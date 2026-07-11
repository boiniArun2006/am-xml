package FjR;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 extends Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f3009n;
    private final fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Throwable f3010t;

    public I28(Drawable drawable, fuX fux, Throwable th) {
        super(null);
        this.f3009n = drawable;
        this.rl = fux;
        this.f3010t = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(n(), i28.n()) && Intrinsics.areEqual(rl(), i28.rl()) && Intrinsics.areEqual(this.f3010t, i28.f3010t);
    }

    @Override // FjR.Dsr
    public Drawable n() {
        return this.f3009n;
    }

    @Override // FjR.Dsr
    public fuX rl() {
        return this.rl;
    }

    public final Throwable t() {
        return this.f3010t;
    }

    public int hashCode() {
        int iHashCode;
        Drawable drawableN = n();
        if (drawableN != null) {
            iHashCode = drawableN.hashCode();
        } else {
            iHashCode = 0;
        }
        return (((iHashCode * 31) + rl().hashCode()) * 31) + this.f3010t.hashCode();
    }
}
