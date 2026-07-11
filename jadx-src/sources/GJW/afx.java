package GJW;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class afx {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Throwable f3470O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f3471n;
    public final Object nr;
    public final qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Function3 f3472t;

    public afx(Object obj, qz qzVar, Function3 function3, Object obj2, Throwable th) {
        this.f3471n = obj;
        this.rl = qzVar;
        this.f3472t = function3;
        this.nr = obj2;
        this.f3470O = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afx)) {
            return false;
        }
        afx afxVar = (afx) obj;
        return Intrinsics.areEqual(this.f3471n, afxVar.f3471n) && Intrinsics.areEqual(this.rl, afxVar.rl) && Intrinsics.areEqual(this.f3472t, afxVar.f3472t) && Intrinsics.areEqual(this.nr, afxVar.nr) && Intrinsics.areEqual(this.f3470O, afxVar.f3470O);
    }

    public static /* synthetic */ afx rl(afx afxVar, Object obj, qz qzVar, Function3 function3, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = afxVar.f3471n;
        }
        if ((i2 & 2) != 0) {
            qzVar = afxVar.rl;
        }
        if ((i2 & 4) != 0) {
            function3 = afxVar.f3472t;
        }
        if ((i2 & 8) != 0) {
            obj2 = afxVar.nr;
        }
        if ((i2 & 16) != 0) {
            th = afxVar.f3470O;
        }
        Throwable th2 = th;
        Function3 function32 = function3;
        return afxVar.n(obj, qzVar, function32, obj2, th2);
    }

    public int hashCode() {
        Object obj = this.f3471n;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        qz qzVar = this.rl;
        int iHashCode2 = (iHashCode + (qzVar == null ? 0 : qzVar.hashCode())) * 31;
        Function3 function3 = this.f3472t;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.nr;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3470O;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final afx n(Object obj, qz qzVar, Function3 function3, Object obj2, Throwable th) {
        return new afx(obj, qzVar, function3, obj2, th);
    }

    public final void nr(eO eOVar, Throwable th) {
        qz qzVar = this.rl;
        if (qzVar != null) {
            eOVar.gh(qzVar, th);
        }
        Function3 function3 = this.f3472t;
        if (function3 != null) {
            eOVar.qie(function3, th, this.f3471n);
        }
    }

    public final boolean t() {
        return this.f3470O != null;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f3471n + ", cancelHandler=" + this.rl + ", onCancellation=" + this.f3472t + ", idempotentResume=" + this.nr + ", cancelCause=" + this.f3470O + ')';
    }

    public /* synthetic */ afx(Object obj, qz qzVar, Function3 function3, Object obj2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? null : qzVar, (i2 & 4) != 0 ? null : function3, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }
}
