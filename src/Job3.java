public class Job3 {
    public void main(String[] args) {

        String str = "I'm sorry Dave I'm afraid I can't do that";
        char[] chars = str.toCharArray();

        for (char i : chars) {

            if ((i == 'a') || (i == 'e') || (i == 'i') ||(i == 'o') ||(i == 'u') || (i == 'y') || (i == 'I')) {
                System.out.print(i);
            }
        }
    }
}
