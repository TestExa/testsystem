package com.TestExa.boot.dao;

import com.TestExa.boot.vo.Exquestions;
import com.TestExa.boot.vo.ExquestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExquestionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    long countByExample(ExquestionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByExample(ExquestionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int deleteByPrimaryKey(Integer exqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insert(Exquestions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int insertSelective(Exquestions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    List<Exquestions> selectByExample(ExquestionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    Exquestions selectByPrimaryKey(Integer exqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") Exquestions record, @Param("example") ExquestionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByExample(@Param("record") Exquestions record, @Param("example") ExquestionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKeySelective(Exquestions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exquestions
     *
     * @mbg.generated Sat Oct 06 10:45:40 CST 2018
     */
    int updateByPrimaryKey(Exquestions record);
}