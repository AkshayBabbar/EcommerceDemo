package ecommerce.portal.service;

import ecommerce.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

public interface MemberCollectionService {
    int add(MemberProductCollection productCollection);

    int delete(Long brandId);

    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    MemberProductCollection detail(Long productId);

    void clear();
}
