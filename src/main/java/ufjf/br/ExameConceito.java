package ufjf.br;

public class ExameConceito implements IExame{

    private String conceito;

    @Override
    public String getExame() {
        return this.conceito;
    }

    @Override
    public void setExame(String conceito) {
        this.conceito = conceito;
    }
}
