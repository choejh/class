package collection;

public class SimpleNumber {

	int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
	
	//set ���� �񱳸� ���� hashCode(), equals() �������̵� 
	
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + num;
		return num%3;	//0 or 1 or 2
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	//���� �ּҰ� == ���� �ּҰ�
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //Ŭ���� �̸��� ���ƾ��Ѵ�. ���� Ÿ���̾�� �Ѵ�.
			return false;
		SimpleNumber other = (SimpleNumber) obj; //����ȯ
		if (num != other.num)	 
			return false;	
		return true;
	}
	
	
	
	
	
}
