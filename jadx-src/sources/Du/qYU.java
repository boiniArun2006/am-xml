package Du;

import EJn.Xo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qYU implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f2043n;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f2044t;

    public qYU(final String serialName, Object objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f2043n = objectInstance;
        this.rl = CollectionsKt.emptyList();
        this.f2044t = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: Du.kO4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qYU.nr(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(qYU qyu, EJn.j buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.KN(qyu.rl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre nr(String str, final qYU qyu) {
        return EJn.qz.Uo(str, Xo.Ml.f2282n, new EJn.Wre[0], new Function1() { // from class: Du.hQ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qYU.O(this.f2019n, (EJn.j) obj);
            }
        });
    }

    @Override // XA.w6
    public Object deserialize(gi.I28 decoder) {
        int iNY;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        EJn.Wre descriptor = getDescriptor();
        gi.w6 w6VarRl = decoder.rl(descriptor);
        if (w6VarRl.HI() || (iNY = w6VarRl.nY(getDescriptor())) == -1) {
            Unit unit = Unit.INSTANCE;
            w6VarRl.t(descriptor);
            return this.f2043n;
        }
        throw new SerializationException("Unexpected index " + iNY);
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return (EJn.Wre) this.f2044t.getValue();
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.rl(getDescriptor()).t(getDescriptor());
    }
}
