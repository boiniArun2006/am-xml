package Du;

import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class U implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final U f1992n = new U();
    private static final EJn.Wre rl = Zs.n("kotlin.UShort", WY.j.X(ShortCompanionObject.INSTANCE));

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    public short rl(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UShort.m594constructorimpl(decoder.az(getDescriptor()).r());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((UShort) obj).getData());
    }

    public void t(gi.Wre encoder, short s2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.J2(getDescriptor()).o(s2);
    }

    private U() {
    }

    @Override // XA.w6
    public /* bridge */ /* synthetic */ Object deserialize(gi.I28 i28) {
        return UShort.m588boximpl(rl(i28));
    }
}
