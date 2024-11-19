// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int repeat = Integer.parseInt(args[1]);
        String differentLetters = "AEFHILMNORSX";
         for (int i = 0; i < word.length(); i++) {
             if(differentLetters.indexOf(word.charAt(i)) == -1){
                System.out.println("Give me a  " + word.charAt(i) + ":" + word.charAt(i)+ "!");
             }
             else {
                System.out.println("Give me an " + word.charAt(i) + ":" + word.charAt(i)+ "!"); 
             }
         }
         System.out.println("What does that spell?");
         for (int i = 0; i < repeat; i++) {
                System.out.println(word + "!!!");
         }
        }
}
