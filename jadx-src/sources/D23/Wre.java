package D23;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre implements Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f1174t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Ml f1175n;
    private volatile Object rl = f1174t;

    public static Ml n(Ml ml) {
        return ((ml instanceof Wre) || (ml instanceof j)) ? ml : new Wre((Ml) w6.rl(ml));
    }

    @Override // qp.InterfaceC2342j
    public Object get() {
        Object obj = this.rl;
        if (obj != f1174t) {
            return obj;
        }
        Ml ml = this.f1175n;
        if (ml == null) {
            return this.rl;
        }
        Object obj2 = ml.get();
        this.rl = obj2;
        this.f1175n = null;
        return obj2;
    }

    private Wre(Ml ml) {
        this.f1175n = ml;
    }
}
