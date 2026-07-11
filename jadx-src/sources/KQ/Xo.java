package KQ;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5334n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f5335t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return Intrinsics.areEqual(this.f5334n, xo.f5334n) && this.rl == xo.rl && Intrinsics.areEqual(this.f5335t, xo.f5335t);
    }

    public Xo(String text, boolean z2, Function0 onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f5334n = text;
        this.rl = z2;
        this.f5335t = onClick;
    }

    public int hashCode() {
        return (((this.f5334n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + this.f5335t.hashCode();
    }

    public final boolean n() {
        return this.rl;
    }

    public final Function0 rl() {
        return this.f5335t;
    }

    public final String t() {
        return this.f5334n;
    }

    public String toString() {
        return "SurveyButtonUIModel(text=" + this.f5334n + ", enabled=" + this.rl + ", onClick=" + this.f5335t + ")";
    }
}
