package Z;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f12270n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wre) && Intrinsics.areEqual(this.f12270n, ((Wre) obj).f12270n);
    }

    public int hashCode() {
        return this.f12270n.hashCode();
    }

    @Override // Z.Dsr
    public Object n(Continuation continuation) {
        return this.f12270n;
    }

    public Wre(fuX fux) {
        this.f12270n = fux;
    }
}
