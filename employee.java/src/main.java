import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeData data = new EmployeeData();

        Boss boss = new Boss(101, "altav", "belum menikah",0);
        data.addEmployee(boss);

        Manager manager = new Manager(102, "dwirhmt11021", "belum menikah",0);
        data.addEmployee(manager);

        CleaningService cleaningService = new CleaningService(103, "Siti", "menikah",0);
        data.addEmployee(cleaningService);

        Security security = new Security(104, "Joko", "belum menikah",0);
        data.addEmployee(security);

        System.out.print("Masukkan NIP: ");
        int nip = input.nextInt();

        System.out.print("Masukkan jam kerja: ");
        double jamKerja = input.nextDouble();

        Employee employee = data.getEmployeeByNip(nip);
        if (employee != null) {
            employee.setJamKerja(jamKerja);
            employee.hitungGaji();
            System.out.println(employee.toString());
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
