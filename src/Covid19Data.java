public class Covid19Data {
    protected String region;
    protected String aldersGruppe;
    private int bekræftetTilfælde;
    private int døde;
    private int intensiv;
    private int indlagt;

    public Covid19Data(String region, String aldersGruppe, int bekræftetTilfælde, int døde, int intensiv, int indlagt) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftetTilfælde = bekræftetTilfælde;
        this.døde = døde;
        this.intensiv = intensiv;
        this.indlagt = indlagt;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldersGruppe='" + aldersGruppe + '\'' +
                ", bekræftetTilfælde=" + bekræftetTilfælde +
                ", døde=" + døde +
                ", intensiv=" + intensiv +
                ", indlagt=" + indlagt +
                '}' + "\n";
    }
}
