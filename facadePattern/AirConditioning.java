public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("AirCon is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AirCon is turned OFF");
    }
}