package Rest.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class KoffieApparaatItem {

    @Column(unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private String name;
    private double cost;
    @OneToMany
    private List<Sugar> sugar;
    @OneToMany
    private List<Milk> milk;

    public KoffieApparaatItem(int id, String name, double cost, List<Sugar> sugar, List<Milk> milk) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.sugar = sugar;
        this.milk = milk;
    }

    public KoffieApparaatItem() {

    }

    @Override
    public String toString() {
        return String.format("Rest.KoffieApparaatItem[id=%d, name='%s', cost='%s']", id, name, cost);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }

    public List<Sugar> getSugar() { return sugar; }
    public void setSugar(List<Sugar> sugar) { this.sugar = sugar; }

    public List<Milk> getMilk() { return milk; }
    public void setMilk(List<Milk> milk) { this.milk = milk; }
}