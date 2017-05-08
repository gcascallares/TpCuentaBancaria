package ar.edu.unlam.tp2;

public class CuentaSueldo extends CuentaBancaria {
	
	public CuentaSueldo (Double saldo){
		super(saldo);
	}
	@Override
	public Double extraer(Double importeExtraccion){
	
		if(importeExtraccion <= super.getSaldo()){
			Double restoEnCuenta = super.getSaldo();
			restoEnCuenta -= importeExtraccion;
			super.setSaldo(restoEnCuenta);
		}
	else {
			System.out.println("saldo insuficiente");
		}
	return super.getSaldo();	
	}
}
