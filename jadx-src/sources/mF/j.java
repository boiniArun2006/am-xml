package mF;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f70680n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Oe.j f70681t;

    public /* synthetic */ j(Object obj, long j2, Oe.j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j2, jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f70680n, jVar.f70680n) && d2n.Ml.KN(this.rl, jVar.rl) && Intrinsics.areEqual(this.f70681t, jVar.f70681t);
    }

    private j(Object obj, long j2, Oe.j jVar) {
        this.f70680n = obj;
        this.rl = j2;
        this.f70681t = jVar;
    }

    public int hashCode() {
        Object obj = this.f70680n;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + d2n.Ml.qie(this.rl)) * 31) + this.f70681t.hashCode();
    }

    public final Object n() {
        return this.f70680n;
    }

    public final long rl() {
        return this.rl;
    }

    public final Oe.j t() {
        return this.f70681t;
    }

    public String toString() {
        return "FMCompositionRequest(compositionInstruction=" + this.f70680n + ", currentTime=" + ((Object) d2n.Ml.ck(this.rl)) + ", outputDimensions=" + this.f70681t + ')';
    }
}
