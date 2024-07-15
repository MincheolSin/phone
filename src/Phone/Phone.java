package Phone;

import Phone.Board.Board;

public class Phone {

	private Battery battery;
	private Display display;

	private final Board board;
	private final Frame frame;
	private final Mic mic ; //
	private final Touchpad touch;
	private final Speaker speaker;
	
	public Phone(String batteryName, int batterySize,
			String displayName, String displayResolution,
			String cpuName, int cpuSize, 
			String gpuName, int gpuSize, 
			String ramName, int ramSize,
			String frameName, String frameColor,
			String micName, String micPerformance,
			String touchName, String touchPerformance,
			String speakerName, String speakerPerformance
		) {
		
		battery = new Battery(batteryName, batterySize);
		display = new Display(displayName, displayResolution);

		board = new Board(cpuName, cpuSize, gpuName, gpuSize, ramName, ramSize);
		frame = new Frame(frameName, frameColor);
		mic = new Mic(micName, micPerformance); //
		touch = new Touchpad(touchName, touchPerformance);
		speaker = new Speaker(speakerName, speakerPerformance);
	
	}

	public Phone(String batteryName, int batterySize) {
		this(batteryName, batterySize,
		"액정1", "18:9",
		"cpu1",4,"gpu1",128,"ram1",16,
		"골격1", "노랑", 
		"마이크1", "좋은성능",
		"터치패드1", "적당한 성능",
		"스피커1", "적당한 성능"			
		);
	}
	
	public Phone(Battery battery,
		Display display,
		Board board,
		Frame frame,
		Mic mic,
		Touchpad touch,
		Speaker speaker
	) {
		this.battery = battery;
		this.display = display;
		this.board = board;
		this.frame = frame;
		this.mic = mic;
		this.touch = touch;
		this.speaker = speaker;
	}

	public void print() {
		
		board.printBoard();
		frame.print();
		mic.print();
		touch.print();
		display.print();
		speaker.print();
		battery.print();

		System.out.println();
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Battery getBattery() {
		return battery;
	}

	public Display getDisplay() {
		return display;
	}

	public Board getBoard() {
		return board;
	}

	public Frame getFrame() {
		return frame;
	}

	public Mic getMic() {
		return mic;
	}

	public Touchpad getTouch() {
		return touch;
	}

	public Speaker getSpeaker() {
		return speaker;
	}


	
}
