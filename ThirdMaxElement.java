public class ThirdMaxElement {
  public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int x : nums) {
            long n = x;

            if ((first != null && n == first) || 
                (second != null && n == second) || 
                (third != null && n == third)) {
                continue; 
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
    
}