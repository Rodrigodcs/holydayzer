import java.util.ArrayList;
import java.util.List;

public class Holydays {
    private List<Holyday> list = new ArrayList<>();

    public void addHolyday(Holyday holyday){
        this.list.add(holyday);
    }

    public void getHolyday(String date){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).getDate()==date){
                System.out.println(this.list.get(i).getHolyday());
                return;
            }
        }
        System.out.println("Não existe feriado nessa data");
    }

    public String[] getAllHolydays(){
        String[] response = new String[this.list.size()];

        for(int i = 0; i < this.list.size(); i++){
            response[i]=this.list.get(i).getHolyday();
        }
        return response;
    }


}
