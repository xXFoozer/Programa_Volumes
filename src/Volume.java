import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0, altura =0.0;
        double volume = 0.0;
        int opcao = 0;

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println(" Programa Calcular Volume de Figuras geométrica");
            System.out.println("--------------------------------------------------------");
            System.out.println("  1- Volume do Cilindro");
            System.out.println("  2- Volume do Cone");
            System.out.println("  3- Volume do Prisma");
            System.out.println("  4- Volume da Esfera");
            System.out.println("  5- Volume da Cubo");
            System.out.println("  6- Volume da Pirâmide Quadrangular");
            System.out.println("  7- Volume da Paralelepípedo ");
            System.out.println("  0- Sair");
            System.out.println("\n");
            System.out.println(" Escolha sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" Digite o Valor do raio: ");
                    raio = sc.nextDouble();

                    System.out.println(" Digite o Valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularCilindro(raio,altura);
                    System.out.printf(" O volume do Cilindro é: %.2f\n\n\n",volume);

                    break;

                case 2:

                    System.out.println(" Digite o Valor do raio: ");
                    raio = sc.nextDouble();

                    System.out.println(" Digite o Valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cone.calcularVolume(raio,altura);
                    System.out.printf(" O volume do Cone é: %.2f\n\n\n",volume);
                    break;

                case 3:
                    System.out.println(" Digite o Valor do lado: ");
                    raio = sc.nextDouble();

                    System.out.println(" Digite o Valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Prisma.calcularVolume(raio,altura);
                    System.out.printf(" O volume do Prisma é: %.2f\n\n\n",volume);
                    break;

                case 4:
                    System.out.println(" Digite o Valor do raio: ");
                    raio = sc.nextDouble();
                    
                    volume = Esfera.calcularVolume(raio,altura);
                    System.out.printf(" O volume do Esfera é: %.2f\n\n\n",volume);
                    break;

                case 5:
                    System.out.println(" Digite o Valor do raio: ");
                    raio = sc.nextDouble();

                    System.out.println(" Digite o Valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cubo.calcularVolume(raio,altura);
                    System.out.printf(" O volume do Cubo é: %.2f\n\n\n",volume);
                    break;

                case 6:
                    System.out.println(" Digite o Valor do raio: ");
                    raio = sc.nextDouble();

                    System.out.println(" Digite o Valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Piramide.calcularVolume(raio,altura);
                    System.out.printf(" O volume da Pirâmide Quadrangular é: %.2f\n\n\n",volume);
                    break;

                case 7:
                    System.out.println(" Digite o Valor do comprimento: ");
                    double comprimento = sc.nextDouble();

                    System.out.println(" Digite o valor da largura");
                    double largura = sc.nextDouble();

                    System.out.println(" Digite o Valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Paralelepipedo.calcularVolume(comprimento,largura,altura);
                    System.out.printf(" O volume da Paralelepípedo é: %.2f\n\n\n",volume);
                    break;

                case 0:
                    System.out.println(" Sair");
                    break;
                default:
                    System.out.println("  Opção Invalida!!");
            }

        }while (opcao !=0 );


        sc.close();
    }
}
