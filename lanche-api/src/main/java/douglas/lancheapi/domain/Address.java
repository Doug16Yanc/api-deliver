package douglas.lancheapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor
public class Address {
    private String zipcode;

    private String addressLine;
}

