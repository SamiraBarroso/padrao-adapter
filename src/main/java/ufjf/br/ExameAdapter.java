package ufjf.br;

public class ExameAdapter extends ExameNota{

    private IExame exameConceito;

    public ExameAdapter(IExame exameConceito) {
        this.exameConceito = exameConceito;
    }

    public String recuperarExame() {
        if (this.getNota() >= 75)
            exameConceito.setExame("Distinction");
        else
        if (this.getNota() >= 55)
            exameConceito.setExame("Merit" );
        else
        if (this.getNota() >= 40)
            exameConceito.setExame("Pass");
        else
            exameConceito.setExame("Standard Not Attained");
        return exameConceito.getExame();
    }

    public void salvarExame() {
        if (exameConceito.getExame().equals("Distinction"))
            this.setNota(75);
        else
        if (exameConceito.getExame().equals("Merit"))
            this.setNota(55);
        else
        if (exameConceito.getExame().equals("Pass"))
            this.setNota(40);
        else
            this.setNota(0);
    }
}
