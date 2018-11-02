package com.dao;

import com.entity.FamilyMember;
import com.entity.PersonalPlan;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/30.
 */
@Repository
public interface FamilyMemberDao extends BaseDao<FamilyMember,Integer> {

    List<FamilyMember> queryAllFamilyMembers(@Param("stu_id")int stu_id) throws SQLException;

}
