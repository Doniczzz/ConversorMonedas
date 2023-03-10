
package conversor;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gabriel
 */
public class ConversorMonedas {
    
    private final Map<String, Double> precios;
    private final String[] monedas = {"ARS", "USD", "EUR", "GBP", "YEN", "KRW"};
    
    public ConversorMonedas() {
        precios = new HashMap<>();
        precios.put("ARS", 0.0027); // 1 dólar = 76 pesos argentinos
        precios.put("USD", 1.0);   // 1 dólar = 1 dólar
        precios.put("EUR", 1.19);  // 1 dólar = 0.84 euros
        precios.put("GBP", 1.18);  // 1 dólar = 0.84 libras esterlinas
        precios.put("YEN", 0.0073); // 1 dólar =  136.99 Yenes japoneses
        precios.put("KRW", 0.00076); // 1 dólar = 1,315.79 Wones
    }
    
    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        double precioOrigen = precios.get(monedaOrigen);
        double precioDestino = precios.get(monedaDestino);
        return cantidad * precioOrigen / precioDestino;
    }
    
    public String[] getMonedas() {
        return monedas;
    }
    
}
