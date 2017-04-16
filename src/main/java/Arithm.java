import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by reda-benchraa on 22/02/17.
 */
@ManagedBean
public class Arithm implements Serializable{
    private float n1,n2;

    public Arithm() {}

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    private char op;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    public float calculate(){
        switch (op){
            case '+' : return n1+n2;
            case '-' : return n1-n2;
            case '*' : return n1*n2;
            case '/' : return n1/n2;
            default: return 0;
        }
    }
}
