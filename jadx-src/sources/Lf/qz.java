package Lf;

import Be4.psW;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class qz extends fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW f6174n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Be4.CN3 f6175t;

    public qz(psW psw, String str, Be4.CN3 cn3) {
        super(null);
        this.f6174n = psw;
        this.rl = str;
        this.f6175t = cn3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Intrinsics.areEqual(this.f6174n, qzVar.f6174n) && Intrinsics.areEqual(this.rl, qzVar.rl) && this.f6175t == qzVar.f6175t;
    }

    public int hashCode() {
        int iHashCode = this.f6174n.hashCode() * 31;
        String str = this.rl;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f6175t.hashCode();
    }

    public final Be4.CN3 n() {
        return this.f6175t;
    }

    public final String rl() {
        return this.rl;
    }

    public final psW t() {
        return this.f6174n;
    }
}
