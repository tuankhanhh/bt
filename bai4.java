import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap so tien gui vao ngan hang: ");
        int tien= new Scanner(System.in).nextInt();
        System.out.println("Nhap lai suat hang nam: ");
        double laisuat= new Scanner(System.in).nextDouble();
        System.out.println("Nhap so thang gui: ");
        byte t= new Scanner(System.in).nextByte();
        double lai= tien*(laisuat/12)*t;
        System.out.println("So tien lai la: "+lai);
        System.out.println("Tong tien : "+(tien+lai));
    }
}
