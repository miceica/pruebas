import utils.*;

public class Main {
    public static void main(String[] args) {

        /*Mes mes = Mes.FEBRERO;
        System.out.println(mes.dias(2024));

        Country country= Country.get("UA");
        System.out.println(country);

        Provincia provincia = Provincia.get("36");
        System.out.println(provincia);

        Bank bank = Bank.get("30076");
        System.out.println(bank);*/

        NSS nss = new NSS("361234901346");
        System.out.println(nss.control());
        System.out.println(nss.numero());
        System.out.println(nss.provincia());
    }
}