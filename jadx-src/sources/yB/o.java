package yB;

import dzu.nKK;
import dzu.qf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f75583n = qf.O("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
    private static final nKK rl = new nKK("PERMIT");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final nKK f75584t = new nKK("TAKEN");
    private static final nKK nr = new nKK("BROKEN");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final nKK f75582O = new nKK("CANCELLED");
    private static final int J2 = qf.O("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final qz mUb(long j2, qz qzVar) {
        return new qz(j2, qzVar, 0);
    }

    public static final fuX n(int i2, int i3) {
        return new C(i2, i3);
    }

    public static /* synthetic */ fuX rl(int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        return n(i2, i3);
    }
}
