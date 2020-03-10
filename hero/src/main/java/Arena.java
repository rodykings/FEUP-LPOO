import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {

    private Hero hero;
    private int width;
    private int height;

    private List<Wall> walls;
    private List<Coin> coins;
    private List<Monster> monsters;


    public Arena(int width, int height) throws IOException {
        this.width = width;
        this.height = height;
        this.walls = createWalls();
        this.coins = createCoins();
        this.monsters = createMonsters();
        hero = new Hero(new Position(10,10));

    }

    private List<Wall> createWalls() {

        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }

        return walls;

    }


    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            coins.add(new Coin(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
        }

        return coins;
    }


    private List<Monster> createMonsters() {
        Random random = new Random();
        ArrayList<Monster> monsters = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            monsters.add(new Monster(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
        }

        return monsters;
    }

    private void processKey(KeyStroke key) {
        this.processKey(key);
    }

    public void draw(TextGraphics graphics) throws IOException {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        for (Wall wall : walls){
            wall.draw(graphics);
        }

        for (Coin coin : coins) {
            coin.draw(graphics);
        }

        for (Monster monster : monsters) {
            monster.draw(graphics);
        }

        hero.draw(graphics);

    }

    public void moveHero(Position position) {
        if (canHeroMove(position)){
            hero.setPosition(position);
        }


    }

    public void moveMonsters(){
        Random random = new Random();
        int r = random.nextInt(3);

        for(Monster monster : monsters){
            boolean wallCollision = false;
            boolean coinCollision = false;
            for(Wall wall : walls){
                if (monster.getPosition().equals(wall.getPosition())) {
                    wallCollision = true;
                    monster.setPosition(new Position(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
                }
            }
            for(Coin coin : coins){
                if (monster.getPosition().equals(coin.getPosition())) {
                    coinCollision = true;
                    monster.setPosition(new Position(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
                }
            }
            if(!wallCollision && !coinCollision){
                int x = monster.getPosition().getX();
                int y = monster.getPosition().getY();

                switch (r){
                    case 0:
                        x+=1;
                        break;
                    case 1:
                        x-=1;
                        break;
                    case 2:
                        y+=1;
                        break;
                    case 3:
                        y-=1;
                        break;

                }

                monster.setPosition(new Position(x, y));
            }

        }
    }


    public boolean verifyMonsterCollisions(){
        for(Monster monster : monsters){
            if(hero.getPosition().equals(monster.getPosition())){
                return true;
            }
        }
        return false;
    }

    public void processKey(KeyStroke key, Screen screen) throws IOException {
        if(key.getKeyType() == KeyType.ArrowUp)
            moveHero(hero.moveUp());
        if(key.getKeyType() == KeyType.ArrowDown)
            moveHero(hero.moveDown());
        if(key.getKeyType() == KeyType.ArrowLeft)
            moveHero(hero.moveLeft());
        if(key.getKeyType() == KeyType.ArrowRight)
            moveHero(hero.moveRight());
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q')
            screen.close();

        System.out.println(key);

        if(verifyMonsterCollisions()){
            screen.close();
            System.out.println("GAME OVER!");
        }else{
            moveMonsters();
        }
    }

    private boolean canHeroMove(Position position) {

        for(Wall wall : this.walls) {
            if (wall.getPosition().equals(position))
                return false;
        }

        return true;
    }

}
