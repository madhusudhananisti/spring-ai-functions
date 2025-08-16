package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@JsonInclude(JsonInclude.Include.NON_NULL)

public record StockPriceRequest(@JsonProperty(required = true, value = "ticker")
                             @JsonPropertyDescription("The ticker symbol of a stock: AAPL") String ticker) {
}
