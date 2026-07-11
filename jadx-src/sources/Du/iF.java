package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class iF implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final iF f2020n = new iF();
    private static final EJn.Wre rl = new lS("kotlin.Int", I28.Wre.f2273n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.xMQ());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Number) obj).intValue());
    }

    public void t(gi.Wre encoder, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.E2(i2);
    }

    private iF() {
    }
}
