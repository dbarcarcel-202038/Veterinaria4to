/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.modelo;
public class Veterinaria {
	//fase de declaración de variables de instancia
	private int idCliente;
	private String nombreCliente;
	private String telefonoCliente;
        private int cita;
	
	//fase de declaración y definición de métodos
	public Veterinaria() {} //Constructor nulo, sólo crea una instancia vacía
	public Veterinaria(int id, String nombre, String telefono, int cita) {//Constructor
		this.idCliente = id;
		this.nombreCliente = nombre;
		this.telefonoCliente = telefono;
                this.cita = cita;
	}
		
	public void setId(int id) {
		this.idCliente = id;
	}
	public int getId() {
		return idCliente;
	}
	
	public void setNombre(String nombre) {
		this.nombreCliente = nombre;
	}
	public String getNombre() {
		return nombreCliente;
	}
	
	public void setTelefono(String telefono) {
		this.telefonoCliente = telefono;
	}
	public String getTelefono() {
		return telefonoCliente;
	}
        public void setCita(int cita){
                this.cita = cita;
        }
        public int getCita() {
            return cita;
        }

   
}
