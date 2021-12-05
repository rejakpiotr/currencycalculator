package rejakpiotr.currencycalculator.webclient.exchange;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeClient {

    private static final String EXCHANGE_URL = "https://api.nbp.pl/api/exchangerates/tables/C/";
    private RestTemplate restTemplate = new RestTemplate();

    public String getExchangeCurrency(String code) {
        return restTemplate.getForObject (EXCHANGE_URL,
                String.class);

    }
}
