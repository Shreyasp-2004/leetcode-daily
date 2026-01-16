public class ClimbingStairs {
        private int[] memo;
    public int climbStairs(int n) {
            memo = new int[n + 1];  
        return climb(n);
    }
    
    private int climb(int i) {
        if (i == 1) return 1;
        if (i == 2) return 2;
        
        if (memo[i] != 0) return memo[i];  
        
        memo[i] = climb(i - 1) + climb(i - 2);  
        return memo[i];
    }
}
