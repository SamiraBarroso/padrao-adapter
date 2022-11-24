package ufjf.br;

public class Bailarino {

    IExame exame;
    ExameAdapter persistencia;

    public Bailarino() {
        exame = new ExameConceito();
        persistencia = new ExameAdapter(exame);
    }

    public void setExame(String categoria) {
        exame.setExame(categoria);
        persistencia.salvarExame();
    }

    public String getExame() {
        return persistencia.recuperarExame();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public int getNota() {
        return persistencia.getNota();
    }

}
