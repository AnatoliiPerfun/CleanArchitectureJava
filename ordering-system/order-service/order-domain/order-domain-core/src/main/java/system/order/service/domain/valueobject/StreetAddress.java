package system.order.service.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

/**
 * system.order.service.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class StreetAddress {

    private final UUID id;
    private final String street;
    private final String city;
    private final int mobile;

    public StreetAddress(String street, String city, int mobile) {
        this.id = UUID.randomUUID();
        this.street = street;
        this.city = city;
        this.mobile = mobile;
    }

    public UUID getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getMobile() {
        return mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return street.equals(that.street) &&
                city.equals(that.city) &&
                mobile == that.mobile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, mobile);
    }

    @Override
    public String toString() {
        return "StreetAddress{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
