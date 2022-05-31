package com.jsf01.jsf_01.bean.request;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {
    private List<String> personagens = asList("Evandro", "Paulo", "Pedro");
    private List<String> personagemSelecionado = new ArrayList<>();
}
