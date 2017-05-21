package ar.edu.unlam.tp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCuentaBancaria {

	@Test
	public void testQueDepositaYExtraeDineroDeCuentaSueldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1000d);
		miCuentaSueldo.depositar(3000d);
		miCuentaSueldo.extraer(3000d);
		assertEquals(1000d,miCuentaSueldo.getSaldo(),0.01);
	}

	@Test
	public void testQueDepositaYExtraeDineroDeCajaAhorro() {
		CajaDeAhorro miCajaDeAhorro = new CajaDeAhorro(1000d,6);
		miCajaDeAhorro.depositar(3000d);
		miCajaDeAhorro.extraer(3000d);
		assertEquals(994d,miCajaDeAhorro.getSaldo(),0.01);
	}
	@Test
	public void testQueDepositaYExtraeDineroDeCuentaCorriente() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(100d);
		miCuentaCorriente.extraer(150d);
		assertEquals(47.5d,miCuentaCorriente.getSaldo(),0.01);
	}

}
