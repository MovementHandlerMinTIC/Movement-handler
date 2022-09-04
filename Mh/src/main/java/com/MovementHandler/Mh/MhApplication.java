package com.MovementHandler.Mh;

import com.MovementHandler.Mh.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MhApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhApplication.class, args);
//		Empleado empleado1 = new Empleado(1, "Juan Perez", "juanperez@gmail.com", "Coca Cola", "Operativo");
//		System.out.println("Nombre empleado: "+ empleado1.getNombreEmpleado());
//		empleado1.setNombreEmpleado("Laura Amaya");
//		System.out.println("Nombre empleado: "+ empleado1.getNombreEmpleado());
//		System.out.println("Correo empleado: "+ empleado1.getCorreoEmpleado());
//		empleado1.setCorreoEmpleado("lauramaya@gmail.com");
//		System.out.println("Correo empleado: "+ empleado1.getCorreoEmpleado());
//		System.out.println("Empresa: "+ empleado1.getEmpresaEmpleado());
//		empleado1.setEmpresaEmpleado("Coca-Cola");
//		System.out.println("Empresa: "+ empleado1.getEmpresaEmpleado());
//		System.out.println("Rol empleado: "+ empleado1.getRolEmpleado());
//		empleado1.setRolEmpleado("Administrador");
//		System.out.println("Rol empleado: "+ empleado1.getRolEmpleado());
//
//		Empresa empresa1 = new Empresa("Coca Cola", "cra. 42a #93-03", "309 4574", "10000335-4");
//		System.out.println("Nombre empresa: "+ empresa1.getNombreEmpresa());
//		empresa1.setNombreEmpresa("Coca-Cola");
//		System.out.println("Nombre empresa: "+ empresa1.getNombreEmpresa());
//		System.out.println("Dirección empresa: "+ empresa1.getDireccionEmpresa());
//		empresa1.setDireccionEmpresa("kra. 42a #93-03");
//		System.out.println("Dirección empresa: "+ empresa1.getDireccionEmpresa());
//		System.out.println("Telefono: "+ empresa1.getTelefonoEmpresa());
//		empresa1.setTelefonoEmpresa("602 309 4574");
//		System.out.println("Telefono: "+ empresa1.getTelefonoEmpresa());
//		System.out.println("NIT: "+ empresa1.getNitEmpresa());
//		empresa1.setNitEmpresa("10056794-5");
//		System.out.println("NIT: "+ empresa1.getNitEmpresa());
//
//		MovimientodeDinero mov1= new MovimientodeDinero(10.000, "Venta de cuaderno", "Carolina Rojas");
//		System.out.println("Monto del movimiento: "+ mov1.getMontoMovimiento());
//		mov1.setMontoMovimiento(-10.0);
//		System.out.println("Monto del movimiento: "+ mov1.getMontoMovimiento());
//		System.out.println("Concepto del movimiento: "+ mov1.getConceptoMovimiento());
//		mov1.setConceptoMovimiento("Venta de cuaderno especial");
//		System.out.println("Concepto del movimiento: "+ mov1.getConceptoMovimiento());
//		System.out.println("Encargado del movimiento: "+ mov1.getUsuarioEncargado());

		Usuario usuario1 = new Usuario(1);
		Usuario usuario2 = new Usuario(2);
		Usuario usuario3 = new Usuario(3);

		Roles Admin = new Roles(1);
		Roles Operario= new Roles(2);

		Perfil perfil1= new Perfil("Juan", "img1", "123", usuario1, "2020-5-8", "2022-5-8");
		Perfil perfil2= new Perfil("Maria", "img2", "213", usuario2, "2020-6-8", "2022-6-8");
		Perfil perfil3= new Perfil("Carlos", "img3", "321", usuario1, "2020-7-8", "2022-7-8");
		Usuario[] usuarios = {usuario1, usuario2, usuario3};

		Empresa empresa1 = new Empresa(1,"coca cola", "123", "12345678", "cr 23", usuarios, "mayo", "abril");
		Empresa empresa2 = new Empresa(2,"pepsi", "213", "87654321", "cr 24", usuarios, "mayo", "abril");
		Empresa empresa3 = new Empresa(3,"postobon", "312", "87651234", "cr 25", usuarios, "mayo", "abril");

		MovimientodeDinero movi1 = new MovimientodeDinero(1, "venta", 13, usuario1, empresa1, "feb", "mar");
		MovimientodeDinero movi2 = new MovimientodeDinero(2, "pago", -10, usuario1, empresa1, "feb", "mar");

		Empleado empleado1 = new Empleado(1, "juan@gmail.com", perfil1, Admin, empresa1, movi1, "abril", "mayo", "Juan Perez");
		Empleado empleado2 = new Empleado(2, "maria@gmail.com", perfil2, Admin, empresa2, movi1, "abril", "mayo", "Maria Perez");
		Empleado empleado3 = new Empleado(3, "carlos@gmail.com", perfil3, Operario, empresa2, movi2, "abril", "mayo", "Carlos Lomen");


	}

}
