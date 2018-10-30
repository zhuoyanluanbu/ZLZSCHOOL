package com.dao;

import com.entity.FamilyMember;
import com.entity.PersonalPlan;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/30.
 */
@Repository
public interface FamilyMemberDao extends BaseDao<FamilyMember,Integer> {

    List<FamilyMember> queryAllFamilyMembers(int stu_id) throws SQLException;

}
