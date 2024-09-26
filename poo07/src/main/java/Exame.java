public class Exame extends Procedimento{

    public Exame(){}

    public Exame(int codigo, String consulta, String data, String descritivo) throws Exception {
        setCodigo(codigo);
        setData(data);
        setDescritivo(descritivo);
    }

    public void mostrar(){
        System.out.println("EXAME>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("descritivo:"+ getDescritivo());
    }
    public void solicitar(){
        //todo
    }

    public void consultar(){
        super.consultar();
    }

}
