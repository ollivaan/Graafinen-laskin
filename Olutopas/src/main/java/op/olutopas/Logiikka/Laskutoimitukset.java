package op.olutopas.Logiikka;

/**
 * Luokka hoitaa Laskutoimitukset
 */
public class Laskutoimitukset {

    TapahtumanKuuntelija tkuuntelija;

    public Laskutoimitukset() {

    }

    /**
     * Metodi laskee pluslaskun
     *
     * @param tulostettuLuku Käyttäjän antama syöte
     *  @param syotettyLuku Käyttäjän antama syöte
     * @return summa
     */
    public double plussaa(double tulostettuLuku, double syotettyLuku) {
        double summa = tulostettuLuku + syotettyLuku;
        return summa;

    }
        /**
         * Metodi laskee miinuslaskun
         *
         * @param tulostettuLuku Käyttäjän antama syöte
         *   @param syotettyLuku Käyttäjän antama syöte
         * @return erotus
         */
    public double miinusta(double tulostettuLuku, double syotettyLuku) {
        double erotus = tulostettuLuku - syotettyLuku;
        return erotus;
    }

    /**
     * Metodi laskee kertolaskun
     *
     * @param tulostettuLuku Käyttäjän antama syöte
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulo
     */
    public double tulo(double tulostettuLuku, double syotettyLuku) {
        double tulo = tulostettuLuku * syotettyLuku;
        return tulo;
    }

    /**
     * Laskee jakolaskun
     *
     * @param tulostettuLuku Käyttäjän antama syöte
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulos
     */
    public double jakoLasku(double tulostettuLuku, double syotettyLuku) {
        double tulos = (syotettyLuku) / tulostettuLuku;
        return tulos;

    }
     /**
     * Yhtakuin
     *
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulos
     */

    public double yhtakuin(double syotettyLuku) {
        double tulos = syotettyLuku;
        return tulos;

    }
     /**
     * Laskee sinin
     *
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulos
     */

    public double sin(double syotettyLuku) {
        double tulos = Math.sin(syotettyLuku);
        return tulos;
    }
     /**
     * laskee cosinin
     *
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulos
     */
    public double cos(double syotettyLuku) {
        double tulos = Math.cos(syotettyLuku);
        return tulos;
    }
     /**
     * laskee tangentin
     *
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulos
     */
    public double tan(double syotettyLuku) {
        double tulos = Math.tan(syotettyLuku);
        return tulos;
    }
     /**
     * laskee piin arvon
     *
     * @param syotettyLuku Käyttäjän antama syöte
     * @return tulos
     */


    double pii(double syotettyLuku) {
        double tulos = (syotettyLuku) * Math.PI;
        return tulos;
    }
     /**
     * pyöristä
     *
     * @param tulostettuLuku Käyttäjän antama syöte
     * @return pyoristys
     */
    double pyorista(double tulostettuLuku) {
        double pyoristys = Math.round(tulostettuLuku);
        return pyoristys;
    }

}
