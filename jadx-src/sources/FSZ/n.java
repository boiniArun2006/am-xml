package FSZ;

import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements lN.Ml {
    private final String J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final lN.Ml f2613O;
    private Object Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2614n;
    private final dX.Ml nr;
    private final dX.CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final dX.fuX f2615t;
    private final long xMQ;

    @Override // lN.Ml
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f2614n, nVar.f2614n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f2615t, nVar.f2615t) && Intrinsics.areEqual(this.nr, nVar.nr) && Intrinsics.areEqual(this.f2613O, nVar.f2613O) && Intrinsics.areEqual(this.J2, nVar.J2);
    }

    @Override // lN.Ml
    public boolean rl() {
        return false;
    }

    public n(String sourceString, dX.CN3 cn3, dX.fuX rotationOptions, dX.Ml imageDecodeOptions, lN.Ml ml, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f2614n = sourceString;
        this.rl = cn3;
        this.f2615t = rotationOptions;
        this.nr = imageDecodeOptions;
        this.f2613O = ml;
        this.J2 = str;
        this.KN = (((((((((sourceString.hashCode() * 31) + (cn3 != null ? cn3.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (ml != null ? ml.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.xMQ = RealtimeSinceBootClock.get().now();
    }

    @Override // lN.Ml
    public int hashCode() {
        return this.KN;
    }

    @Override // lN.Ml
    public String n() {
        return this.f2614n;
    }

    public final void t(Object obj) {
        this.Uo = obj;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f2614n + ", resizeOptions=" + this.rl + ", rotationOptions=" + this.f2615t + ", imageDecodeOptions=" + this.nr + ", postprocessorCacheKey=" + this.f2613O + ", postprocessorName=" + this.J2 + ")";
    }
}
