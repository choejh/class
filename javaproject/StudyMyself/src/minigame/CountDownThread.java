package minigame;

class CountDownThread extends Thread {
	//public static boolean timeOver=false;
	//public static boolean gameOver=false;
	
//	Over o;
//
//	public CountDownThread(Over o) {
//		this.o = o;
//	}

	@Override
	public void run() {
	 static boolean timeOver=false;
	boolean gameOver=false;
		for (int i = 15; i >= 0; i--) {
			if(gameOver) {
				return;
			}
//			if (o.gameOverCheck) {
//				return;
//			}

			try {
				System.out.println("\t\t" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		timeOver=true;
//		o.timeOverCheck=true;
	}
}