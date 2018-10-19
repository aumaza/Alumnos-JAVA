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
    private int _id;
    private String _apellidoNombre; 
    private String _email;
    private float _promedio;
    private int _notasIngreso[];
    private String _direccion;
    


public int getId()
    {
        return this._id;
    }
    
    public String getNombre()
    {
        return this._apellidoNombre;
    }
    
    public String getEmail()
    {
        return this._email;
    }
    
    public float getPromedio()
    {
        return this._promedio;
    }
    
    public String getDireccion()
    {
        return this._direccion;
    }
    
    public void setId(int _id)
    {
        this._id = _id;
    }
    
    public void setApellidoNombre(String _apellidoNombre)
    {
        this._apellidoNombre = _apellidoNombre;
    }
    
    public void setEmail(String _email)
    {
        this._email = _email;
    }
    
    public void setPromedio(float _promedio)
    {
        this._promedio = _promedio;
    }
    
    public void setDireccion(String _direccion)
        {
            this._direccion = _direccion;
        }
    
    public void setNotasIngreso(int[] _notasIngreso)
    {
        this._notasIngreso = _notasIngreso;
    }
    
    
    public alumnos()
    {
        this._notasIngreso = new int[5];
    }
        

    public alumnos(int id, String apellidoNombre, String email, float promedio, int[] notasIngreso, String direccion)
    {
        this._id = id;
        this._apellidoNombre = apellidoNombre;
        this._direccion
    }
    
    
    
    
    
    
    
    
    public String Alumno()
    {
        Alumnos alum = new alumno();
        Alumnos alum1 = new alumno();
        Alumnos alum2 = new alumno();
    }
    
    public float calcularPromedio()
    {
        
    }
    
    public String alumnoString()
    {
        int i;
                
        String cadena = null;
        cadena = this._id + this._apellidoNombre + this._email + this._direccion;
        StringBuilder cadena = new StringBuilder;
        cadena.append(this._apellidoNombre);
        
        /*StringBuffer buffer = new StringBuffer();
        buffer.append("Nombre: ").append(this._apellidoNombre);*/
        
        
        for(int nota : this._notasIngreso)
        {
            cadena+=" " + nota;
        }
        
       // cadena += this._notasIngreso;
        return cadena.toString();
    }
}