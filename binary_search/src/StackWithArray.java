public class StackWithArray {

    private int[] stack; // Array para almacenar los elementos
    private int top;     // Índice del tope de la pila
    private int size;    // Tamaño máximo de la pila

    // Constructor para inicializar la pila
    public StackWithArray(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1; // -1 indica que la pila está vacía
    }

    // Method para insertar un elemento en la pila
    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Pila llena. No se puede insertar.");
        } else {
            top++; // Incrementa el índice del tope
            stack[top] = element; // Añade el elemento en la posición 'top'
            System.out.println("Elemento " + element + " insertado.");
        }
    }

    // Method para quitar el elemento en la parte superior de la pila
    public int pop() {
        if (top == -1) {
            System.out.println("Pila vacía. No hay elementos para quitar.");
            return -1; // O lanza una excepción si prefieres
        } else {
            int removedElement = stack[top]; // Guarda el elemento a quitar
            top--; // Decrementa el índice del tope
            System.out.println("Elemento " + removedElement + " eliminado.");
            return removedElement;
        }
    }

    // Method para ver el elemento en la parte superior de la pila sin quitarlo
    public int peek() {
        if (top == -1) {
            System.out.println("Pila vacía. No hay elementos.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Method para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;
    }

    // Method para verificar si la pila está llena
    public boolean isFull() {
        return top == size - 1;
    }
}


