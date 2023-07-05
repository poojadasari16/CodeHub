 interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
 }
 class Bicycle implements Vehicle{

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
     public void speedUp(int increment){
        speed = speed + increment;
    }
    @Override
     public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
     public void status(){
         System.out.println(speed + "\n" + gear);
     }
 }

 class Bike implements Vehicle{
    int speed;
    int gear;
    @Override
     public void changeGear(int OldGear){
        speed = speed - OldGear;
    }
    @Override
     public void speedUp(int increment_more){
        speed = speed + increment_more;
    }

     @Override
     public void applyBrakes(int decrement_more) {
        speed = speed - decrement_more;

     }
     public void status(){
        System.out.println(speed +"\n" +gear);
     }
 }

 class InterfaceVehicle {
    public static void main(String[] args){
        System.out.println("Bycycle: ");
        Bicycle bycycle = new Bicycle();
        bycycle.changeGear(2);
        bycycle.speedUp(3);
        bycycle.applyBrakes(5);
        bycycle.status();

        System.out.println("Bike: ");
        Bike bike = new Bike();
        bike.changeGear(2);
        bike.speedUp(3);
        bike.applyBrakes(4);
        bike.status();
    }
 }
