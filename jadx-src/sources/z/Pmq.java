package z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Pmq {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f76272O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76273n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DC f76274t;

    public Pmq(int i2, int i3, DC format, int i5, int i7) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f76273n = i2;
        this.rl = i3;
        this.f76274t = format;
        this.nr = i5;
        this.f76272O = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pmq)) {
            return false;
        }
        Pmq pmq = (Pmq) obj;
        return this.f76273n == pmq.f76273n && this.rl == pmq.rl && this.f76274t == pmq.f76274t && this.nr == pmq.nr && this.f76272O == pmq.f76272O;
    }

    public final int O() {
        return this.f76273n;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f76273n) * 31) + Integer.hashCode(this.rl)) * 31) + this.f76274t.hashCode()) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f76272O);
    }

    public final DC n() {
        return this.f76274t;
    }

    public final int nr() {
        return this.f76272O;
    }

    public final int rl() {
        return this.rl;
    }

    public final int t() {
        return this.nr;
    }

    public String toString() {
        return "TextureSpec(width=" + this.f76273n + ", height=" + this.rl + ", format=" + this.f76274t + ", magFilter=" + this.nr + ", minFilter=" + this.f76272O + ")";
    }

    public /* synthetic */ Pmq(int i2, int i3, DC dc, int i5, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, dc, (i8 & 8) != 0 ? 9729 : i5, (i8 & 16) != 0 ? 9729 : i7);
    }
}
