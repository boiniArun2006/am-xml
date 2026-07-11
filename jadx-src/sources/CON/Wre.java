package CON;

import Ba.I28;
import EJn.I28;
import EJn.qz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f924n = new Wre();
    private static final EJn.Wre rl = qz.t("kotlinx.datetime.LocalDate", I28.Dsr.f2270n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Ba.I28 deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return I28.Companion.rl(Ba.I28.INSTANCE, decoder.g(), null, 2, null);
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Ba.I28 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.T(value.toString());
    }

    private Wre() {
    }
}
