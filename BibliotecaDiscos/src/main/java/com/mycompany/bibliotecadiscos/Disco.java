package com.mycompany.bibliotecadiscos;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Disco {
    final private short tipodisco;
    final private String nombre;
    final private int anio;
    private int tActivas;
    private int tPermitidas;
    
    //construye un disco pidiendo al usuario los campos fijos 
    public Disco(short tipoDisco, String nombre, int anio){
       this.tipodisco = tipoDisco;
       this.nombre = nombre;
       this.anio = anio;
    } 
   
    //construye un disco con los valores que permaneceran fijos, pero cero en transmisiones permitidas
   public Disco (short tipoDisco, String nombre, int anio, int tPermitidas){
       this.tipodisco = tipoDisco;
       this.nombre = nombre;
       this.anio = anio;
       this.tActivas = 0; 
       this.tPermitidas = 0;
   }
   
   //construye un disco con los valores fijos y el numero de transmisiones permitidas
    public Disco(short tipodisco, String nombre, int anio, int tActivas, int tPermitidas) {
        this.tipodisco = tipodisco;
        this.nombre = nombre;
        this.anio = anio;
        this.tActivas = tActivas;
        this.tPermitidas = tPermitidas;
    }
    
    //metodos
    public String daTransmision(){
       SimpleDateFormat fechaAsig = new SimpleDateFormat("dd/MM/yyyy");
           
       if (tActivas == 0){
           return "No hay transmisiones disponibles";
       }
       return fechaAsig.format(new Date());
    }
    
    public boolean terminaTransmision(){
        
        if (tActivas > 0){
            tActivas = tActivas - 1;
        }
        
        return tActivas > 0;
    }         

    public int getAnio() {
        return anio;
    }
    
    
}
