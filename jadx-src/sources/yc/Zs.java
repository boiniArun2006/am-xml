package yc;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Zs {
    private final String J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f75911O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f75912n;
    private final long nr;
    private final tu.Ew rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f75913t;
    private final int xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zs)) {
            return false;
        }
        Zs zs = (Zs) obj;
        return Intrinsics.areEqual(this.f75912n, zs.f75912n) && this.rl == zs.rl && Intrinsics.areEqual(this.f75913t, zs.f75913t) && this.nr == zs.nr && this.f75911O == zs.f75911O && Intrinsics.areEqual(this.J2, zs.J2) && this.Uo == zs.Uo && this.KN == zs.KN && this.xMQ == zs.xMQ;
    }

    public Zs(Uri uri, tu.Ew type, String title, long j2, int i2, String filename, int i3, int i5, int i7) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f75912n = uri;
        this.rl = type;
        this.f75913t = title;
        this.nr = j2;
        this.f75911O = i2;
        this.J2 = filename;
        this.Uo = i3;
        this.KN = i5;
        this.xMQ = i7;
    }

    public final int J2() {
        return this.KN;
    }

    public final tu.Ew KN() {
        return this.rl;
    }

    public final long O() {
        return this.nr;
    }

    public final String Uo() {
        return this.f75913t;
    }

    public int hashCode() {
        return (((((((((((((((this.f75912n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f75913t.hashCode()) * 31) + Long.hashCode(this.nr)) * 31) + Integer.hashCode(this.f75911O)) * 31) + this.J2.hashCode()) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ);
    }

    public final int n() {
        return this.Uo;
    }

    public final int nr() {
        return this.f75911O;
    }

    public final int rl() {
        return this.xMQ;
    }

    public final String t() {
        return this.J2;
    }

    public String toString() {
        return "CursorInfo(uri=" + this.f75912n + ", type=" + this.rl + ", title=" + this.f75913t + ", size=" + this.nr + ", rotation=" + this.f75911O + ", filename=" + this.J2 + ", duration=" + this.Uo + ", startTrim=" + this.KN + ", endTrim=" + this.xMQ + ")";
    }

    public final Uri xMQ() {
        return this.f75912n;
    }
}
