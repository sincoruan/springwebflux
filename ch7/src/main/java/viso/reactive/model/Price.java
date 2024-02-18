package viso.reactive.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {
    private Integer coefficient;
    private Integer exponent;
    private String currency;
}
