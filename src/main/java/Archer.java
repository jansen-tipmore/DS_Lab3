
public abstract class Archer extends Job {


	public Archer() {
		// TODO Auto-generated constructor stub
	}


	public int attack(int val, int DEX, int STR, int INT) {
		return (int) (DEX * 1.5 * val);
		
	}

	@Override
	public String getJobName() {
		return "ARCHER";
	}

}
