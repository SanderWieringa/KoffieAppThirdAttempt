package Rest.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sugar {
    @Id
    private int _id;

    public Sugar(){

    }

    public Sugar(int id){
        _id = id;
    }
}
