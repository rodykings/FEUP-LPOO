package com.aor.refactoring.example5;

public interface Command {
    void execute(char command);
}


class moveForward implements Command{

    private Position position;

    public moveForward(Position position){
        this.position = position;
    }

    @Override
    public void execute(char command) {
        switch (this.position.getDirection()){
            case 'N':
                this.position.setPosition(this.position.getRow()-1, this.position.getColumn(), this.position.getDirection());
                break;
            case 'S':
                break;
            case 'E':
                break;
            case 'W':
                break;
        }
    }
}


class rotateRight implements Command{

    private Position position;

    public rotateRight(Position position){
        this.position = position;
    }

    @Override
    public void execute(char command) {

    }
}


class rotateLeft implements Command{

    private Position position;

    public rotateLeft(Position position){
        this.position = position;
    }

    @Override
    public void execute(char command) {

    }
}

