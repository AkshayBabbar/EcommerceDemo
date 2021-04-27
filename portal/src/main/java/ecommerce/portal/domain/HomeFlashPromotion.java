package ecommerce.portal.domain;

import java.util.Date;
import java.util.List;

public class HomeFlashPromotion {
    private Date startTime;
    private Date endTime;
    private Date nextStartTime;
    private Date nextEndTime;
    //Commodities belonging to the spike activity
    private List<FlashPromotionProduct> productList;
}
