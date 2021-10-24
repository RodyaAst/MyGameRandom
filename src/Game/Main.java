package Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Game game = new Game();
            game.gameLines();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
