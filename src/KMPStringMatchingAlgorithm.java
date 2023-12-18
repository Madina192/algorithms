public class KMPStringMatchingAlgorithm {
    public static void main(String[] args) {
        kmp("abcdabcabcdf", "abcdf");
    }

    private static boolean kmp(String input, String pattern) {
        boolean isMatch = true;
        int indexPattern = 0;
        for (int i = 0; i < input.length(); i++) {
            int indexInput = i;
            while (indexPattern < pattern.length()) {
                isMatch = true;
                System.out.println("characters: " + indexInput + " -> " + input.charAt(indexInput) + " " + indexPattern + " -> " + pattern.charAt(indexPattern));
                if (input.charAt(indexInput) != pattern.charAt(indexPattern)) {
                    isMatch = false;
                    indexPattern = 0;
                    break;
                } else {
                    indexInput++;
                    indexPattern++;
                }
            }
        }
        if (isMatch) {
            System.out.println("matches!");
        }
        return isMatch;
    }
}
