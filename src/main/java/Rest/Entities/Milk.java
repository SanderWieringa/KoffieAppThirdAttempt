package Rest.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Milk {
    @Id
    private int _id;

    public Milk(){

    }

    public Milk(int id){
        _id = id;
    }

}
