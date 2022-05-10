/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author 정현수
 */
public class UserInfo {
    private String type;
    private String id;
    private String pw;
    
    public UserInfo (String type, String id, String pw) {
        this.type = type;
        this.id = id;
        this.pw = pw;
    }
    
    public String getName() {
        return type;
    }
    
    public String getId() {
        return id;
    }
    
    public String getPw() {
        return pw;
    }

    public String getUserInfo() {
        String userInfo = String.format("%s\t%s\t%s", type, id, pw);
        return userInfo;
    }
}
