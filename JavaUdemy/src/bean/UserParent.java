package bean;

import bean.User;

public class UserParent {
    public User user;
    public String adminname;

    public UserParent(){

    }
    public UserParent(User user , String adminname){
        this.user = user;
        this.adminname=user.name+"-"+adminname;
    }

}
