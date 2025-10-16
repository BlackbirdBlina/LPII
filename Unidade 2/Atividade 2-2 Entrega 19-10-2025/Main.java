public class Main {
    public static void main(String[] args) {
        // Repositório com Generics
        Repositorio<String> repo = new Repositorio<String>();

        // Testando com String
        repo.adicionar("objeto1", "Banana");
        repo.adicionar("objeto2", "Maçã");

        System.out.println("Busca por Banana:");
        String saida1 = repo.buscar("objeto1");
        System.out.println(saida1);

        System.out.println("Busca por Maçã:");
        String saida2 = repo.buscar("objeto2");
        System.out.println(saida2);

        System.out.println("\nListando todos:");
        repo.listar();

        // Testando com Aluno
        Aluno a1 = new Aluno("2021001", "Maria");
        Aluno a2 = new Aluno("2021002", "João");

        Repositorio<Aluno> repoAluno = new Repositorio<Aluno>();
        /* Acredito que o ideal seria usar a matrícula como chave,
        porém como o professor havia definido a busca com nome, fiz com o nome */
        repoAluno.adicionar(a1.getNome(), a1);
        repoAluno.adicionar(a2.getNome(), a2);

        System.out.println("\nBusca por Maria:");
        Aluno resultado1 = repoAluno.buscar("Maria");
        System.out.println(resultado1);

        System.out.println("Busca por João:");
        Aluno resultado2 = repoAluno.buscar("João");
        System.out.println(resultado2);

        System.out.println("\nListando todos:");
        repoAluno.listar();
    }
}
