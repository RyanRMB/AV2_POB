package hotelXpotec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hotelMain {
    List<Cliente> clientes = new ArrayList<>();
    List<Quarto> quartos = new ArrayList<>();
    List<Cama> camas = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();
    
    public static void main(String[] args) {
    	int m=1,n=1;
    	hotelMain sistema = new hotelMain();
    	Scanner scanner = new Scanner(System.in);
    	while(m!=0) 
    	{
    		System.out.println("Digite o número correspondente ao tipo de informação que deseja lidar.");
    		System.out.println("1 - Clientes.");
    		System.out.println("2 - Reservas.");
    		System.out.println("3 - Quarto.");
    		System.out.println("4 - Cama.");
    		m = scanner.nextInt();
    		if(m==1) 
    		{
    			switch (n) {
    			case 0:
    				System.out.println("Programa encerrado.");
    				break;
    			case 1:
    				sistema.incluirCliente(null);
    				break;
    			case 2:
    				sistema.listarClientes();
    				break;
    			case 3:	
    				sistema.alterarCliente();
    				break;
    			case 4:	
    				sistema.excluirCliente();
    				break;
    			default:
    				System.out.println("Opção inválida. Tente novamente.");
    			}
    		} else if (m==2) {
    			switch (n) {
    			case 0:
    				System.out.println("Programa encerrado.");
    				break;
    			case 1: 
    				sistema.incluirQuarto();
    				break;
    			case 2:
    				sistema.listarQuartos();
    				break;
    			case 3:	
    				sistema.alterarQuarto();
    				break;
    			case 4:	
    				sistema.excluirQuarto();
    				break;
    			default:
    				System.out.println("Opção inválida. Tente novamente.");
    			}
    			
    		} else if (m==3) {
    			
    		} else if (m==4) {
    			
    		}
    	}
    	scanner.close();
    }

    public void incluirCliente(Cliente cliente) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("ID do cliente: ");
        String idCliente = scanner.nextLine();
        System.out.print("País do cliente: ");
        String paisCliente = scanner.nextLine();
        System.out.print("E-mail do cliente: ");
        String emailCliente = scanner.nextLine();
        System.out.print("Endereço do cliente: ");
        int enderecoCliente = scanner.nextInt();
        System.out.print("Código Postal do cliente: ");
        int postalCodeCliente = scanner.nextInt();
        System.out.print("CPF do cliente: ");
        int cpfCliente = scanner.nextInt();
        System.out.print("Passaporte do cliente: ");
        int passaporteCliente = scanner.nextInt();
        System.out.print("Data de Nascimento do cliente (AAAA-MM-DD): ");
        String dataNascimentoString = scanner.next();
        LocalDate dataNascimentoCliente = LocalDate.parse(dataNascimentoString);

        Cliente novoCliente = new Cliente(nomeCliente, idCliente, paisCliente, emailCliente, enderecoCliente, postalCodeCliente, cpfCliente, passaporteCliente, dataNascimentoCliente);
        clientes.add(novoCliente);
        System.out.println("Cliente adicionado com sucesso.");
        scanner.close();
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) 
        {
        	 System.out.println("Nome: " + cliente.getNome());
             System.out.println("ID: " + cliente.getId());
             System.out.println("País: " + cliente.getPais());
             System.out.println("E-mail: " + cliente.getEmail());
             System.out.println("Endereço: " + cliente.getEndereco());
             System.out.println("Código Postal: " + cliente.getPostalCode());
             System.out.println("CPF: " + cliente.getCpf());
             System.out.println("Passaporte: " + cliente.getPassaporte());
             System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
             System.out.println();        
        }
    }

    public void alterarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente a ser alterado: ");
        String nomeClienteAlterar = scanner.nextLine();
        Cliente clienteAlterar = buscarCliente(nomeClienteAlterar);

        if (clienteAlterar != null) {
        	int opcao=1;
        	while(opcao!=0) 
            {
            	System.out.println("O que você deseja alterar para o cliente " + clienteAlterar.getNome() + "?");
                System.out.println("0. Cancelar.");
                System.out.println("1. Nome.");
                System.out.println("2. País.");
                System.out.println("3. E-mail.");
                System.out.println("4. Endereço.");
                System.out.println("5. Código Postal.");
                System.out.println("6. CPF.");
                System.out.println("7. Passaporte.");
                System.out.println("8. Data de Nascimento.");
                System.out.print("Escolha a opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            	switch (opcao) {
            		case 0:
            			System.out.print("Operação cancelada.");
            			break;
            		case 1:
            			System.out.print("Novo nome: ");
            			String novoNome = scanner.nextLine();
            			clienteAlterar.setNome(novoNome);
            			break;
            		case 2:
            			System.out.print("Novo país: ");
            			String novoPais = scanner.nextLine();
            			clienteAlterar.setPais(novoPais);
            			break;
            		case 3:
            			System.out.print("Novo e-mail: ");
            			String novoEmail = scanner.nextLine();
            			clienteAlterar.setEmail(novoEmail);
            			break;
            		case 4:
            			System.out.print("Novo endereço: ");
            			String novoEndereco = scanner.nextLine();
            			clienteAlterar.setNome(novoEndereco);
            			break;
            		case 5:
            			System.out.print("Novo código postal: ");
            			String novoCodigoPostal = scanner.nextLine();
            			clienteAlterar.setNome(novoCodigoPostal);
            			break;
            		case 6:
            			System.out.print("Novo CPF: ");
            			String novoCPF = scanner.nextLine();
            			clienteAlterar.setNome(novoCPF);
            			break;
            		case 7:
            			System.out.print("Novo passaporte: ");
            			String novoPassaporte = scanner.nextLine();
            			clienteAlterar.setNome(novoPassaporte);
            			break;
            		case 8:
            			System.out.print("Novo data de nascimento: ");
            			String novaData = scanner.nextLine();
            			clienteAlterar.setNome(novaData);
            			break;	
            		default:
            			System.out.println("Opção inválida.");
            			break;
            	}
            }
            System.out.println("Cliente alterado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
        scanner.close();
    }
    public void excluirCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente a ser excluído: ");
        String nomeClienteExcluir = scanner.nextLine();
        Cliente clienteExcluir = buscarCliente(nomeClienteExcluir);

        if (clienteExcluir != null) {
            clientes.remove(clienteExcluir);
            System.out.println("Cliente excluído com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
        scanner.close();
    }
    
    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.nome.equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
    
    public void incluirQuarto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número do quarto: ");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do quarto: ");
        String nomeQuarto = scanner.nextLine();

        System.out.print("Descrição do quarto: ");
        String descricaoQuarto = scanner.nextLine();

        System.out.print("Quantidade de camas: ");
        int qtdeCamas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tem banheiro? (true/false): ");
        boolean temBanheiro = scanner.nextBoolean();
        scanner.nextLine();

        Quarto novoQuarto = new Quarto(numeroQuarto);
        novoQuarto.setNomeQuarto(nomeQuarto);
        novoQuarto.setDescricao(descricaoQuarto);
        novoQuarto.setQtdeCamas(qtdeCamas);
        novoQuarto.setTemBanheiro(temBanheiro);

        quartos.add(novoQuarto);

        System.out.println("Quarto adicionado com sucesso.");
        scanner.close();
    }
    
    public void alterarQuarto() {
        Scanner scanner = new Scanner(System.in);
        int opcao=1;
        
        while(opcao!=0) 
        {
        	System.out.print("Digite o número do quarto a ser alterado: ");
        	int numeroQuartoAlterar = scanner.nextInt();
        	scanner.nextLine();
        	Quarto quartoAlterar = buscarQuarto(numeroQuartoAlterar);
        	System.out.println("O que você deseja alterar no quarto " + quartoAlterar.getNumero() + "?");
        	System.out.print("0. Cancelar.");
        	System.out.println("1. Número do quarto.");
        	System.out.println("2. Nome do quarto.");
        	System.out.println("3. Descrição de quarto.");
        	System.out.println("4. Banheiro.");
        	scanner.nextLine();
        	opcao = scanner.nextInt();
        	switch(opcao) 
        	{
        	case 0:
        		System.out.print("Operação cancelada.");
        		break;
        	case 1:
        		System.out.print("Novo número de quarto: ");
        		int novoNumero = scanner.nextInt();
        		quartoAlterar.setNumero(novoNumero);
        	case 2:
        		System.out.print("Novo nome do quarto: ");
        		String novoNome = scanner.nextLine();
        		quartoAlterar.setNomeQuarto(novoNome);
        	case 3:
        		System.out.print("Nova descrição de quarto: ");
        		String novaDescricao = scanner.nextLine();
        		quartoAlterar.setDescricao(novaDescricao);
        	case 4:
        		System.out.print("Tem banheiro?");
        		boolean novoBanheiro = scanner.hasNext();
        		quartoAlterar.setTemBanheiro(novoBanheiro);
        	default:
        		System.out.print("Opção inválida.");
        	
        	}
        }
        scanner.close();
    }

    private Quarto buscarQuarto(int numeroQuartoAlterar) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuartoAlterar) {
                return quarto;
            }
        }
        return null;
    }

	public void excluirQuarto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do quarto a ser excluído: ");
        int numeroQuartoExcluir = scanner.nextInt();
        scanner.nextLine();

        Quarto quartoExcluir = buscarQuarto(numeroQuartoExcluir);

        if (quartoExcluir != null) {
            quartos.remove(quartoExcluir);
            System.out.println("Quarto excluído com sucesso.");
        } else {
            System.out.println("Quarto não encontrado.");
        }
        scanner.close();
    }

    public void listarQuartos() {
        for (Quarto quarto : quartos) {
        	System.out.println("Número do quarto: " + quarto.getNumero());
        	System.out.println("Nome do quarto: " + quarto.getNomeQuarto());
        	System.out.println("Descrição de quarto: " + quarto.getDescricao());
        	System.out.println("Banheiro: " + quarto.isTemBanheiro());
            System.out.println();
        }
    }
    
    public void incluirCama(List<Cama> camas) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número da Cama: ");
        int numeroCama = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descrição da Cama: ");
        String descricaoCama = scanner.nextLine();

        System.out.print("Posição da Cama: ");
        String posicaoCama = scanner.nextLine();

        System.out.print("A cama tem beliche? ");
        boolean temBeliche = scanner.nextBoolean();

        Cama novaCama = new Cama(numeroCama);
        novaCama.setDescricao(descricaoCama);
        novaCama.setPosicao(posicaoCama);
        novaCama.setTemBeliche(temBeliche);

        camas.add(novaCama);

        System.out.println("Cama adicionada com sucesso.");
        scanner.close();
    }

    public void listarCamas(List<Cama> camas) {
        for (Cama cama : camas) {
            System.out.println("Número da Cama: " + cama.getNumero());
            System.out.println();
        }
    }

    public void alterarCama() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da cama a ser alterada: ");
        int numeroCamaAlterar = scanner.nextInt();
        Cama camaAlterar = buscarCama(numeroCamaAlterar);

        if (camaAlterar != null) {
            System.out.print("Nova descrição para a cama: ");
            String novaDescricaoCama = scanner.nextLine();
            camaAlterar.setDescricao(novaDescricaoCama);
            System.out.println("Cama alterada com sucesso.");
        } else {
            System.out.println("Cama não encontrada.");
        }
        scanner.close();
    }

    public void excluirCama() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da cama a ser excluída: ");
        int numeroCamaExcluir = scanner.nextInt();
        Cama camaExcluir = buscarCama(numeroCamaExcluir);

        if (camaExcluir != null) {
            camas.remove(camaExcluir);
            System.out.println("Cama excluída com sucesso.");
        } else {
            System.out.println("Cama não encontrada.");
        }
        scanner.close();
    }
    
   public Cama buscarCama(int numeroCama) {
        for (Cama cama : camas) {
            if (cama.getNumero() == numeroCama) {
                return cama;
            }
        }
        return null;
    }
   
   public void incluirReserva() {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Número do Quarto: ");
       int numeroQuarto = scanner.nextInt();
       scanner.nextLine();

       System.out.print("Data de Início da Reserva (formato DD/MM/AAAA): ");
       String dataInicio = scanner.nextLine();

       System.out.print("Data de Fim da Reserva (formato DD/MM/AAAA): ");
       String dataFim = scanner.nextLine();

       Reserva novaReserva = new Reserva(numeroQuarto, dataInicio, dataFim);
       reservas.add(novaReserva);

       System.out.println("Reserva adicionada com sucesso.");
       scanner.close();
   }

   public void listarReservas() {
       System.out.println("Lista de Reservas");
       for (Reserva reserva : reservas) {
           System.out.println(reserva);
       }
       System.out.println();
   }

   public void alterarReserva() {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Número do Quarto da Reserva a ser alterada: ");
       int numeroQuarto = scanner.nextInt();
       scanner.nextLine();  // Consumir a quebra de linha

       for (Reserva reserva : reservas) {
           if (reserva.getIdQuarto() == numeroQuarto) {
               System.out.print("Nova Data de Início da Reserva (formato DD/MM/AAAA): ");
               String novaDataInicio = scanner.nextLine();

               System.out.print("Nova Data de Fim da Reserva (formato DD/MM/AAAA): ");
               String novaDataFim = scanner.nextLine();

               reserva.setDataInicio(novaDataInicio);
               reserva.setDataFim(novaDataFim);

               System.out.println("Reserva alterada com sucesso.");
               return;  // Encerrar a função se encontrar a reserva
           }
       }

       System.out.println("Reserva não encontrada.");
   }

   public void excluirReserva() {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Número do Quarto da Reserva a ser excluída: ");
       int numeroQuarto = scanner.nextInt();
       scanner.nextLine();  // Consumir a quebra de linha

       Reserva reservaExcluir = null;

       for (Reserva reserva : reservas) {
    	   
       }
       scanner.close();
   }
}
