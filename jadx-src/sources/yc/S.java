package yc;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class S {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75846n;
    private final Integer nr;
    private final Function3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f75847t;

    public S(int i2, Function3 predicate, int i3, Integer num) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f75846n = i2;
        this.rl = predicate;
        this.f75847t = i3;
        this.nr = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s2 = (S) obj;
        return this.f75846n == s2.f75846n && Intrinsics.areEqual(this.rl, s2.rl) && this.f75847t == s2.f75847t && Intrinsics.areEqual(this.nr, s2.nr);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f75846n) * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f75847t)) * 31;
        Integer num = this.nr;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final int n() {
        return this.f75846n;
    }

    public final Integer nr() {
        return this.nr;
    }

    public final Function3 rl() {
        return this.rl;
    }

    public final int t() {
        return this.f75847t;
    }

    public String toString() {
        return "EffectCategory(id=" + this.f75846n + qfEYuUHwj.cuSPgmbs + this.rl + ", titleRes=" + this.f75847t + ", titleThumbRes=" + this.nr + ")";
    }

    public /* synthetic */ S(int i2, Function3 function3, int i3, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, function3, i3, (i5 & 8) != 0 ? null : num);
    }
}
