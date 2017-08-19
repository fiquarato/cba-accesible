package com.inclusion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.inclusion.entity.Entidad;
import com.inclusion.repository.EntidadRepository;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	
	@Autowired
	private EntidadRepository entidadRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);		
	}
	
	@Bean
	public boolean loadEntidades(){
		
		Entidad ent1 = new Entidad();
		ent1.setNombre("Fundacion F.A.R.O.S.");
		ent1.setDireccion("Haedo");
		ent1.setNumeroDireccion(473);
		ent1.setLatitud(-31.4135551);
		ent1.setLongitud(-64.21298130000002);
		ent1.setTelefono("0351 - 4809735" );
		ent1.setWeb("http://www.fundacionfaros.org.ar/contact");
		entidadRepository.save(ent1);

		//---------------------------------------------------

		Entidad ent2 = new Entidad();
		ent2.setNombre("CILSA");
		ent2.setDireccion("Coronel Agustin Olmedo");
		ent2.setNumeroDireccion(180);
		ent2.setLatitud(-31.4091605);
		ent2.setLongitud(-64.19939369999997);
		ent2.setTelefono("0351 425-8900");
		ent2.setWeb("https://www.cilsa.org/contacto/");
		entidadRepository.save(ent2);
		//---------------------------------------------------

		Entidad ent3 = new Entidad();
		ent3.setNombre("Fundacion La Estacion");
		ent3.setDireccion("Adolfo Orma");
		ent3.setNumeroDireccion(1446);
		ent3.setLatitud(-31.3830075);
		ent3.setLongitud(-64.2300262);
		ent3.setTelefono("54-351-4823764");
		ent3.setEmail("fundacionlaestacion@hotmail.com");
		entidadRepository.save(ent3);

		//---------------------------------------------------

		Entidad ent4 = new Entidad();
		ent4.setNombre("Instituto de Rehabilitacion Cordoba");
		ent4.setDireccion("San Lorenzo");
		ent4.setNumeroDireccion(283);
		ent4.setLatitud(-31.4241422 );
		ent4.setLongitud(-64.18379119999997);
		ent4.setTelefono("0351 422 8183");
		ent4.setEmail("alpicordoba@ciudad.com.ar");
		entidadRepository.save(ent4);

		//---------------------------------------------------

		Entidad ent5 = new Entidad();
		ent5.setNombre("Fundacion Pueblo Nuevo");
		ent5.setDireccion("General Alvear");
		ent5.setNumeroDireccion(351);
		ent5.setLatitud(-31.4127161);
		ent5.setLongitud(-64.17970600000001);
		ent5.setTelefono("0351 424-0599");
		ent5.setWeb("http://fundacionpueblonuevo.blogspot.com.ar/");
		entidadRepository.save(ent5);

		//---------------------------------------------------

		Entidad ent6 = new Entidad();
		ent6.setNombre("Fundacion La Mirada");
		ent6.setDireccion("Pedro de Mendoza");
		ent6.setNumeroDireccion(2634);
		ent6.setLatitud(-31.4410872);
		ent6.setLongitud(-64.20698449999998);
		ent6.setTelefono("0351 652-6726");
		ent6.setEmail("fundacionlamirada@gmail.com");
		entidadRepository.save(ent6);

		//---------------------------------------------------

		Entidad ent7 = new Entidad();
		ent7.setNombre("Crescomas");
		ent7.setDireccion("Santiago del Estero");
		ent7.setNumeroDireccion(273);
		ent7.setLatitud(-31.41488);
		ent7.setLongitud(-64.17620399999998);
		ent7.setTelefono("0351 6240098") ;
		ent7.setEmail("crescomascba@gmail.com");
		entidadRepository.save(ent7);

		//---------------------------------------------------

		Entidad ent8 = new Entidad();
		ent8.setNombre("Por igual mas");
		ent8.setDireccion("Juan del Campillo");
		ent8.setNumeroDireccion(173);
		ent8.setLatitud(-31.4015043);
		ent8.setLongitud(-64.17958599999997);
		ent8.setTelefono("0351 152486437");
		ent8.setEmail("porigual.comunicaciones@gmail.com");
		entidadRepository.save(ent8);

		//---------------------------------------------------

		Entidad ent9 = new Entidad();
		ent9.setNombre("Fundacion Senda Azul");
		ent9.setDireccion("Dumesnil");
		ent9.setNumeroDireccion(1440);
		ent9.setLatitud(-31.4012455);
		ent9.setLongitud(-64.19812580000001);
		ent9.setTelefono("0351 4731297");
		ent9.setEmail("fundacionsendaazul@live.com.ar");
		entidadRepository.save(ent9);

		//---------------------------------------------------

		Entidad ent10 = new Entidad();
		ent10.setNombre("Inclubyte");
		ent10.setDireccion("Javier Lascano Colodrero");
		ent10.setNumeroDireccion(2962);
		ent10.setLatitud(-31.3630431);
		ent10.setLongitud(-64.211728) ;
		ent10.setTelefono("0351 477-0245");
		ent10.setEmail("fundacioninclubyte@gmail.com");
		entidadRepository.save(ent10);

		//---------------------------------------------------

		Entidad ent11 = new Entidad();
		ent11.setNombre("Usuarios, Familiares y Amigos de los Servicios de Salud Mental");
		ent11.setDireccion("Leon Morra");
		ent11.setNumeroDireccion(172);
		ent11.setLatitud(-31.4190659);
		ent11.setLongitud(-64.17061919999998);
		ent11.setTelefono("3514951969");
		ent11.setEmail("saludmentalcordoba@gmail.com");
		entidadRepository.save(ent11);

		//---------------------------------------------------

		Entidad ent12 = new Entidad();
		ent12.setNombre("Pequenio Cottolengo Don Orione");
		ent12.setDireccion("Av. Armada Argentina");
		ent12.setNumeroDireccion(2440);
		ent12.setLatitud(-31.47791819999999);
		ent12.setLongitud(-64.2377368) ;
		ent12.setTelefono("0800 444 3274");
		ent12.setWeb("http://www.donorionecordoba.com.ar/");
		entidadRepository.save(ent12);

		//---------------------------------------------------

		Entidad ent13 = new Entidad();
		ent13.setNombre("Fundacion Si Cordoba");
		ent13.setDireccion("Dean Funes");
		ent13.setNumeroDireccion(100);
		ent13.setLatitud(-31.4151981);
		ent13.setLongitud(-64.18663129999999) ;
		ent13.setTelefono("0351 155426938");
		ent13.setEmail("cordoba@fundacionsi.org.ar");
		entidadRepository.save(ent13);

		//---------------------------------------------------

		Entidad ent14 = new Entidad();
		ent14.setNombre("Fundacion Baccigalupo Deporte");
		ent14.setDireccion("Agustin Garzon");
		ent14.setNumeroDireccion(1221);
		ent14.setLatitud(-31.424027);
		ent14.setLongitud(-64.16720609999999);
		ent14.setTelefono("0351 155500347");
		ent14.setWeb("http://fundacionbaccigalupo.org/");
		entidadRepository.save(ent14);

		//---------------------------------------------------

		Entidad ent15 = new Entidad();
		ent15.setNombre("Powerchair Football Argentina");
		ent15.setDireccion("Av. Carcano sn");
		ent15.setNumeroDireccion(0);
		ent15.setLatitud(-31.368864);
		ent15.setLongitud(-64.246113) ;
		ent15.setTelefono("011 47082620");
		ent15.setEmail("adriana.borgogno@pcfa.com.ar");
		entidadRepository.save(ent15);

		//---------------------------------------------------

		Entidad ent16 = new Entidad();
		ent16.setNombre("Apadro");
		ent16.setDireccion("Elpidio Gonzalez");
		ent16.setNumeroDireccion(302);
		ent16.setLatitud(-31.2931162);
		ent16.setLongitud(-64.30208590000001) ;
		ent16.setTelefono("0351 153506909");
		ent16.setEmail("apadro_va@hotmail.com");
		entidadRepository.save(ent16);

		//---------------------------------------------------

		return true;
	}
}