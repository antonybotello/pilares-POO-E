public class Moto extends Vehiculo {
    private String tipoManillar;
    private String posaPies;

    

    public Moto() {
    }

    
    public Moto(String numLlantas, String color, String marca, String anio, String modelo, String tipoManillar,
            String posaPies) {
        super(numLlantas, color, marca, anio, modelo);
        this.tipoManillar = tipoManillar;
        this.posaPies = posaPies;
    }
    @Override
    public void detenerse() {
        System.out.println("La moto se ha detenido");
    }

    public void arrancar(){
        System.out.println("La moto ha arrancado");
    }
    public void hacerCaballito() {
        System.out.println("La moto ha hecho caballito");

    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    public String getPosaPies() {
        return posaPies;
    }

    public void setPosaPies(String posaPies) {
        this.posaPies = posaPies;
    }


    @Override
    public String toString() {
        return "Datos de la moto:"+
                "\nTipo de Manillar= " + tipoManillar + 
                "\nEstilo de Posa Pies= " + posaPies + 
                "\nNúmero de Llantas= " + numLlantas+
                "\nColor" + color + 
                "\nMarca= " + marca +
                "\nAño= " + anio +
                "\nModelo= " + modelo ;
    }
    
    
}
