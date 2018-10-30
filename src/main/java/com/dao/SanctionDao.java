package com.dao;

import com.entity.Sanction;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by huyoucheng on 2018/10/30.
 */
@Repository
public interface SanctionDao extends BaseDao<Sanction,Integer> {

    List<Sanction> queryAllSanctions(int stu_id) throws SQLException;

}
