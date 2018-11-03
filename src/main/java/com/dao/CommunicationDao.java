package com.dao;

import com.entity.Communication;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/11/3.
 */
@Repository
public interface CommunicationDao extends BaseDao<Communication,Integer> {

    int insertCommunicationFamily(Communication communication) throws SQLException;

    int updateCommunicationFamily(Communication communication) throws SQLException;

    Communication selectFamilyCommunicationById(@Param("id")int id) throws SQLException;

    List<Communication> getAllFamilyCommunications(@Param("stu_id")int stu_id) throws SQLException;



    int insertCommunicationStudent(Communication communication) throws SQLException;

    int updateCommunicationStudent(Communication communication) throws SQLException;

    Communication selectStudentCommunicationById(@Param("id")int id) throws SQLException;

    List<Communication> getAllStudentCommunications(@Param("stu_id")int stu_id) throws SQLException;
}
