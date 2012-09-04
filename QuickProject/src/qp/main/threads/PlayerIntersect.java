package qp.main.threads;

import java.util.ArrayList;

import qp.main.entity.Enemy;
import qp.main.entity.Player;
import qp.main.gui.frame.Frame;

public class PlayerIntersect implements Runnable{
	public void run(){
		try{
			while(!Frame.lost){
				for(Enemy e: (ArrayList<Enemy>) Enemy.getEnemies().clone())
				if (Player.getPlayer().intersects(e.x, e.y, e.width, e.height)){
					Frame.lost = true;
				}
				Thread.sleep(20);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}