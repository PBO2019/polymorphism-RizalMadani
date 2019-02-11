package Tugas;

public class Utama {
    public static void main(String[]args){
        Hitunggaji x=new Hitunggaji();

        Supervisor sp=new Supervisor();
        Staff st=new Staff();

        x.hitung("Supervisor", sp.getTarif());
        x.hitung("Staff", st.getTarif());
    }
}
