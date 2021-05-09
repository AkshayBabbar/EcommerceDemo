package ecommerce.portal.service.impl;

import ecommerce.ormmapper.mapper.*;
import ecommerce.ormmapper.model.CmsSubject;
import ecommerce.ormmapper.model.PmsProduct;
import ecommerce.portal.dao.HomeDao;
import ecommerce.portal.domain.HomeContentResult;
import ecommerce.portal.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HomeServiceImpl implements HomeService {
    @Autowired
    private SmsHomeAdvertiseMapper advertiseMapper;
    @Autowired
    private HomeDao homeDao;
    @Autowired
    private SmsFlashPromotionMapper flashPromotionMapper;
    @Autowired
    private SmsFlashPromotionSessionMapper promotionSessionMapper;
    @Autowired
    private PmsProductMapper productMapper;
    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;
    @Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public HomeContentResult content() {
        return null;
    }

    @Override
    public List<PmsProduct> recommedProductList(Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<CmsSubject> getSubjectList(Long categoryId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public List<PmsProduct> newProductList(Integer pageNum, Integer pageSize) {
        return null;
    }
}
