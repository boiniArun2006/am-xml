package TFv;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DAz extends teV.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10251n = -1;
    public Continuation rl;

    @Override // teV.w6
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public Continuation[] rl(Ew ew) {
        long j2 = this.f10251n;
        this.f10251n = -1L;
        this.rl = null;
        return ew.FX(j2);
    }

    @Override // teV.w6
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean n(Ew ew) {
        if (this.f10251n >= 0) {
            return false;
        }
        this.f10251n = ew.B();
        return true;
    }
}
