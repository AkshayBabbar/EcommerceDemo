package ecommerce.portal.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "order.cancel")
public class CancelOrderReceiver {

    private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderReceiver.class);

}
