public abstract class Employee {
    private int nip;
    private String nama;
    private String jabatan;
    private String status;
    private double jamKerja;
    private double gaji;
    private double bonus;
    private double potongan;

    public Employee(int nip, String nama, String jabatan, String status, double jamKerja) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.status = status;
        this.jamKerja = jamKerja;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(double jamKerja) {
        this.jamKerja = jamKerja;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPotongan() {
        return potongan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public abstract void hitungGaji();

    public String toString() {
        return "NIP: " + nip +
                "\nNama\t\t: " + nama +
                "\nJabatan\t\t: " + jabatan +
                "\nStatus\t\t: " + status +
                "\nJam kerja\t: " + jamKerja +
                "\nGaji\t\t: " + gaji +
                "\nBonus\t\t: " + bonus +
                "\nPotongan\t: " + potongan +
                "\nGaji bersih\t: " + (gaji + bonus - potongan);
    }
}
