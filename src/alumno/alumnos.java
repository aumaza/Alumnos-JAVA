/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author capacita_mecon
 */
public class alumnos 
{
    private int id;
    private String apellidoNombre; 
    private String email;
    private float promedio;
    private int notasIngreso[];
    private String direccion;
    


public int getId()
    {
        return this.id;
    }
    
    public String getNombre()
    {
        return this.apellidoNombre;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public float getPromedio()
    {
        return this.promedio;
    }
    
    public String getDireccion()
    {
        return this.direccion;
    }
    
    public void alumno()
    {
        this.notasIngreso = new int[5];
    }
    
    public void alumno(int id, String apellidoNombre)
    {
        //this();
        this.id = id;
        this.apellidoNombre = apellidoNombre;
            
    }
    
    public void alumno(int id, String apellidoNombre, String email)
    {
        //this();
        this.id = id;
        this.apellidoNombre = apellidoNombre;
        this.email = email;
    }
    
    public void alumno(int id, String apellidoNombre, String email, Float promedio)
    {
        this.id = id;
        this.apellidoNombre = apellidoNombre;
        this.email = email;
        this.promedio = promedio;
    }

    public void alumno(int id, String apellidoNombre, String email, Float promedio, String direccion)
    {
        this.id = id;
        this.apellidoNombre = apellidoNombre;
        this.email = email;
        this.promedio = promedio;
        this.direccion = direccion;
    }
}