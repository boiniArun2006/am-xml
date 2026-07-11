package kotlinx.serialization.json;

import EJn.I28;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class SPz implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SPz f70268n = new SPz();
    private static final EJn.Wre rl = EJn.qz.t("kotlinx.serialization.json.JsonLiteral", I28.Dsr.f2270n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public r deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Dsr dsrKN = l3D.nr(decoder).KN();
        if (dsrKN instanceof r) {
            return (r) dsrKN;
        }
        throw Mms.Ew.J2(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(dsrKN.getClass()), dsrKN.toString());
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, r value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        l3D.KN(encoder);
        if (value.J2()) {
            encoder.T(value.t());
            return;
        }
        if (value.O() != null) {
            encoder.J2(value.O()).T(value.t());
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(value.t());
        if (longOrNull != null) {
            encoder.az(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(value.t());
        if (uLongOrNull != null) {
            encoder.J2(WY.j.WPU(ULong.INSTANCE).getDescriptor()).az(uLongOrNull.getData());
            return;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(value.t());
        if (doubleOrNull != null) {
            encoder.Uo(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(value.t());
        if (booleanStrictOrNull != null) {
            encoder.XQ(booleanStrictOrNull.booleanValue());
        } else {
            encoder.T(value.t());
        }
    }

    private SPz() {
    }
}
