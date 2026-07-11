package com.alightcreative.app.motion.activities;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Fj {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f44536n;
    private final String nr;
    private final Uri rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f44537t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fj)) {
            return false;
        }
        Fj fj = (Fj) obj;
        return this.f44536n == fj.f44536n && Intrinsics.areEqual(this.rl, fj.rl) && Intrinsics.areEqual(this.f44537t, fj.f44537t) && Intrinsics.areEqual(this.nr, fj.nr);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f44536n) * 31) + this.rl.hashCode()) * 31;
        String str = this.f44537t;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nr;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ImportableFont(id=" + this.f44536n + ", uri=" + this.rl + ", displayName=" + this.f44537t + ", mime=" + this.nr + ")";
    }

    public Fj(long j2, Uri uri, String str, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f44536n = j2;
        this.rl = uri;
        this.f44537t = str;
        this.nr = str2;
    }

    public final String n() {
        return this.f44537t;
    }

    public final Uri rl() {
        return this.rl;
    }
}
