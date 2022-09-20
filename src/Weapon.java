public class Weapon {
private int SniperAwm;
private int RapidFireUzi;
private int MeleeWeaponMk14;

    public Weapon(int sniperAwm, int rapidFireUzi, int meleeWeaponMk14) {
        SniperAwm = sniperAwm;
        RapidFireUzi = rapidFireUzi;
        MeleeWeaponMk14 = meleeWeaponMk14;
    }

    public int getSniperAwm() {
        return SniperAwm;
    }

    public void setSniperAwm(int sniperAwm) {
        SniperAwm = sniperAwm;
    }

    public int getRapidFireUzi() {
        return RapidFireUzi;
    }

    public void setRapidFireUzi(int rapidFireUzi) {
        RapidFireUzi = rapidFireUzi;
    }

    public int getMeleeWeaponMk14() {
        return MeleeWeaponMk14;
    }

    public void setMeleeWeaponMk14(int meleeWeaponMk14) {
        MeleeWeaponMk14 = meleeWeaponMk14;
        System.out.println(SniperAwm);
    }
}




