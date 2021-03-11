package evtest.model.ref;

import javax.persistence.*;

@Entity
public class RefTypeA extends RefType {
    private String valueA;

    public String getValueA() {
        return valueA;
    }

    public void setValueA(String valueA) {
        this.valueA = valueA;
    }
}
