import Phone.*;

public class Main {
	public static void main(String[] args) {
		Phone rolipop = new Phone();
		
		rolipop.print(rolipop);
		rolipop.battery = new Battery("배터리2", 50);	
		rolipop.print(rolipop.battery);
		rolipop.display = new Display("액정2", "21:9");	
		rolipop.print(rolipop.display);
		rolipop.frame = new Frame("골격2","검정");
		rolipop.print(rolipop.frame);
		rolipop.print(rolipop.speaker);
		//rolipop.speaker = new Speaker("스피커2","안좋은 성능");   변경 불가능
		rolipop.print(rolipop.speaker);
	}
}
