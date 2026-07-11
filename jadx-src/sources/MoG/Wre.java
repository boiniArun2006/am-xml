package MoG;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6758n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z f6759t;

    public /* synthetic */ Wre(Uri uri, long j2, z zVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, j2, zVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Intrinsics.areEqual(this.f6758n, wre.f6758n) && d2n.j.gh(this.rl, wre.rl) && Intrinsics.areEqual(this.f6759t, wre.f6759t);
    }

    private Wre(Uri uri, long j2, z zVar) {
        super(null);
        this.f6758n = uri;
        this.rl = j2;
        this.f6759t = zVar;
    }

    public int hashCode() {
        return (((this.f6758n.hashCode() * 31) + d2n.j.ck(this.rl)) * 31) + this.f6759t.hashCode();
    }

    public final long n() {
        return this.rl;
    }

    public final z rl() {
        return this.f6759t;
    }

    public final Uri t() {
        return this.f6758n;
    }

    public String toString() {
        return "FMAudioAsset(uri=" + this.f6758n + ", duration=" + ((Object) d2n.j.S(this.rl)) + ", track=" + this.f6759t + ')';
    }
}
