package CON;

import Ba.Ml;
import EJn.I28;
import EJn.qz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f920n = new I28();
    private static final EJn.Wre rl = qz.t("kotlinx.datetime.Instant", I28.Dsr.f2270n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Ba.Ml deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Ml.Companion.Uo(Ba.Ml.INSTANCE, decoder.g(), null, 2, null);
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Ba.Ml value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.T(value.toString());
    }

    private I28() {
    }
}
