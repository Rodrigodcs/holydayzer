public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Holydays holydaysList = new Holydays();
        Holyday holyday1 = new Holyday("Confraternização mundial","01/01/2023");
        holydaysList.addHolyday(holyday1);
        Holyday holyday2 = new Holyday("Carnaval","21/02/2023");
        holydaysList.addHolyday(holyday2);
        Holyday holyday3 = new Holyday("Páscoa","17/04/2023");
        holydaysList.addHolyday(holyday3);
        Holyday holyday4 = new Holyday("Tiradentes","21/04/2023");
        holydaysList.addHolyday(holyday4);
        Holyday holyday5 = new Holyday("Dia do trabalho","01/05/2023");
        holydaysList.addHolyday(holyday5);
        Holyday holyday6 = new Holyday("Corpus Christi","08/06/2023");
        holydaysList.addHolyday(holyday6);
        Holyday holyday7 = new Holyday("Independência do Brasil","07/09/2023");
        holydaysList.addHolyday(holyday7);
        Holyday holyday8 = new Holyday("Nossa Senhora Aparecida","12/10/2023");
        holydaysList.addHolyday(holyday8);
        Holyday holyday9 = new Holyday("Finados","02/11/2023");
        holydaysList.addHolyday(holyday9);
        Holyday holyday10 = new Holyday("Proclamação da República","15/11/2023");
        holydaysList.addHolyday(holyday10);
        Holyday holyday11 = new Holyday("Natal","25/12/2023");
        holydaysList.addHolyday(holyday11);

        holydaysList.getHolyday("25/12/2023");
        holydaysList.getHolyday("08/06/2023");
        holydaysList.getHolyday("21/04/2023");
        holydaysList.getHolyday("12/04/2023");
        System.out.println();
        String[] allHolydays = holydaysList.getAllHolydays();

        for(int i = 0; i < allHolydays.length; i++){
            System.out.println(allHolydays[i]);
        }
    }
}
