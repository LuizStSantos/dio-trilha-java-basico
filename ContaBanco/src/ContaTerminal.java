public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: IMPORTAR A CLASSE SCANNER DO PACOTE
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //EXIBIR MENSAGEM PARA O USUÁRIO

        System.out.println("Por favor, digite o núemro da conta ! Ex: 1021");
        int numero = scanner.nextInt();

        //LIMPAR O BUFFER DO SCANNER
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência ! Ex: 067-8");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente ! Ex: MARIO ANDRADE");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta ! Ex: 237.38");
        double saldo = scanner.nextDouble();

        //OBTER PELO SCANNER OS VALORES DIGITADOS
        //EXIBIR A MENSAGEM DE BOAS VINDAS COM OS DADOS INFORMADOS
        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

        //FECHAR O SCANNER
        scanner.close();       
    }
}