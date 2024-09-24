import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest {
	
	HeroInterface Strange;
	HeroInterface Spider;
	HeroInterface Hawkeye;
	HeroInterface Gorgug;
	HeroInterface Fabian;
	HeroInterface Ricky;
	HeroInterface Adaine;
	HeroInterface Legolas;
	HeroInterface BarrySyx;
	HeroInterface LibertyPrime;
	HeroInterface SnowWhite;
	HeroInterface Gimli;
	
	
	@BeforeEach void setup() throws Exception {
		
		Strange = HeroFactory.createHero("ROBOT", "MAGE");
		Spider = HeroFactory.createHero("ELF", "WARRIOR");
		Hawkeye = HeroFactory.createHero("DWARF", "ARCHER");
		Adaine = HeroFactory.createHero("ELF", "MAGE");
		Legolas = HeroFactory.createHero("ELF", "ARCHER");
		BarrySyx = HeroFactory.createHero("ROBOT", "WARRIOR");
		LibertyPrime = HeroFactory.createHero("ROBOT", "ARCHER");
		SnowWhite = HeroFactory.createHero("DWARF", "MAGE");
		Gimli = HeroFactory.createHero("DWARF", "WARRIOR");
		
		Gorgug = HeroFactory.createHero("ORC", "ARTIFICER");
		Fabian = HeroFactory.createHero("ELF", "BARD");
		Ricky = HeroFactory.createHero("HUMAN", "WARRIOR");

		
	}
	
	@Test
	public void HeroFactorytest() {
		assertEquals("ROBOT",Strange.getRaceName());
		assertEquals("ELF",Spider.getRaceName());
		assertEquals("DWARF",Hawkeye.getRaceName());
		assertEquals("MAGE",Strange.getJobName());
		assertEquals("WARRIOR",Spider.getJobName());
		assertEquals("ARCHER",Hawkeye.getJobName());
		assertEquals("ROBOT",BarrySyx.getRaceName());
		assertEquals("ELF",Adaine.getRaceName());
		assertEquals("DWARF",SnowWhite.getRaceName());
		assertEquals("MAGE",Adaine.getJobName());
		assertEquals("WARRIOR",Gimli.getJobName());
		assertEquals("ARCHER",LibertyPrime.getJobName());
		assertEquals("ROBOT",LibertyPrime.getRaceName());
		assertEquals("ELF",Legolas.getRaceName());
		assertEquals("DWARF",Gimli.getRaceName());
		assertEquals("MAGE",SnowWhite.getJobName());
		assertEquals("WARRIOR",BarrySyx.getJobName());
		assertEquals("ARCHER",Legolas.getJobName());
		assertFalse("ARCHER" == Strange.getJobName());
		assertNull(Gorgug);
		assertNull(Fabian);
		assertNull(Ricky);
	}
	@Test
	public void StatTest() {
		assertEquals(20, Strange.getSTR());
		assertEquals(25, Strange.getINT());
		assertEquals(20, Strange.getDEX());
		assertEquals(20, Spider.getSTR());
		assertEquals(20, Spider.getINT());
		assertEquals(25, Spider.getDEX());
		assertEquals(25, Hawkeye.getSTR());
		assertEquals(20, Hawkeye.getINT());
		assertEquals(20, Hawkeye.getDEX());
	}
	@Test
	public void AttackTest() {
		assertEquals(270, Strange.attack(10));
		assertEquals(225, Spider.attack(10));
		assertEquals(300, Hawkeye.attack(10));
	}

}
