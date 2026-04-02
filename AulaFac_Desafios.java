import java.util.Scanner;
public class AulaFac_Desafios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

/* Uma concessionária de veículos está com uma promoção, vendendo seus carros com desconto. O desconto é de 10% para
 carros com ano inferior a 2000 e 7% quando o ano for 2000 ou superior. Faça um programa que receba vários registros
  contendo o ano do carro e o seu valor original. A cada registro lido o programa deverá perguntar se o usuário 
  deseja continuar. Se o usuário responder que sim, ler novo registro, caso responda que não o programa deverá 
  apresentar na tela a 
quantidade de carros vendidos, o valor total com desconto de 7%, o valor total com desconto de 10%. */
System.out.println("Digite o ano do carro:");
int anoCarro = scanner.nextInt();
System.out.println("Digite o valor original do carro:");
double valorOriginal = scanner.nextDouble();
double valorComDesconto7 = 0;
double valorComDesconto10 = 0;
int quantidadeCarrosVendidos = 0;
while (true) {
    System.out.println("Deseja continuar? (sim/não)");
    String resposta = scanner.next();
    if (resposta.equalsIgnoreCase("sim")) {
        System.out.println("Digite o ano do carro:");
        anoCarro = scanner.nextInt();
        System.out.println("Digite o valor original do carro:");
        valorOriginal = scanner.nextDouble();
        if (anoCarro < 2000) {
            valorComDesconto10 += valorOriginal * 0.9; // Aplicando desconto
        } else {
            valorComDesconto7 += valorOriginal * 0.93; // Aplicando desconto        
            quantidadeCarrosVendidos++;
        }
}