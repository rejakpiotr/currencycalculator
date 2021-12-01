package rejakpiotr.currencycalculator.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rejakpiotr.currencycalculator.model.ExchangeDto;
import rejakpiotr.currencycalculator.services.ExchangeService;

@RestController
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @GetMapping("/exchange")
    public ExchangeDto getExchangeCourse() {
        return exchangeService.getExchangeCourse();
    }
}
