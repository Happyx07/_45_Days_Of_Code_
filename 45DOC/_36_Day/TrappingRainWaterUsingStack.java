package _36_Day;

public class TrappingRainWaterUsingStack {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int waterTrapped = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                waterTrapped += distance * boundedHeight;
            }
            stack.push(i);
        }

        return waterTrapped;
    }
}
