public class Security extends Employee {
    public Security(int nip, String nama, String status, double jamKerja) {
        super(nip, nama, "Security", status, jamKerja);
    }

        public void hitungGaji() {
            double gaji = getJamKerja() * 60000;
            double bonus = gaji * 0.15;
            double potongan = 0;
            if (getStatus().equalsIgnoreCase("menikah")) {
                potongan = gaji * 0.1;
            }
            setGaji(gaji);
            setBonus(bonus);
            setPotongan(potongan);
        }
    }