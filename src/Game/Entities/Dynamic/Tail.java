package Game.Entities.Dynamic;

import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Tail {
    public int x,y;
    public Tail(int x, int y,Handler handler){
        this.x=x;
        this.y=y;
        handler.getWorld().playerLocation[x][y]=true;

    }

}
