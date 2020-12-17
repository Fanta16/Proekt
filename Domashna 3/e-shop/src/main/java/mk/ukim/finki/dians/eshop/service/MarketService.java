package mk.ukim.finki.dians.eshop.service;

import mk.ukim.finki.dians.eshop.model.Market;

import java.util.List;

public interface MarketService {
    public List<Market> findAll();
    public List<Market> findMarketsByName(String name);
    public List<Market> findMarketsByAddress(String address);
    public List<Market> findMarketsByLatitudeAndLongitude(float latitude,float longitude);


}
