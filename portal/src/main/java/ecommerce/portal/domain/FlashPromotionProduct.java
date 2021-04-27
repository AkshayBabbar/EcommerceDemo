package ecommerce.portal.domain;

import ormMapper.model.PmsProduct;

import java.math.BigDecimal;

public class FlashPromotionProduct extends PmsProduct {

    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
