package com.MovementHandler.Mh;

import com.MovementHandler.Mh.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MhApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhApplication.class, args);

		Usuario usuario1 = new Usuario(1);
		Usuario usuario2 = new Usuario(2);
		Usuario usuario3 = new Usuario(3);

		Perfil perfil1= new Perfil("Juan", "img1", "123", usuario1, "2020-5-8", "2022-5-8");
		Perfil perfil2= new Perfil("Maria", "img2", "213", usuario2, "2020-6-8", "2022-6-8");
		Perfil perfil3= new Perfil("Carlos", "img3", "321", usuario1, "2020-7-8", "2022-7-8");
		Usuario[] usuarios = {usuario1, usuario2, usuario3};

		Empresa empresa1 = new Empresa(1,"coca cola", "123", "12345678", "cr 23", usuarios, "mayo", "abril");
		Empresa empresa2 = new Empresa(2,"pepsi", "213", "87654321", "cr 24", usuarios, "mayo", "abril");
		Empresa empresa3 = new Empresa(3,"postobon", "312", "87651234", "cr 25", usuarios, "mayo", "abril");

		MovimientodeDinero movi1 = new MovimientodeDinero(1, "venta", 13, usuario1, empresa1, "feb", "mar");
		MovimientodeDinero movi2 = new MovimientodeDinero(2, "pago", -10, usuario1, empresa1, "feb", "mar");

		Empleado empleado1 = new Empleado(1, "juan@gmail.com", perfil1, Enum_Roles.Admin, empresa1, movi1, "abril", "mayo", "Juan Perez");
		Empleado empleado2 = new Empleado(2, "maria@gmail.com", perfil2, Enum_Roles.Admin, empresa2, movi1, "abril", "mayo", "Maria Perez");
		Empleado empleado3 = new Empleado(3, "carlos@gmail.com", perfil3, Enum_Roles.Operario, empresa2, movi2, "abril", "mayo", "Carlos Lomen");

	}

}
