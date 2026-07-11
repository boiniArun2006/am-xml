package Du;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Mo implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Mo f1974n = new Mo();
    private static final EJn.Wre rl = Zs.n("kotlin.UByte", WY.j.g(ByteCompanionObject.INSTANCE));

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    public byte rl(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UByte.m331constructorimpl(decoder.az(getDescriptor()).N());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((UByte) obj).getData());
    }

    public void t(gi.Wre encoder, byte b2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.J2(getDescriptor()).KN(b2);
    }

    private Mo() {
    }

    @Override // XA.w6
    public /* bridge */ /* synthetic */ Object deserialize(gi.I28 i28) {
        return UByte.m325boximpl(rl(i28));
    }
}
