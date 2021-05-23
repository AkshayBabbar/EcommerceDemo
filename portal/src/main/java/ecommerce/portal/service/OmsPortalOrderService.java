package ecommerce.portal.service;

import ecommerce.common.api.CommonPage;
import ecommerce.portal.domain.ConfirmOrderResult;
import ecommerce.portal.domain.OmsOrderDetail;
import ecommerce.portal.domain.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface OmsPortalOrderService {
    @Transactional
    void cancelOrder(long orderId);

    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);


    Map<String, Object> generateOrder(OrderParam orderParam);

    void deleteOrder(Long orderId);

    void confirmReceiveOrder(Long orderId);

    @Transactional
    Integer paySuccess(Long orderId, Integer payType);

    @Transactional
    Integer cancelTimeOutOrder();

    void sendDelayMessageCancelOrder(Long orderId);

    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);

    OmsOrderDetail detail(Long orderId);
}
