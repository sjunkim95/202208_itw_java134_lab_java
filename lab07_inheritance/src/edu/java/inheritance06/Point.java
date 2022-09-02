package edu.java.inheritance06;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override // Object 클래스의 toString을 재정의
    public String toString() {
        String point = String.format("Point(x=%d, y=%d)", this.x, this.y);
        return point;
    }
    
}
