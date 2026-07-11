package NtE;

import LQ.j;
import as.aC;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Wre implements Fs8.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f7112n;
    private final as.CN3 rl;

    public /* synthetic */ Wre(long j2, as.CN3 cn3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, cn3);
    }

    private Wre(long j2, as.CN3 cn3) {
        this.f7112n = j2;
        this.rl = cn3;
    }

    @Override // Fs8.j
    public Object rl(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // Fs8.j
    public Object n(d2n.Wre wre, Continuation continuation) {
        return new j.w6(new as.n(v9.n.O(aC.n(wre.t(), this.rl), null, 2, null), this.rl));
    }
}
