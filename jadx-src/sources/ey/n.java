package ey;

import as.Xo;
import as.aC;
import as.o;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {
    public static final Q4.w6 t(Q4.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        int iN = ml.J2().n();
        if (o.t(iN, o.rl(1))) {
            return Q4.w6.PCM_8BIT;
        }
        if (o.t(iN, o.rl(2))) {
            return Q4.w6.PCM_16BIT;
        }
        if (o.t(iN, o.rl(3))) {
            return Q4.w6.PCM_24BIT;
        }
        if (o.t(iN, o.rl(4))) {
            return ml.J2().nr() ? Q4.w6.PCM_FLOAT : Q4.w6.PCM_32BIT;
        }
        throw new IllegalStateException(("Unsupported byte count per sample: " + ml).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fuX rl(ByteBuffer byteBuffer, Q4.j jVar, long j2) {
        Xo xoNr = aC.nr(j2, jVar.t());
        return new fuX(byteBuffer, new Xo(xoNr.rl() - as.I28.n(as.Ml.f43088n, w9.w6.J2(byteBuffer.position()), jVar.rl(), jVar.n()), jVar.t(), null), jVar.rl(), jVar.n(), null);
    }
}
