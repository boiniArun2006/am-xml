package MoG;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class QJ extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6756n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z f6757t;

    public /* synthetic */ QJ(Uri uri, long j2, z zVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, j2, zVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QJ)) {
            return false;
        }
        QJ qj = (QJ) obj;
        return Intrinsics.areEqual(this.f6756n, qj.f6756n) && d2n.j.gh(this.rl, qj.rl) && Intrinsics.areEqual(this.f6757t, qj.f6757t);
    }

    private QJ(Uri uri, long j2, z zVar) {
        super(null);
        this.f6756n = uri;
        this.rl = j2;
        this.f6757t = zVar;
    }

    public int hashCode() {
        return (((this.f6756n.hashCode() * 31) + d2n.j.ck(this.rl)) * 31) + this.f6757t.hashCode();
    }

    public final z n() {
        return this.f6757t;
    }

    public final Uri rl() {
        return this.f6756n;
    }

    public String toString() {
        return "FMVideoAsset(uri=" + this.f6756n + ", duration=" + ((Object) d2n.j.S(this.rl)) + ", track=" + this.f6757t + ')';
    }
}
