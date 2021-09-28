public class LivroDNotas{ // um problema

    //variável de instância
    //instância é sinônimo de objeto
    //ela chama var de instância pois cada instãncia tem a sua própria cópia dela
    String nomeDoCurso;

    //esse é um método de instância
    public void exibirMensagem(){
        //nomeDoCurso = atributo
        // System.out.println("Bem vindo ao seu livro de notas");//descrição
        System.out.printf("Bem vindo ao seu livro de notas do curso %s!", nomeDoCurso);
    } // metodo main alta coesão 
}
// não tem objeto
// so tem a descrição class não instanciei apena a 
//instrução agr o dado livro de notas existe
// e posso construir objeto
// 