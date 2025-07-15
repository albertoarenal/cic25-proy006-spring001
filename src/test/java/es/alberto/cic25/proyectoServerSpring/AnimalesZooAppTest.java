package es.alberto.cic25.proyectoServerSpring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimalesZooAppTest {

	@Autowired
	private ZooController zooController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCrearPerro() {

		assertEquals("Perro", zooController.getPerro().getNombre());
	}

	@Test
	public void testAnimalesZoo() {

		assertEquals(4, zooController.get().size());
	}

}
