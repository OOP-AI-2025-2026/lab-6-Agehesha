
package org.example.geometry;

public final class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    @Override public void setX(int x) { this.x = x; }
    @Override public void setY(int y) { this.y = y; }
    @Override public int getX() { return x; }
    @Override public int getY() { return y; }
    @Override public void moveTo(int x, int y) { this.x = x; this.y = y; }

    @Override public String toString() { return "(" + x + ", " + y + ")"; }
}
