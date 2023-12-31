package myapp.shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyOval extends MyDrawing {
    @Override
    void paint(Graphics2D g, int x, int y, int w, int h, Color lineColor, Color fillColor) {
        g.setStroke(getStroke());
        g.setColor(fillColor);
        g.fillOval(x, y, w, h);
        g.setColor(lineColor);
        g.drawOval(x, y, w, h);
    }

    @Override
    public void setRegion() {
        int[] params = getAdjustedParams();
        int x = params[0];
        int y = params[1];
        int w = params[2];
        int h = params[3];
        region = new Ellipse2D.Float(x, y, w, h);
    }

    @Override
    public int[] getEdge() {
        int[] params = getAdjustedParams();
        int x = params[0];
        int y = params[1];
        int w = params[2];
        int h = params[3];
        int[] edge = { x, y, x + w, y + h };
        return edge;
    }
}