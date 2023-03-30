
public interface main {
    public static void main(String[] args) {
        String emailPenerima = "GTA V";
        String nomerHp = "+628111111111";
        String mobileId = "android-123456";

        emailnotifikasi emailNotif = new emailnotifikasi();
        smsnotifikasi smsNotif = new   smsnotifikasi();
        pushnotifikasi pushNotif = new pushnotifikasi();

        String message = "jadilah dewasa tanpa drama";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
    

