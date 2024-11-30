public class Delivery {

    public Delivery(DeliveryFactory factory, String name, String number, String street, String city) {
        DeliveryLocationData locationData = new DeliveryLocationData(street, city);
        DeliveryLocation location = factory.makeLocation(locationData);
        location.deliver(name, number);
    }
}
