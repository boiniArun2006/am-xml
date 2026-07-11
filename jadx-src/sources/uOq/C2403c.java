package uOq;

/* JADX INFO: renamed from: uOq.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C2403c implements oSp.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f74380t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f74381n = f74380t;
    private volatile oSp.n rl;

    @Override // oSp.n
    public Object get() {
        Object obj;
        Object obj2 = this.f74381n;
        Object obj3 = f74380t;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f74381n;
                if (obj == obj3) {
                    obj = this.rl.get();
                    this.f74381n = obj;
                    this.rl = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public C2403c(oSp.n nVar) {
        this.rl = nVar;
    }
}
