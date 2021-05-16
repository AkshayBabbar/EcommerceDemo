package ecommerce.portal.domain;

import ecommerce.ormmapper.model.CmsSubject;
import ecommerce.ormmapper.model.PmsBrand;
import ecommerce.ormmapper.model.PmsProduct;
import ecommerce.ormmapper.model.SmsHomeAdvertise;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HomeContentResult {

    //Carousel ads
    private List<SmsHomeAdvertise> advertiseList;
    //Recommended Brand
    private List<PmsBrand> brandList;
    //Current spike
    private HomeFlashPromotion homeFlashPromotion;
    //New Products
    private List<PmsProduct> newProductList;
    //Popular recommendation
    private List<PmsProduct> hotProductList;
    //Recommended topics
    private List<CmsSubject> subjectList;
}
