import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Building {
    private Integer id;
    private List<String> residents;

    public Building(Integer id, String resident){
        this.id = id;
        residents = new LinkedList<>();
        residents.add(resident);
    }
    public Building(Integer Id, String[] residents){
        this.residents = Arrays.stream(residents).toList();
    }

    public void add(String name){
       if(!residents.contains(name)){
           residents.add(name);
       }
    }
    public void remove(){

    }

    public Integer getResidents(){
        return residents.size();
    }
}
