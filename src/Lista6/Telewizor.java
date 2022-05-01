package Lista6;

public class Telewizor extends RTV implements WydawanieDzwiekow{
    int rozdzielczosc;
    String technologiaObrazu;

    public Telewizor(int rozdzielczosc, String technologiaObrazu) {
        this.rozdzielczosc = rozdzielczosc;
        this.technologiaObrazu = technologiaObrazu;
    }

    @Override
    public void Dzwiek() {

    }
}

