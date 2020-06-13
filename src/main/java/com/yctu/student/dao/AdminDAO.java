package com.yctu.student.dao;

import com.yctu.student.domain.AdminDO;

public interface AdminDAO {

    /**
     * 修改管理员信息（修改密码）
     * @param adminDO
     */
    void updateAdmin(AdminDO adminDO);

}

