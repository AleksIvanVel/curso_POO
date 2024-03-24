
package com.mycompany.bibliotecadiscos;
public interface ServiciosDisco {
    
//Metodos de consulta
    public int getActivas();
    public int getANHO();
    public String getNOMBRE();
    public int getPermitidas();
    public short getTIPO_DISCO();
    
//Metodos de actualizacion
    public void setActivas(int newActivas);
    public void setPermitidas(int permisos);
    
//Metodos de implementacion
    public Disco copiaDisco();
    public String daTransmision();
    public String muestraDisco(String encabezado);
    public boolean terminaTransmison();
    public String toString ();
}
