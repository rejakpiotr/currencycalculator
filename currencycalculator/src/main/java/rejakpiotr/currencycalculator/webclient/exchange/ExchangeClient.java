package rejakpiotr.currencycalculator.webclient.exchange;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeClient {

    private static final String EXCHANGE_URL = "http://api.nbp.pl/api/exchangerates";
    private RestTemplate restTemplate = new RestTemplate();

    public String getExchangeUSD( String code) {
        return restTemplate.getForObject (EXCHANGE_URL + "/rates/C/{code}/last/6/",
                String.class, code);

    }
}
