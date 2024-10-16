import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pilha = new Stack<>();


pilha.push(30);
pilha.push(10);
pilha.push(20);
pilha.push(50);
pilha.push(40);

System.out.println("Pilha Original: " + pilha);


pilha = removeMaiorMenor(pilha);


System.out.println("Pilha após remover maior e menor: " + pilha);
}

public static Stack<Integer> removeMaiorMenor(Stack<Integer> pilha) {
if (pilha.isEmpty()) {
return pilha; 
}

Stack<Integer> pilhaAux = new Stack<>();
int maior = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;


for (Integer num : pilha) {
if (num > maior) {
maior = num;
}
if (num < menor) {
menor = num;
}
}


while (!pilha.isEmpty()) {
int elemento = pilha.pop();
if (elemento != maior && elemento != menor) {
pilhaAux.push(elemento);
}
}


while (!pilhaAux.isEmpty()) {
pilha.push(pilhaAux.pop());
}

return pilha;
}
    }

