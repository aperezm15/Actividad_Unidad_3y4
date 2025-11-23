package com.tienda.ports;

import com.tienda.model.Cliente;
import java.util.List;


//Puerto de Entrada: Contrato de las operaciones de negocio del Cliente.

public interface ClienteServicePort {

    int registrarNuevoCliente(Cliente cliente);

    Cliente consultarClientePorId(int id);

    List<Cliente> obtenerTodosLosClientes();

    boolean actualizarDatosCliente(Cliente cliente);

    boolean eliminarCliente(int id);
}