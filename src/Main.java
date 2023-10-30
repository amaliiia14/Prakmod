import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int decimal = input.nextInt();
        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("Bilangan heksadesimal: " + hexadecimal);
    }

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
