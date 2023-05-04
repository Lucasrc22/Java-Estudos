import java.util.Date;


public class Revista extends Publicacao{
    private Date dataPub;

    public Date getDataPub(){
        return dataPub;
    }
    public void setDataPub(Date dataPub){
        this.dataPub = dataPub;
    }
}