package poo.u3;

public enum TipoMadera {
    ROBLE(800),
    CAOBA(770),
    NOGAL(820),
    CEREZO(790);

    private final int pesoEspecifico;

    TipoMadera(int pesoEspecifico) {
        this.pesoEspecifico = pesoEspecifico;
    }

    public int getPesoEspecifico() {
        return this.pesoEspecifico;
    }
}
