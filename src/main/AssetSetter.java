package main;

import object.ChestObject;
import object.DoorObject;
import object.KeyObject;
import object.MedalObject;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new KeyObject();
        gp.obj[0].worldX = 25 * gp.tileSize;
        gp.obj[0].worldY = 19 * gp.tileSize;

        gp.obj[1] = new KeyObject();
        gp.obj[1].worldX = 33 * gp.tileSize;
        gp.obj[1].worldY = 25 * gp.tileSize;

        gp.obj[2] = new KeyObject();
        gp.obj[2].worldX = 21 * gp.tileSize;
        gp.obj[2].worldY = 18 * gp.tileSize;

        gp.obj[3] = new DoorObject();
        gp.obj[3].worldX = 32 * gp.tileSize;
        gp.obj[3].worldY = 23 * gp.tileSize;

        gp.obj[4] = new DoorObject();
        gp.obj[4].worldX = 19 * gp.tileSize;
        gp.obj[4].worldY = 18 * gp.tileSize;

        gp.obj[5] = new DoorObject();
        gp.obj[5].worldX = 23 * gp.tileSize;
        gp.obj[5].worldY = 13 * gp.tileSize;

        gp.obj[6] = new ChestObject();
        gp.obj[6].worldX = 23 * gp.tileSize;
        gp.obj[6].worldY = 7 * gp.tileSize;

        gp.obj[7] = new MedalObject();
        gp.obj[7].worldX = 23 * gp.tileSize;
        gp.obj[7].worldY = 22 * gp.tileSize;

        gp.obj[8] = new DoorObject();
        gp.obj[8].worldX = 23 * gp.tileSize;
        gp.obj[8].worldY = 35 * gp.tileSize;

        gp.obj[9] = new DoorObject();
        gp.obj[9].worldX = 23 * gp.tileSize;
        gp.obj[9].worldY = 36 * gp.tileSize;

        gp.obj[10] = new KeyObject();
        gp.obj[10].worldX = 20 * gp.tileSize;
        gp.obj[10].worldY = 18 * gp.tileSize;
    }
}
