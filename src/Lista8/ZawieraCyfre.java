package Lista8;

public class ZawieraCyfre extends Exception{
    String napis;
    ZawieraCyfre(String napis){
        this.napis=napis;
    }
    public String getMessage(){
        return "Nick: "+napis+" musi zawierać cyfre";
    }
}
