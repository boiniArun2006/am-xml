package XA;

import Du.AbstractC1338n;
import EJn.Ml;
import EJn.Pl;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX extends AbstractC1338n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f11787n;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f11788t;

    public fuX(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f11787n = baseClass;
        this.rl = CollectionsKt.emptyList();
        this.f11788t = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: XA.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.xMQ(this.f11784n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(fuX fux, EJn.j buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        EJn.j.rl(buildSerialDescriptor, "type", WY.j.T(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "value", EJn.qz.KN("kotlinx.serialization.Polymorphic<" + fux.J2().getSimpleName() + Typography.greater, Pl.j.f2280n, new EJn.Wre[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.KN(fux.rl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre xMQ(final fuX fux) {
        return EJn.n.t(EJn.qz.Uo("kotlinx.serialization.Polymorphic", Ml.j.f2278n, new EJn.Wre[0], new Function1() { // from class: XA.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.mUb(this.f11779n, (EJn.j) obj);
            }
        }), fux.J2());
    }

    @Override // Du.AbstractC1338n
    public KClass J2() {
        return this.f11787n;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return (EJn.Wre) this.f11788t.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + J2() + ')';
    }
}
