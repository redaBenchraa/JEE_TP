import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * Created by reda-benchraa on 03/03/17.
 */

@ManagedBean
@ApplicationScoped
public class RedirectionBean {
    private String username;
    private String password;
    private String role;

    private Users users;


    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public RedirectionBean(){
        users = new Users();
        users.getListUsers().add(new User("reda","ben","admin"));
        users.getListUsers().add(new User("rabab","chah","manager"));
        users.getListUsers().add(new User("cl1","chah","client"));
        users.getListUsers().add(new User("cl2","chah","client"));
        users.getListUsers().add(new User("cl3","chah","client"));
        users.getListUsers().add(new User("cl4","chah","client"));
        users.getListUsers().add(new User("cl5","chah","client"));
        users.getListUsers().add(new User("cl6","chah","client"));
    }
    private int getUserRole(){
        for(User us : users.getListUsers()){
            if(us.getUsername().equals(username) && us.getPassword().equals(password) ){
                if(us.getRole().equals("admin")) return 0;
                if(us.getRole().equals("manager")) return 1;
                if(us.getRole().equals("client")) return 2;
            }
        }
        return -1;
    }
    public String redirect(){
        switch (getUserRole()){
            case 0 :
                return "admin";
            case 1 :
                return "manager";
            case 2 :
                return "client";
            default:
                return "redirect";
        }
    }

    public String getRole() {
        return role;
    }

    public String add(){
        System.out.printf("Called");
        users.getListUsers().add(new User(username,password,role));
        return "manager";
    }
}
