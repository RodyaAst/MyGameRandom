package Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        try {
            game.gameLines();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
