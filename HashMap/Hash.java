

class Hash{

    static class HashTable{
        int size;
        int[] value;
        String[] key;
    
        HashTable(int d){
            size = d;
            value = new int[size];

            for (int i = 0; i < value.length; i++) {
                value[i] = 0;
            }
        }

        public int get (int index){
            return value[index];
        }

        public void print (){
            for (int i = 0; i < value.length; i++) {
                System.out.println(value[i]);
            }
        }
    }

    public static void main(String[] args) {
        HashTable test = new HashTable(10);
        System.out.println(test.get(3));
        test.print();
    }
}