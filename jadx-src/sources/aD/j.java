package aD;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f12756O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f12757n;
    private final long nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f12758t;

    public /* synthetic */ j(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Color.HI(this.f12757n, jVar.f12757n) && Color.HI(this.rl, jVar.rl) && Color.HI(this.f12758t, jVar.f12758t) && Color.HI(this.nr, jVar.nr) && Color.HI(this.f12756O, jVar.f12756O);
    }

    private j(long j2, long j3, long j4, long j5, long j6) {
        this.f12757n = j2;
        this.rl = j3;
        this.f12758t = j4;
        this.nr = j5;
        this.f12756O = j6;
    }

    public int hashCode() {
        return (((((((Color.XQ(this.f12757n) * 31) + Color.XQ(this.rl)) * 31) + Color.XQ(this.f12758t)) * 31) + Color.XQ(this.nr)) * 31) + Color.XQ(this.f12756O);
    }

    public final long n() {
        return this.rl;
    }

    public final long rl() {
        return this.nr;
    }

    public final long t() {
        return this.f12756O;
    }

    public String toString() {
        return "AlightColors(baseBackground=" + Color.S(this.f12757n) + ", baseMainContent=" + Color.S(this.rl) + ", baseSecondaryContent=" + Color.S(this.f12758t) + ", paywallMainBackground=" + Color.S(this.nr) + ", paywallMainContent=" + Color.S(this.f12756O) + ")";
    }
}
