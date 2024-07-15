package Phone;

public class Frame {
	private String name;
	private String color;

	public Frame(String name, String color){
		this.name = name;
		this.color = color;
	}

	public void print() {
		System.out.println("골격 이름 : "+name + "\n색상 : "+color);
	}
}
