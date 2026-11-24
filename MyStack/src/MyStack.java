public class MyStack {

        private String[] elements;
        private int numberOfElements;
        private String topElement;
        private String searchedElement;

        MyStack(int capacity) {
            this.elements = new String[capacity];
            this.numberOfElements = 0;
        }

        void push(String item) {
            if (numberOfElements == elements.length) {
                throw new ArrayIndexOutOfBoundsException("Stack is full");
            }
            elements[numberOfElements] = item;
            numberOfElements++;
        }

        void pop(){
            if (isEmpty()){
                throw new IllegalStateException("Stack is empty");
            }

            elements[--numberOfElements] = null;
        }

        boolean isEmpty(){
            return  numberOfElements == 0;
        }

        void peek(){
            if (isEmpty()){
                throw new IllegalStateException("Stack is empty");
            }
            topElement = elements[--numberOfElements];
        }

        void verification(int input){
            boolean lesserThanZero = input < 0;
            boolean greaterThanElementAmount = input > elements.length;

            if(lesserThanZero){
                throw new IllegalArgumentException("Your input is lesser than 0");
            }

            if(greaterThanElementAmount){
                throw new IllegalArgumentException("your input is grester than satck size ");
            }
        }

        void search(int index){

            verification(index);

            if (isEmpty()){
                throw new IllegalStateException("Stack is empty");
            }
            searchedElement = elements[index - 1];
        }

        public String getSearchedElement(){
            return searchedElement;
        }

        public String getTopElements() {
            return topElement;
        }

        public int numberOfElements() {
            return numberOfElements;
        }


}
