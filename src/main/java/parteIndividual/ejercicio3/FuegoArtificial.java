package parteIndividual.ejercicio3;

public class FuegoArtificial implements Explotable{

    private String sonido;

    public FuegoArtificial() {
    }

    public FuegoArtificial(String ruido) {
        this.sonido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(this.sonido);
    }

    @Override
    public String toString() {
        return "FuegoArtificial{" +
                "ruido='" + sonido + '\'' +
                '}';
    }

}
