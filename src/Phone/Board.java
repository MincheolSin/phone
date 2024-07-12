package Phone;

class Board{
	private class Cpu {
		private String name;
		private int size;
		void putCpu(String name, int size){
			this.name = name;
			this.size = size;
		}
		void print() {
			System.out.println("CPU이름 : "+name + "\n코어 : "+size);
		}
	}
	
	private class Gpu {
		private String name;
		private int size;
		void putGpu(String name, int size){
			this.name = name;
			this.size = size;		
		}
		void print() {
			System.out.println("GPU이름 : "+name + "\n용량 : "+size);
		}
	}
	
	private class Ram {
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
	
	private Cpu cpu = new Cpu();
	private Gpu gpu = new Gpu();
	private Ram ram = new Ram();
	
	private void cpuMaker(String a, int b) {
		cpu.putCpu(a,b);
	}
	private void gpuMaker(String a, int b) {
		gpu.putGpu(a, b);
	}
	private void ramMaker(String a, int b) {
		ram.putRam(a,b);
	}
	
	Board(String cpuname, int cpusize,String gpuname, int gpusize,String ramname, int ramsize) {
		cpuMaker(cpuname,cpusize);
		gpuMaker(gpuname,gpusize);
		ramMaker(ramname,ramsize);
	}
	
	void printBoard() {
		cpu.print();
		gpu.print();
		ram.print();
	}

}
