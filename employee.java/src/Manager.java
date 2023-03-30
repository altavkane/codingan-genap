public class Manager extends Employee {
    public Manager(int nip, String nama, String status, double jamKerja) {
        super(nip, nama, "Manager", status, jamKerja);
    }

    public void hitungGaji() {
        double gaji = getJamKerja() * 100000;
        double bonus = gaji * 0.3;
        double potongan = 0;
        if (getJamKerja() < 8) {
            potongan = gaji * 0.05;
        }
        setGaji(gaji);
        setBonus(bonus);
        setPotongan(potongan);

    }
}