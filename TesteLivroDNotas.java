import javax.swing.JOptionPane;

public class TesteLivroDNotas {
    
    public static void main(String[] arg){
        // variável de referência (semelhante aos ponteiros da linguaguem C)
        // declarei uma variável
        //análogo a int a;  METODO [PILHA MAIN] livroDNotas EXISTE NA STACK PQ É VARIAVEL LOCAL
        LivroDNotas livroDNotas;   
        //new constrói um objeto todo OBJ new, Randow (geraçao de valor aleatorios), Scanner(leitura de dados) fica no HEAP
        livroDNotas = new LivroDNotas();
        //estamos enviando a mensagem "exibirMensagem" ao 
        //objeto livro 
        String nomeDoCurso = JOptionPane. showInputDialog("Digite o nome do curso");
        livroDNotas.nomeDoCurso = nomeDoCurso;
        livroDNotas.exibirMensagem();

        LivroDNotas outroLivro = new LivroDNotas();

        String outroNome = JOptionPane.showInputDialog("Nome do segundo curso");

        outroLivro.nomeDoCurso = outroNome;

        outroLivro.exibirMensagem();

        System.out.println("Terminando...");
    }
}
 