public class Job6 {
    public static void main (String[] args) {

        String str = "Les choses que l'on possède finissent par nous posséder.";
        char[] char1 = str.toCharArray();
        System.out.print(char1.length);
            for (int i = char1.length - 1 ; i > -1 ; i--) {
                System.out.print(char1[i]);
       }
    }
}
