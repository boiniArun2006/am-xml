package XA;

import Du.AbstractC1341t;
import Du.C1340p;
import Du.cA;
import Du.h;
import Du.mz;
import Du.psW;
import Du.tI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract /* synthetic */ class ci {
    private static final Ml t(KClass kClass, List list) {
        Ml[] mlArr = (Ml[]) list.toArray(new Ml[0]);
        return AbstractC1341t.nr(kClass, (Ml[]) Arrays.copyOf(mlArr, mlArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier xMQ(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final Ml J2(DGv.Ml ml, KType type) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Ml mlKN = KN(ml, type, true);
        if (mlKN != null) {
            return mlKN;
        }
        AbstractC1341t.ck(cA.t(type));
        throw new KotlinNothingValueException();
    }

    public static final Ml O(KClass kClass, List serializers, Function0 elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        Ml mlRl = rl(kClass, serializers, elementClassifierIfArray);
        return mlRl == null ? t(kClass, serializers) : mlRl;
    }

    public static final Ml Uo(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Ml mlO = r.O(kClass);
        if (mlO != null) {
            return mlO;
        }
        cA.J2(kClass);
        throw new KotlinNothingValueException();
    }

    public static final List az(DGv.Ml ml, List typeArguments, boolean z2) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z2) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(r.rl(ml, (KType) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            Ml mlNr = r.nr(ml, (KType) it2.next());
            if (mlNr == null) {
                return null;
            }
            arrayList2.add(mlNr);
        }
        return arrayList2;
    }

    public static final Ml gh(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Ml mlRl = AbstractC1341t.rl(kClass);
        return mlRl == null ? tI.rl(kClass) : mlRl;
    }

    public static final Ml mUb(DGv.Ml ml, KType type) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return KN(ml, type, false);
    }

    private static final Ml nr(Ml ml, boolean z2) {
        if (z2) {
            return WY.j.Z(ml);
        }
        Intrinsics.checkNotNull(ml, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return ml;
    }

    public static final Ml qie(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return r.nr(DGv.Wre.n(), type);
    }

    private static final Ml rl(KClass kClass, List list, Function0 function0) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new Du.Wre((Ml) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new psW((Ml) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new C1340p((Ml) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new h((Ml) list.get(0), (Ml) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new mz((Ml) list.get(0), (Ml) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return WY.j.mUb((Ml) list.get(0), (Ml) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return WY.j.az((Ml) list.get(0), (Ml) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return WY.j.HI((Ml) list.get(0), (Ml) list.get(1), (Ml) list.get(2));
        }
        if (!AbstractC1341t.HI(kClass)) {
            return null;
        }
        Object objInvoke = function0.invoke();
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return WY.j.n((KClass) objInvoke, (Ml) list.get(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Ml KN(DGv.Ml ml, KType kType, boolean z2) {
        Ml mlAz;
        Ml mlRl;
        fuX fux;
        KClass kClassT = cA.t(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(cA.Uo((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (AbstractC1341t.qie(kClassT) && DGv.Ml.t(ml, kClassT, null, 2, null) != null) {
                mlAz = null;
            } else {
                mlAz = Q.az(kClassT, zIsMarkedNullable);
            }
        } else if (!ml.nr()) {
            Object objTy = Q.ty(kClassT, arrayList, zIsMarkedNullable);
            if (Result.m319isFailureimpl(objTy)) {
                objTy = null;
            }
            mlAz = (Ml) objTy;
        }
        if (mlAz != null) {
            return mlAz;
        }
        if (arrayList.isEmpty()) {
            mlRl = r.O(kClassT);
            if (mlRl == null && (mlRl = DGv.Ml.t(ml, kClassT, null, 2, null)) == null) {
                if (AbstractC1341t.qie(kClassT)) {
                    fux = new fuX(kClassT);
                    mlRl = fux;
                }
                mlRl = null;
            }
        } else {
            List listUo = r.Uo(ml, arrayList, z2);
            if (listUo == null) {
                return null;
            }
            Ml mlN = r.n(kClassT, listUo, new Function0() { // from class: XA.SPz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ci.xMQ(arrayList);
                }
            });
            if (mlN == null) {
                mlRl = ml.rl(kClassT, listUo);
                if (mlRl == null) {
                    if (AbstractC1341t.qie(kClassT)) {
                        fux = new fuX(kClassT);
                        mlRl = fux;
                    }
                    mlRl = null;
                }
            } else {
                mlRl = mlN;
            }
        }
        if (mlRl == null) {
            return null;
        }
        return nr(mlRl, zIsMarkedNullable);
    }
}
