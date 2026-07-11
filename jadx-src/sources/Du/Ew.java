package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ew implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ew f1957n = new Ew();
    private static final EJn.Wre rl = new lS("kotlin.time.Duration", I28.Dsr.f2270n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    public long rl(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Duration.INSTANCE.m1745parseIsoStringUwyO8pc(decoder.g());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Duration) obj).getRawValue());
    }

    public void t(gi.Wre encoder, long j2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.T(Duration.m1690toIsoStringimpl(j2));
    }

    private Ew() {
    }

    @Override // XA.w6
    public /* bridge */ /* synthetic */ Object deserialize(gi.I28 i28) {
        return Duration.m1650boximpl(rl(i28));
    }
}
