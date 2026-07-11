package Pj0;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    SoftReference f7743n = null;
    SoftReference rl = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    SoftReference f7744t = null;

    public void n() {
        SoftReference softReference = this.f7743n;
        if (softReference != null) {
            softReference.clear();
            this.f7743n = null;
        }
        SoftReference softReference2 = this.rl;
        if (softReference2 != null) {
            softReference2.clear();
            this.rl = null;
        }
        SoftReference softReference3 = this.f7744t;
        if (softReference3 != null) {
            softReference3.clear();
            this.f7744t = null;
        }
    }

    public Object rl() {
        SoftReference softReference = this.f7743n;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void t(Object obj) {
        this.f7743n = new SoftReference(obj);
        this.rl = new SoftReference(obj);
        this.f7744t = new SoftReference(obj);
    }
}
