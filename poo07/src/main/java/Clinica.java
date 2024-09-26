public class Clinica {

    public static void main(String[] args) {
        try {
            Paciente p1 = new Paciente();
            p1.setCodigo(1l);
            p1.setCpf("asdasdasd");
            p1.setGenero("F");
            p1.setIdade(34);
            p1.setNome("maria da silva");
            p1.setTelefone("2344-23444");
            p1.mostrar();
            Paciente obj34 = new Paciente();
            obj34.setTelefone("2345-3456");
            obj34.setIdade(23);
            obj34.setNome("joana souza");
            obj34.setGenero("F");
            obj34.setCpf("234234234");
            obj34.mostrar();

            Paciente objX = new Paciente(-45, "joao", "234234", "2344-2344", "M", 40);
            objX.mostrar();

      
        }
        catch(Exception err){
            System.out.println("Ocorreu um erro = "+ err.getMessage());
        }
        finally {
            System.out.println("ACABOU>>>>>>>>");
        }
    }
}
