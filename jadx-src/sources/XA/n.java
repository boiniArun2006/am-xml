package XA;

import Du.cA;
import EJn.Pl;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f11790n;
    private final EJn.Wre nr;
    private final Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f11791t;

    public n(KClass serializableClass, Ml ml, Ml[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f11790n = serializableClass;
        this.rl = ml;
        this.f11791t = ArraysKt.asList(typeArgumentsSerializers);
        this.nr = EJn.n.t(EJn.qz.Uo("kotlinx.serialization.ContextualSerializer", Pl.j.f2280n, new EJn.Wre[0], new Function1() { // from class: XA.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.t(this.f11789n, (EJn.j) obj);
            }
        }), serializableClass);
    }

    private final Ml nr(DGv.Ml ml) {
        Ml mlRl = ml.rl(this.f11790n, this.f11791t);
        if (mlRl != null) {
            return mlRl;
        }
        Ml ml2 = this.rl;
        if (ml2 != null) {
            return ml2;
        }
        cA.J2(this.f11790n);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(n nVar, EJn.j buildSerialDescriptor) {
        EJn.Wre descriptor;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Ml ml = nVar.rl;
        List annotations = (ml == null || (descriptor = ml.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = CollectionsKt.emptyList();
        }
        buildSerialDescriptor.KN(annotations);
        return Unit.INSTANCE;
    }

    @Override // XA.w6
    public Object deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.qie(nr(decoder.getSerializersModule()));
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.nr;
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.ViF(nr(encoder.getSerializersModule()), value);
    }
}
