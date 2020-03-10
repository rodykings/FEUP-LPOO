import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall extends Element{

    public Wall(int width, int height) {

        super(new Position(width, height));
    }


    public Position getPosition() {
        return super.getPosition();
    }

    @Override
    public void draw(TextGraphics graphics) {
        graphics.putString(new TerminalPosition(super.getPosition().getX(), super.getPosition().getY()), "|");
    }
}
