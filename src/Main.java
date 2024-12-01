public class Main {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();


        DeliveryFactory deliveryFactory = new DeliveryFactory();



       new Delivery(deliveryFactory, "Ana", "220",
                "Alencar", "São carlos" );

       new Delivery(deliveryFactory, "Lucas", "230",
                "Jus", "Minas Gerais" );

       new Delivery(deliveryFactory, "Gus", "230",
                "Lago", "São Paulo" );


        deliveryFactory.getLocations();

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;

        System.out.println("Memória usada: " + memoryUsed/1024 + " KB");


    }

}