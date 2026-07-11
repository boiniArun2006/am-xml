package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class QJ implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final QJ f1982n = new QJ();
    private static final EJn.Wre rl = new lS("kotlin.Char", I28.w6.f2277n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Character deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.aYN());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Character) obj).charValue());
    }

    public void t(gi.Wre encoder, char c2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.nY(c2);
    }

    private QJ() {
    }
}
