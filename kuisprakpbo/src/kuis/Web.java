package kuis;

public class Web extends Divisi implements Penilaian{

    public Web() {
    }
    
    @Override
    public void hitungNilai() {
        
        float nilai;
        
        nilai = (float) ((0.4*this.tulis) + (0.35*this.coding) + (0.25*this.wawancara));
        
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

    public void setwawancara(float wawancara) {
        this.wawancara = wawancara;
    }
    
}
