package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@JsonInclude(JsonInclude.Include.NON_NULL)

public record WeatherRequest(@JsonProperty(required = true, value = "location")
                             @JsonPropertyDescription("The city and state eg: Sanfrancisco, CA") String location,
                             @JsonProperty(required = false)
                             @JsonPropertyDescription("Optional use full name of state, for US cities only") String state,
                             @JsonProperty(required = false)
                             @JsonPropertyDescription("Optional country name") String country) {
}
