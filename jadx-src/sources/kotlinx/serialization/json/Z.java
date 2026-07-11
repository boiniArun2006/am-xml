package kotlinx.serialization.json;

import EJn.Pl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Z implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Z f70269n = new Z();
    private static final EJn.Wre rl = EJn.qz.KN("kotlinx.serialization.json.JsonNull", Pl.n.f2281n, new EJn.Wre[0], null, 8, null);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public afx deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l3D.Uo(decoder);
        if (decoder.E2()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.gh();
        return afx.INSTANCE;
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, afx value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        l3D.KN(encoder);
        encoder.Ik();
    }

    private Z() {
    }
}
