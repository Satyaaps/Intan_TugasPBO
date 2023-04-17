package TugasPBO;

public class Restaurant {
        private String namaRestoran;
        private String alamatRestoran;

        public Restaurant(String namaRestaurant, String alamatRestaurant) {
            this.namaRestoran = namaRestaurant;
            this.alamatRestoran = alamatRestaurant;
        }

        public String getNamaRestoran() {
            return namaRestoran;
        }

        public String getAlamatRestoran() {
            return alamatRestoran;
        }

        public void setNamaRestoran(String namaRestoran) {
            this.namaRestoran = namaRestoran;
        }

        public void setAlamatRestoran(String alamatRestoran) {
            this.alamatRestoran = alamatRestoran;
        }
    }