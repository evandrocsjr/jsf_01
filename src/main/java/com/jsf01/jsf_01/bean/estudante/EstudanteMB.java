package com.jsf01.jsf_01.bean.estudante;

import com.jsf01.jsf_01.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
public class EstudanteMB implements Serializable {
    private Estudante estudante = new Estudante();
    private List<String> nomeArray = asList("João", "Pedro", "Jeferson");
    private Set<String> setList = new HashSet<>(asList("Maria", "Ana", "Pedro"));
    private Map<String, String> mapList = new HashMap<>();

    public void executar(String nome){
        System.out.println("Buscando algo no banco");
        System.out.println("Imprimindo algo");
        System.out.println("Estudante " + nome + " recebeu a impressão.");
    }

    public String executandoRetorno(String nome){
        return "Uma frase qualquer do " + nome;
    }
    {
        mapList.put("Evandro", "Frase 1");
        mapList.put("João", "Frase 2");
        mapList.put("Paulo", "Frase 3");
    }

    public Map<String, String> getMapList() {
        return mapList;
    }

    public void setMapList(Map<String, String> mapList) {
        this.mapList = mapList;
    }

    public Set<String> getSetList() {
        return setList;
    }

    public void setSetList(Set<String> setList) {
        this.setList = setList;
    }

    public List<String> getNomeArray() {
        return nomeArray;
    }

    public void setNomeArray(List<String> nomeArray) {
        this.nomeArray = nomeArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String nextPage() {
        return "index2?faces-redirect=true";
    }
}
