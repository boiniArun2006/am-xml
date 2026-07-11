package GJW;

import kotlin.Unit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Pmq implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final lej f3441n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pl f3442t;

    @Override // java.lang.Runnable
    public void run() {
        this.f3442t.o(this.f3441n, Unit.INSTANCE);
    }

    public Pmq(lej lejVar, Pl pl) {
        this.f3441n = lejVar;
        this.f3442t = pl;
    }
}
