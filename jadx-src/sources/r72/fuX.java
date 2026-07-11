package r72;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r72.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements q3M.n {
    private final q3M.n nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f72859t;

    public fuX(long j2, q3M.n networkErrorUploadDelayProvider) {
        Intrinsics.checkNotNullParameter(networkErrorUploadDelayProvider, "networkErrorUploadDelayProvider");
        this.f72859t = j2;
        this.nr = networkErrorUploadDelayProvider;
    }

    @Override // q3M.n
    public void reset() {
        this.nr.reset();
    }

    @Override // q3M.n
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public long n(n.AbstractC1150n delayConditioner) {
        Intrinsics.checkNotNullParameter(delayConditioner, "delayConditioner");
        if (Intrinsics.areEqual(delayConditioner, n.AbstractC1150n.C1153n.f72867n)) {
            long j2 = this.f72859t;
            this.nr.reset();
            return j2;
        }
        if (Intrinsics.areEqual(delayConditioner, n.AbstractC1150n.j.C1152n.f72866n)) {
            long j3 = this.f72859t;
            this.nr.reset();
            return j3;
        }
        if (Intrinsics.areEqual(delayConditioner, n.AbstractC1150n.j.C1151j.f72865n)) {
            return q3M.I28.t(this.nr);
        }
        throw new NoWhenBranchMatchedException();
    }
}
