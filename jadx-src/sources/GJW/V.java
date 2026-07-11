package GJW;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class V extends dzu.g9s implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f3455r;

    @Override // java.lang.Runnable
    public void run() {
        nY(Qik.n(this.f3455r, yg.nr(getContext()), this));
    }

    @Override // GJW.j, GJW.L0y
    public String xg() {
        return super.xg() + "(timeMillis=" + this.f3455r + ')';
    }

    public V(long j2, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.f3455r = j2;
    }
}
