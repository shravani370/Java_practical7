class Practical7_2 {

    static int iterative_logic1(String text, String pattern) {

        if (pattern.length() == 0 || pattern.length() > text.length())
            return 0;

        int count = 0;

        for (int i = 0; i <= text.length() - pattern.length(); i++) {

            int j;

            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }

            if (j == pattern.length())
                count++;
        }

        return count;
    }


    static int iterative_logic2(String text, String pattern) {

        if (pattern.length() == 0)
            return 0;

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }

        return count;
    }


    static int iterative_logic3(String text, String pattern) {

        if (pattern.length() == 0 || pattern.length() > text.length())
            return 0;

        int count = 0;

        for (int i = 0; i <= text.length() - pattern.length(); i++) {

            if (text.substring(i, i + pattern.length()).equals(pattern))
                count++;
        }

        return count;
    }



    static int recursive_logic1(String text, String pattern, int index) {

        if (pattern.length() == 0 || index > text.length() - pattern.length())
            return 0;

        if (text.substring(index, index + pattern.length()).equals(pattern))
            return 1 + recursive_logic1(text, pattern, index + 1);

        return recursive_logic1(text, pattern, index + 1);
    }


    static int recursive_logic2(String text, String pattern) {

        if (pattern.length() == 0)
            return 0;

        int index = text.indexOf(pattern);

        if (index == -1)
            return 0;

        return 1 + recursive_logic2(text.substring(index + pattern.length()), pattern);
    }


    static int recursive_logic3(String text, String pattern) {

        if (pattern.length() == 0 || text.length() < pattern.length())
            return 0;

        if (text.startsWith(pattern))
            return 1 + recursive_logic3(text.substring(1), pattern);

        return recursive_logic3(text.substring(1), pattern);
    }


    public static void main(String[] args) {

        String s1 = "SGGSIE&TSGGS";
        String s2 = "SGGS";

        System.out.println("Iterative Logic 1: " + iterative_logic1(s1, s2));
        System.out.println("Iterative Logic 2: " + iterative_logic2(s1, s2));
        System.out.println("Iterative Logic 3: " + iterative_logic3(s1, s2));

        System.out.println("Recursive Logic 1: " + recursive_logic1(s1, s2, 0));
        System.out.println("Recursive Logic 2: " + recursive_logic2(s1, s2));
        System.out.println("Recursive Logic 3: " + recursive_logic3(s1, s2));
    }
}