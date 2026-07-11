package ep;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements n, HZ.j {
    private static final w6 rl = new w6(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f63862n;

    public static n n(Object obj) {
        return new w6(Ml.t(obj, "instance cannot be null"));
    }

    @Override // qp.InterfaceC2342j
    public Object get() {
        return this.f63862n;
    }

    private w6(Object obj) {
        this.f63862n = obj;
    }
}
