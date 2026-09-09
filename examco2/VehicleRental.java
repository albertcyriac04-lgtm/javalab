class Vehicle{
   protected String regNo;
   protected double dailyRate;
   
   Vehicle(String regNo, double dailyRate){
      this.regNo = regNo;
      this.dailyRate = dailyRate;
    }
 double computeRent(int days) {
        return dailyRate * days;
    }
}
class Car extends Vehicle{
  private int numDoor;
  Car(String regNo,double dailyRate,int numDoor){
    super(regNo,dailyRate);
    this.numDoor = numDoor;}
    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Car c = new Car("KL01AB1234", 1500, 4);
        System.out.println("Rent = " + c.computeRent(5));
    }
}