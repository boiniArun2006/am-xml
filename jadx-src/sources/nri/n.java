package nri;

import gAe.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f71231n;

    public static n n(byte[] bArr, SPz sPz) {
        if (sPz != null) {
            return new n(j.n(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int rl() {
        return this.f71231n.t();
    }

    private n(j jVar) {
        this.f71231n = jVar;
    }
}
