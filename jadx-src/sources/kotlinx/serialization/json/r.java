package kotlinx.serialization.json;

import Mms.l4Z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class r extends qf {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f70279O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f70280n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EJn.Wre f70281t;

    public /* synthetic */ r(Object obj, boolean z2, EJn.Wre wre, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z2, (i2 & 4) != 0 ? null : wre);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return J2() == rVar.J2() && Intrinsics.areEqual(t(), rVar.t());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object body, boolean z2, EJn.Wre wre) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f70280n = z2;
        this.f70281t = wre;
        this.f70279O = body.toString();
        if (wre != null && !wre.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean J2() {
        return this.f70280n;
    }

    public final EJn.Wre O() {
        return this.f70281t;
    }

    @Override // kotlinx.serialization.json.qf
    public String t() {
        return this.f70279O;
    }

    public int hashCode() {
        return (Boolean.hashCode(J2()) * 31) + t().hashCode();
    }

    @Override // kotlinx.serialization.json.qf
    public String toString() {
        if (J2()) {
            StringBuilder sb = new StringBuilder();
            l4Z.t(sb, t());
            return sb.toString();
        }
        return t();
    }
}
