package com.jsf01.jsf_01.bean.session;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable {
    private List<String> personagens = asList("Goku", "Naruto", "João");
    private List<String> personagensSelecionados = new ArrayList<>();

    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagensSelecionados.add(personagem);
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public List<String> getPersonagensSelecionados() {
        return personagensSelecionados;
    }

    public void setPersonagensSelecionados(List<String> personagensSelecionados) {
        this.personagensSelecionados = personagensSelecionados;
    }
}
