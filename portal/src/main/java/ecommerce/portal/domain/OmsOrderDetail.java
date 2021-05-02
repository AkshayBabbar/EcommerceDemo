package ecommerce.portal.domain;

import ecommerce.ormmapper.model.OmsOrder;
import ecommerce.ormmapper.model.OmsOrderItem;

import java.util.List;

public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
