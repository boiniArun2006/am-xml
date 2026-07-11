package MoG;

import android.net.Uri;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class qz extends aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6771n;
    private final Oe.j rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Intrinsics.areEqual(this.f6771n, qzVar.f6771n) && Intrinsics.areEqual(this.rl, qzVar.rl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(Uri uri, Oe.j dimensions) {
        super(null);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.f6771n = uri;
        this.rl = dimensions;
    }

    public int hashCode() {
        return (this.f6771n.hashCode() * 31) + this.rl.hashCode();
    }

    public final Oe.j n() {
        return this.rl;
    }

    public final Uri rl() {
        return this.f6771n;
    }

    public String toString() {
        return gUxOLwRQBPPLC.XHbHdQITZZRugkc + this.f6771n + ", dimensions=" + this.rl + ')';
    }
}
