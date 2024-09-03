class Solution {
    public boolean isValid(String word) {
      if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (isVowel(ch)) {
                hasVowel = true;
            }
            if (Character.isLetter(ch) && !isVowel(ch)) {
                hasConsonant = true;
            }
        }
        return hasVowel && hasConsonant;
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

}