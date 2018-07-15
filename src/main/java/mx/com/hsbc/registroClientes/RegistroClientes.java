package mx.com.hsbc.registroClientes;

import javax.jws.WebService;

@WebService
public interface RegistroClientes {
	
	public void agregarCliente(String nombre, String apellido, Integer edad);
	
	public String leerCliente();
	
	public void actualizarCliente(String nombre);

	public void eliminarCliente(String nombre);
}
