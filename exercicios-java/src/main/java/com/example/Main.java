package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
class Nivel1 {
    public static void main(String[] args) {

        // Exercício 1
        int numeroExercicio1_1 = 45;
        double numeroExercicio1_2 = numeroExercicio1_1;

        System.out.println("1° Exercício\n");
        System.out.println("Número 1 em int: " + numeroExercicio1_1 + "\nNúmero 2 em double: " + numeroExercicio1_2);

        // Exercício 2
        double numeroExercicio2_1 = 45;
        int numeroExercicio2_2 = (int) numeroExercicio2_1;

        System.out.println("\n2° Exercício\n");
        System.out.println("Número 1 em double: " + numeroExercicio2_1 + "\nNúmero 2 em int: " + numeroExercicio2_2);

        // Exercício 3
        float numeroExercicio3_1 = 44.5f;
        long numeroExercicio3_2 = (long) numeroExercicio3_1;

        System.out.println("\n3° Exercício\n");
        System.out.println("Número 1 em float: " + numeroExercicio3_1 + "\nNúmero 2 em long: " + numeroExercicio3_2);

        // Exercício 4
        short numeroExercicio4_1 = 4;
        int numeroExercicio4_2 = (int) numeroExercicio4_1;
        byte numeroExercicio4_3 = (byte) numeroExercicio4_1;

        System.out.println("\n4° Exercício\n");
        System.out.println("Número 1 em short: " + numeroExercicio4_1 + "\nNúmero 2 em int: " + numeroExercicio4_2 + "\nNúmero 3 em byte: " + numeroExercicio4_3);
    }
}

class Nivel2 {

    public static void main(String[] args) {

        // Exercício 1
        int numeroExercicio5_1 = 5;
        int numeroExercicio5_2 = 10;
        boolean verificadorMaior = numeroExercicio5_1 > numeroExercicio5_2;
        boolean verificadorMaiorIgual = numeroExercicio5_1 >= numeroExercicio5_2;
        boolean verificadorMenor = numeroExercicio5_1 < numeroExercicio5_2;
        boolean verificadorMenorIgual = numeroExercicio5_1 <= numeroExercicio5_2;
        boolean verificadorIgual = numeroExercicio5_1 == numeroExercicio5_2;
        boolean verificadorDiferente = numeroExercicio5_1 != numeroExercicio5_2;

        System.out.println("Número 1: " + numeroExercicio5_1 + "\nNúmero 2: " + numeroExercicio5_2 + "\nNúmero 1 é > que Número 2: " + verificadorMaior);
        System.out.println("\nNúmero 1: " + numeroExercicio5_1 + "\nNúmero 2: " + numeroExercicio5_2 + "\nNúmero 1 é >= que Número 2: " + verificadorMaiorIgual);
        System.out.println("\nNúmero 1: " + numeroExercicio5_1 + "\nNúmero 2: " + numeroExercicio5_2 + "\nNúmero 1 é < que Número 2: " + verificadorMenor);
        System.out.println("\nNúmero 1: " + numeroExercicio5_1 + "\nNúmero 2: " + numeroExercicio5_2 + "\nNúmero 1 é <= que Número 2: " + verificadorMenorIgual);
        System.out.println("\nNúmero 1: " + numeroExercicio5_1 + "\nNúmero 2: " + numeroExercicio5_2 + "\nNúmero 1 é == que Número 2: " + verificadorIgual);
        System.out.println("\nNúmero 1: " + numeroExercicio5_1 + "\nNúmero 2: " + numeroExercicio5_2 + "\nNúmero 1 é != que Número 2: " + verificadorDiferente);

        // Exercício 2
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        boolean resultadoAnd1 = cond1 && cond2;
        boolean resultadoAnd2 = cond1 && cond3;

        boolean resultadoOr1 = cond1 || cond2;
        boolean resultadoOr2 = cond1 || cond3;

        boolean resultadoMisto = cond1 || cond2 && cond3;

        System.out.println("\nValores iniciais:");
        System.out.println("cond1: " + cond1);
        System.out.println("cond2: " + cond2);
        System.out.println("cond3: " + cond3);

        System.out.println("\nResultados com AND (&&):");
        System.out.println("cond1 && cond2: " + resultadoAnd1);
        System.out.println("cond1 && cond3: " + resultadoAnd2);

        System.out.println("\nResultados com OR (||):");
        System.out.println("cond1 || cond2: " + resultadoOr1);
        System.out.println("cond1 || cond3: " + resultadoOr2);

        System.out.println("\nResultado misto:");
        System.out.println("cond1 || cond2 && cond3: " + resultadoMisto);
    }
}

class Nivel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.println("Me dê sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Me dê sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Me dê sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        System.out.println("Essa foi a sua média aritmética final: " + mediaAritmetica + "\n\n");

        // Exercício 2
        System.out.println("Me diga qual a temperatura em graus celsius hoje: ");
        double grausCelsius = scanner.nextDouble();

        double grausFahrenheit = (grausCelsius * 9 / 5) + 32;

        System.out.println("Sua temperatura em graus Celsius: " + grausCelsius + ".\nSua temperatura em graus Fahrenheit: " + grausFahrenheit + "\n\n");

        // Exercício 3
        System.out.println("Me diga o valor da aresta lateral:");
        double medidaAresta = scanner.nextDouble();

        double area = medidaAresta * medidaAresta;

        System.out.println("A medida da sua aresta: " + medidaAresta + ".\nA medida da sua área é: " + area + "\n\n");

        // Exercício 4
        System.out.println("Me diga o valor da largura:");
        double medidaLargura = scanner.nextDouble();
        System.out.println("Me diga o valor da altura:");
        double medidaAltura = scanner.nextDouble();

        double perimetroRetangulo = 2 * (medidaAltura + medidaLargura);

        System.out.println("A medida da sua largura: " + medidaLargura + ".\nA medida da sua altura é: " + medidaAltura + ".\nA medida do perímetro é: " + perimetroRetangulo + "\n\n");

        // Exercício 5
        System.out.println("Me diga o nome do produto:");
        String nomeProduto = scanner.nextLine();
        
        System.out.println("Me diga o valor do produto:");
        double valorProduto = scanner.nextDouble();

        double produtoDescontado = valorProduto * 0.85;

        System.out.println("O nome do produto é: " + nomeProduto + ".\nO valor do produto é: " + valorProduto + ".\nO valor com desconto é: " + produtoDescontado);

        scanner.close();
    }
}

class Nivel4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.println("Me diga seu peso:");
        double pesoPessoa = scanner.nextDouble();

        System.out.println("Me diga a sua altura:");
        double alturaPessoa = scanner.nextDouble();

        double imc = pesoPessoa / Math.pow(alturaPessoa, 2);

        System.out.println("Seu peso: " + pesoPessoa + ".\nSua altura: " + alturaPessoa + ".\nSeu IMC: " + imc + "\n\n");

        // Exercício 2
        System.out.println("Me diga a distância percorrida:");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Me diga a quantidade de combustível gasto:");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("A distância percorrida: " + distanciaPercorrida + ".\nA quantidade de combustível gasto: " + combustivelGasto + ".\nO consumo médio é: " + consumoMedio + "\n\n");

        // Exercício 3
        System.out.println("Me diga o valor de horas trabalhadas:");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Me diga o valor do salário por hora:");
        double salarioHora = scanner.nextDouble();

        double salarioMensal = horasTrabalhadas * salarioHora;

        System.out.println("O valor de horas trabalhadas: " + horasTrabalhadas + ".\nO valor do salário por hora: " + salarioHora + ".\nO salário mensal é: " + salarioMensal + "\n\n");

        // Exercício 4
        System.out.println("Me diga o raio do círculo:");
        double raioCirculo = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

        System.out.println("O valor do raio do círculo: " + raioCirculo + ".\nA área do círculo é: " + areaCirculo + "\n\n");

        // Exercício 5
        System.out.println("Me diga o valor de A:");
        double A = scanner.nextDouble();
        System.out.println("Me diga o valor de B:");
        double B = scanner.nextDouble();

        System.out.println("Antes da troca - A: " + A + ", B: " + B);

        double temp = A;
        A = B;
        B = temp;

        System.out.println("Depois da troca - A: " + A + ", B: " + B);

        scanner.close();
    }
}

class Nivel5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 
        System.out.println("Me diga seu peso:");
        double pesoPessoa = scanner.nextDouble();

        System.out.println("Me diga a sua altura:");
        double alturaPessoa = scanner.nextDouble();

        double imc = pesoPessoa / Math.pow(alturaPessoa, 2);

        System.out.println("Seu peso: " + pesoPessoa + ".\nSua altura: " + alturaPessoa + ".\nSeu IMC: " + imc + "\n\n");

        // Exercício 2
        System.out.println("Me diga o valor em metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("O valor em centímetros é: " + centimetros + ".\nO valor em milímetros é: " + milimetros + "\n\n");

        // Exercício 3
        System.out.println("Me diga o primeiro valor inteiro: ");
        int primeiroValor = scanner.nextInt();
        System.out.println("Me diga o segundo valor inteiro: ");
        int segundoValor = scanner.nextInt();

        int quociente = primeiroValor / segundoValor;
        int resto = primeiroValor % segundoValor;

        System.out.println("O quociente da divisão é: " + quociente + ".\nO resto da divisão é: " + resto + "\n\n");

        // Exercício 4
        System.out.println("Me diga o capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        System.out.println("Me diga a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();
        System.out.println("Me diga o período (em anos): ");
        double periodo = scanner.nextDouble();

        double juros = capitalInicial * (taxaJuros / 100) * periodo;
        double montante = capitalInicial + juros;

        System.out.println("O capital inicial é: " + capitalInicial + ".\nA taxa de juros é: " + taxaJuros + "%.\nO período é: " + periodo + " anos.\nOs juros são: " + juros + ".\nO montante é: " + montante + "\n\n");

        // Exercício 5
        System.out.println("Me diga o tempo total em segundos: ");
        double tempoTotalSegundos = scanner.nextDouble();
        double x = Math.floor(tempoTotalSegundos / 3600);
        double y = Math.floor((tempoTotalSegundos % 3600) / 60);
        double z = tempoTotalSegundos % 60;

        System.out.println("O tempo total é: " + (int)x + " horas, " + (int)y + " minutos e " + z + " segundos.");

        scanner.close();
    }
}


class Nivel6_EXTRA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 - Verificação de um triângulo

        System.out.println("Me diga a medida do primeiro lado do triângulo: ");
        double ladoA = scanner.nextDouble();
        System.out.println("Me diga a medida do segundo lado do triângulo: ");
        double ladoB = scanner.nextDouble();
        System.out.println("Me diga a medida do terceiro lado do triângulo: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triângulo é equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O triângulo é isósceles.");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("O triângulo é escaleno");
            }   
        } else{
            System.out.println("As medidas não formam um triângulo");
        }   


        // Exercício 2 - Calculadora com Menu

        System.out.println("Me diga o primeiro número:");
        double numeroExercicio6_1 = scanner.nextDouble();

        System.out.println("Me diga a operação (+, -, *, /):");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número");
        double numeroExercicio6_2 = scanner.nextDouble();

        switch (operacao) {
            case '+':
                System.out.println("A soma dos dois valores é igual a: " + (numeroExercicio6_1 + numeroExercicio6_2) + "\n");
                break;
            case '-':
                System.out.println("A subtração dos dois valores é igual a : " + (numeroExercicio6_1 - numeroExercicio6_2) + "\n");
                break;
            case '*':
                System.out.println("A multiplicação dos dois valores é igual a : " + (numeroExercicio6_1 * numeroExercicio6_2) + "\n");
                break;
            case '/':
                if (numeroExercicio6_2 != 0) {
                    System.out.println("Resultado: " + (numeroExercicio6_1 / numeroExercicio6_2) + "\n");
                }else {
                    System.out.println("ERRO: Divisão por 0 não é permitida");
                }
                break;
            default:
            System.out.println("Operador inválido");
        }

        // Exercício 3 - Cálculo de fatorial
        System.out.println("Digite um número inteiro positivo para ver seu fatorial:");
        int numeroFatorial = scanner.nextInt();
        long fatorial = 1; // Usamos long porque fatoriais crescem muito rápido

        if (numeroFatorial < 0) {
            System.out.println("Não existe fatorial de número negativo.\n");
        } else {
            for (int i = 1; i <= numeroFatorial; i++) {
                fatorial *= i; // O mesmo que fatorial = fatorial * i
            }
            System.out.println("O fatorial de " + numeroFatorial + "! é: " + fatorial + "\n");
        }


        // Exercício 4 - Descubra o número aleatorio
        int numeroRandom = (int)(Math.random() * 10) + 1;
        int palpite = 0;
        int tentativa = 0;

        while(palpite != numeroRandom){
            System.out.println("Pensei em um número, tente acertar: ");
            palpite = scanner.nextInt();
            tentativa ++;

            if (palpite < numeroRandom){
                System.out.println("Número muito baixo, tente novamente." );
                System.out.println("Tentativa: " + tentativa + "\n");
            } else if (palpite > numeroRandom){
                System.out.println("Número muito alto, tente novamente.");
                System.out.println("Tentativa: " + tentativa + "\n");
            }
        }

        System.out.println("Parabéns, você acertou o número: " + numeroRandom + " em " + tentativa + " tentativas.");


        scanner.close();
    }   
}

// Exercícios com a Nath 01/09/2026
class Nivel7{
    public static void main(String[] args) {
        // Exercício 1 - Verificador de Maior de Idade
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Parabéns, vc é maior de idade!");
        }else{
            System.out.println("Que pena, vc é menor de idade!");
        }

        // Exercício 2 - Verificador de Aprovado ou não
        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();
        if(nota >= 7){
            System.out.println("Parabéns, vc foi aprovado!");
        }else{
            System.out.println("Que pena, vc foi reprovado!");
        }

        // Exercício 3 - Qual é o maior número
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("O maior número é: " + maior);

        // Exercício 4 - Classificação de Desempenho, classificando entre Excelente, Bom, Regular ou Insuficiente
        System.out.println("Digite sua nota: ");
        double notaDesempenho = scanner.nextDouble();

        if (notaDesempenho >= 9) {
            System.out.println("Classificação: Excelente");
        } else if (notaDesempenho >= 7) {
            System.out.println("Classificação: Bom");
        } else if (notaDesempenho >= 5) {
            System.out.println("Classificação: Regular");
        } else {
            System.out.println("Classificação: Insuficiente");
        }

        // Exercício 5 - Pedir um número e usar switch case para mostrar qual é o dia da semana correspondente
        System.out.println("Digite um número de 1 a 7 para saber o dia da semana correspondente: ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda-feira");
                break;
            case 3:
                System.out.println("Dia da semana: Terça-feira");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta-feira");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta-feira");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta-feira");
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
        }

        scanner.close();
    }
}

class Nivel8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 - Contador de Pares e Ímpares
        int contadorPares = 0;
        int contadorImpares = 0;

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        System.out.println("Quantidade de números pares: " + contadorPares);
        System.out.println("Quantidade de números ímpares: " + contadorImpares);


        // Exercício 2 - Sequência de Fibonacci
        System.out.println("Me diga um número N: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        // Exercício 3 - Validação de Entrada com do-while
        System.out.println("Me diga uma senha (mínimo 6 caracteres):");
        String senha;
        do {
            senha = scanner.next();
            if (senha.length() < 6) {
                System.out.println("Senha inválida. Tente novamente:");
            }
        } while (senha.length() < 6);

        System.out.println("Senha válida!");

        scanner.close();
    }
}

class Nível9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 - Inversão de Vetor
        int[] vetor = new int[5];
        int[] inverso = new int[5];
        System.out.println("Digite 5 números inteiros: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            inverso[i] = vetor[4 - i];
        }
        System.out.print("Vetor invertido: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(inverso[i] + " ");
        }

        // Exercício 2 - Menor e Maior Elemento do Vetor
        int[] vetor2 = new int[5];
        System.out.println("\nDigite 5 números inteiros: ");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int menor = vetor2[0];
        int maior = vetor2[0];
        for (int i = 1; i < 5; i++) {
            if (vetor2[i] < menor) {
                menor = vetor2[i];
            }
            if (vetor2[i] > maior) {
                maior = vetor2[i];
            }
        }
        System.out.println("Menor elemento: " + menor);
        System.out.println("Maior elemento: " + maior);


        scanner.close();
    }
}