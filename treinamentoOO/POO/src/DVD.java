public class DVD extends AudioVisual implements AcompanhaEncarte{
    private String dadosEncarte;
    @Override
    public String gerarReferencia(){
        return null;
    }

    @Override
    public String getEncarte() {
        // TODO Auto-generated method stub
        return dadosEncarte;
    }

    @Override
    public void setEncarte(String encarte) {
        // TODO Auto-generated method stub
        this.dadosEncarte = encarte;
    }
    
}