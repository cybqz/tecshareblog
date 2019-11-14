package com.cyb.blogserver.service;

import com.cyb.blogserver.domain.Parames;
import com.cyb.blogserver.domain.ParamesExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ParamesServices {
	
	public static Map<String, String> PARAMESMAP = new HashMap<String, String>();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    long countByExample(ParamesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int deleteByExample(ParamesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int insert(Parames record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int insertSelective(Parames record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    List<Parames> selectByExample(ParamesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    Parames selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") Parames record, @Param("example") ParamesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int updateByExample(@Param("record") Parames record, @Param("example") ParamesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int updateByPrimaryKeySelective(Parames record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parames
     *
     * @mbg.generated Thu Feb 14 14:51:18 CST 2019
     */
    int updateByPrimaryKey(Parames record);
}