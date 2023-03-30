public class CleaningService extends Employee {
    public CleaningService(int nip, String nama, String status, double jamKerja) {
        super(nip, nama, "Cleaning Service", status, jamKerja);
    }
        public void hitungGaji() {
            double gaji = getJamKerja() * 50000;
            double bonus = 0;
            double potongan = 0;
            if (getJamKerja() > 7) {
                bonus = gaji * 0.1;
            }
            if (getStatus().equalsIgnoreCase("menikah")) {
                potongan = gaji * 0.1;
            }
            setGaji(gaji);
            setBonus(bonus);
            setPotongan(potongan);
        }
    }
