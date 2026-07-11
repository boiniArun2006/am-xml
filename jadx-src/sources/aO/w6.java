package aO;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bitmap f12873n;
    private final int nr;
    private final Uri rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f12874t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f12873n, w6Var.f12873n) && Intrinsics.areEqual(this.rl, w6Var.rl) && this.f12874t == w6Var.f12874t && this.nr == w6Var.nr;
    }

    public w6(Bitmap bm, Uri videoUri, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        this.f12873n = bm;
        this.rl = videoUri;
        this.f12874t = i2;
        this.nr = i3;
    }

    public int hashCode() {
        return (((((this.f12873n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f12874t)) * 31) + Integer.hashCode(this.nr);
    }

    public final Bitmap n() {
        return this.f12873n;
    }

    public final Uri nr() {
        return this.rl;
    }

    public final int rl() {
        return this.nr;
    }

    public final int t() {
        return this.f12874t;
    }

    public String toString() {
        return "CachedVideoThumb(bm=" + this.f12873n + ", videoUri=" + this.rl + ", prevIdrMs=" + this.f12874t + ", nextIdrMs=" + this.nr + ")";
    }
}
