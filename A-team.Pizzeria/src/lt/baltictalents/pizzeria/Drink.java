package lt.baltictalents.pizzeria;

//!!!Drink - interfeisas arba abstrakti klase gerimams (galimos implementacijos: Beer, Water (still, sparkling), SoftDrink,
//!!!Tea (sugar, honey), Coffee (sugar, milk) ir t.t.)

public class Drink {
    public String pavadinimas;
    public double kaina;
    public double alkoholioProcentas;

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public void setAlkoholioProcentas(double alkoholioProcentas) {
        this.alkoholioProcentas = alkoholioProcentas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public double getAlkoholioProcentas() {
        return alkoholioProcentas;
    }
}

