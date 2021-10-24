package Game;

public class Robot {
    private int number;
    private int max = 100;
    private int min = 1;

    public Robot(int number) {
        this.number = number;
    }

    public boolean startRobot() {
        return checkNum();
    }

    private int robotNum(int numIn, int numOut) {
        return (int) (Math.random() * ++numOut) + numIn;
    }


    private boolean checkNum() {
        int robores;
            robores = robotNum(min, max);
            if (robores < number) {
                min = robores;
            } else if (robores > max) {
                max = robores;
            } else if (robores == number) return true;
        System.out.println("Робот не угадал!");
        return false;
    }

}
