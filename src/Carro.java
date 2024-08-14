public class Carro extends Vehiculo {
    private String numPuertas;
    private boolean picoYPlaca;
    private String categoriaPeaje;
    

    
    public Carro() {
    }
    
    

    public Carro(String numLlantas, String color, String marca, String anio, String modelo, String numPuertas,
            boolean picoYPlaca, String categoriaPeaje) {
        super(numLlantas, color, marca, anio, modelo);
        this.numPuertas = numPuertas;
        this.picoYPlaca = picoYPlaca;
        this.categoriaPeaje = categoriaPeaje;
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se ha detenido");
    }



    public void arrancar(){
        System.out.println("El carro ha arrancado");
    }
    public void abrirPuerta(){
        System.out.println("Se ha abierto la puerta del carro");
    }
    public void activarAire(){
        System.out.println("Se ha activado el aire acondicionado del carro");

    }
    public String getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(String numPuertas) {
        this.numPuertas = numPuertas;
    }
    public boolean isPicoYPlaca() {
        return picoYPlaca;
    }
    public void setPicoYPlaca(boolean picoYPlaca) {
        this.picoYPlaca = picoYPlaca;
    }
    public String getCategoriaPeaje() {
        return categoriaPeaje;
    }
    public void setCategoriaPeaje(String categoriaPeaje) {
        this.categoriaPeaje = categoriaPeaje;
    }
    
}
