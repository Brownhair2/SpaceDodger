package org.wintrisstech;

import java.awt.Color;

class PlainAlien2 extends Alien {
    
    private int t = 0;

    public PlainAlien2() {
        color = Color.white;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);
    }

    @Override
    public void update(Ship ship) {
        t++;
        if (t > 300) {
            visible = false;
        }
    }
    
}
