package kotlinx.serialization.json;

import EJn.Ml;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class QJ implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final QJ f70267n = new QJ();
    private static final EJn.Wre rl = EJn.qz.Uo("kotlinx.serialization.json.JsonElement", Ml.n.f2279n, new EJn.Wre[0], new Function1() { // from class: kotlinx.serialization.json.o
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return QJ.KN((EJn.j) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(EJn.j buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        EJn.j.rl(buildSerialDescriptor, "JsonPrimitive", l3D.J2(new Function0() { // from class: kotlinx.serialization.json.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.xMQ();
            }
        }), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "JsonNull", l3D.J2(new Function0() { // from class: kotlinx.serialization.json.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.mUb();
            }
        }), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "JsonLiteral", l3D.J2(new Function0() { // from class: kotlinx.serialization.json.Xo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.gh();
            }
        }), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "JsonObject", l3D.J2(new Function0() { // from class: kotlinx.serialization.json.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.qie();
            }
        }), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "JsonArray", l3D.J2(new Function0() { // from class: kotlinx.serialization.json.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.az();
            }
        }), null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre az() {
        return Ml.f70264n.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre gh() {
        return SPz.f70268n.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre mUb() {
        return Z.f70269n.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre qie() {
        return u.f70282n.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre xMQ() {
        return Ln.f70263n.getDescriptor();
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Dsr value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        l3D.KN(encoder);
        if (value instanceof qf) {
            encoder.ViF(Ln.f70263n, value);
        } else if (value instanceof nKK) {
            encoder.ViF(u.f70282n, value);
        } else {
            if (!(value instanceof w6)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.ViF(Ml.f70264n, value);
        }
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public Dsr deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return l3D.nr(decoder).KN();
    }

    private QJ() {
    }
}
