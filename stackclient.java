public class stackclient {
    public static void main(String [] args){
        Stack stack = new Stack(5);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("i.size of stack after push operations:" + stack.size());

        System.out.println("2. pop elements form stack :");
        while (!stack.isEmpty()); {
            System.out.println("&d", stack.pop());
        }

        System.out.println("\n3.size of stack after pop operations : " + stack.size());
    }

}




