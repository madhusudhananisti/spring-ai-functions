package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.math.BigDecimal;

public record WeatherResponse(@JsonPropertyDescription("WindSpeed in KMH") BigDecimal winSpeed,
                              @JsonPropertyDescription("Direction of wind") Integer windDegrees,
                              @JsonPropertyDescription("Current temparature in celcius") Integer temp,
                              @JsonPropertyDescription("Current Humidity") Integer humidity,
                              @JsonPropertyDescription("Epoch time of sunset GMT") Integer sunSet,
                              @JsonPropertyDescription("Epoch time of sunrise GMT") Integer sunRise,
                              @JsonPropertyDescription("Low temperature in celsius") Integer minTemp,
                              @JsonPropertyDescription("Cloud Coverage Percentage") Integer cloudPct,
                              @JsonPropertyDescription("Temperature in Celcius") Integer feelsLike,
                              @JsonPropertyDescription("Max temperature in celsius") Integer maxTemp) {
}