package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class FPL implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FPL f1958n = new FPL();
    private static final EJn.Wre rl = new lS("kotlin.Short", I28.fuX.f2274n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Short deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.r());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Number) obj).shortValue());
    }

    public void t(gi.Wre encoder, short s2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.o(s2);
    }

    private FPL() {
    }
}
