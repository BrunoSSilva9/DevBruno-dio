package com.fabrica.tests;

import com.funcionalidades.iphone.Eletronico.Iphone;

public class Test01 {

	public static void main(String[] args) {
	
		Iphone ip1 = new Iphone();
		
		ip1.selecionarMusica("Morena - Luan Santana");
		
		ip1.iniciarCorreioVoz();
		
		ip1.pausar();
		
		ip1.ligar("94992587413");
		
		ip1.atender();
		
		ip1.exibirPagina("https://web.dio.me/lab/desafio-de-projeto-1/learning/e3b2650f-ece9-43ee-b020-1074306e1f07?back=/track/coding-future-gft-desenvolvimento-java-com-ia");
		ip1.adicionarNovaAba();
		ip1.atualizarPagina();
		
		System.out.println(ip1);

	}

}
