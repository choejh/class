package io;

import java.io.Serializable;

public class Circle2 implements Serializable{
	
	//implements Serializable : ����ȭ�� ����̴�, �ν��Ͻ� ������ �����ϴ�.
	// ����ȭ�� �ϱ����ؼ��� �ݵ�� implements Serializable ���־�� �Ѵ�.
	
	// transient : ����ȭ ��󿡼� ����
	Point p;
	double rad;
	
	public Circle2(int xPos, int yPos, double rad) {
		p = new Point(xPos, yPos);
		this.rad=rad;
	}
	
	public void showCircleInfo() {
		System.out.printf("[%d,%d] \n", p.x, p.y);
		System.out.println("rad : "+rad);
	}

}