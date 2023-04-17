package TugasPBO;

public class menu {
        private String namaMenu;
        private int hargaMenu;
        private String jenisMenu;

        public Menu(String namaMenu, int hargaMenu, String jenisMenu) {
            this.namaMenu = namaMenu;
            this.hargaMenu = hargaMenu;
            this.jenisMenu = jenisMenu;
        }

        public String getNamaMenu() {
            return namaMenu;
        }

        public int getHargaMenu() {
            return hargaMenu;
        }

        public String getJenisMenu() {
            return jenisMenu;
        }

        public void setNamaMenu(String namaMenu) {
            this.namaMenu = namaMenu;
        }

        public void setHargaMenu(int hargaMenu) {
            this.hargaMenu = hargaMenu;
        }

        public void setJenisMenu(String jenisMenu) {
            this.jenisMenu = jenisMenu;
        }
    }

