package fabrica;

import controladores.Controlador_cliente;
import interfaces.IControlador_Cliente;

public class Fabrica {
    
	// 1) única instancia (singleton)
    private static Fabrica instancia;

    // 2) servicios/controladores “únicos” que voy a exponer
    private final IControlador_Cliente ctrlCliente;

    // 3) constructor privado (nadie puede hacer new desde afuera)
    private Fabrica() {
        this.ctrlCliente = new Controlador_cliente();
    }

    // 4) punto de acceso global//
    public static synchronized Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    // 5) getters de servicios
    public IControlador_Cliente getControladorCliente() {
        return ctrlCliente;
    }
}

