package controler;

public class Cliente  implements java.io.Serializable{
             private int id;
             private String nomeFantasia;
             private String razaoSocial;
             private String inscricaoEstadual;
             private String cnpj;
             private String telefone;
             private String email;
             private String cep;
             private String rua;
             private String bairro;
             private int numero;
             private String uf;
             private String cidade;
             private String parceiro;

             public Cliente() {
                         
             }
             
             
             public Cliente(String nomeFantasia, String razaoSocial, String inscricaoEstadual, String cnpj, String telefone, String email, String cep, String rua, String bairro, int numero, String uf, String cidade,  String parceiro) {
                          this.nomeFantasia = nomeFantasia;
                          this.razaoSocial = razaoSocial;
                          this.inscricaoEstadual = inscricaoEstadual;
                          this.cnpj = cnpj;
                          this.telefone = telefone;
                          this.email = email;
                          this.cep = cep;
                          this.rua = rua;
                          this.bairro = bairro;
                          this.numero = numero;
                          this.uf = uf;
                          this.cidade = cidade;
                          this.parceiro = parceiro;
             }

             public int getId() {
                          return id;
             }

             public void setId(int id) {
                          this.id = id;
             }

             public String getNomeFantasia() {
                          return nomeFantasia;
             }

             public void setNomeFantasia(String nomeFantasia) {
                          this.nomeFantasia = nomeFantasia;
             }

             public String getRazaoSocial() {
                          return razaoSocial;
             }

             public void setRazaoSocial(String razaoSocial) {
                          this.razaoSocial = razaoSocial;
             }

             public String getInscricaoEstadual() {
                          return inscricaoEstadual;
             }

             public void setInscricaoEstadual(String inscricaoEstadual) {
                          this.inscricaoEstadual = inscricaoEstadual;
             }

             public String getCnpj() {
                          return cnpj;
             }

             public void setCnpj(String cnpj) {
                          this.cnpj = cnpj;
             }

             public String getTelefone() {
                          return telefone;
             }

             public void setTelefone(String telefone) {
                          this.telefone = telefone;
             }

             public String getEmail() {
                          return email;
             }

             public void setEmail(String email) {
                          this.email = email;
             }

             public String getCep() {
                          return cep;
             }

             public void setCep(String cep) {
                          this.cep = cep;
             }

             public String getRua() {
                          return rua;
             }

             public void setRua(String rua) {
                          this.rua = rua;
             }

             public String getBairro() {
                          return bairro;
             }

             public void setBairro(String bairro) {
                          this.bairro = bairro;
             }

             public int getNumero() {
                          return numero;
             }

             public void setNumero(int numero) {
                          this.numero = numero;
             }

             public String getUf() {
                          return uf;
             }

             public void setUf(String uf) {
                          this.uf = uf;
             }

             public String getCidade() {
                          return cidade;
             }

             public void setCidade(String cidade) {
                          this.cidade = cidade;
             }

             public String getParceiro() {
                          return parceiro;
             }

             public void setParceiro(String parceiro) {
                          this.parceiro = parceiro;
             }
             
             
             
}
