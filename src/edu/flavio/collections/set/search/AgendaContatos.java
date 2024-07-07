package edu.flavio.collections.set.search;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos:
    private Set<Contato> contatoSet;

    //métodos:
    //construtores
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //manipuladores
//adicionarContato(String nome, int numeroTelefone): Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numeroTelefone) {
        contatoSet.add(new Contato(nome, numeroTelefone));
    }
//exibirContatos(): Exibe todos os contatos da agenda.
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

//pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Set<Contato> pesquisaPorNome(String nome){
       Set<Contato>contatosPorNome=new HashSet<>();
                for (Contato c: contatoSet){
                    if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                    }
                }
        return contatosPorNome;
    }

//atualizarNumeroContato(String nome, int novoNumero)
    public Contato atualizarNumeroContato(String nome,int novoNumero){
        Contato contatoAtualizado =null;//pq só será referenciado depois que for atualizado
        for(Contato c:contatoSet){
            if(c.getNome().startsWith(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado=c;//pq retornar esse contato??
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda =new AgendaContatos();
//A adição em um HashSet é feita com ordem aleatóiria
        agenda.adicionarContato("Milton",1199997777);
        agenda.adicionarContato("Milton",0);
        agenda.adicionarContato("Milton",1199997777);
        agenda.adicionarContato("Ana",1297756600);
        agenda.adicionarContato("Cirílo",1197979797);
        agenda.adicionarContato("Debora",1198887777);
        agenda.adicionarContato("Deborah",1198887777);
        System.out.println("AGENDA");

        agenda.exibirContatos();

        //resultado sem o "equals" e "hashCode":
        /*AGENDA
 [Contato{nome='Milton', numeroTelefone=1199997777},
  Contato{nome='Ana', numeroTelefone=1297756600},
  Contato{nome='Debora', numeroTelefone=1198887777},
  Contato{nome='Deborah', numeroTelefone=1198887777},
  Contato{nome='Cirílo', numeroTelefone=1197979797},
  Contato{nome='Milton', numeroTelefone=0},
  Contato{nome='Milton', numeroTelefone=1199997777}]
*/
        //resultado Com o "equals" e "hashCode" (Por nome)

        /*[Contato{nome='Deborah', numeroTelefone=1198887777},
          Contato{nome='Ana', numeroTelefone=1297756600},
          Contato{nome='Cirílo', numeroTelefone=1197979797},
          Contato{nome='Debora', numeroTelefone=1198887777},
          Contato{nome='Milton', numeroTelefone=1199997777}]
        */

        System.out.println("Pesquisa por Nome");
        System.out.println( agenda.pesquisaPorNome("Cirílo"));

        System.out.println("Atualizar Contato");
        System.out.println(agenda.atualizarNumeroContato("Milton",1188776655));
        System.out.println("");

        System.out.println("agenda atualizada");
        agenda.exibirContatos();
        System.out.println("");
        System.out.println("Conclusão: com a utilização da interface 'Set', criamos uma variável de instância 'contatoSet' do tipo Set<Contato>,que é inicializada como um objeto HashSet<Contato> no construtor da classe.");
        System.out.println("Para realizar a pesquisa, criamos um método (que retornará um conjunto='Set' do tipo <Contato>') e, dentro dele, criamos 'contatosPorNome' que é um objeto HashSet<>");
        System.out.println("Para atualizar o telefone, criamos um método (que retornará um valor do tipo 'Contato') e, dentro dele, criamos uma variável 'contaotoAtualizado' do tipo 'Contato' que é iniciada com valor 'null', pois só poderá receber valor depois da execução do código");
    }
}