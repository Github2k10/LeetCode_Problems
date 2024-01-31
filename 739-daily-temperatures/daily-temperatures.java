class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return ans;
    }
}