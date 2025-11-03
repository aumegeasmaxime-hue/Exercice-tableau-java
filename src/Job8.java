public class Job8 {
    public static void main (String[] args) {

        int [] arr = {84, 12, 1, 43, 5, 0};
        int [] arrey = new int[arr.length];
        int p = 0;
        int highest = 0;
        for (int x : arr) {
            if (x > highest) {
                highest = x;
            }
        }
        for (int croissant = 0 ; croissant <= highest ; croissant++ ) {
            for (int x : arr) {
                if (croissant == x) {
                    System.out.print(croissant + " ");
                    arrey [p] = croissant;
                    p++;
                }
            }
        }
        for (int w : arrey) {
            System.out.print(w + " ");
        }
    }
}

