public class Building {
    private Integer id;
    private String[] residents;

    public Building(Integer id, String resident){
        this.id = id;
        this.residents = new String[1];
        this.residents[0] = resident;
    }
    public Building(Integer Id, String[] residents){
        this.id = id;
        this.residents = residents;
    }

    public void add(){

    }
    public void remove(){

    }

    public Integer getResidents(){
        return residents.length;
    }
}
