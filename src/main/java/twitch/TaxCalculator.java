package twitch;

public class TaxCalculator {

  private double[][] taxBracket = new double[][] {{10000, 0}, {10000, .1}, {30000, .2}, {-1, .3}};

  public double calculateTaxes(double income) {
    double taxesOwed = 0;

    for (double[] bracket : taxBracket) {
      if (income < bracket[0]) {
        return taxesOwed + income * bracket[1];
      } else if (bracket[0] == -1) {
        return taxesOwed + income * bracket[1];
      } else {
        taxesOwed += bracket[0] * bracket[1];
        income -= bracket[0];
      }
    }
    return taxesOwed;
  }
}
