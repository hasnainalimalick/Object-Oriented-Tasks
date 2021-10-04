interface Car{
    void gears();
    void clutch();
}

class CarImp implements Car{

    public void gears() {
        System.out.println("this is gear");

    }

    public void clutch() {
        System.out.println("this is clutch");
    }
}



public class PracticeInterface {
    public static void main(String[] args) {
        Car c = new CarImp();
        c.gears();
        c.clutch();

    }
}
