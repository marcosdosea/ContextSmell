package org.contextsmell;

import java.util.HashMap;

import org.designroleminer.LimiarMetrica;

public class LimiarTecnica {
	private String tecnica;
	private HashMap<String, LimiarMetrica> metricas;

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public HashMap<String, LimiarMetrica> getMetricas() {
		return metricas;
	}

	public void setMetricas(HashMap<String, LimiarMetrica> metricas) {
		this.metricas = metricas;
	}

}
