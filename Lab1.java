public class Lab1 {
    public static float randomNumber(){
        float random = 0;
        random = (float) ((Math.random() * 26) - 13);
        if (random >= 12)
            random = 12;
        return random;
    }
    public static void printArray (double [][] a1){
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%-9.3f", a1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        long [] a = new long [] {18, 16, 14, 12, 10, 8, 6, 4, 2};
        float [] x = new float [20];
        for (int i = 0; i < x.length; i++){
            x[i] = randomNumber();
        }
        double [][] a1 = new double [9][20];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 20; j++) {
                if (a[i] == 12) {
                    a1[i][j] = Math.pow(2 * Math.asin((x[j] - 1) / 26) * (Math.asin(Math.sin(x[j]) + 1)), 3);
                } else if (a[i] == 2 || a[i] == 4 || a[i] == 16 || a[i] == 18) {
                    a1[i][j] = ((Math.pow(x[j], 3) + 4) / 2);
                } else {
                    a1[i][j] = Math.cos(Math.pow((Math.asin(Math.cos(x[j])) / 2), 2));
                }
            }
        }
        printArray(a1);
    }
}
