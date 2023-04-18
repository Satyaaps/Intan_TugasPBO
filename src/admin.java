package TugasPBO;

import java.util.ArrayList;
import java.util.Scanner;
public class admin {
        private static ArrayList<String> restaurants = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isLoggedIn = false;

            // Login System
            while (!isLoggedIn) {
                System.out.print("Masukkan username anda: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password anda: ");
                String password = scanner.nextLine();

                if (username.equals("admin") && password.equals("password")) {
                    isLoggedIn = true;
                    System.out.println("Hallo, Selamat Datang");
                } else {
                    System.out.println("Username atau password anda salah. Coba lagi.");
                }
            }

            // Menu Utama
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("\n--- Admin Restaurant ---");
                System.out.println("1. Lihat Restaurant");
                System.out.println("2. Tambah Restaurant");
                System.out.println("3. Hapus Restaurant");
                System.out.println("4. Logout");
                System.out.print("Pilih: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        lihatRestaurant();
                        break;
                    case 2:
                        tambahRestaurant(scanner);
                        break;
                    case 3:
                        hapusRestaurant(scanner);
                        break;
                    case 4:
                        System.out.println("Logout Sukses");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Masukkan pilihan yang benar");
                }
            }

            scanner.close();
        }

        private static void lihatRestaurant() {
            if (restaurants.isEmpty()) {
                System.out.println("Tidak ada restaurant yang tersedia.");
            } else {
                System.out.println("Restaurant yang tersedia:");
                for (String restaurant : restaurants) {
                    System.out.println("- " + restaurant);
                }
            }
        }

        private static void tambahRestaurant(Scanner scanner) {
            System.out.print("Masukkan nama restaurant: ");
            String namaRestaurant = scanner.nextLine();
            restaurants.add(namaRestaurant);
            System.out.println("Restaurant telah ditambahkan");
        }

        private static void hapusRestaurant(Scanner scanner) {
            System.out.print("Masukkan nama restaurant yang ingin dihapus: ");
            String namaRestaurant = scanner.nextLine();

            if (restaurants.contains(namaRestaurant)) {
                restaurants.remove(namaRestaurant);
                System.out.println("Restaurant berhasil dihapus.");
            } else {
                System.out.println("Restaurant tidak ditemukan.");
            }
        }
    }