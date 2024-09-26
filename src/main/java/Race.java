
public abstract class Race implements HeroInterface {
	
	Job job;
	
	public Race() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack(int val) {
		// TODO Auto-generated method stub
		return job.attack(val, this.getDEX(), this.getSTR(), this.getINT());
	}

	@Override
	public int getSTR() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getDEX() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getINT() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public abstract String getRaceName();

	@Override
	public abstract String getJobName();

}
