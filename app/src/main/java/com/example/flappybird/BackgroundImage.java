package com.example.flappybird;

public class BackgroundImage {
    private int backgroundImageX, backgroundImageY, backgroundImageVelocity;

    public BackgroundImage(){
        backgroundImageY = 0;
        backgroundImageX = 0;
        backgroundImageVelocity = 3;
    }

    public int getX() {
        return backgroundImageX;
    }

    public void setX(int backgroundImageX) {
        this.backgroundImageX = backgroundImageX;
    }

    public int getY() {
        return backgroundImageY;
    }

    public void setY(int backgroundImageY) {
        this.backgroundImageY = backgroundImageY;
    }

    public int getVelocity() {
        return backgroundImageVelocity;
    }

    public void setBackgroundImageVelocity(int backgroundImageVelocity) {
        this.backgroundImageVelocity = backgroundImageVelocity;
    }
}
