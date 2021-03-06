package com.TestExa.boot.dao;

import com.TestExa.boot.vo.Exterm;
import com.TestExa.boot.vo.ExtermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtermMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    long countByExample(ExtermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByExample(ExtermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByPrimaryKey(Integer exteid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insert(Exterm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insertSelective(Exterm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    List<Exterm> selectByExample(ExtermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    Exterm selectByPrimaryKey(Integer exteid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") Exterm record, @Param("example") ExtermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExample(@Param("record") Exterm record, @Param("example") ExtermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKeySelective(Exterm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exterm
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKey(Exterm record);
}