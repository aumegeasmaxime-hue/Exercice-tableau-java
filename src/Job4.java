public class Job4 {
    public void main(String[] args) {

        String str = "Dans l'espace, personne ne vous entend crier";
        char[] chars = str.toCharArray();
        int espace = 0;

        for (char a : chars) {
            if (a == ' ') {
                a = 1;
                espace += a;
            }
        }
        System.out.println(chars.length - espace);
    }
}
