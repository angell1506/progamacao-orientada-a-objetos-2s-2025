package sistema_iptu;

public class Chacara {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiPOCOArtesiano;

    public Double calcularIPTU(){
        return this.areaM2 * this.municipio.getPrecoM2();
    }

    public Municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean isPossuiPOCOArtesiano() {
        return this.possuiPOCOArtesiano;
    }

    public Boolean getPossuiPOCOArtesiano() {
        return this.possuiPOCOArtesiano;
    }

    public void setPossuiPOCOArtesiano(Boolean possuiPOCOArtesiano) {
        this.possuiPOCOArtesiano = possuiPOCOArtesiano;
    }

}