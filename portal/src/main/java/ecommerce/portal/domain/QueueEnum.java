package ecommerce.portal.domain;

import lombok.Getter;

/**
 * Message queue enumeration configuration
 */

@Getter
public enum QueueEnum {
    /**
     * Message notification queue
     */
    QUEUE_ORDER_CANCEL("ecommerce.order.direct", "ecommerce.order.cancel", "ecommerce.order.cancel"),
    /**
     * Message notification ttl queue
     */
    QUEUE_TTL_ORDER_CANCEL("ecommerce.order.direct.ttl", "ecommerce.order.cancel.ttl", "ecommerce.order.cancel.ttl");


    /**
     * Exchange name
     */
    private String exchange;

    /**
     * Queue Name
     */
    private String name;

    /***
     * Routing Key
     */
    private String routeKey;

    /**
     * @param exchange
     * @param name
     * @param routeKey
     */
    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
