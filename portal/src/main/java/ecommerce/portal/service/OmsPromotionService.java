package ecommerce.portal.service;

import ecommerce.ormmapper.model.OmsCartItem;
import ecommerce.portal.domain.CartPromotionItem;

import java.util.List;

public interface OmsPromotionService {
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
