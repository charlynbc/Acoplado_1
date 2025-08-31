package presentacion;
import fabrica.Fabrica;
import interfaces.IControlador_Cliente;

public class Main {

	public static void main(String[] args) {
		
		        IControlador_Cliente ctrl = Fabrica.getInstance().getControladorCliente();
		        ctrl.saludar_cliente("Charly");
		    }
		


	}


