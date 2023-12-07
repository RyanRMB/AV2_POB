package hotelXpotec;

import java.time.LocalDate;

public class Cliente {
	 public String nome, id, pais, email;
	 public int endereco, postalCode, cpf, passaporte;
	 public LocalDate dataNascimento;

	 public Cliente(String nome, String idString, String pais, String email,int endereco, int postalCode, int cpf, int passaporte, LocalDate dataNascimento) {
  this.nome = nome;
  this.id = idString;
  this.pais = pais;
  this.email = email;
  this.endereco = endereco;
  this.postalCode = postalCode;
  this.cpf = cpf;
  this.passaporte = passaporte;
  this.dataNascimento = dataNascimento;
}

	 public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String idString) {
		this.id = idString;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEndereco() {
		return endereco;
	}

	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
