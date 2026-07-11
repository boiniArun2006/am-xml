package DGv;

import DGv.j;
import XA.eO;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n extends Ml {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f1411O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f1412n;
    private final Map nr;
    public final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f1413t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f1412n = class2ContextualFactory;
        this.rl = polyBase2Serializers;
        this.f1413t = polyBase2DefaultSerializerProvider;
        this.nr = polyBase2NamedSerializers;
        this.f1411O = polyBase2DefaultDeserializerProvider;
        this.J2 = z2;
    }

    @Override // DGv.Ml
    public eO J2(KClass baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map map = (Map) this.rl.get(baseClass);
        XA.Ml ml = map != null ? (XA.Ml) map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        XA.Ml ml2 = ml instanceof eO ? ml : null;
        if (ml2 != null) {
            return ml2;
        }
        Object obj = this.f1413t.get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (eO) function1.invoke(value);
        }
        return null;
    }

    @Override // DGv.Ml
    public XA.w6 O(KClass baseClass, String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) this.nr.get(baseClass);
        XA.Ml ml = map != null ? (XA.Ml) map.get(str) : null;
        if (!(ml instanceof XA.Ml)) {
            ml = null;
        }
        if (ml != null) {
            return ml;
        }
        Object obj = this.f1411O.get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (XA.w6) function1.invoke(str);
        }
        return null;
    }

    @Override // DGv.Ml
    public void n(fuX collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry entry : this.f1412n.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            j jVar = (j) entry.getValue();
            if (jVar instanceof j.C0050j) {
                Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                XA.Ml mlRl = ((j.C0050j) jVar).rl();
                Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.nr(kClass, mlRl);
            } else {
                if (!(jVar instanceof j.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.Uo(kClass, ((j.n) jVar).rl());
            }
        }
        for (Map.Entry entry2 : this.rl.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                XA.Ml ml = (XA.Ml) entry3.getValue();
                Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(ml, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.O(kClass2, kClass3, ml);
            }
        }
        for (Map.Entry entry4 : this.f1413t.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.checkNotNull(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.J2(kClass4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
        }
        for (Map.Entry entry5 : this.f1411O.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.checkNotNull(kClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.t(kClass5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1));
        }
    }

    @Override // DGv.Ml
    public boolean nr() {
        return this.J2;
    }

    @Override // DGv.Ml
    public XA.Ml rl(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        j jVar = (j) this.f1412n.get(kClass);
        XA.Ml mlN = jVar != null ? jVar.n(typeArgumentsSerializers) : null;
        if (mlN instanceof XA.Ml) {
            return mlN;
        }
        return null;
    }
}
