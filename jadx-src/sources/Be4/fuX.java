package Be4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f549n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f549n, fux.f549n) && this.rl == fux.rl;
    }

    public int hashCode() {
        return (this.f549n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final Drawable n() {
        return this.f549n;
    }

    public final boolean rl() {
        return this.rl;
    }

    public fuX(Drawable drawable, boolean z2) {
        this.f549n = drawable;
        this.rl = z2;
    }
}
