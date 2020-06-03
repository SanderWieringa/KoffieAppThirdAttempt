package Rest.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class KoffieApparaatItem {

    @Id
    private int _id;
    private String _name;
    private double _cost;
    @OneToMany
    private List<Sugar> _sugar;
    @OneToMany
    private List<Milk> _milk;

    public KoffieApparaatItem(int id, String name, double cost, List<Sugar> sugar, List<Milk> milk) {
        _id = id;
        _name = name;
        _cost = cost;
        _sugar = sugar;
        _milk = milk;
    }

    protected KoffieApparaatItem() {

    }

    @Override
    public String toString() {
        return String.format("Rest.KoffieApparaatItem[id=%d, name='%s', cost='%s']", _id, _name, _cost);
    }

    public int getId(){
        return _id;
    }
    public void setId(int id){
        _id = id;
    }

    public String getName(){
        return _name;
    }
    public void setName(String name){
        _name = name;
    }

    public void set_cost(double cost){
        _cost = cost;
    }
    public double get_cost(){
        return _cost;
    }

    public List<Sugar> get_sugar() { return _sugar; }
    public void set_sugar(List<Sugar> sugar) { _sugar = sugar; }

    public List<Milk> get_milk() { return _milk; }
    public void set_milk(List<Milk> milk) { _milk = milk; }
}