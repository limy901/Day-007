import java.util.Random;

class Ran {
	Listing list = new Listing();
	//list.readF();
	System.out.println("[0] : "+list.names[0]);
	Random r = new Random();//랜덤타입의 r이라는 객체를 만듦.
	int n = 20;//랜덤값에 사용될 갯수, 20명이니까 20.
	
	void showNum(){ //숫자뽑는 메소드
		int i = r.nextInt(n); //0~(n-1)까지의 랜덤숫자뽑힘.
		System.out.println("i : "+i);
		//랜덤으로 만들어진 i값이 출력됨.
		System.out.println("첫번째 발표자 : "+list.names[0]);
	}

	public static void main(String[] args) 
	{
		Ran ran = new Ran();
		ran.showNum();
	}
}
