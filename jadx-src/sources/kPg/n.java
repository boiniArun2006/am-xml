package kPg;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f69925n;
    private final int nr;
    private final Uri rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69926t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f69925n, nVar.f69925n) && Intrinsics.areEqual(this.rl, nVar.rl) && this.f69926t == nVar.f69926t && this.nr == nVar.nr;
    }

    public n(j entity, Uri uri, int i2, int i3) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f69925n = entity;
        this.rl = uri;
        this.f69926t = i2;
        this.nr = i3;
    }

    public final int J2() {
        return this.f69926t;
    }

    public final Uri O() {
        return this.rl;
    }

    public int hashCode() {
        return (((((this.f69925n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f69926t)) * 31) + Integer.hashCode(this.nr);
    }

    public final j n() {
        return this.f69925n;
    }

    public final Dsr nr() {
        return this.f69925n.t();
    }

    public final int rl() {
        return this.nr;
    }

    public final String t() {
        return this.f69925n.rl();
    }

    public String toString() {
        return "SampleMediaInfo(entity=" + this.f69925n + ", uri=" + this.rl + ", width=" + this.f69926t + ", height=" + this.nr + ")";
    }
}
