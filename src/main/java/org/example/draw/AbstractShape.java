
package org.example.draw;

import java.awt.Graphics2D;

public abstract class AbstractShape {
    private final int x1, y1, x2, y2;

    public AbstractShape(int x1, int y1, int x2, int y2) {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
    }

    public abstract void paint(Graphics2D g);

    protected int x1() { return x1; }
    protected int y1() { return y1; }
    protected int x2() { return x2; }
    protected int y2() { return y2; }
}
