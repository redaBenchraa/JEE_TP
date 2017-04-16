import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.*;
import java.io.Serializable;

/*
 * Created by reda-benchraa on 22/02/17.
 */
@ManagedBean
@ApplicationScoped
public class AppStatus implements Serializable{
    private int value = 0;

    public int getValue() {
        return ++value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @PostConstruct
    void init(){
        System.err.println("Create "+this);
    }

    @PreDestroy
    void close(){
        System.err.println("Destroy "+this);
    }
}
