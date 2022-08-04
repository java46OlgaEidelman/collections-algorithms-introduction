package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.Collection;
import telran.util.List;

abstract class ListTests extends CollectionTests {

	@Test
	void addIndexTest() {
		List<Integer> list = (List<Integer>) collection;
		//TODO complete the test
	}
	//TODO write rest three tests
	@Test
	void test() {
		Integer ar[] = new Integer[3];
		System.out.println(Arrays.toString(ar));
	}
	@Override
	protected Collection<Integer> createCollection() {
		// TODO Auto-generated method stub
		return null;
	}

}
