public class deretangkaA {

    public static void main(String[] args) {
        int n = 5; // Jumlah angka dalam pola
        int count = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(count + " ");
            count++;

            if (i % 2 == 0) {
                System.out.print(count + " ");
                count += 2;
            } else {
                System.out.print(count + " ");
                count++;
            }
        }
    }
}
