package DGv;

import DGv.j;
import Du.AbstractC1341t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 implements fuX {
    private boolean J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f1407n = new HashMap();
    private final Map rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f1408t = new HashMap();
    private final Map nr = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f1406O = new HashMap();

    public static /* synthetic */ void HI(I28 i28, KClass kClass, j jVar, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        i28.ty(kClass, jVar, z2);
    }

    public static /* synthetic */ void az(I28 i28, KClass kClass, KClass kClass2, XA.Ml ml, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        i28.qie(kClass, kClass2, ml, z2);
    }

    @Override // DGv.fuX
    public void J2(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        gh(baseClass, defaultSerializerProvider, false);
    }

    public final Ml KN() {
        return new n(this.f1407n, this.rl, this.f1408t, this.nr, this.f1406O, this.J2);
    }

    @Override // DGv.fuX
    public void O(KClass baseClass, KClass actualClass, XA.Ml actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        az(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // DGv.fuX
    public void Uo(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        HI(this, kClass, new j.n(provider), false, 4, null);
    }

    public final void gh(KClass baseClass, Function1 defaultSerializerProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1 function1 = (Function1) this.f1408t.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultSerializerProvider) || z2) {
            this.f1408t.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    public final void mUb(KClass baseClass, Function1 defaultDeserializerProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1 function1 = (Function1) this.f1406O.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultDeserializerProvider) || z2) {
            this.f1406O.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    @Override // DGv.fuX
    public void nr(KClass kClass, XA.Ml serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        HI(this, kClass, new j.C0050j(serializer), false, 4, null);
    }

    public final void qie(KClass baseClass, KClass concreteClass, XA.Ml concreteSerializer, boolean z2) {
        Object next;
        KClass kClass;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String strKN = concreteSerializer.getDescriptor().KN();
        Map map = this.rl;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        Map map4 = this.nr;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        XA.Ml ml = (XA.Ml) map3.get(concreteClass);
        if (ml != null && !Intrinsics.areEqual(ml, concreteSerializer)) {
            if (!z2) {
                throw new w6(baseClass, concreteClass);
            }
        }
        XA.Ml ml2 = (XA.Ml) map6.get(strKN);
        if (ml2 != null && !Intrinsics.areEqual(ml2, concreteSerializer)) {
            Iterator it = MapsKt.asSequence(map3).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Map.Entry) next).getValue() == ml2) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (kClass = (KClass) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + strKN + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z2) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + strKN + "': " + concreteSerializer + " for '" + concreteClass + "' and " + ml2 + " for '" + kClass + '\'');
            }
        }
        map3.put(concreteClass, concreteSerializer);
        map6.put(strKN, concreteSerializer);
    }

    @Override // DGv.fuX
    public void t(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        mUb(baseClass, defaultDeserializerProvider, false);
    }

    public final void ty(KClass forClass, j provider, boolean z2) {
        j jVar;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (z2 || (jVar = (j) this.f1407n.get(forClass)) == null || Intrinsics.areEqual(jVar, provider)) {
            this.f1407n.put(forClass, provider);
            if (AbstractC1341t.qie(forClass)) {
                this.J2 = true;
                return;
            }
            return;
        }
        throw new w6("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }

    public final void xMQ(Ml module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.n(this);
    }
}
