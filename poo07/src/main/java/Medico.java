public class Medico extends Funcionario{
    private String crm;
    private String especialidade;


    public Medico(){}

    public Medico(int codigo, String nome, String crm, String telefone,
                  String especialidade, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public void mostrar(){
        System.out.println("MEDICO>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("crm:"+ getCrm());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("senha:"+ getSenha());
        System.out.println("especialidade:"+ getEspecialidade());
    }


    public void receitar(Consulta obj) throws Exception {
        Receita novaReceita = new Receita(1,"teste","2024-10-09", "dipirona");
        obj.getReceitas().add(novaReceita);

        Exame novoExame = new Exame(1,"teste","2024-09-12", "Raio x torax");
        obj.getExames().add(novoExame);
    }

    public void acessar(){
        System.out.println(getCrm());
        System.out.println(getEspecialidade());
        super.acessar();
    }

}
