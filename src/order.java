package TugasPBO;

import java.util.ArrayList;
public class order {

        private int idRestaurant;
        private ArrayList<menu> daftarMenu;
        private ArrayList<Integer> kuantitas;
        private int jarakAntar;
        private int totalHarga;

        public order(int idRestaurant, ArrayList<menu> daftarMenu, ArrayList<Integer> kuantitas, int jarakAntar) {
            this.idRestaurant = idRestaurant;
            this.daftarMenu = daftarMenu;
            this.kuantitas = kuantitas;
            this.jarakAntar = jarakAntar;
            this.totalHarga = hitungTotalHarga();
        }

        public int getIdRestaurant() {
            return idRestaurant;
        }

        public ArrayList<menu> getDaftarMenu() {
            return daftarMenu;
        }

        public ArrayList<Integer> getKuantitas() {
            return kuantitas;
        }

        public int getJarakAntar() {
            return jarakAntar;
        }

        public int getTotalHarga() {
            return totalHarga;
        }

        public void setIdRestaurant(int idRestaurant) {
            this.idRestaurant = idRestaurant;
        }

        public void setDaftarMenu(ArrayList<menu> daftarMenu) {
            this.daftarMenu = daftarMenu;
        }

        public void setKuantitas(ArrayList<Integer> kuantitas) {
            this.kuantitas = kuantitas;
        }

        public void setJarakAntar(int jarakAntar) {
            this.jarakAntar = jarakAntar;
        }

        public void setTotalHarga(int totalHarga) {
            this.totalHarga = totalHarga;
        }

        private int hitungTotalHarga() {
            int total = 0;
            for (int i = 0; i < daftarMenu.size(); i++) {
                total += daftarMenu.get(i).getHarga() * kuantitas.get(i);
            }
            total += jarakAntar * 3000; // asumsi jarak dihitung per km dan biayanya Rp1000/km
            return total;
        }
}
