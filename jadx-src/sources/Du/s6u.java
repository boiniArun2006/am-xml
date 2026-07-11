package Du;

import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class s6u implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s6u f2050n = new s6u();
    private static final EJn.Wre rl = Zs.n("kotlin.UInt", WY.j.E2(IntCompanionObject.INSTANCE));

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    public int rl(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UInt.m408constructorimpl(decoder.az(getDescriptor()).xMQ());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((UInt) obj).getData());
    }

    public void t(gi.Wre encoder, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.J2(getDescriptor()).E2(i2);
    }

    private s6u() {
    }

    @Override // XA.w6
    public /* bridge */ /* synthetic */ Object deserialize(gi.I28 i28) {
        return UInt.m402boximpl(rl(i28));
    }
}
