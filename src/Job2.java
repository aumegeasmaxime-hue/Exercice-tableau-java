public class Job2 {
    public static void main (String[] args) {


        String str = "Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((i % 2) == 0) {
                System.out.print(chars[i]);
            }
        }
    }
}
