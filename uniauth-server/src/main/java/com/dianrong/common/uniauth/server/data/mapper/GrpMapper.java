package com.dianrong.common.uniauth.server.data.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.codahale.metrics.annotation.Timed;
import com.dianrong.common.uniauth.common.bean.dto.GroupDto;
import com.dianrong.common.uniauth.server.data.entity.Grp;
import com.dianrong.common.uniauth.server.data.entity.GrpExample;

public interface GrpMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    @Timed
    int countByExample(GrpExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByExample(GrpExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insert(Grp record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insertSelective(Grp record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    @Timed
    List<Grp> selectByExample(GrpExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    @Timed
    Grp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExampleSelective(@Param("record") Grp record, @Param("example") GrpExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExample(@Param("record") Grp record, @Param("example") GrpExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByPrimaryKeySelective(Grp record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByPrimaryKey(Grp record);

    List<Grp> getGroupTree(Integer groupId);

    List<HashMap<String, Integer>> getGroupTreeLinks(Integer groupId);

    Integer selectNameCountBySameLayerGrpId(Integer groupId);

    Integer checkOwner(Map<String, Object> paramMap);

    Set<Integer> getOwnGrpIds(Long ownerId);

    Integer getUserIdInGroupOrSub(Map<String, Object> paramMap);

    @Timed
    List<GroupDto> listGroupsRelateToUser(Map<String, Object> paramMap);
}
