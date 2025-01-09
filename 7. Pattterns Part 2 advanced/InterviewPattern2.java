class InterviewPattern2 {
    public static void interviewPattern2(int n) {
        String str = "Coding is My Passion";
        int len = str.length();
        int charIndex = 0;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // characters
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(str.charAt(charIndex) + " ");
                charIndex = (charIndex + 1) % len; // reset to 0 after reaching the end
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        interviewPattern2(5);
    }
}