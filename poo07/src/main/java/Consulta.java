import java.util.List;

public class Consulta  extends Agenda{
    private String motivo;
    private String historico;
    private List<Receita> receitas;
    private List<Exame> exames;

    public Consulta(){}

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public Consulta(int codigo, String data, String hora, Medico medico,
                    Paciente paciente, String motivo, String historico) throws Exception {
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void mostrar(){
        System.out.println("CONSULTA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        getMedico().mostrar();
        getPaciente().mostrar();
        System.out.println("motivo:"+ getMotivo());
        System.out.println("historico:"+ getHistorico());
        for (Receita obj: getReceitas()) {
            obj.mostrar();
        }
        for(Exame obj: getExames()){
            obj.mostrar();
        }
    }

    public void consultar(){
        System.out.println(getMotivo());
        System.out.println(getHistorico());
        super.consultar();
    }

    public void marcar(){
        //todo
    }
    public void cancelar(){
        //todo
    }

    public void realizar(){
        //todo
    }
    public void atualizar(){
        //todo
    }
}
