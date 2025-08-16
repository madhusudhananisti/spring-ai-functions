package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.math.BigDecimal;

public record StockPriceResponse(@JsonPropertyDescription("Ticker symbol of a stock") String ticker,
                                 @JsonPropertyDescription("Name of the stock") String name,
                                 @JsonPropertyDescription("Price of the stock") Double price,
                                 @JsonPropertyDescription("Current Humidity") Integer humidity,
                                 @JsonPropertyDescription("Exchange of the stock") String exchange,
                                 @JsonPropertyDescription("Epoch time of stock last updated") Integer updated,
                                 @JsonPropertyDescription("Currency of the stock price") String currency) {
}