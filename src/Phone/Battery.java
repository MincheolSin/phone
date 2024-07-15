package Phone;

public class Battery {
	private String name;
	private int size;

	public Battery(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void print() {
		System.out.println("배터리 이름 : "+name + "\n배터리 용량 : "+size);
	}
	
}
