import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

/**
 * Created by reda-benchraa on 03/03/17.
 */
@ManagedBean(name="Listusers")
@ApplicationScoped
public class Users {
    private ArrayList<User> listUsers;

    public Users(){
        listUsers= new ArrayList();
    }

    public ArrayList<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<User> listUsers) {
        this.listUsers = listUsers;
    }
}
