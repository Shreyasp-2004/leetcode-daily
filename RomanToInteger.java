import java.util.*;
class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));

            if (i + 1 < s.length() && curr < map.get(s.charAt(i + 1))) {
                total -= curr;   // subtract if smaller before bigger
            } else {
                total += curr;   // otherwise add
            }
        }
        return total;
    }
}
