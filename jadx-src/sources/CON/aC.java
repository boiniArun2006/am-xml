package CON;

import Ba.aC;
import EJn.I28;
import EJn.qz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class aC implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final aC f925n = new aC();
    private static final EJn.Wre rl = qz.t("kotlinx.datetime.UtcOffset", I28.Dsr.f2270n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Ba.aC deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return aC.Companion.rl(Ba.aC.INSTANCE, decoder.g(), null, 2, null);
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Ba.aC value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.T(value.toString());
    }

    private aC() {
    }
}
