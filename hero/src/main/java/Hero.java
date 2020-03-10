import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.SGR;

public class Hero extends Element{


    public Hero(Position position){
        super(position);
    }

    public Position moveUp(){
        return new Position(super.getPosition().getX(), super.getPosition().getY()-1);
    }

    public Position moveDown(){
        return new Position(super.getPosition().getX(), super.getPosition().getY()+1);
    }

    public Position moveLeft(){
        return new Position(super.getPosition().getX()-1, super.getPosition().getY());
    }

    public Position moveRight(){
        return new Position(super.getPosition().getX()+1, super.getPosition().getY());
    }

    public void setPosition(Position position){
        super.setPosition(position);
    }

    @Override
    public Position getPosition() {
        return super.getPosition();
    }

    public void draw(TextGraphics graphics){
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(super.getPosition().getX(), super.getPosition().getY()), "X");
    }
}
