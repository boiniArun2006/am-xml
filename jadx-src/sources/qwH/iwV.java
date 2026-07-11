package qwH;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface iwV {

    public static final class j {
        public static void rl(iwV iwv, fm.j jVar) {
            iwv.XQ(jVar != null ? Integer.valueOf(jVar.rl(9)) : null);
        }

        public static fm.j n(iwV iwv) {
            Integer numJ2 = iwv.J2();
            if (numJ2 != null) {
                return new fm.j(numJ2.intValue(), 9);
            }
            return null;
        }
    }

    void HI(Integer num);

    Integer J2();

    Integer Uo();

    void XQ(Integer num);

    void Z(Integer num);

    void aYN(Integer num);

    Integer az();

    void e(Integer num);

    fm.j g();

    void mUb(CN3 cn3);

    CN3 o();

    void qie(fm.j jVar);

    Integer rl();

    Integer t();
}
