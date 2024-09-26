
public class Mage extends Job {

	public Mage() {
	}

	@Override
	public int attack(int val, int DEX, int STR, int INT) {
		return INT * val + DEX;
	}

	@Override
	public String getJobName() {
		return "MAGE";
	}

}
