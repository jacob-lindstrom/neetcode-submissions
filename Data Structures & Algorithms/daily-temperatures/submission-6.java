class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<int[]> temp = new Stack<>();
        // [temp, index]

        for(int i = 0; i < n; i++){

            int t = temperatures[i];
            while (!temp.isEmpty() && t > temp.peek()[0]){
                result[temp.peek()[1]] = i - temp.pop()[1];
            }

            temp.push(new int[]{t, i});

        }

        return result;

    }
}
