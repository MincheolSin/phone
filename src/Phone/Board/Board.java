package Phone.Board;

public class Board{
	final private Cpu cpu;
	final private Gpu gpu;
	final private Ram ram;
	
	public Board(String cpuname, int cpusize,String gpuname, int gpusize,String ramname, int ramsize) {
		cpu = new Cpu(cpuname,cpusize);
		gpu = new Gpu(gpuname, gpusize);
		ram = new Ram(ramname, ramsize);
	}
	
	public void printBoard() {
		cpu.print();
		gpu.print();
		ram.print();
	}

}
