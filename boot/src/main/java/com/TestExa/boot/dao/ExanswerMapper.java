package com.TestExa.boot.dao;

import com.TestExa.boot.vo.Exanswer;
import com.TestExa.boot.vo.ExanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExanswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    long countByExample(ExanswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByExample(ExanswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByPrimaryKey(Integer exaid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insert(Exanswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insertSelective(Exanswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    List<Exanswer> selectByExample(ExanswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    Exanswer selectByPrimaryKey(Integer exaid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") Exanswer record, @Param("example") ExanswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExample(@Param("record") Exanswer record, @Param("example") ExanswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKeySelective(Exanswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exanswer
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKey(Exanswer record);
}