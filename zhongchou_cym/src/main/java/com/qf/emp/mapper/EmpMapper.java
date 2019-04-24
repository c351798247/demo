package com.qf.emp.mapper;

import com.qf.pojo.Emp;
import com.qf.pojo.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    List<Emp> selectByExampleWithRowbounds(EmpExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    Emp selectByPrimaryKey(Short empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Emp record);
}