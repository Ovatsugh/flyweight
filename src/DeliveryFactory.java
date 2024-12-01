import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeliveryFactory {
    private final Map<String, DeliveryLocation> locations = new HashMap<>();


    private String createId(DeliveryLocationData data) {
        // Usa Stream para processar os valores
        return Stream.of(data.street(), data.ciy()) // Obtém os valores de `DeliveryLocationData`
                .map(item -> item.replaceAll("\\s+", "").toLowerCase()) // Remove espaços e converte para minúsculas
                .collect(Collectors.joining("_")); // Junta os valores com '_'
    }

    DeliveryLocation makeLocation(DeliveryLocationData intrinsicState) {
        String key = createId(intrinsicState);

        //   Procurando se já existe um DeliveryLocation com a mesma chave
        if (locations.containsKey(key)) {
            return this.locations.get(key);
        }

        DeliveryLocation deliveryLocation = new DeliveryLocation(intrinsicState);
        this.locations.put(key, deliveryLocation);
        return this.locations.get(key);
    }


    public void getLocations() {
        System.out.println("[ LOCATIONS ]");
        // Itera sobre o mapa e imprime cada chave e valor
        for (Map.Entry<String, DeliveryLocation> entry : locations.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Localização: " + entry.getValue());
        }
    }
}
