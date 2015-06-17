package com.ameliapaine.helloworld;

/**
 * Created by Amelia on 6/16/2015.
 */
public class PandaModel {

    public static final int DEFAULT_HEALTH = 100;
    public static final int DEFAULT_STR = 0;
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    private int x, y;
    private int hp, str;

    public PandaModel(int xVal, int yVal) {
        x = xVal;
        y = yVal;
        hp = DEFAULT_HEALTH;
        str = DEFAULT_STR;
    }

    public PandaModel() {
        x = DEFAULT_X;
        y = DEFAULT_Y;
        hp = DEFAULT_HEALTH;
        str = DEFAULT_STR;
    }

    public void trainStr(int training) {
        str += training;
    }

    public void moveTo(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getStr() {
        return str;
    }

    public int getHp() {
        return hp;
    }
}
