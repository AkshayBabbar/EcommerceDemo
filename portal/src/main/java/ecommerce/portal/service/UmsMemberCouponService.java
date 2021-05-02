package ecommerce.portal.service;

import ecommerce.ormmapper.model.SmsCoupon;
import ecommerce.ormmapper.model.SmsCouponHistory;
import ecommerce.portal.domain.CartPromotionItem;
import ecommerce.portal.domain.SmsCouponHistoryDetail;

import java.util.List;

public interface UmsMemberCouponService {
    void add(Long couponId);

    List<SmsCouponHistory> listHistory(Integer useStatus);

    List<SmsCoupon> list(Integer useStatus);

    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartPromotionItemList, Integer type);

    List<SmsCoupon> listByProduct(Long productId);

}
