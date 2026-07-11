package Eo;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements zdu.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f2369t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2370n = -1;
    private Pj0.j rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private final synchronized void Uo() {
        Pj0.j.M7(this.rl);
        this.rl = null;
        this.f2370n = -1;
    }

    @Override // zdu.n
    public synchronized Pj0.j J2(int i2) {
        return this.f2370n == i2 ? Pj0.j.T(this.rl) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // zdu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean O(int i2) {
        boolean z2;
        if (i2 == this.f2370n) {
            z2 = Pj0.j.FX(this.rl);
        }
        return z2;
    }

    @Override // zdu.n
    public synchronized void clear() {
        Uo();
    }

    @Override // zdu.n
    public synchronized void n(int i2, Pj0.j bitmapReference, int i3) {
        try {
            Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
            if (this.rl != null) {
                Object objEF = bitmapReference.eF();
                Pj0.j jVar = this.rl;
                if (Intrinsics.areEqual(objEF, jVar != null ? (Bitmap) jVar.eF() : null)) {
                    return;
                }
            }
            Pj0.j.M7(this.rl);
            this.rl = Pj0.j.T(bitmapReference);
            this.f2370n = i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // zdu.n
    public void nr(int i2, Pj0.j bitmapReference, int i3) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // zdu.n
    public synchronized Pj0.j rl(int i2) {
        return Pj0.j.T(this.rl);
    }

    @Override // zdu.n
    public synchronized Pj0.j t(int i2, int i3, int i5) {
        try {
        } finally {
            Uo();
        }
        return Pj0.j.T(this.rl);
    }
}
