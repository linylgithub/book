package tk.mybatis.simple.model;

public class SysUserRole {
    private Long userId;
    private Long roleId;


    public Long getUserId() {
        return userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
