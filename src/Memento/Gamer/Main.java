package Memento.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Gamer.loadMemento();
		if(!Gamer.isMementoNull()){
			System.out.println("使用上次的游戏信息");
			gamer.restoreMemento();
		}else{
			System.out.println("开始新的游戏");
			gamer.createMemento();
		}
		for(int i = 0; i<20; i++){
			System.out.println("====" + i);
			System.out.println("info:"+ gamer);
			gamer.bet();
			System.out.println("现在有" + gamer.getMoney() + "金币");
			if(gamer.getMoney() > gamer.getMementoMoney()){
				System.out.println("当前金币比上一次多，保存游戏信息");
				gamer.createMemento();
				Gamer.saveMemento();
			}else if(gamer.getMoney() < gamer.getMementoMoney()/2){
				System.out.println("当前金币少于上一次的二分之一,回滚到上次游戏信息");
				gamer.restoreMemento();
			}
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			System.out.println("");
		}
	}

}
