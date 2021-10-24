package Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.gameLines();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
