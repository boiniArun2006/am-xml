package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fg implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fg f2014n = new fg();
    private static final EJn.Wre rl = new lS("kotlin.Long", I28.CN3.f2269n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Long deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.ty());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Number) obj).longValue());
    }

    public void t(gi.Wre encoder, long j2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.az(j2);
    }

    private fg() {
    }
}
