public class palindrome {

    public static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah semua huruf menjadi lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String kata1 = "Katak";
        String kata2 = "Makan";
        String kata3 = "Kasur";
        String frase1 = "Kasur ini rusak";

        System.out.println(kata1 + " adalah palindrome: " + isPalindrome(kata1));
        System.out.println(kata2 + " adalah palindrome: " + isPalindrome(kata2));
        System.out.println(kata3 + " adalah palindrome: " + isPalindrome(kata3));
        System.out.println(frase1 + " adalah palindrome: " + isPalindrome(frase1));
    }
}
