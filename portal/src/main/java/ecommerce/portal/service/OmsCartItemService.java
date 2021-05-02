package ecommerce.portal.service;

import ecommerce.portal.domain.CartProduct;
import ecommerce.portal.domain.CartPromotionItem;
import org.springframework.transaction.annotation.Transactional;
import ecommerce.ormmapper.model.OmsCartItem;

import java.util.List;

public interface OmsCartItemService {
    @Transactional
    int add(OmsCartItem cartItem);

    List<OmsCartItem> list(Long id);

    List<CartPromotionItem> listPromotion(Long id, List<Long> cartIds);

    int updateQuantity(Long id, Long id1, Integer quantity);

    CartProduct getCartProduct(Long productId);

    @Transactional
    int updateAttr(OmsCartItem cartItem);

    int delete(Long id, List<Long> ids);

    int clear(Long id);
}
