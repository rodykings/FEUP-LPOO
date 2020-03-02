import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {

    Hero hero;

    Terminal terminal = new DefaultTerminalFactory().createTerminal();
    Screen screen = new TerminalScreen(terminal);

    public Game(Hero hero) throws IOException {
        this.hero = hero;

        try {

            screen.setCursorPosition(null);   // we don't need a cursor
            screen.startScreen();             // screens must be started
            screen.doResizeIfNecessary();     // resize screen if necessary


        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    private void draw() throws IOException {
        screen.clear();
        hero.draw(screen);
        screen.refresh();
    }
    public void run() throws IOException {
        while(true){
            draw();
            KeyStroke key = screen.readInput();
            processKey(key);
            if(key.getKeyType() == KeyType.EOF)
                break;
        }

    }

    private void processKey(KeyStroke key) throws IOException {
            if(key.getKeyType() == KeyType.ArrowUp)
                hero.moveUp();
            if(key.getKeyType() == KeyType.ArrowDown)
                hero.moveDown();
            if(key.getKeyType() == KeyType.ArrowLeft)
                hero.moveLeft();
            if(key.getKeyType() == KeyType.ArrowRight)
                hero.moveRight();
            if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q')
                screen.close();

        System.out.println(key);
    }

}

