
public class Elf extends Race {

	public Elf(Job j) {
		super(j);
	}
	
	public int getDEX() {
		return 25;
	}
	
	@Override
	public String getRaceName() {
		return "ELF";
	}

}

