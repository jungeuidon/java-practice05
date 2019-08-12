package prob3;

public class Sparrow extends Bird{
	
//	@Override
//	public void fly() {
//		System.out.println("참새("+super.getName()+")는 날지 않습니다.");
//	}
//
//	@Override
//	public void sing() {
//		System.out.println("참새("+super.getName()+")가 소리내어 웁니다.");
//	}
//	
//	@Override
//	public String toString() {
//		return "참새의 이름은 " + super.getName() + "입니다.";
//	}
	
	private String name; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("참새("+getName()+")는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println("참새("+getName()+")가 소리내어 웁니다.");
	}
	
	@Override
	public String toString() {
		return "참새의 이름은 " + getName() + "입니다.";
	}
}
