public class Job5 {
    public static void main (String[] args) {

        String str = "On n’est pas le meilleur quand on le croit mais quand on le sait";
        char[] tchars = str.toCharArray();
        int somme= 0;
        for (char i : tchars) {
            if ((i == 'a') || (i == 'e') || (i == 'i') ||(i == 'o') ||(i == 'u') || (i == 'y') || (i == 'O')) {
                i = 1;
                somme += i ;
            }
        }
        System.out.println(somme);

        System.out.println(tchars.length - somme);
    }
}
