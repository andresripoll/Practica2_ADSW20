package es.upm.dit.adsw.practica2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PruebaVehiculo {

	@Test
	public void test01(){
		
		String grafo = "grafo.txt";
	    GrafoPosiciones gp = new GrafoPosiciones(grafo);
	    Vehiculo v1 = new Vehiculo("id1" , new Vector(0.0,0.0),0.0,new Vector(0.0,0.0),1.0);
		NavegadorImpl nav = new NavegadorImpl(v1, gp);
		v1.setNavegador(nav);
		Vector destino = new Vector(0.0,30.0);
		v1.irA(destino);
		
		assertEquals(destino, v1.getPos());
	}
	
	@Test
	public void test02(){
		
		String grafo = "grafo.txt";
	    GrafoPosiciones gp = new GrafoPosiciones(grafo);
	    Vehiculo v2 = new Vehiculo("id2" , new Vector(0.0,30.0),0.0,new Vector(0.0,30.0),1.0);
		NavegadorImpl nav = new NavegadorImpl(v2, gp);
		v2.setNavegador(nav);
		Vector destino = new Vector(40.0,30.0);
		v2.irA(destino);
		
		assertEquals(destino, v2.getPos());
	}
}
