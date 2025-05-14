package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

import br.com.fiap.winery.stock.WineStockService;
import br.com.fiap.winery.warning.WineWarningService;


public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        // Consumir WineStockService
        URL url1 = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qname1 = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service1 = Service.create(url1, qname1);
        WineStockService wineStock = service1.getPort(WineStockService.class);
        String order = wineStock.placeOrder("Eduardo", 3);
        System.out.println("Retorno de placeOrder: " + order);

        // Consumir WineWarningService
        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qname2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qname2);
        WineWarningService warning = service2.getPort(WineWarningService.class);
        String warn = warning.sendWarn();
        System.out.println("Retorno de sendWarn: " + warn);
    }
}
