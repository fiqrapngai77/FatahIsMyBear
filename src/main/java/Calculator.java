public class Calculator {
  public int evaluate(String expression) {
	  /* KEVIN HERE~@VUYBIUONIP */
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
	System.out.println("Meow");
    return sum;
	
  }
}
