package Rest.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KoffieApparaatItem {

    @Id
    private int _id;
    private String _name;
    private double _cost;

    public KoffieApparaatItem(int id, String name, double cost) {
        _id = id;
        _name = name;
        _cost = cost;
    }

    public KoffieApparaatItem() {

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
}