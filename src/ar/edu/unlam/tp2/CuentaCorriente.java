package ar.edu.unlam.tp2;

public class CuentaCorriente extends CuentaBancaria {
	private Double descubiertoInicial;
	private final Double cargoDescubierto = 0.05;
	
	public CuentaCorriente (Double saldo,Double descubierto){
		super(saldo);
		this.descubiertoInicial = descubiertoInicial;
	}
	@Override
	public Double extraer(Double importeExtraccion){
	
		if(importeExtraccion <= super.getSaldo()){
			Double restoEnCuenta = super.getSaldo();
			restoEnCuenta -= importeExtraccion;
			super.setSaldo(restoEnCuenta);
		}
		else if(importeExtraccion <= (this.descubiertoInicial + super.getSaldo())){
			Double nuevoDescubierto = getDescubiertoInicial();
			Double comision;
			Double descubiertoFinal;
			descubiertoInicial-= (importeExtraccion - super.getSaldo() );
			comision = cargoDescubierto * (nuevoDescubierto - descubiertoInicial);
		    descubiertoFinal = nuevoDescubierto - comision;
			//this.setDescubiertoInicial(descubiertoFinal);
			super.setSaldo(descubiertoFinal);
		}
		else {
			System.out.println("saldo insuficiente");
		}
	return super.getSaldo();	
	}

	public Double getDescubiertoInicial() {
		return descubiertoInicial;
	}

	public void setDescubiertoInicial(Double descubiertoInicial) {
		this.descubiertoInicial = descubiertoInicial;
	}
	
}
