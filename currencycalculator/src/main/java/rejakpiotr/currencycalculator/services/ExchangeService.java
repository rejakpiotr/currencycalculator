package rejakpiotr.currencycalculator.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rejakpiotr.currencycalculator.model.ExchangeDto;
import rejakpiotr.currencycalculator.webclient.ExchangeClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExchangeService {

    private final ExchangeClient exchangeClient;

    public ExchangeDto getExchangeCourse() {
        String response = exchangeClient.getExchangeCurrency("USD");
        log.info(response);
        return null;
    }




}
