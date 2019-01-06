package pl.sda.shop.users;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@Builder
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress {

    private String street;
    private String city;
    private String country;
    private String zipCode;

}
