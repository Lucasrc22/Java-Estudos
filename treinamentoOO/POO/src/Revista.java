import java.util.Date;


public class Revista extends Publicacao{
    private Date dataPub;
    private String editor;
    public Date getDataPub() {
        return dataPub;
    }
    public void setDataPub(Date dataPub) {
        this.dataPub = dataPub;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getResponsavel(){
        String responsavel = "Desconhecido";
        if( editor != null && editor.equals("")){
            responsavel = editor;
        }
        return responsavel;
    }

}