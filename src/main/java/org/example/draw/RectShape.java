
package org.example.draw;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public final class RectShape extends AbstractShape {
    public RectShape(int x1, int y1, int x2, int y2) { super(x1, y1, x2, y2); }

    @Override public void paint(Graphics2D g) {
        int x = Math.min(x1(), x2());
        int y = Math.min(y1(), y2());
        int w = Math.abs(x2() - x1());
        int h = Math.abs(y2() - y1());
        g.draw(new Rectangle2D.Double(x, y, w, h));
    }
}
