package ar.edu.unlam.tp2;

public class CuentaCorriente extends CuentaBancaria {
	private final Double descubiertoInicial = 100d;
	private final Double cargoDescubierto = 0.05;
	
	public CuentaCorriente (Double saldo){
		super(saldo);
	}
	@Override
	public Double extraer(Double importeExtraccion){
	
		if(importeExtraccion <= super.getSaldo()){
			super.setSaldo(super.getSaldo() - importeExtraccion);
		}
		else if(importeExtraccion <= (this.descubiertoInicial + super.getSaldo())){
			Double comision;
			Double nuevodescubierto;
			nuevodescubierto = descubiertoInicial - (importeExtraccion - super.getSaldo());
			comision = cargoDescubierto * (descubiertoInicial - nuevodescubierto);
			super.setSaldo(nuevodescubierto - comision);
		}
		else {
			System.out.println("saldo insuficiente");
		}
	return super.getSaldo();	
	}
}
