package org.wmc.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.wmc.model.entity.ItemKill;

public interface ItemKillMapper {
    List<ItemKill> selectAll();

    ItemKill selectById(@Param("id") Integer id);

    int updateKillItem(@Param("killId") Integer killId);



    ItemKill selectByIdV2(@Param("id") Integer id);

    int updateKillItemV2(@Param("killId") Integer killId);
}