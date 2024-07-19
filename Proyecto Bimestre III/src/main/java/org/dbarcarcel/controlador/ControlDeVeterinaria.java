/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.controlador;
import java.util.ArrayList;
import org.sgonzalez.modelo.Veterinaria;
public class ControlDeVeterinaria {
	//fase de declaración de variables
	private ArrayList<Veterinaria> listaDeAnimales;
	private static ControlDeVeterinaria instancia;
	
	//fase de declaración y definición de métodos
	public ControlDeVeterinaria() {//Constructor privado		
		listaDeAnimales = new ArrayList<Veterinaria>();
	}
	
	public int cantidadDeElementos(){
		return listaDeAnimales.size();
	}
		
	public static ControlDeVeterinaria getInstancia() {
		if(instancia == null) {
			instancia = new ControlDeVeterinaria();
		} return instancia; 
	}//getInstancia
		
	public void crearCliente(Veterinaria veterinaria) {
		listaDeAnimales.add(veterinaria);
	}
	
	public ArrayList<Veterinaria> getListaDeClientes() {
		return listaDeAnimales;
	}//ArrayList
	
	public void eliminarCliente(Veterinaria veterinaria){
		getListaDeClientes().remove(veterinaria);
	}//eliminar 
	
	public void eliminarCliente(int posicion){
		listaDeAnimales.remove(posicion-1);
	}//eliminar
	
	public Veterinaria buscarCliente( int idCliente ){
		Veterinaria veterinaria = new  Veterinaria();
		for( Veterinaria elemento : listaDeAnimales ){
			if( elemento.getId() == idCliente){
				veterinaria = elemento;
			break;
			}//if 
		}//for 
		return veterinaria;   
	}//buscar
	
	public void actualizarCliente(Veterinaria antiguo, Veterinaria actualizado){
		int indice = listaDeAnimales.indexOf(antiguo);
		if( indice >= 0 )
			listaDeAnimales.set(indice,actualizado);
	}
}
