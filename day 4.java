
public class Main2 {
    public static String reverseWords(String s) {
        // Step 1: trim leading and trailing spaces
        s = s.trim();

        // Step 2: split by one or more spaces using regex
        String[] words = s.split("\\s+");

        // Step 3: reverse the words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) { // add space except after last word
                sb.append(" ");
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));     
        System.out.println(reverseWords("  hello world  "));      
        System.out.println(reverseWords("a good   example"));     
        System.out.println(reverseWords("    "));                
        System.out.println(reverseWords("word"));                
    }
}
