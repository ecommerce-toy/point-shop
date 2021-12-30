package product.demo.shop.domain.product.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import product.demo.shop.common.entity.AuditEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product_category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductCategoryEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_category_id")
    private Long productCategoryId;

    @Column(name = "parent")
    private Long parent;

    @Column(name = "product_category_name")
    private String productCategoryName;

    public static ProductCategoryEntity of(long productCategoryId, long parent, String productCategoryName) {
        return new ProductCategoryEntity(productCategoryId, parent, productCategoryName);
    }

    public static ProductCategoryEntity of(long parent, String productCategoryName) {
        return new ProductCategoryEntity(null, parent, productCategoryName);
    }
}
