package ar.edu.unlam.tp2;

public class CajaDeAhorro extends CuentaBancaria {
	
	private Integer cantidadDeExtracciones;
	
	public CajaDeAhorro (Double saldo, Integer cantidadDeExtracciones){
		super(saldo);
		this.cantidadDeExtracciones = cantidadDeExtracciones;
	}
	
	public void contarCantidadDeExtracciones(){
		this.cantidadDeExtracciones++;
	}
	public Integer cuantasExtraccionesRealice(){
		return this.cantidadDeExtracciones;
	}
	@Override
	public Double extraer(Double importeExtraccion){
		if(importeExtraccion <= super.getSaldo() && cantidadDeExtracciones<=5){
			Double restoEnCuenta = super.getSaldo();
			restoEnCuenta -= importeExtraccion;
			super.setSaldo(restoEnCuenta);
		}
		else if(super.getSaldo()>=importeExtraccion && cantidadDeExtracciones>=6){
			Double restoEnCuenta = super.getSaldo();
			restoEnCuenta -= (importeExtraccion + 6);
			super.setSaldo(restoEnCuenta);
		}
		else {
			System.out.println("saldo insuficiente");
		}
		return super.getSaldo();	
	}
}
