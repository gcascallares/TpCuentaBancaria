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
			super.setSaldo(super.getSaldo() - importeExtraccion);
		}
		else if(super.getSaldo()>=importeExtraccion && cantidadDeExtracciones>=6){
			super.setSaldo(super.getSaldo() - (importeExtraccion + 6));
		}
		else {
			System.out.println("saldo insuficiente");
		}
		return super.getSaldo();	
	}
}
