public abstract class Vehiculo {
    private String numLlantas;
    private String color;
    private String marca;
    private String anio;
    private String modelo;

    
    
    public Vehiculo() {
        this.numLlantas="4";
    }

    
    public Vehiculo(String numLlantas, String color, String marca, String anio, String modelo) {
        this.numLlantas = numLlantas;
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }


    public void arrancar(){
        System.out.println("El vehículo ha arrancado");
    }
    public void moverse(){
        System.out.println("El vehículo se ha movido");
    }
    public void detenerse(){
        System.out.println("El vehículo se ha detenido");
    }
    public String getNumLlantas() {
        return numLlantas;
    }
    public void setNumLlantas(String numLlantas) {
        this.numLlantas = numLlantas;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
