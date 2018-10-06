package com.TestExa.boot.dao;

import com.TestExa.boot.vo.Extype;
import com.TestExa.boot.vo.ExtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    long countByExample(ExtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByExample(ExtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByPrimaryKey(Integer extid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insert(Extype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insertSelective(Extype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    List<Extype> selectByExample(ExtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    Extype selectByPrimaryKey(Integer extid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") Extype record, @Param("example") ExtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExample(@Param("record") Extype record, @Param("example") ExtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKeySelective(Extype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table extype
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKey(Extype record);
}