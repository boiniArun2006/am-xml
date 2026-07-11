package yc;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class qf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f76093n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return Intrinsics.areEqual(this.f76093n, qfVar.f76093n) && Intrinsics.areEqual(this.rl, qfVar.rl);
    }

    public qf(String id, String vectorData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(vectorData, "vectorData");
        this.f76093n = id;
        this.rl = vectorData;
    }

    public int hashCode() {
        return (this.f76093n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f76093n;
    }

    public final String rl() {
        return this.rl;
    }

    public String toString() {
        return qfEYuUHwj.qDsmi + this.f76093n + ", vectorData=" + this.rl + ")";
    }
}
