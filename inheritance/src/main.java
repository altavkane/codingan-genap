
public class main {
    
    public static void main(String[] args) {
       
        bangundatar bangunDatar = new bangundatar();
        
        persegi Persegi = new persegi();
        Persegi.sisi = 2;
        lingkaran lingkaran = new lingkaran();
        lingkaran.r = 22;
        persegipanjang persegipanjang = new persegipanjang();
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 4;
        segitiga segitiga = new segitiga();
        segitiga.alas = 12;
        segitiga.tinggi=8;
        
        
        
        
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        Persegi.luas();
        Persegi.luas(5);
        Persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
                
        
 
      
        
        
    }
    
    }
