package tk.mybatis.simple.model;

public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String privilegeUrl;
    
    public Long getId() {
        return id;
    }
    public String getPrivilegeUrl() {
        return privilegeUrl;
    }
    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
    public String getPrivilegeName() {
        return privilegeName;
    }
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
