package Game;


import java.util.Scanner;

public class Game {
    private Man man;
    private Robot robot;
    private int randomNun;

    public void gameLines() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Добрый день!");
        Thread.sleep(1000);
        System.out.println("Давай сыграем в игру!");
        Thread.sleep(1000);
        System.out.print("Введи свое имя: ");
        randomNun = (int)(Math.random()*100);
        man = createMan(setName(),randomNun);
        robot = createRobot(randomNun);
        while (true) {
            boolean booM = man.startMan();
            boolean booR = robot.startRobot();
            if (booM) {
                System.out.println("Вы победили! Мои поздравления!");
                break;
            } else if (booR) {
                System.out.println("Робот победил! Очень жаль!");
                break;
            }
        }
    }

    private Man createMan(String name, int number) {
        return new Man(name, number);
    }

    private Robot createRobot(int number) {
        return new Robot(number);
    }

    private String setName() {
        String name;
        while (true) {
            name = new Scanner(System.in).nextLine();
            if (!name.equalsIgnoreCase("")) {
                break;
            } else System.out.print("Введи свое имя: ");
        }
        return name;
    }
}
