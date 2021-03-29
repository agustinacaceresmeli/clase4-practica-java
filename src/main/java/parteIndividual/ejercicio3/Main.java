package parteIndividual.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Evento evento = new Evento();

        Invitado invitado = new InvitadoStandard();
        Invitado invitado1 = new InvitadoMeli();
        Invitado invitado2 = new InvitadoMeli();

        evento.agregarInvitados(invitado);
        evento.agregarInvitados(invitado1);
        evento.agregarInvitados(invitado2);

        System.out.println(evento.toString());

        FuegoArtificial fuegoArtificial1 = new FuegoArtificial("pim");
        FuegoArtificial fuegoArtificial2 = new FuegoArtificial("pum");
        FuegoArtificial fuegoArtificial3 = new FuegoArtificial("pam");

        Pack pack1 = new Pack();
        pack1.agregarFuegoArtificial(fuegoArtificial1);
        pack1.agregarFuegoArtificial(fuegoArtificial2);
        pack1.agregarFuegoArtificial(fuegoArtificial3);

        Pack pack2 = new Pack();
        pack2.agregarFuegoArtificial(fuegoArtificial2);
        pack2.agregarFuegoArtificial(pack1);

        evento.agregarFuegosArtificiales(fuegoArtificial2);
        evento.agregarFuegosArtificiales(pack2);
        evento.agregarFuegosArtificiales(pack1);

        System.out.println("La Chiqui sopla las velas");
        evento.apagarVelas();
    }

}
