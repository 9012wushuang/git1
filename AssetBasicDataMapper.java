package com.edianzu.cloud.assets.dao.data.basic;

import com.edianzu.cloud.assets.model.data.basic.AssetBasicData;
import com.edianzu.cloud.assets.model.data.basic.AssetBasicDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetBasicDataMapper {
    int countByExample(AssetBasicDataExample example);

    int deleteByExample(AssetBasicDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssetBasicData record);

    int insertSelective(AssetBasicData record);

    List<AssetBasicData> selectByExample(AssetBasicDataExample example);

    AssetBasicData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssetBasicData record, @Param("example") AssetBasicDataExample example);

    int updateByExample(@Param("record") AssetBasicData record, @Param("example") AssetBasicDataExample example);

    int updateByPrimaryKeySelective(AssetBasicData record);

    int updateByPrimaryKey(AssetBasicData record);
}