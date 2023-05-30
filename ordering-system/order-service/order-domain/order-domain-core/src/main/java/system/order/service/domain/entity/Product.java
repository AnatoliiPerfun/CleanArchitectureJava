package system.order.service.domain.entity;

import system.domain.entity.BaseEntity;
import system.domain.valueobject.Money;
import system.domain.valueobject.ProductId;

/**
 * system.order.service.domain.entity
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId ProductId, String name, Money price) {
        super.setId(ProductId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
