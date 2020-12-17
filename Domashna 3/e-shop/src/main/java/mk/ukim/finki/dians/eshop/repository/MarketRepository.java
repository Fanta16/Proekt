package mk.ukim.finki.dians.eshop.repository;

import mk.ukim.finki.dians.eshop.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketRepository  extends JpaRepository<Market,Long> {
List<Market> findMarketsByName(String name);
List<Market> findMarketsByAddress(String address);
List<Market> findMarketsByLatitudeAndLongitude(float latitude,float longitude);



}
