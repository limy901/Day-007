import java.util.Random;

class Ran {
	Listing list = new Listing();
	//list.readF();
	System.out.println("[0] : "+list.names[0]);
	Random r = new Random();//����Ÿ���� r�̶�� ��ü�� ����.
	int n = 20;//�������� ���� ����, 20���̴ϱ� 20.
	
	void showNum(){ //���ڻ̴� �޼ҵ�
		int i = r.nextInt(n); //0~(n-1)������ �������ڻ���.
		System.out.println("i : "+i);
		//�������� ������� i���� ��µ�.
		System.out.println("ù��° ��ǥ�� : "+list.names[0]);
	}

	public static void main(String[] args) 
	{
		Ran ran = new Ran();
		ran.showNum();
	}
}
