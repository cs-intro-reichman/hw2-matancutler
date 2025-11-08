
public class Cheers {
        public static void main(String[] args) {
         String word = args[0];
         int N = Integer.parseInt(args[1]);
         String vowels = "aeiouyAEIOUY";

         for (int i = 0 ; i < word.length() ; i ++){
                if (vowels.indexOf(word.charAt(i)) != -1)
                  System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
                else
                 System.out.println("Give me a " + word.charAt(i) + ": " + word.charAt(i) + "!");
         } 
         for (int i = 0; i<N ; i++){
                System.out.println(word + "!!!");
         }
        }
}
