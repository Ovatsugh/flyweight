public class Main2 {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();


        DeliveryLocation d1 = new DeliveryLocation(new DeliveryLocationData("Alencar", "SP"));

        DeliveryLocation d2 = new DeliveryLocation(new DeliveryLocationData("Lago", "São Carlos"));

        DeliveryLocation d3 = new DeliveryLocation(new DeliveryLocationData("Jota", "Rio Preto"));

        DeliveryLocation d4 = new DeliveryLocation(new DeliveryLocationData("Toshi", "Campinas"));


        d1.deliver("Ana", "231");
        d2.deliver("Joao", "321");
        d3.deliver("Jose", "328");

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;

        System.out.println("Memória usada: " + memoryUsed/1024 + " KB");


    }

}