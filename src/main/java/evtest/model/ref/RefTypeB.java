package evtest.model.ref;


import javax.persistence.*;

@Entity
public class RefTypeB extends RefType  {
    private String valueB;

    public String getValueB() {
        return valueB;
    }

    public void setValueB(String valueB) {
        this.valueB = valueB;
    }

}
