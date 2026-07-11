package z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class c7r {
    private String J2;
    private String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f76300O;
    private String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f76301n;
    private int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f76302t;

    public c7r(int i2, int i3, int i5, int i7, long j2, String tag, String subTag, String recycledSubTag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(recycledSubTag, "recycledSubTag");
        this.f76301n = i2;
        this.rl = i3;
        this.f76302t = i5;
        this.nr = i7;
        this.f76300O = j2;
        this.J2 = tag;
        this.Uo = subTag;
        this.KN = recycledSubTag;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7r)) {
            return false;
        }
        c7r c7rVar = (c7r) obj;
        return this.f76301n == c7rVar.f76301n && this.rl == c7rVar.rl && this.f76302t == c7rVar.f76302t && this.nr == c7rVar.nr && this.f76300O == c7rVar.f76300O && Intrinsics.areEqual(this.J2, c7rVar.J2) && Intrinsics.areEqual(this.Uo, c7rVar.Uo) && Intrinsics.areEqual(this.KN, c7rVar.KN);
    }

    public final void J2(int i2) {
        this.nr = i2;
    }

    public final void O(int i2) {
        this.f76301n = i2;
    }

    public final void Uo(int i2) {
        this.rl = i2;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f76301n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f76302t)) * 31) + Integer.hashCode(this.nr)) * 31) + Long.hashCode(this.f76300O)) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + this.KN.hashCode();
    }

    public final int n() {
        return this.f76301n;
    }

    public final void nr(long j2) {
        this.f76300O = j2;
    }

    public final int rl() {
        return this.nr;
    }

    public final void t(int i2) {
        this.f76302t = i2;
    }

    public String toString() {
        return "TexInfo(size=" + this.f76301n + ", width=" + this.rl + ", height=" + this.f76302t + ", updateCount=" + this.nr + ", lastUpdateMs=" + this.f76300O + ", tag=" + this.J2 + ", subTag=" + this.Uo + ", recycledSubTag=" + this.KN + ")";
    }

    public /* synthetic */ c7r(int i2, int i3, int i5, int i7, long j2, String str, String str2, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i2, (i8 & 2) != 0 ? 0 : i3, (i8 & 4) != 0 ? 0 : i5, (i8 & 8) != 0 ? 0 : i7, (i8 & 16) != 0 ? 0L : j2, str, (i8 & 64) != 0 ? "" : str2, (i8 & 128) != 0 ? "" : str3);
    }
}
