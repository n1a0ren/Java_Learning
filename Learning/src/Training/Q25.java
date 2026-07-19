package Training;
//接雨水
public class Q25 {
    public static void main(String[] args) {
        int[] height = {3,0,0,2};
        int volume=0;
        int start = 0;
        int end = height.length-1;
        for (int i = start+1; i <= end; i++) {
            if (height[start]<=height[i]) {
                volume += getVolume(height,start,i);
                start=i;
            }
        }
        for (int i = end-2; i >= start; i--) {
            if(height[end]<=height[i]){
                volume += getVolume(height,i,end)-(height[i]-height[end])>0?getVolume(height,i,end)-(height[i]-height[end]):0;
                end=i;
            }
        }System.out.println(volume);
    }
    private static int getVolume(int[] height, int start, int i) {
        int block = 0;
        for (int i1 = start+1; i1 < i; i1++) {
            block+=height[i1];
        }
        return (i-start-1)*height[start]-block;
    }
}

