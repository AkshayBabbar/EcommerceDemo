package ecommerce.portal.service;

import ecommerce.ormmapper.model.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    int add(UmsMemberReceiveAddress address);

    int delete(Long id);

    int update(Long id, UmsMemberReceiveAddress address);

    List<UmsMemberReceiveAddress> list();

    UmsMemberReceiveAddress getItem(Long id);

}
