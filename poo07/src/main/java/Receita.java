public class Receita extends Procedimento{
    public Receita(){}

    public Receita(int codigo, String consulta, String data, String descritivo) throws Exception {
        setCodigo(codigo);
        setData(data);
        setDescritivo(descritivo);
    }

    public void mostrar(){
        System.out.println("RECEITA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("descritivo:"+ getDescritivo());
    }

    public void preescrever(){
        //TODO;
    }

    public void consultar(){
        super.consultar();
    }

}
