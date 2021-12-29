package bean;

public class UserService {
    public static void main(String[] args) {
        User u = new User();
        u.userid = 23;
        u.address = "PLOT NO -63 WZ -31 B ";
        u.name = "John K kolesar";

        User user = new User("Meet","plot no98",24);

        System.out.println("Values from u object ::" + u.name +" - "+u.userid+" - "+u.address);
        System.out.println("Values from user object ::" + user.name +" - "+user.userid+" - "+user.address);
    }
}
