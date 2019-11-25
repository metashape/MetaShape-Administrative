package br.com.metashape.utils;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author pedrobertolini
 */
public class Sku {        
    public int cod_sku;
    private String nome_sku;
    private String sabor_cor;
    private String descricao;
    private String categoria;
    private boolean ativo;

    public Sku(int cod_sku, String nome_sku, String sabor_cor, String descricao, String categoria) {
        this.cod_sku = cod_sku;
        this.nome_sku = nome_sku;
        this.sabor_cor = sabor_cor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.ativo = true;
    }
     public int getCod_sku() {
        return cod_sku;
    }

    public void setCod_sku(int cod_sku) {
        this.cod_sku = cod_sku;
    }

    public String getNome_sku() {
        return nome_sku;
    }

    public void setNome_sku(String nome_sku) {
        this.nome_sku = nome_sku;
    }

    public String getSabor_cor() {
        return sabor_cor;
    }

    public void setSabor_cor(String sabor_cor) {
        this.sabor_cor = sabor_cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String decricao) {
        this.descricao = decricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
