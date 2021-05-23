package ecommerce.portal.component;

import ecommerce.portal.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * The timer for canceling and unlocking the inventory when the order expires
 */

@Component
public class OrderTimeOutCancelTask {

    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    @Autowired
    private OmsPortalOrderService portalOrderService;

    /**
     * cron expression: Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * Scan every 10 minutes, scan the order placed before the set timeout period, if not paid, cancel the order
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOfOrder() {
        Integer count = portalOrderService.cancelTimeOutOrder();
        LOGGER.info("Cancel the order, release the locked inventory according to the sku number, and cancel the order quantity:{}", count);
    }


}
