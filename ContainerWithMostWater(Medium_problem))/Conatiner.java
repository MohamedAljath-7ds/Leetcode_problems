class Container {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int right = height.length - 1;
        int left = 0;
        while (left < right) {
            // [0,8] * (0 - 8) maxArea = 8 and 1<7 so left++ [8,7] * (8-1) 7 * 7 maxArea =>
            // 49;
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}