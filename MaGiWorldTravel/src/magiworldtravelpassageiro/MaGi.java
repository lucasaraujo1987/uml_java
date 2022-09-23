package magiworldtravelpassageiro;


public class MaGi{
    private int id;
    private String nome;
    private int cpf, cep, contador;
    private String embarque, destino, endereco, sn;
    
//        public void Menu() {
//        System.out.println("---------------------");
//        System.out.println("  MAGI WORLD TRAVEL  ");
//        System.out.println("---------------------");
//        System.out.println("[1] CADASTRAR CLIENTES");
//        System.out.println("[2] CADASTRAR DESTINO");
//        System.out.println("[3] CONSULTAR TOTAL CADASTRADO");
//        System.out.println("[4] CONSULTAR CLIENTE ESPECÍFICO");
//        System.out.println("[5] CONSULTAR TODOS OS DESTINOS");
//        System.out.println("[6] PARA SAIR");
//        Scanner t = new Scanner(System.in);
//        int opcao = t.nextInt();
//        switch (opcao){
//            case 1:
//                    do{
//                        contador++;
//                        System.out.println("------------------------");
//                        System.out.println("  CADASTRO DE CLIENTES  ");
//                        System.out.println("------------------------");
//                        System.out.print("Nome Completo: ");
//                        nome = t.next();
//                        /*System.out.print("CPF: ");
//                        cpf[contador] = t.nextInt();
//                        //embarque = "";
//                        //destino = "";
//                        System.out.print("Cep: ");
//                        cep[contador] = t.nextInt();
//                        System.out.print("Endereço (Rua/Cidade/Estado)");
//                        endereco[contador] = t.next();*/
//
//
//                        do{
//                            System.out.println("Cadastrar outra pessoa? [S/N]");
//                            sn = t.next().toUpperCase();
//                                if("S"!=sn){
//                                    System.out.println("Digite 'S' ou 'N' !"+ sn);
//                                }
//                        }while("N"==sn||"S"==(sn));                   
//                    }while(sn=="N");
//                    Menu();
//            break;
//            case 2:
//            
//            break;
//            case 3:
//            
//            break;
//            case 4:
//            
//            break;
//            case 5:
//            
//            break;
//            case 6:
//            
//            break;
//        }
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEmbarque() {
        return embarque;
    }

    public void setEmbarque(String embarque) {
        this.embarque = embarque;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
