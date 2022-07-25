import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố nhé !");
        System.out.println("Nhập vào số cần kiểm tra");
        double number = scanner.nextDouble();
        if (number < 2){
            System.out.println(number + " không phải số nguyên tố ");
        }else {
            int i = 2;
            boolean check = true;
            while (i < number){
                if (number %i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " là số nguyên tố ");
            }else {
                System.out.println(number + " không là số nguyên tố ");
            }
        }

    }
}