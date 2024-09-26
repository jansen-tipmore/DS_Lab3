
public abstract class Race implements HeroInterface {
	
	Job job;
	
	public Race(Job j) {
		this.job = j;
	}

	@Override
	public int attack(int val) {
		return job.attack(val, this.getDEX(), this.getSTR(), this.getINT());
	}

	@Override
	public int getSTR() {
		return 20;
	}

	@Override
	public int getDEX() {
		return 20;
	}

	@Override
	public int getINT() {
		return 20;
	}

	@Override
	public abstract String getRaceName();

	@Override
	public String getJobName() {
		return job.getJobName();
	}	

}
