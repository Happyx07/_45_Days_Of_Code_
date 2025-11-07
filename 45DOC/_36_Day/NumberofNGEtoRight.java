package _36_Day;

// Given an array of arr[] and Q queries of indices. For each query indices[i], determine the count of elements in arr that are strictly greater than arr[indices[i]] to its right (after the position indices[i]).

public class NumberofNGEtoRight {
    public int[] countNGE(int[] arr, int[] queries) {
        int n = arr.length;
        int[] result = new int[queries.length];
        int[] ngeCount = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // Find the next greater element for each position
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int idx = stack.pop();
                ngeCount[idx] = i - idx - 1;
            }
            stack.push(i);
        }

        // For each query, count the number of elements greater than arr[queries[i]]
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i];
            int count = 0;
            for (int j = idx + 1; j < n; j++) {
                if (arr[j] > arr[idx]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
