public class Job8 {
    public static void main (String[] args) {



        int [] arr = {84, 12, 1, 43, 5, 0};
        int highest = 0;
        for (int x : arr) {
            if (x > highest) {
                highest = x;
            }
        }
            for (int i = 0 ; i <= highest ; i++ ) {
                for (int x : arr) {

                    if (i == x) {
                        System.out.println(i);

                    }
                }

            }










    }
}
