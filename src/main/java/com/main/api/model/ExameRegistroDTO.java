package com.main.api.model;

import java.time.LocalDateTime;

public class ExameRegistroDTO {
    private Long id;
    private Long prontuarioId;
    private String nome;
    private String resultado;
    private String observacoes;
    private Long medicoResponsavelExameId;
    private String medicoResponsavelExameNome;
    private String medicoResponsavelExameEspecialidade;
    private String medicoResponsavelExameCRM;
    private LocalDateTime dataExame;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getProntuarioId() { return prontuarioId; }
    public void setProntuarioId(Long prontuarioId) { this.prontuarioId = prontuarioId; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
    public Long getMedicoResponsavelExameId() { return medicoResponsavelExameId; }
    public void setMedicoResponsavelExameId(Long medicoResponsavelExameId) { this.medicoResponsavelExameId = medicoResponsavelExameId; }
    public String getMedicoResponsavelExameNome() { return medicoResponsavelExameNome; }
    public void setMedicoResponsavelExameNome(String medicoResponsavelExameNome) { this.medicoResponsavelExameNome = medicoResponsavelExameNome; }
    public String getMedicoResponsavelExameEspecialidade() { return medicoResponsavelExameEspecialidade; }
    public void setMedicoResponsavelExameEspecialidade(String medicoResponsavelExameEspecialidade) { this.medicoResponsavelExameEspecialidade = medicoResponsavelExameEspecialidade; }
    public String getMedicoResponsavelExameCRM() { return medicoResponsavelExameCRM; }
    public void setMedicoResponsavelExameCRM(String medicoResponsavelExameCRM) { this.medicoResponsavelExameCRM = medicoResponsavelExameCRM; }
    public LocalDateTime getDataExame() { return dataExame; }
    public void setDataExame(LocalDateTime dataExame) { this.dataExame = dataExame; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}