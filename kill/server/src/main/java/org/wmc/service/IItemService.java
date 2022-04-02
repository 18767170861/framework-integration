package org.wmc.service;

import java.util.List;
import org.wmc.model.entity.ItemKill;

public interface IItemService {

    List<ItemKill> getKillItems() throws Exception;

    ItemKill getKillDetail(Integer id) throws Exception;
}
