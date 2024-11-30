public class Main {
    public static void main(String[] args) {

        DeliveryFactory deliveryFactory = new DeliveryFactory();


       Delivery entrega1 = new Delivery(deliveryFactory, "Joao", "211",
                "Alencar", "São carlos" );

        Delivery entrega3 = new Delivery(deliveryFactory, "Ana", "220",
                "Alencar", "São carlos" );

        Delivery entrega4 = new Delivery(deliveryFactory, "Lucas", "230",
                "Lago", "São carlos" );

        Delivery entrega5 = new Delivery(deliveryFactory, "Gus", "230",
                "Lago", "São Paulo" );




        deliveryFactory.getLocations();

    }

}