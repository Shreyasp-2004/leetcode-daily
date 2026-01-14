public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while(left < right) {
            boolean isLeftVowel = isVowel(chars[left]);
            boolean isRightVowel = isVowel(chars[right]);
            if(!isLeftVowel) left++;
            if(!isRightVowel) right--;
            if(isLeftVowel && isRightVowel) {
                char bowl = chars[left];
                chars[left] = chars[right];
                chars[right] = bowl;
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }

    private boolean isVowel(char letter) {
        Set<Character> vowels = Set.of('A', 'E', 'I', 'O','U', 'a', 'e', 'i', 'o', 'u');

        return vowels.contains(letter);
    }
}

