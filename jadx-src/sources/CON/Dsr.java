package CON;

import Ba.n;
import Du.fg;
import EJn.qz;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f917n = new Dsr();
    private static final Lazy rl = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) j.f918n);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f918n = new j();

        /* JADX INFO: renamed from: CON.Dsr$j$j, reason: collision with other inner class name */
        static final class C0022j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0022j f919n = new C0022j();

            C0022j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((EJn.j) obj);
                return Unit.INSTANCE;
            }

            public final void n(EJn.j buildClassSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                buildClassSerialDescriptor.n("nanoseconds", fg.f2014n.getDescriptor(), CollectionsKt.emptyList(), false);
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final EJn.Wre invoke() {
            return qz.nr("kotlinx.datetime.TimeBased", new EJn.Wre[0], C0022j.f919n);
        }
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return (EJn.Wre) rl.getValue();
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public n.I28 deserialize(gi.I28 decoder) {
        long jTe;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        EJn.Wre descriptor = getDescriptor();
        gi.w6 w6VarRl = decoder.rl(descriptor);
        boolean z2 = true;
        if (!w6VarRl.HI()) {
            long jTe2 = 0;
            boolean z3 = false;
            while (true) {
                Dsr dsr = f917n;
                int iNY = w6VarRl.nY(dsr.getDescriptor());
                if (iNY == -1) {
                    z2 = z3;
                    jTe = jTe2;
                    break;
                }
                if (iNY != 0) {
                    w6.n(iNY);
                    throw new KotlinNothingValueException();
                }
                jTe2 = w6VarRl.te(dsr.getDescriptor(), 0);
                z3 = true;
            }
        } else {
            jTe = w6VarRl.te(f917n.getDescriptor(), 0);
        }
        Unit unit = Unit.INSTANCE;
        w6VarRl.t(descriptor);
        if (z2) {
            return new n.I28(jTe);
        }
        throw new MissingFieldException("nanoseconds", getDescriptor().KN());
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, n.I28 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        EJn.Wre descriptor = getDescriptor();
        gi.Ml mlRl = encoder.rl(descriptor);
        mlRl.WPU(f917n.getDescriptor(), 0, value.getNanoseconds());
        mlRl.t(descriptor);
    }

    private Dsr() {
    }
}
