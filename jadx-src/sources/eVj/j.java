package eVj;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f63737O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f63738n;
    private final Integer nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f63739t;

    public j(boolean z2, boolean z3, boolean z4, Integer num, Function0 function0) {
        this.f63738n = z2;
        this.rl = z3;
        this.f63739t = z4;
        this.nr = num;
        this.f63737O = function0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f63738n == jVar.f63738n && this.rl == jVar.rl && this.f63739t == jVar.f63739t && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f63737O, jVar.f63737O);
    }

    public final boolean O() {
        return this.f63738n;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f63738n) * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f63739t)) * 31;
        Integer num = this.nr;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Function0 function0 = this.f63737O;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final boolean n() {
        return this.rl;
    }

    public final Function0 nr() {
        return this.f63737O;
    }

    public final Integer rl() {
        return this.nr;
    }

    public final boolean t() {
        return this.f63739t;
    }

    public String toString() {
        return "SpannableTransformation(underline=" + this.f63738n + ", bold=" + this.rl + ", italic=" + this.f63739t + ", color=" + this.nr + ", onClick=" + this.f63737O + ")";
    }

    public /* synthetic */ j(boolean z2, boolean z3, boolean z4, Integer num, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : function0);
    }
}
