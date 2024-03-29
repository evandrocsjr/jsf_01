package com.jsf01.jsf_01.bean.request;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {
    private List<String> personagens = asList("Evandro", "Paulo", "Pedro");
    private List<String> personagensSelecionados = new ArrayList<>();

    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagensSelecionados.add(personagem);
    }

    public List<String> getPersonagensSelecionados() {
        return personagensSelecionados;
    }

    public void setPersonagensSelecionados(List<String> personagensSelecionados) {
        this.personagensSelecionados = personagensSelecionados;
    }
}
