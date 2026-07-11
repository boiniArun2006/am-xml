package Du;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class D implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final D f1949n = new D();
    private static final EJn.Wre rl = Zs.n("kotlin.ULong", WY.j.e(LongCompanionObject.INSTANCE));

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    public long rl(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ULong.m487constructorimpl(decoder.az(getDescriptor()).ty());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((ULong) obj).getData());
    }

    public void t(gi.Wre encoder, long j2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.J2(getDescriptor()).az(j2);
    }

    private D() {
    }

    @Override // XA.w6
    public /* bridge */ /* synthetic */ Object deserialize(gi.I28 i28) {
        return ULong.m481boximpl(rl(i28));
    }
}
