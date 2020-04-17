package com.aor.refactoring.example5;

public class Position {
    private int row;
    private int column;
    private char direction;

    public Position(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection(){
        return direction;
    }

    public void setPosition(int row, int column, char direction) {
        this.row=row;
        this.column=column;
        this.direction=direction;
    }
}