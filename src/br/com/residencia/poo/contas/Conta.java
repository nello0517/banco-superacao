package br.com.residencia.poo.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
	//protected String titular;
	protected String tipoConta;
	protected Integer agencia;
	protected Integer numero;
	protected Double saldo;
	protected String cpf;

	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Conta() {

	}

	public Conta(String tipoConta, Integer agencia, Integer numero, Double saldo, String cpf) {
		this.tipoConta = tipoConta;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cpf = cpf;
	}
	
/*	public String getTitular() {
		return titular;
	}

public void setTitular(String titular) {
		this.titular = titular;
	}*/
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public abstract void transferir(Conta destino, double valor);
	
	public abstract void verificarSaldo();
}