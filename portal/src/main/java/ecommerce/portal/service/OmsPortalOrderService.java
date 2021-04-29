package ecommerce.portal.service;

import org.springframework.transaction.annotation.Transactional;

public interface OmsPortalOrderService {
    @Transactional
    void cancelOrder(long orderId);

//ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);
}
