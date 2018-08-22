package lt.baltictalents.pizzeria;

//public class PizzeriaMain {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}

// !!!PizzeriaMain - veiksmo vieta

public class PizzeriaMain {


    public static void main(String[] args) {
        Food pica = new Food();
        Food burgeris = new Food();
        Food kebabas = new Food();
        Food salotos = new Food();

        pica.setPavadinimas("Havaju");
        pica.setKaina(3.50);
        burgeris.setPavadinimas("Stipruoliu");
        burgeris.setKaina(2.50);
        kebabas.setPavadinimas("CatPremium");
        kebabas.setKaina(2.00);
        salotos.setPavadinimas("Vakarykstes");
        salotos.setKaina(1.00);

        Drink alus = new Drink();
        Drink limonadas = new Drink();
        Drink sultys = new Drink();
        Drink karstasGerimas = new Drink();

        alus.setPavadinimas("LabasRytas");
        alus.setAlkoholioProcentas(10.5);
        alus.setKaina(2.50);
        limonadas.setPavadinimas("Burbilinadas");
        limonadas.setAlkoholioProcentas(0.0);
        limonadas.setKaina(1.00);
        sultys.setPavadinimas("BurokeliuFreshas");
        sultys.setAlkoholioProcentas(1.5);
        sultys.setKaina(2.50);
        karstasGerimas.setPavadinimas("Week no sleep Kava");
        karstasGerimas.setAlkoholioProcentas(3.00);
        karstasGerimas.setKaina(8.00);
        System.out.println("Maistas");
        System.out.println("=================================");
        System.out.println("Pavadinimas / Kaina (Eur)");
        System.out.println(pica.getPavadinimas() + " - " + pica.getKaina() + " Eur");
        System.out.println(burgeris.getPavadinimas() + " - " + burgeris.getKaina() + " Eur");
        System.out.println(kebabas.getPavadinimas() + " - " + kebabas.getKaina() + " Eur");
        System.out.println(salotos.getPavadinimas() + " - " + salotos.getKaina() + " Eur");
        System.out.println("=================================\n");

        System.out.println("Gerimai");
        System.out.println("=================================");
        System.out.println("Pavadinimas / Stiprumas (%) / Kaina (Eur)");
        System.out.println(alus.getPavadinimas() + " - " + alus.getAlkoholioProcentas() + "%" + " / " + alus.getKaina() + " Eur");
        System.out.println(limonadas.getPavadinimas() + " - " + limonadas.getAlkoholioProcentas() + "%" + " / " + limonadas.getKaina() + " Eur");
        System.out.println(sultys.getPavadinimas() + " - " + sultys.getAlkoholioProcentas() + "%" + " / " + sultys.getKaina() + " Eur");
        System.out.println(karstasGerimas.getPavadinimas() + " - " + karstasGerimas.getAlkoholioProcentas() + "%" + " / " + karstasGerimas.getKaina() + " Eur");
        System.out.println("=================================\n");


    }
}
