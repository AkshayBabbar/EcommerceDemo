package ecommerce.portal.service;

import ecommerce.portal.domain.MemberReadHistory;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MemberReadHistoryService {
    int add(MemberReadHistory memberReadHistory);

    int delete(List<String> ids);

    void clear();

    Page<MemberReadHistory> list(Integer pageNum, Integer pageSize);
}
