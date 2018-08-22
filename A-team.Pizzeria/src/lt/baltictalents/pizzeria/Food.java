package lt.baltictalents.pizzeria;

//public interface Food {
//}

// Panasu, kad pagal uzduoti tai turi buti ne klase, o interface'as =(
// !!!Food - interfeisas maistui (galimos implementacijos: Pizza, Wrap, Tortilla ir t.t.)

public class Food {
    public String pavadinimas;
    public double kaina;

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }
}
