package first;

//1020

 public abstract class Player {

	//�߻�Ŭ���� : Ŭ������ ��� �޼��� �߿� �ϳ��� �߻� �޼��带 ������ �߻�Ŭ������ �ȴ�.
	
	//�߻�޼��� : �����ϴ� {} �����ΰ� ���� �޼���, �޼��� ���Ǻο� abstract Ű���带 ���ش�.
	//			���� ���������� ; ���� �����Ѵ�. 
	abstract void play(int num);
	abstract void stop();
	
	
	
}


 abstract class VideoPlayer extends Player{
	 //�߻� Ŭ������ ����ؼ� �߻�޼��� play, stop �� ������.
	 //VideoPlayer Ŭ������ �߻�Ŭ������.

 }
 
 class AudioPlayer extends Player{
	 //�߻�Ŭ����(���� Ŭ����)�� void play(int num) �޼��带 �������̵� : �����Ѵ�.
	 void play(int num) {
		 
	 }
	 void stop() {
		 
	 }
	 
 }