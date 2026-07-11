package Ea;

import as.n;
import as.w6;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.Intrinsics;
import v9.Dsr;
import v9.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {
    public static final void n(n nVar, float f3) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Dsr.rl(v9.n.rl(nVar.O()), f3);
    }

    public static final void rl(n nVar, float f3, float f4) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        ShortBuffer shortBufferRl = v9.n.rl(nVar.O());
        float fT = w6.t(nVar);
        ShortBuffer shortBufferDuplicate = shortBufferRl.duplicate();
        int iPosition = shortBufferRl.position();
        int iRemaining = shortBufferRl.remaining();
        for (int i2 = 0; i2 < iRemaining; i2++) {
            float fNr = (i2 / nVar.nr()) / fT;
            shortBufferRl.put(Short.valueOf(I28.n((int) (shortBufferDuplicate.get() * (((1 - fNr) * f3) + (fNr * f4))))).shortValue());
        }
        shortBufferRl.position(iPosition);
    }
}
