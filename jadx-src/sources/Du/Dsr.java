package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f1956n = new Dsr();
    private static final EJn.Wre rl = new lS("kotlin.Boolean", I28.j.f2275n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.WPU());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Boolean) obj).booleanValue());
    }

    public void t(gi.Wre encoder, boolean z2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.XQ(z2);
    }

    private Dsr() {
    }
}
