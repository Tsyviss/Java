import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число : ");
        int inNumber = input.nextInt();
        if (inNumber > 7) {
            System.out.println("Привет");
        } else if (inNumber == 7) {
            System.out.println("Введите число большее 7");
        } else {
            System.out.println("Данное число меньше 7");
        }
    }
