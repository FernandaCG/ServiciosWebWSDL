package mx.com.hsbc.registroClientes;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.com.hsbc.registroClientes.RegistroClientes")
public class RegistroClientesImpl implements RegistroClientes{

	@Override
	public void agregarCliente(String nombre, String apellido, Integer edad) {
		System.out.println("Se agreg� un cliente con la siguiente informaci�n:\nNombre: "+ nombre +"\nApellido: "+ apellido+"\nEdad: "+ edad);
		
	}

	@Override
	public String leerCliente() {
		return null;
	}

	@Override
	public void actualizarCliente(String nombre) {
		System.out.println("Se ha actualizado el nombre del cliente a "+ nombre);
		
	}

	@Override
	public void eliminarCliente(String nombre) {
		System.out.println("Se ha eliminado el cliente " + nombre);
		
	}
	
	
}
