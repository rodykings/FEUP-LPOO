package com.aor.refactoring.example5;

public class Turtle {
    private Position position;

    public Turtle(int row, int column, char direction) {
        this.position = new Position(row, column, direction);
    }

    public Position getPosition(){
        return this.position;
    }


    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            if (direction.getDirection() == 'N') direction.direction = 'W';
            else if (direction.getDirection() == 'W') direction.direction = 'S';
            else if (direction.getDirection() == 'S') direction.direction = 'E';
            else if (direction.getDirection() == 'E') direction.direction = 'N';
        } else if (command == 'R') { // ROTATE RIGHT
            if (direction.getDirection() == 'N') direction.direction = 'E';
            else if (direction.getDirection() == 'E') direction.direction = 'S';
            else if (direction.getDirection() == 'S') direction.direction = 'W';
            else if (direction.getDirection() == 'W') direction.direction = 'N';
        } else if (command == 'F'){ // MOVE FORWARD
            if (direction.getDirection() == 'N') position = position.getRow() - 1;
            if (direction.getDirection() == 'S') position.row = position.getRow() + 1;
            if (direction.getDirection() == 'W') position.column = position.getColumn() - 1;
            if (direction.getDirection() == 'E') position.column = position.getColumn() + 1;
        }
    }
}
