package XA;

import Du.AbstractC1338n;
import EJn.Ml;
import EJn.Pl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz extends AbstractC1338n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f11793O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f11794n;
    private final Map nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f11795t;

    public static final class j implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f11796n;

        public j(Iterable iterable) {
            this.f11796n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Ml) ((Map.Entry) obj).getValue()).getDescriptor().KN();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f11796n.iterator();
        }
    }

    public qz(final String serialName, KClass baseClass, KClass[] subclasses, Ml[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.f11794n = baseClass;
        this.rl = CollectionsKt.emptyList();
        this.f11795t = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: XA.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qz.mUb(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + J2().getSimpleName() + " should be marked @Serializable");
        }
        Map map = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers));
        this.nr = map;
        j jVar = new j(map.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itSourceIterator = jVar.sourceIterator();
        while (itSourceIterator.hasNext()) {
            Object next = itSourceIterator.next();
            Object objKeyOf = jVar.keyOf(next);
            Object obj = linkedHashMap.get(objKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(objKeyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + J2() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (Ml) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f11793O = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(final qz qzVar, EJn.j buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        EJn.j.rl(buildSerialDescriptor, "type", WY.j.T(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "value", EJn.qz.Uo("kotlinx.serialization.Sealed<" + qzVar.J2().getSimpleName() + Typography.greater, Pl.j.f2280n, new EJn.Wre[0], new Function1() { // from class: XA.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qz.qie(this.f11792n, (EJn.j) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.KN(qzVar.rl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre mUb(String str, final qz qzVar) {
        return EJn.qz.Uo(str, Ml.n.f2279n, new EJn.Wre[0], new Function1() { // from class: XA.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qz.gh(this.f11778n, (EJn.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(qz qzVar, EJn.j buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry entry : qzVar.f11793O.entrySet()) {
            EJn.j.rl(buildSerialDescriptor, (String) entry.getKey(), ((Ml) entry.getValue()).getDescriptor(), null, false, 12, null);
        }
        return Unit.INSTANCE;
    }

    @Override // Du.AbstractC1338n
    public KClass J2() {
        return this.f11794n;
    }

    @Override // Du.AbstractC1338n
    public eO O(gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Ml ml = (Ml) this.nr.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        Ml mlO = ml != null ? ml : super.O(encoder, value);
        if (mlO != null) {
            return mlO;
        }
        return null;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return (EJn.Wre) this.f11795t.getValue();
    }

    @Override // Du.AbstractC1338n
    public w6 nr(gi.w6 decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Ml ml = (Ml) this.f11793O.get(str);
        return ml != null ? ml : super.nr(decoder, str);
    }
}
