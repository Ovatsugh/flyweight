public class DeliveryLocation  {

    private final DeliveryLocationData intrinsicState;

    public DeliveryLocation(DeliveryLocationData intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void deliver(String name, String number) {
        System.out.println("Entrega para: " + name);
        System.out.println("Numero: " + number);
        System.out.println("Em: " + this.intrinsicState.street() + "," + this.intrinsicState.ciy());
        System.out.println("############################");
    }

    @Override
    public String toString() {
        return  this.intrinsicState.street() + "," + this.intrinsicState.ciy();
    }
}
