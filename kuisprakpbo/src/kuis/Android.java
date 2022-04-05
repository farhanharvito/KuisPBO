package kuis;

public class Android extends Divisi implements Penilaian{

    public Android() {
    }

    public Android(String nama, String nim, float tulis, float coding, float wawancara) {
        this.nama = nama;
        this.nim = nim;
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }
    
    @Override
    public void hitungNilai() {
        
        float nilai;
        
        nilai = (float) ((0.2*this.tulis) + (0.5*this.coding) + (0.3*this.wawancara));
        
        this.nilai = nilai;
    }

    @Override
    public void editNilai(float tulis,float coding,float wawancara) {
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }

    public String getNama() {
        return nama;
    }
    
    public float getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setTulis(float tulis) {
        this.tulis = tulis;
    }

    public void setCoding(float coding) {
        this.coding = coding;
    }

    public void setWawancara(float wawancara) {
        this.wawancara = wawancara;
    }
    
    
}
