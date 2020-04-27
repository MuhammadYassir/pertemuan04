package Array;

public class ArrayHargaLaptop {
    public static void main(String [] args){
        String[][] laptop = {{"toshiba","5.000.0000"},{"Lenovo","4.000.0000"},{"Asus","10.000.0000"}};

        for(int x=0; x < laptop.length; x++){
            System.out.println("merek : "+laptop[x][0]);
            System.out.println("merek : "+laptop[x][1]);
        }
    }
}
