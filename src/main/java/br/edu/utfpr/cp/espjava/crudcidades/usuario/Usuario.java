package br.edu.utfpr.cp.espjava.crudcidades.usuario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> papeis;

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public List<String> getPapeis() { return papeis; }
    public String getSenha() { return senha; }
    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPapeis(List<String> papeis) { this.papeis = papeis; }
    public void setSenha(String senha) { this.senha = senha; }
}
