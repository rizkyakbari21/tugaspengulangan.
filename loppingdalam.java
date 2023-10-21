public class loppingdalam {

    public static void main(String[] args) {
        int n = 3; // Jumlah baris

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            num--;
        }
    }
}
