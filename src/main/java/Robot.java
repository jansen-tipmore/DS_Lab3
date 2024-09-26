
public class Robot extends Race {

	public Robot(Job j) {
		super(j);
	}

	@Override
	public int getINT() {
		return 25;
	}
	
	
	@Override
	public String getRaceName() {
		return "ROBOT";
	}

}
