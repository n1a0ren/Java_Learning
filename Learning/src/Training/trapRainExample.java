package Training;
public class trapRainExample {
    public static int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int volume = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // 左边较低，以左边为基准
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    volume += leftMax - height[left];
                }
                left++;
            } else {
                // 右边较低，以右边为基准
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    volume += rightMax - height[right];
                }
                right--;
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        int[] height1 = {0,1,1,0,1,1,0,2};
        System.out.println("测试: " + trap(height1));
    }
}