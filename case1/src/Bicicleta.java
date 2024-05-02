public class Bicicleta {
    

    private String marca;
    private String modelo;
    private String tipo;
    private int velocidadMax;
    private boolean marchas;
    private double precio;

    public Bicicleta(String marca, String modelo, String tipo, int velocidadMax, boolean marchas, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.velocidadMax = velocidadMax;
        this.marchas = marchas;
        this.precio = precio;
    }


    public Bicicleta() {
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String marca) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public boolean isMarchas() {
        return this.marchas;
    }

    public boolean getMarchas() {
        return this.marchas;
    }

    public void setMarchas(boolean marchas) {
        this.marchas = marchas;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        String tieneMarchas="";
        if (marchas){
         tieneMarchas = "con marchas";
        } else {tieneMarchas = "sin marchas";}
        return "{" +
            "Bicicleta de " + getTipo() + " de la marca " + getMarca() + " " + getModelo() + ""
            + tieneMarchas + " | " +
            "Velocidad máxima: " + getVelocidadMax() + "Km/h " +
            "| Precio:" + getPrecio() + "" +
            "}";
    }
    public String toString2() {
        String tieneMarchas="";
        if (marchas){
         tieneMarchas = "con marchas";
        } else {tieneMarchas = "sin marchas";}
        return "Modelo " +getModelo() + " de " + getTipo() + " " + tieneMarchas + " por " + getPrecio() + "€";
    }

    // metodos extra
    public void tocaClaxon(boolean claxon) {
        if(claxon)
        {System.out.println("meeeeecccc");}
     else {System.out.println("Vaya, no tiene claxon.");
     }
    }

    /*public void descuento (double dto) {
        setPrecio*
    }*/


    
}
