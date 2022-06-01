package com.jsf01.jsf_01.bean.view;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {
    private List<String> personagens;
    private List<String> personagensSelecionados = new ArrayList<>();

    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagensSelecionados.add(personagem);
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstructor do ViewScoped");
        personagens = asList("Nome1", "Nome2", "Nome3");
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "view?faces-redirect=true";
    }

    public List<String> getPersonagensSelecionados() {
        return personagensSelecionados;
    }

    public void setPersonagensSelecionados(List<String> personagensSelecionados) {
        this.personagensSelecionados = personagensSelecionados;
    }
}
