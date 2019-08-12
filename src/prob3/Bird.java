package prob3;

public abstract class Bird {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void fly();  //명시적으로 추상 메소드라고 지정해놓으면 자식클래스에서 무조건 구현해야한다.
	public abstract void sing(); //명시적으로 추상 메소드라고 지정해놓으면 자식클래스에서 무조건 구현해야한다.
	
//	public void fly() {
//		
//	}
//	public void sing() {
//		
//	}
}
