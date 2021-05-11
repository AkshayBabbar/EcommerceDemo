package ecommerce.portal.dao;

import ecommerce.ormmapper.model.SmsCoupon;
import ecommerce.portal.domain.CartProduct;
import ecommerce.portal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Long id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId")Long productCategoryId);
}
