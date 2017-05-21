package ar.edu.unlam.tp2;

public class CuentaBancaria {
	private Double saldo;
	
	public CuentaBancaria(Double saldo){
	this.saldo = saldo;	
	}
	
	public Double extraer(Double importeExtraccion){
		
		if(importeExtraccion <= this.getSaldo()){
			this.saldo -= importeExtraccion;
		}
	else {
			System.out.println("saldo insuficiente");
		}
	return this.getSaldo();	
	}
	
	public Double depositar(Double deposito){
		this.saldo +=  deposito;
		return saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double consultarSaldo(){
		return getSaldo();
	}
}
