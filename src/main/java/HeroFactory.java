public class HeroFactory
{


	public static HeroInterface createHero(String raceName, String jobName) {
		Race r = null;
		if (jobName == "ARCHER") {
			Job j = new Archer();
			if (raceName == "ELF") {
				 r = new Elf(j);
			}
			else if(raceName == "DWARF") {
				 r = new Dwarf(j);
			}
			else if(raceName == "ROBOT") {
				 r = new Robot(j);
			}
		}
		else if(jobName == "WARRIOR") {
			Job j = new Warrior();
			if (raceName == "ELF") {
				 r = new Elf(j);
			}
			else if(raceName == "DWARF") {
				 r = new Dwarf(j);
			}
			else if(raceName == "ROBOT") {
				 r = new Robot(j);
			}
		}
		else if (jobName == "MAGE") {
			Job j = new Mage();
			if (raceName == "ELF") {
				 r = new Elf(j);
			}
			else if(raceName == "DWARF") {
				 r = new Dwarf(j);
			}
			else if(raceName == "ROBOT") {
				 r = new Robot(j);
			}
		}
		return r;
   }
	
}