package as;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    public static final n J2(n trimmed, int i2) {
        Intrinsics.checkNotNullParameter(trimmed, "$this$trimmed");
        return w9.w6.nr(v9.n.KN(trimmed.O()), i2) <= 0 ? trimmed : n.rl(trimmed, v9.n.qie(trimmed.O(), w9.Ml.HI(w9.Ml.f74802t.n(), w9.Ml.J2(i2))), null, 2, null);
    }

    public static final n O(n paddedWith, int i2, int i3) {
        Intrinsics.checkNotNullParameter(paddedWith, "$this$paddedWith");
        if (i2 <= 0 && i3 <= 0) {
            throw new IllegalArgumentException("Zero padding on both sides of the receiver is not supported");
        }
        int iO = fuX.O(fuX.nr(i2, paddedWith.nr()), paddedWith.t());
        ByteBuffer byteBufferO = v9.n.O(w9.w6.qie(w9.w6.qie(iO, v9.n.KN(paddedWith.O())), fuX.O(fuX.nr(i3, paddedWith.nr()), paddedWith.t())), null, 2, null);
        byteBufferO.position(iO);
        byteBufferO.put(paddedWith.O());
        byteBufferO.position(0);
        return n.rl(paddedWith, byteBufferO, null, 2, null);
    }

    public static final n Uo(n trimmed, long j2) {
        Intrinsics.checkNotNullParameter(trimmed, "$this$trimmed");
        return J2(trimmed, aC.n(j2, trimmed.Uo()));
    }

    public static final n n(n nVar, n other) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!eO.Uo(nVar.J2(), other.J2())) {
            throw new IllegalArgumentException(("Samples rate must be equal, found " + ((Object) eO.xMQ(nVar.J2())) + " and " + ((Object) eO.xMQ(other.J2())) + '.').toString());
        }
        if (!qz.nr(nVar.nr(), other.nr())) {
            throw new IllegalArgumentException(("Channel count must be equal, found " + ((Object) qz.J2(nVar.nr())) + " and " + ((Object) qz.J2(other.nr())) + '.').toString());
        }
        ByteBuffer byteBufferO = v9.n.O(w9.w6.qie(v9.n.KN(nVar.O()), v9.n.KN(other.O())), null, 2, null);
        int iUo = v9.n.Uo(nVar.O());
        byteBufferO.put(nVar.O());
        v9.n.ck(nVar.O(), iUo);
        int iUo2 = v9.n.Uo(other.O());
        byteBufferO.put(other.O());
        v9.n.ck(other.O(), iUo2);
        byteBufferO.position(0);
        return n.rl(nVar, byteBufferO, null, 2, null);
    }

    public static final int nr(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return fuX.t(v9.n.KN(nVar.O()), nVar.t());
    }

    public static final int rl(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return fuX.J2(nVar.nr(), nVar.t());
    }

    public static final int t(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return fuX.n(nr(nVar), nVar.nr());
    }
}
