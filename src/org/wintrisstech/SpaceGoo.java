package org.wintrisstech;

import java.awt.Color;
import java.awt.Graphics2D;

class SpaceGoo extends Alien {
     
    private int t = 0;
    private int rotation = 10;

    public SpaceGoo() {
        color = Color.green;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);
    }

    @Override
    public void update(Ship ship) {
        t++;
        if (t > 300) {
            visible = false;
        }
        if (t%50 == 0) {
            rotation += 10;
        }
        if (x<0) {
            x = SpaceDodger.windowWidth-w;
        }
        else
        {
            if (x>SpaceDodger.windowWidth) {
                x = w;
            }
            else
            {
                if (y<0) {
                    y = SpaceDodger.windowHeight-h;
                }
                else
                {
                    if (y>SpaceDodger.windowHeight) {
                        x = h;
                    }
                }
            }
        }
        x += Math.cos(rotation)*5;
        y += Math.sin(rotation)*5;
    }

    @Override
    public void paint(Graphics2D g2) {
        if (visible) {
            g2.setColor(color);
            g2.rotate(rotation, x, y);
            g2.fillRect(x - w / 2, y - h / 2, w, h);
            g2.rotate(-rotation, x, y);
        }
    }
    
       
}
