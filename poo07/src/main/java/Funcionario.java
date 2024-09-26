public abstract class Funcionario {
    private int codigo;
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario(){}

    public Funcionario(int codigo, String nome, String telefone, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrar(){
        System.out.println("Funcionario cadastrado com sucesso.");
    }
    public void acessar(){
        System.out.println(getNome());
        System.out.println(getSenha());
        System.out.println(getTelefone());
    }

}
