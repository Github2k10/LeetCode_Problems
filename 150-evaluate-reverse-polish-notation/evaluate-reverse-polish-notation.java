class Solution {
    public int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int i = 0;

        for(String s : tokens){
            if(s.equals("+")){
                int b = arr[--i];
                int a = arr[--i];

                arr[i++] = (int)a + b;
            } else if(s.equals("-")){
                int b = arr[--i];
                int a = arr[--i];

                arr[i++] = (int)a - b;
            } else if(s.equals("*")){
                int b = arr[--i];
                int a = arr[--i];

                arr[i++] = (int)a * b;
            } else if(s.equals("/")){
                int b = arr[--i];
                int a = arr[--i];

                arr[i++] = (int)a / b;
            } else {
                arr[i++] = Integer.parseInt(s);
            }
        }

        return arr[--i];
    }
}