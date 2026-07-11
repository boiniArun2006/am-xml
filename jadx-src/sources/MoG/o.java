package MoG;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6769n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Oe.j f6770t;

    public /* synthetic */ o(Uri uri, long j2, Oe.j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, j2, jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f6769n, oVar.f6769n) && d2n.j.gh(this.rl, oVar.rl) && Intrinsics.areEqual(this.f6770t, oVar.f6770t);
    }

    private o(Uri uri, long j2, Oe.j jVar) {
        super(null);
        this.f6769n = uri;
        this.rl = j2;
        this.f6770t = jVar;
    }

    public int hashCode() {
        return (((this.f6769n.hashCode() * 31) + d2n.j.ck(this.rl)) * 31) + this.f6770t.hashCode();
    }

    public final Oe.j n() {
        return this.f6770t;
    }

    public final long rl() {
        return this.rl;
    }

    public final Uri t() {
        return this.f6769n;
    }

    public String toString() {
        return "FMGifAsset(uri=" + this.f6769n + ", duration=" + ((Object) d2n.j.S(this.rl)) + ", dimensions=" + this.f6770t + ')';
    }
}
