package rejakpiotr.currencycalculator.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import rejakpiotr.currencycalculator.webclient.exchange.dto.OpenCurrencyDto;

@Component
public class ExchangeClient {

    private static final String EXCHANGE_URL = "https://api.nbp.pl/api/exchangerates/tables/C/";
    private RestTemplate restTemplate = new RestTemplate();

    public String getExchangeCurrency() {
        return callGetMethod (EXCHANGE_URL,
                OpenCurrencyDto.class,
                String.class);



    }
    public <T> T callGetMethod(String String exchangeUrl,
                                Class<OpenCurrencyDto> openCurrencyDtoClass,
                                Class<T> responseType) {
        return restTemplate.getForObject (EXCHANGE_URL,
                responseType);
}
