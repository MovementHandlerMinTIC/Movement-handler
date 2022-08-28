package com.MovementHandler.Mh;

import com.MovementHandler.Mh.entities.Empleado;
import com.MovementHandler.Mh.entities.Empresa;
import com.MovementHandler.Mh.entities.MovimientodeDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MhApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhApplication.class, args);
		System.out.println("\n******EMPLEADO******");
		Empleado empleado1 = new Empleado("Juan Perez", "juanperez@gmail.com", "Coca Cola", "Operativo");
		System.out.println("Nombre empleado: "+ empleado1.getNombreEmpleado());
		empleado1.setNombreEmpleado("Laura Amaya");
		System.out.println("Nombre empleado: "+ empleado1.getNombreEmpleado());
		System.out.println("Correo empleado: "+ empleado1.getCorreoEmpleado());
		empleado1.setCorreoEmpleado("lauramaya@gmail.com");
		System.out.println("Correo empleado: "+ empleado1.getCorreoEmpleado());
		System.out.println("Empresa: "+ empleado1.getEmpresaEmpleado());
		empleado1.setEmpresaEmpleado("Coca-Cola");
		System.out.println("Empresa: "+ empleado1.getEmpresaEmpleado());
		System.out.println("Rol empleado: "+ empleado1.getRolEmpleado());
		empleado1.setRolEmpleado("Administrador");
		System.out.println("Rol empleado: "+ empleado1.getRolEmpleado());

		System.out.println("\n******EMPRESA******");
		Empresa empresa1 = new Empresa("Coca Cola", "cra. 42a #93-03", "309 4574", "10000335-4");
		System.out.println("Nombre empresa: "+ empresa1.getNombreEmpresa());
		empresa1.setNombreEmpresa("Pepsi");
		System.out.println("Nombre empresa: "+ empresa1.getNombreEmpresa());
		System.out.println("Dirección empresa: "+ empresa1.getDireccionEmpresa());
		empresa1.setDireccionEmpresa("kra. 42a #93-03");
		System.out.println("Dirección empresa: "+ empresa1.getDireccionEmpresa());
		System.out.println("Telefono: "+ empresa1.getTelefonoEmpresa());
		empresa1.setTelefonoEmpresa("602 309 4574");
		System.out.println("Telefono: "+ empresa1.getTelefonoEmpresa());
		System.out.println("NIT: "+ empresa1.getNitEmpresa());
		empresa1.setNitEmpresa("10056794-5");
		System.out.println("NIT: "+ empresa1.getNitEmpresa());

		System.out.println("\n******MONTO DE DINERO******");
		MovimientodeDinero mov1= new MovimientodeDinero(10.000, "Venta de cuaderno", "Carolina Rojas");
		System.out.println("Monto del movimiento: "+ mov1.getMontoMovimiento());
		mov1.setMontoMovimiento(-10.0);
		System.out.println("Monto del movimiento: "+ mov1.getMontoMovimiento());
		System.out.println("Concepto del movimiento: "+ mov1.getConceptoMovimiento());
		mov1.setConceptoMovimiento("Venta de cuaderno especial");
		System.out.println("Concepto del movimiento: "+ mov1.getConceptoMovimiento());
		System.out.println("Encargado del movimiento: "+ mov1.getUsuarioEncargado());
	}

}
