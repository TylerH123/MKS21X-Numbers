public class RealNumber{
  private double numerator;
  private double denominator;
  public RealNumber compareReals(RealNumber num, RealNumber num2){
    return num;
  }
  public double compareRatReal(double num, RealNumber num2){
    return num;
  }
  public double getVal(){
    return numerator / denominator;
  }
  public void setVal(double num, double denom){
    numerator = num;
    denominator = denom;
  }
  public String toString(){
    return numerator + "/" + denominator;
  }
}
