
package org.example.draw;

import java.awt.Graphics2D;

public final class LineShape extends AbstractShape {
    public LineShape(int x1, int y1, int x2, int y2) { super(x1, y1, x2, y2); }

    @Override public void paint(Graphics2D g) {
        g.drawLine(x1(), y1(), x2(), y2());
    }
}
