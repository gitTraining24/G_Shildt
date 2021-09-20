public class DtoM {
    public static void main(String[] args) {
        for (short count = 1; count<145; count++){
            System.out.println(count + " дюймов это " + ((float)count)/39.37 + " метра.");
            if (count % 12 == 0){
                System.out.println();
            }
        }
    }
}
