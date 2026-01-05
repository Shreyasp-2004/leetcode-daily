public class TeemoA {
    public int findDuration(int[] timeSeries, int duration) {
        int count = 0;
        for(int i=0;i<timeSeries.length-1; i++){
            int gap = timeSeries[i + 1] - timeSeries[i];
            if (gap < duration) {
                count += gap; 
            } else {
                count += duration;
            }
        }
        return count+duration;
    }
}
