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
		
		Entidad ent = new Entidad();

		ent.setNombre("Fundacion F.A.R.O.S.");
		ent.setDireccion("Haedo");
		ent.setNumeroDireccion(473);
		ent.setLatitud(-31.4135551);
		ent.setLongitud(-64.21298130000002);
		ent.setTelefono("0351 - 4809735" );
		ent.setWeb("http://www.fundacionfaros.org.ar/contact");
		entidadRepository.save(ent);
		//---------------------------------------------------		
		ent.setNombre("CILSA");
		ent.setDireccion("Coronel Agustin Olmedo");
		ent.setNumeroDireccion(180);
		ent.setLatitud(-31.4091605);
		ent.setLongitud(-64.19939369999997);
		ent.setTelefono("0351 425-8900");
		ent.setWeb("https://www.cilsa.org/contacto/");
		entidadRepository.save(ent);		
		//---------------------------------------------------
		ent.setNombre("Fundacion La Estacion");
		ent.setDireccion("Adolfo Orma");
		ent.setNumeroDireccion(1446);
		ent.setLatitud(-31.3830075);
		ent.setLongitud(-64.2300262);
		ent.setTelefono("54-351-4823764");
		ent.setEmail("fundacionlaestacion@hotmail.com");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Instituto de Rehabilitacion Cordoba");
		ent.setDireccion("San Lorenzo");
		ent.setNumeroDireccion(283);
		ent.setLatitud(-31.4241422 );
		ent.setLongitud(-64.18379119999997);
		ent.setTelefono("0351 422 8183");
		ent.setEmail("alpicordoba@ciudad.com.ar");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Fundacion Pueblo Nuevo");
		ent.setDireccion("General Alvear");
		ent.setNumeroDireccion(351);
		ent.setLatitud(-31.4127161);
		ent.setLongitud(-64.17970600000001);
		ent.setTelefono("0351 424-0599");
		ent.setWeb("http://fundacionpueblonuevo.blogspot.com.ar/");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Fundacion La Mirada");
		ent.setDireccion("Pedro de Mendoza");
		ent.setNumeroDireccion(2634);
		ent.setLatitud(-31.4410872);
		ent.setLongitud(-64.20698449999998);
		ent.setTelefono("0351 652-6726");
		ent.setEmail("fundacionlamirada@gmail.com");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Crescomas");
		ent.setDireccion("Santiago del Estero");
		ent.setNumeroDireccion(273);
		ent.setLatitud(-31.41488);
		ent.setLongitud(-64.17620399999998);
		ent.setTelefono("0351 6240098") ;
		ent.setEmail("crescomascba@gmail.com");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Por igual mas");
		ent.setDireccion("Juan del Campillo");
		ent.setNumeroDireccion(173);
		ent.setLatitud(-31.4015043);
		ent.setLongitud(-64.17958599999997);
		ent.setTelefono("0351 152486437");
		ent.setEmail("porigual.comunicaciones@gmail.com");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Fundacion Senda Azul");
		ent.setDireccion("Dumesnil");
		ent.setNumeroDireccion(1440);
		ent.setLatitud(-31.4012455);
		ent.setLongitud(-64.19812580000001);
		ent.setTelefono("0351 4731297");
		ent.setEmail("fundacionsendaazul@live.com.ar");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Inclubyte");
		ent.setDireccion("Javier Lascano Colodrero");
		ent.setNumeroDireccion(2962);
		ent.setLatitud(-31.3630431);
		ent.setLongitud(-64.211728) ;
		ent.setTelefono("0351 477-0245");
		ent.setEmail("fundacioninclubyte@gmail.com");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Usuarios, Familiares y Amigos de los Servicios de Salud Mental");
		ent.setDireccion("Leon Morra");
		ent.setNumeroDireccion(172);
		ent.setLatitud(-31.4190659);
		ent.setLongitud(-64.17061919999998);
		ent.setTelefono("3514951969");
		ent.setEmail("saludmentalcordoba@gmail.com");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Pequenio Cottolengo Don Orione");
		ent.setDireccion("Av. Armada Argentina");
		ent.setNumeroDireccion(2440);
		ent.setLatitud(-31.47791819999999);
		ent.setLongitud(-64.2377368) ;
		ent.setTelefono("0800 444 3274");
		ent.setWeb("http://www.donorionecordoba.com.ar/");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Fundacion Si Cordoba");
		ent.setDireccion("Dean Funes");
		ent.setNumeroDireccion(100);
		ent.setLatitud(-31.4151981);
		ent.setLongitud(-64.18663129999999) ;
		ent.setTelefono("0351 155426938");
		ent.setEmail("cordoba@fundacionsi.org.ar");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Fundacion Baccigalupo Deporte");
		ent.setDireccion("Agustin Garzon");
		ent.setNumeroDireccion(1221);
		ent.setLatitud(-31.424027);
		ent.setLongitud(-64.16720609999999);
		ent.setTelefono("0351 155500347");
		ent.setWeb("http://fundacionbaccigalupo.org/");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Powerchair Football Argentina");
		ent.setDireccion("Av. Carcano sn");
		ent.setNumeroDireccion(0);
		ent.setLatitud(-31.368864);
		ent.setLongitud(-64.246113) ;
		ent.setTelefono("011 47082620");
		ent.setEmail("adriana.borgogno@pcfa.com.ar");
		entidadRepository.save(ent);
		//---------------------------------------------------
		ent.setNombre("Apadro");
		ent.setDireccion("Elpidio Gonzalez");
		ent.setNumeroDireccion(302);
		ent.setLatitud(-31.2931162);
		ent.setLongitud(-64.30208590000001);
		ent.setTelefono("0351 153506909");
		ent.setEmail("apadro_va@hotmail.com");
		entidadRepository.save(ent);

		return true;
	}
}