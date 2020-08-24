package creacionales.Builder.ejemplo_practico.patron;

public class Persona {

    private String nombre;
    private String telefono;

    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.telefono = builder.telefono;
    }

    public static class Builder {
        private String nombre;
        private String telefono;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }
    }

}
