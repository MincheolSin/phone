package Phone;

public class Display {
	private String name;
	private String resolution;
	public Display(String name, String resolution){
		this.name = name;
		this.resolution = resolution;
	}
	void print() {
		System.out.println("액정 이름 : "+name + "\n해상도 : "+resolution);
	}
}
