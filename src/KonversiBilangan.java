import java.util.Scanner;

/**
 * Kelas KonversiBilangan digunakan untuk mengonversi bilangan desimal ke bilangan heksadesimal.
 */
public class KonversiBilangan {
    /**
     * Metode utama digunakan untuk menjalankan program konversi desimal ke heksadesimal.
     * @param args Argumen garis perintah tidak digunakan pada program ini.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int decimal = input.nextInt();
        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("Bilangan heksadesimal: " + hexadecimal);
    }

    /**
     * Metode ini mengonversi bilangan desimal menjadi bilangan heksadesimal;
     * @param decimal Bilangan desimal yang akan dikonversikan.
     * @return Bilangan heksadesimal yang dihasilkan dari konversi.
     */
    public static String decimalToHexadecimal(int decimal) {
        String hexChars = "0123456789ABCDEF";
        if (decimal == 0) {
            return "0";
        }
        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = hexChars.charAt(remainder) + hexadecimal;
            decimal = decimal / 16;
        }
        return hexadecimal;
    }
}


