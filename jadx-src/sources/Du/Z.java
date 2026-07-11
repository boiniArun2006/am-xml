package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Z implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Z f2001n = new Z();
    private static final EJn.Wre rl = new lS("kotlin.Double", I28.Ml.f2272n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Double deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.Z());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Number) obj).doubleValue());
    }

    public void t(gi.Wre encoder, double d2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.Uo(d2);
    }

    private Z() {
    }
}
