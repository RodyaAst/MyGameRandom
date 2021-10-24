package Game;

import java.util.Scanner;

public class Man {
    private String name;
    private final int number;

    public Man(String name, int number) {
        this.name = name;
        this.number=number;

    }
    public boolean startMan(){
        int outNumber = tryNum();
        if (outNumber==number) {
            return true;
        } else if (outNumber>number) {
            System.out.println("Ваше число больше!");
        } else if (outNumber<number) {
            System.out.println("Ваше число меньше!");
        }
        return false;
    }
    private int tryNum () {
        System.out.print("Введите число от 1 до 100: ");
        int result=0;
        while(true) {
            try {
                result = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.print("Введите число! От 1 до 100");
            }
            if (result > 0 && result < 101) break;
        }
        return result;
    }
}
