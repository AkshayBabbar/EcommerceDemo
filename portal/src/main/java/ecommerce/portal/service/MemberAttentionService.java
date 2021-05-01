package ecommerce.portal.service;

import ecommerce.portal.domain.MemberBrandAttention;

public interface MemberAttentionService {
    /**
     * subscribe for  brand attention
     *
     * @param memberBrandAttention
     * @return
     */
    int subscribe(MemberBrandAttention memberBrandAttention);

    /**
     * Unsubscribe/delete brand from the list
     *
     * @param brandId
     * @return
     */
    int unsubscribe(Long brandId);

    /**
     * Get Details for Brand
     *
     * @param brandId
     * @return
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * Clear Watchlist
     */
    void clear();
}
