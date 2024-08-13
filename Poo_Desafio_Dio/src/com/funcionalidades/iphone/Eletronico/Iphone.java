package com.funcionalidades.iphone.Eletronico;

import java.util.ArrayList;
import java.util.List;

import com.funcionalidades.iphone.AparelhoTelefonico.AparelhoTelefonico;
import com.funcionalidades.iphone.NavegadorInternet.NavegadorInternet;
import com.funcionalidades.iphone.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	protected boolean reproduzir = false;
	protected boolean chamada = false;
	protected int abas = 1;
	protected List<String> playlistMusicas = new ArrayList<>();
	
	public Iphone() {
	}

	@Override
	public String exibirPagina(String url) {
		System.out.println("Carregando pagina...");
		return null;
	}

	@Override
	public void adicionarNovaAba() {
		this.abas++;
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	@Override
	public boolean ligar(String numero) {
		System.out.println("Chamada para o numero " + numero);
		
		return true;
	}

	@Override
	public void atender() {
		this.chamada = true;
	}

	@Override
	public String iniciarCorreioVoz() {
		System.out.println("Iniciando Chamada...");
		return null;
	}

	@Override
	public boolean tocar() {
		this.reproduzir = true;
		
		return reproduzir;
	}

	@Override
	public void pausar() {
		this.reproduzir = false;
		System.out.println("Reproduzir musica: " + reproduzir);	
	}

	@Override
	public String selecionarMusica(String musica) {
		this.addMusicas(musica);
		this.tocar();
		System.out.println("Reproduzindo musica: " + musica);
		
		return musica;
	}

	public List<String> getPlaylistMusicas() {
		return this.playlistMusicas;
	}

	public void addMusicas(String musica) {
		playlistMusicas.add(musica);
	}
	
	public void removeMusicas(String musica) {
		playlistMusicas.remove(musica);
	}

	@Override
	public String toString() {
		return "Iphone [reproduzir=" + reproduzir + ", chamada=" + chamada
				+ ", abas=" + abas + ", playlistMusicas=" + playlistMusicas + "]";
	}

	

	
}
