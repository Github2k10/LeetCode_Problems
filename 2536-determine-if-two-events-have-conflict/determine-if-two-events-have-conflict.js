/**
 * @param {string[]} event1
 * @param {string[]} event2
 * @return {boolean}
 */
var haveConflict = function(event1, event2) {
    // console.log("event1 => ", event1, ", event2 => ", event2);

    let check = function(event, time){
        let conflict = false;
        let start = event[0].split(":");
        let end = event[1].split(":");
        start = +(start[0] + start[1])
        end = +(end[0] + end[1]);

        let hr = time.split(':')[0]
        let m = time.split(':')[1]
        time = +(hr + m);
        
        // console.log("start => ", start, ", end => ", end);
        // console.log("time => ", time);

        return time >= start && time <= end;
    }
    
    // return check(event1, event2[0]);
    // return check(event1, event2[1]);
    // return check(event2, event1[0]);
    // return check(event2, event1[1]);
    return check(event1, event2[0]) || check(event1, event2[1]) || check(event2, event1[0]) || check(event2, event1[1]);
};