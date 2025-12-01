package dominio;

import java.util.UUID;

public class Cliente {

    private UUID codigoCliente;
    private String nome;
    private String cpf;
    private String sexo;
    private byte[] foto;

    public Cliente(UUID codigoCliente, String nome, String cpf, String sexo, byte[] foto) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.foto = foto;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(UUID codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
