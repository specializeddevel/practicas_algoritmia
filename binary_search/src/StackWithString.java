public class StackWithString {

        private String stack; // Usamos un String para almacenar los elementos


    public static void main(String[] args) {
        StackWithString stack = new StackWithString();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.peek());
        stack.pop();
        stack.push('d');
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
    }
        // Constructor para inicializar la pila
        public StackWithString() {
            this.stack = ""; // La pila comienza vacía
        }

        // Method para insertar un elemento en la pila
        public void push(char element) {
            stack += element; // Agrega el nuevo carácter al final del String
            System.out.println("Elemento " + element + " insertado.");
        }

        // Method para quitar el elemento en la parte superior de la pila
        public char pop() {
            if (stack.isEmpty()) {
                System.out.println("Pila vacía. No hay elementos para quitar.");
                return '\0'; // Devuelve un carácter nulo si está vacío
            } else {
                char removedElement = stack.charAt(stack.length() - 1); // Obtén el último carácter
                stack = stack.substring(0, stack.length() - 1); // Elimina el último carácter
                System.out.println("Elemento " + removedElement + " eliminado.");
                return removedElement;
            }
        }

        // Method para ver el elemento en la parte superior de la pila sin quitarlo
        public char peek() {
            if (stack.isEmpty()) {
                System.out.println("Pila vacía. No hay elementos.");
                return '\0';
            } else {
                return stack.charAt(stack.length() - 1); // Devuelve el último carácter
            }
        }

        // Method para verificar si la pila está vacía
        public boolean isEmpty() {
            return stack.isEmpty();
        }

    @Override
    public String toString() {
        return "StackWithString{" +
                "stack='" + stack + '\'' +
                '}';
    }
}


