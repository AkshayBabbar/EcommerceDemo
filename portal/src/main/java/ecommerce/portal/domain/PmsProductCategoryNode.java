package ecommerce.portal.domain;

import ecommerce.ormmapper.model.PmsProductCategory;

import java.util.List;

public class PmsProductCategoryNode extends PmsProductCategory {
    private List<PmsProductCategoryNode> children;
}
