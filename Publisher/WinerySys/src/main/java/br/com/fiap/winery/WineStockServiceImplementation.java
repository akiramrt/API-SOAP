package br.com.fiap.winery;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Cabernet Sauvignon, Merlot, Pinot Noir, Syrah, Malbec";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! " + quantity + " garrafas de " + name;
    }
}