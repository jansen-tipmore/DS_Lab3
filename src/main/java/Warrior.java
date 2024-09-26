
public class Warrior extends Job {

	public Warrior() {
	}

	@Override
	public int attack(int val, int DEX, int STR, int INT) {
		return STR * val + DEX;
	}

	@Override
	public String getJobName() {
		return "WARRIOR";
	}

}
