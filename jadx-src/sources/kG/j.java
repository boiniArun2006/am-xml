package kG;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d2n.Wre f69754n;
    private final Oe.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Bitmap f69755t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f69754n, jVar.f69754n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f69755t, jVar.f69755t);
    }

    public j(d2n.Wre range, Oe.w6 size, Bitmap frame) {
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.f69754n = range;
        this.rl = size;
        this.f69755t = frame;
    }

    public int hashCode() {
        return (((this.f69754n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f69755t.hashCode();
    }

    public final Bitmap n() {
        return this.f69755t;
    }

    public final d2n.Wre rl() {
        return this.f69754n;
    }

    public String toString() {
        return "GIFFrame(range=" + this.f69754n + ", size=" + this.rl + ", frame=" + this.f69755t + ')';
    }
}
