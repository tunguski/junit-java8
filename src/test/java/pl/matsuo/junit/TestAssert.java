package pl.matsuo.junit;

import org.junit.Test;

import static pl.matsuo.junit.Assert.*;

/**
 * Created by marek on 17.04.14.
 */
public class TestAssert {


  @Test
  public void testMethods() {
    try {
      assertEquals(() -> "test 1", 1, 2);
    } catch (AssertionError e) {
      if (!e.getMessage().equals("test 1 expected:<1> but was:<2>")) {
        throw new AssertionError("Wrong text: '" + e.getMessage() + "'");
      }
    }
  }
}
