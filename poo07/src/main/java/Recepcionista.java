public class Recepcionista extends Funcionario {
    private String cpf;

    public Recepcionista(){}

    public Recepcionista(int codigo, String nome, String cpf, String telefone, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrar(){
        System.out.println("RECEPCIONISTA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("cpf:"+ getCpf());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("senha:"+ getSenha());
    }

    public  void acessar(){
        System.out.println(getCpf());
        super.acessar();
    }

    public void consultar() throws Exception {
        Paciente obj = new Paciente(1,"maria","345435","4555-3455","F",30);
        obj.mostrar();
    }


}
