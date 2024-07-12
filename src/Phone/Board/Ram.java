package Phone.Board;

class Ram {
	private String name;
	private int size;
	void putRam(String name, int size){
		this.name = name;
		this.size = size;
	}
	void print() {
		System.out.println("RAM이름 : "+name + "\n용량 : "+size);
	}

}
