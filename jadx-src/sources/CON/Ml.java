package CON;

import Ba.n;
import Du.iF;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f921n = new Ml();
    private static final Lazy rl = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) j.f922n);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f922n = new j();

        /* JADX INFO: renamed from: CON.Ml$j$j, reason: collision with other inner class name */
        static final class C0023j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0023j f923n = new C0023j();

            C0023j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((EJn.j) obj);
                return Unit.INSTANCE;
            }

            public final void n(EJn.j buildClassSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                buildClassSerialDescriptor.n("days", iF.f2020n.getDescriptor(), CollectionsKt.emptyList(), false);
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final EJn.Wre invoke() {
            return qz.nr("kotlinx.datetime.DayBased", new EJn.Wre[0], C0023j.f923n);
        }
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return (EJn.Wre) rl.getValue();
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public n.w6 deserialize(gi.I28 decoder) {
        int iXQ;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        EJn.Wre descriptor = getDescriptor();
        gi.w6 w6VarRl = decoder.rl(descriptor);
        boolean z2 = true;
        if (!w6VarRl.HI()) {
            iXQ = 0;
            boolean z3 = false;
            while (true) {
                Ml ml = f921n;
                int iNY = w6VarRl.nY(ml.getDescriptor());
                if (iNY == -1) {
                    z2 = z3;
                    break;
                }
                if (iNY != 0) {
                    w6.n(iNY);
                    throw new KotlinNothingValueException();
                }
                iXQ = w6VarRl.XQ(ml.getDescriptor(), 0);
                z3 = true;
            }
        } else {
            iXQ = w6VarRl.XQ(f921n.getDescriptor(), 0);
        }
        Unit unit = Unit.INSTANCE;
        w6VarRl.t(descriptor);
        if (z2) {
            return new n.w6(iXQ);
        }
        throw new MissingFieldException("days", getDescriptor().KN());
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, n.w6 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        EJn.Wre descriptor = getDescriptor();
        gi.Ml mlRl = encoder.rl(descriptor);
        mlRl.fD(f921n.getDescriptor(), 0, value.getDays());
        mlRl.t(descriptor);
    }

    private Ml() {
    }
}
