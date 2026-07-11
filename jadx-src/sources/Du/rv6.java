package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class rv6 implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final rv6 f2048n = new rv6();
    private static final EJn.Wre rl = new lS("kotlin.Float", I28.C0079I28.f2271n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Float deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.o());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Number) obj).floatValue());
    }

    public void t(gi.Wre encoder, float f3) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.aYN(f3);
    }

    private rv6() {
    }
}
