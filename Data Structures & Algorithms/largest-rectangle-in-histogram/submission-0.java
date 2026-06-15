class Solution {
    public int largestRectangleArea(int[] heights) {
            if(heights.length==0) return 0 ;

            // Edge case: empty array
            if (heights == null || heights.length == 0) {
                return 0;
            }

            Stack<Integer> stack = new Stack<>();
            int maxArea = 0;

            // We go one extra iteration (i == heights.length) to clear the stack
            for (int i = 0; i <= heights.length; i++) {

                // Determine current height (0 at the end to force pops)
                int currentHeight;
                if (i == heights.length) {
                    currentHeight = 0; 
                } else {
                    currentHeight = heights[i];
                }

                // While there are bars in stack AND current bar is shorter than stack's top bar
                while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {

                    // The height of the rectangle we're calculating
                    int rectangleHeight = heights[stack.pop()];

                    // Calculate the width
                    int rectangleWidth;
                    if (stack.isEmpty()) {
                        // If stack is empty, this bar extended from index 0 to i-1
                        rectangleWidth = i;
                    } else {
                        // Otherwise, extends from (index after previous bar) to (i-1)
                        rectangleWidth = i - stack.peek() - 1;
                    }

                    // Calculate area and update max
                    int area = rectangleHeight * rectangleWidth;
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }

                // Push current bar's index onto stack
                stack.push(i);
            }

            return maxArea;
        }
}

