package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNull;

@SpringBootTest

class WeatherApplicationTests {

	@Test
	void equalTest(){
		assertEquals("",1,1);
	    //given
	    //when
	    //then
	}
	@Test
	void nullTest() {
		assertNull("",null);
	    //given
	    //when
	    //then
	}

}
