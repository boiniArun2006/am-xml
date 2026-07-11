package veW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {
    public static void n(bF.fuX fux, bF.I28 i28) {
        if (!(fux instanceof l3D)) {
            l0.j.Uo("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fux);
        } else {
            s4.t().O().qie(((l3D) fux).nr().J2(i28), 1);
        }
    }
}
