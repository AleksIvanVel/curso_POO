package com.mycompany.streamingservice;
/**
 * Disco digital para su uso por una companhia de
 * "streaming". Se usa como ejemplo en algunos 
 * aspectos introductorios a Java.
 * 
 * @author Ivan.
 * @version 1.0, 26/03/2024.
 */

public interface ServiciosDisco {  

//Metodos de consulta
    
    /**
     * Proporciona el numero de transmisiones activas.
     
     * @return numero de transmisiones ativas.
     */
    public int getActivas();
    
    /**
     * Proporciona el anhio en el que fue grabado el disco.
     * 
     * @return fecha de rabacion. 
     */
    public int getANHO();
    
    /**
     * Proporciona el nombre que tenga asociado el disco. Puede ser
     * el musico si se trata de un CD o la pelicula si se trata de un DVD
     * o Bluray.
     * 
     * @return nombre del musico si se trata de un CD o de la pelicula
     * si se trata de un DVD o Bluray.
     */
    public String getNOMBRE();
    
    /**
     * Proporciona el numero de transmisones permitidas. 
     * 
     * @return numero de transmisiones permitidas. 
     */
    public int getPermitidas();
    
    /**
     * Proporciona el tipo de disco.
     * 
     * @return el tio de disco entre 1 y 3. 
     */
    public short getTIPO_DISCO();
    
//Metodos de actualizacion
    
    /**
     * Modifica el valor de transmisiones activas.
     * 
     * @param newActivas valor que se desa establecer.
     */
    public void setActivas(int newActivas);
    
    /**
     * Modifica el valor de transmisiones permitidas.
     * 
     * @param permisos valor que se desa establecer.  
     */
    public void setPermitidas(int permisos);
    
//Metodos de implementacion
    
    /**
     * Duplica a este disco, construyendo un objeto con los mismos
     * valores, pero con identidad distinta.
     * 
     * @return un nuevo disco identico al que se le pide.
     */
    public ServiciosDisco copiaDisco();
    
    /**
     * Otorga una transmision, contestando con la fecha y hora en que 
     * la esta dando. Si no la puede dar, responde negativamente.
     * Actualiza el numero de transmisiones activas.
     * 
     * @return un mnesaje diciendo si se pudo o no otrogar la transmision.
     */
    public String daTransmision();
    
    /**
     * Muestra de forma estetica el contenido de este disco.
     * 
     * @param encabezado para encabezar lo que se imprima.
     * 
     * @return una cadena con la infromacion y que contine saltos de linea.
     */
    public String muestraDisco(String encabezado);
    
    /**
     * Actualiza el numero de transmisiones activas.
     * 
     * @return si pudo (true) o no (false) terminar una transmision.
     */
    public boolean terminaTransmison();
    
    /**
     * Proporciona una cadena con los distintos campos ocupando un
     * lugar definido.
     * 
     * @return la informacion del disco linealizado en forma de
     *      cadena, todos los discos con la misma informacion.
     */
    public String toString ();
}

