package es.upm.dit.adsw.practica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaNavegadorImpl {

	@Test
	public void test01(){
		
		String grafo = "grafo.txt";
	    GrafoPosiciones gp = new GrafoPosiciones(grafo);
	    Vehiculo v1 = new Vehiculo("id1" , new Vector(0.0,0.0),0.0,new Vector(0.0,0.0),1.0);
		NavegadorImpl nav = new NavegadorImpl(v1, gp);
		Vector destino = new Vector(0.0,30.0);
		
		nav.setSecuenciaMovimientos(destino);
		Tramo[] prueba = new Tramo[11];
		prueba[0] = new Tramo(new Vector(0.0,0.0), new Vector(10.0,0.0), 1000.0);
		prueba[1] = new Tramo(new Vector(10.0,0.0), new Vector(20.0,0.0), 1000.0);
		prueba[2] = new Tramo(new Vector(20.0,0.0), new Vector(30.0,0.0), 1000.0);
		prueba[3] = new Tramo(new Vector(30.0,0.0), new Vector(40.0,0.0), 1000.0);
		prueba[4] = new Tramo(new Vector(40.0,0.0), new Vector(40.0,10.0), 500.0);
		prueba[5] = new Tramo(new Vector(40.0,10.0), new Vector(40.0,20.0), 500.0);
		
		assertEquals(prueba[0], nav.getCamino().get(0));
		assertEquals(prueba[1], nav.getCamino().get(1));
		assertEquals(prueba[2], nav.getCamino().get(2));
		assertEquals(prueba[3], nav.getCamino().get(3));
		assertEquals(prueba[4], nav.getCamino().get(4));
		assertEquals(prueba[5], nav.getCamino().get(5));
	}
	
	@Test
	public void test02(){
		
		String grafo = "grafo.txt";
	    GrafoPosiciones gp = new GrafoPosiciones(grafo);
	    Vehiculo v2 = new Vehiculo("id2" , new Vector(0.0,30.0),0.0,new Vector(0.0,30.0),1.0);
		NavegadorImpl nav = new NavegadorImpl(v2, gp);
		Vector destino = new Vector(0.0,0.0);
		
		nav.setSecuenciaMovimientos(destino);
		Tramo[] prueba = new Tramo[3];
		prueba[0] = new Tramo(new Vector(0.0,30.0), new Vector(0.0,20.0), 2000.0);
		prueba[1] = new Tramo(new Vector(0.0,20.0), new Vector(0.0,10.0), 2000.0);
		prueba[2] = new Tramo(new Vector(0.0,10.0), new Vector(0.0,0.0), 2000.0);
		
		
		assertEquals(prueba[0], nav.getCamino().get(0));
		assertEquals(prueba[1], nav.getCamino().get(1));
		assertEquals(prueba[2], nav.getCamino().get(2));
	
	}
	
	@Test
	public void test03(){
		
		String grafo = "grafo.txt";
	    GrafoPosiciones gp = new GrafoPosiciones(grafo);
	    Vehiculo v3 = new Vehiculo("id3" , new Vector(0.0,30.0),0.0,new Vector(0.0,30.0),1.0);
		NavegadorImpl nav = new NavegadorImpl(v3, gp);
		Vector destino = new Vector(40.0,30.0);
		
		nav.setSecuenciaMovimientos(destino);
		Tramo[] prueba = new Tramo[11];
		prueba[0] = new Tramo(new Vector(0.0,30.0), new Vector(10.0,30.0), 1000.0);
		prueba[1] = new Tramo(new Vector(10.0,30.0), new Vector(20.0,30.0), 1000.0);
		prueba[2] = new Tramo(new Vector(20.0,30.0), new Vector(30.0,30.0), 1000.0);
		prueba[3] = new Tramo(new Vector(30.0,30.0), new Vector(40.0,30.0), 1000.0);
		
		
		assertEquals(prueba[0], nav.getCamino().get(0));
		assertEquals(prueba[1], nav.getCamino().get(1));
		assertEquals(prueba[2], nav.getCamino().get(2));
		assertEquals(prueba[3], nav.getCamino().get(3));
		
	}
	
	@Test
	public void test04(){
		
		String grafo = "grafo.txt";
	    GrafoPosiciones gp = new GrafoPosiciones(grafo);
	    Vehiculo v4 = new Vehiculo("id4" , new Vector(0.0,0.0),0.0,new Vector(0.0,0.0),1.0);
		NavegadorImpl nav = new NavegadorImpl(v4, gp);
		Vector destino = new Vector(0.0,00.0);
		
		nav.setSecuenciaMovimientos(destino);
		
		assertEquals(nav.getCamino().size(), 0);
		
	}

}
