package kotlinx.serialization.json;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ln implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ln f70263n = new Ln();
    private static final EJn.Wre rl = EJn.qz.KN("kotlinx.serialization.json.JsonPrimitive", I28.Dsr.f2270n, new EJn.Wre[0], null, 8, null);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public qf deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Dsr dsrKN = l3D.nr(decoder).KN();
        if (dsrKN instanceof qf) {
            return (qf) dsrKN;
        }
        throw Mms.Ew.J2(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(dsrKN.getClass()), dsrKN.toString());
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, qf value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        l3D.KN(encoder);
        if (value instanceof afx) {
            encoder.ViF(Z.f70269n, afx.INSTANCE);
        } else {
            encoder.ViF(SPz.f70268n, (r) value);
        }
    }

    private Ln() {
    }
}
