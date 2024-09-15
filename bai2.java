import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap lan luot cac thong tin :ten, tuoi, chieu cao, co thich lap trinh khong");
        String ten= sc.nextLine();
        byte tuoi= sc.nextByte();
        int chieucao = sc.nextInt();
        String lt= new Scanner(System.in).nextLine();
        System.out.println("Ten : "+ten);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Chieu cao : "+chieucao+"cm");
        System.out.println(lt+" thich lap trinh");
    }
}

