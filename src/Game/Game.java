package Game;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    private Man man;
    private Robot robot;
    private int randomNun;
    private String path = "C:\\Users\\Rodya\\Desktop\\MyGame\\src\\Game\\logplayers.txt";
    private BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));

    public Game() throws IOException {
    }

    public void gameLines() throws InterruptedException, IOException {
        Thread.sleep(500);
        System.out.println("Добрый день!");
        Thread.sleep(1000);
        System.out.println("Давай сыграем в игру!");
        Thread.sleep(1000);
        System.out.print("Введи свое имя: ");
        randomNun = (int) (Math.random() * 100);
        man = createMan(setName(), randomNun);
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

    private String setName() throws IOException {
        String name;
        while (true) {
            name = new Scanner(System.in).nextLine();
            if (!name.equalsIgnoreCase("")) {
                writer.write(name);
                writer.close();
                break;
            } else System.out.print("Введи свое имя: ");
        }
        return name;
    }
}
