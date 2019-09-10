/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individu;

/**
 *
 * @author Nabiela.Sarah
 */
public class Kubus {
     private int sisi, volume;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = (int) Math.pow(sisi, 3);
    }
}
