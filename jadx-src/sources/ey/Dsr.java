package ey;

import as.Ml;
import as.Xo;
import as.eO;
import as.qz;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Dsr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(ByteBuffer byteBuffer, int i2, int i3) {
        return as.I28.n(as.Ml.f43088n, w9.w6.J2(byteBuffer.position()), i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(fuX fux) {
        Ml.j jVar = as.Ml.f43088n;
        as.I28.n(jVar, w9.w6.J2(fux.n().position()), fux.t(), fux.rl());
        as.I28.n(jVar, w9.w6.J2(fux.n().limit()), fux.t(), fux.rl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(ByteBuffer byteBuffer, int i2, int i3) {
        return as.I28.n(as.Ml.f43088n, w9.w6.J2(byteBuffer.limit()), i2, i3);
    }

    public static final void nr(fuX fux, fuX destination) {
        Intrinsics.checkNotNullParameter(fux, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!qz.nr(fux.t(), destination.t())) {
            throw new IllegalArgumentException(("Converting between different channel counts is unsupported. Source channel count: " + ((Object) qz.J2(fux.t())) + ", destination channel count: " + ((Object) qz.J2(destination.t()))).toString());
        }
        if (!eO.Uo(fux.J2().t(), destination.J2().t())) {
            throw new IllegalArgumentException(("Cannot copy contents since the buffers have different sample rate.\nSource sample rate: " + ((Object) eO.xMQ(fux.J2().t())) + "\nDestination sample rate: " + ((Object) eO.xMQ(destination.J2().t()))).toString());
        }
        if (fux.O().compareTo(destination.nr()) >= 0 || destination.O().compareTo(fux.nr()) >= 0) {
            throw new IllegalArgumentException(("Cannot copy contents since the buffers do not overlap.\nBuffer 1: " + fux.J2() + ", " + fux.O() + ", " + fux.nr() + "\nBuffer 2: " + destination.J2() + ", " + destination.O() + ", " + destination.nr()).toString());
        }
        int iJ2 = v9.n.J2(fux.n());
        int iRl = as.I28.rl(Uo(fux.O(), destination.O()), fux.t(), fux.rl());
        int iRl2 = as.I28.rl(Uo(destination.nr(), fux.nr()), fux.t(), fux.rl());
        ByteBuffer byteBufferN = fux.n();
        v9.n.ck(byteBufferN, w9.Ml.qie(v9.n.Uo(byteBufferN), iRl));
        ByteBuffer byteBufferN2 = fux.n();
        v9.n.HI(byteBufferN2, w9.Ml.gh(v9.n.J2(byteBufferN2), iRl2));
        int iRl3 = as.I28.rl(Uo(destination.O(), fux.O()), fux.t(), fux.rl());
        ByteBuffer byteBufferN3 = destination.n();
        v9.n.ck(byteBufferN3, w9.Ml.qie(v9.n.Uo(byteBufferN3), iRl3));
        destination.n().put(fux.n());
        v9.n.HI(fux.n(), iJ2);
        KN(fux);
        KN(destination);
    }

    private static final int Uo(Xo xo, Xo xo2) {
        return as.Ml.t(RangesKt.coerceAtLeast(xo2.rl() - xo.rl(), 0));
    }
}
