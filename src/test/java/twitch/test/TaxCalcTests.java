package twitch.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import twitch.TaxCalculator;

public class TaxCalcTests {

  @Test
  //18000 -> 8000*.1 -> 800
  //22000 -> 10000*.1 + 2000*.2 ->1400
  //48000 -> 10000*.1 + 28000*.2 -> 6600
  //80000 -> 10000*.1 + 30000*.2 + 30000*.3 -> 16000
  public void testTaxCalc() {
    TaxCalculator calc = new TaxCalculator();

    assertEquals(0, calc.calculateTaxes(10000), 0);
    assertEquals(800, calc.calculateTaxes(18000), 0);
    assertEquals(1400, calc.calculateTaxes(22000), 0);
    assertEquals(6600, calc.calculateTaxes(48000), 0);
    assertEquals(16000, calc.calculateTaxes(80000), 0);
  }
}
