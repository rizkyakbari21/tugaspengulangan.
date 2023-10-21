public class deretangkaB {

    public static void main(String[] args) {
        int n = 8; // Jumlah angka dalam pola
        int[] sequence = new int[n];
        sequence[0] = 1;
        sequence[1] = 2;
        sequence[2] = 3;

        for (int i = 3; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
        }

        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}
