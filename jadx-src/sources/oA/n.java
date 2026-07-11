package oA;

import java.util.NoSuchElementException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.full.NoSuchPropertyException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71354n;
    private final KType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final KProperty1 f71355t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f71354n, nVar.f71354n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f71355t, nVar.f71355t);
    }

    public n(KClass fromClass, KType toType, KProperty1 prop) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        Intrinsics.checkNotNullParameter(prop, "prop");
        this.f71354n = fromClass;
        this.rl = toType;
        this.f71355t = prop;
    }

    public KClass J2() {
        return this.f71354n;
    }

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return this.f71355t.get(receiver);
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return this.f71355t.get(receiver);
    }

    public int hashCode() {
        return (((this.f71354n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f71355t.hashCode();
    }

    @Override // oA.j
    public Object n(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        throw new UnsupportedOperationException();
    }

    @Override // oA.j
    public KType nr() {
        return this.rl;
    }

    @Override // oA.j
    public Object rl(Object receiver, Object obj) throws NoSuchPropertyException {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        boolean z2 = false;
        Object obj2 = null;
        for (Object obj3 : KClasses.getDeclaredMemberFunctions(J2())) {
            if (Intrinsics.areEqual(((KFunction) obj3).getName(), "copy")) {
                if (z2) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                obj2 = obj3;
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        KFunction kFunction = (KFunction) obj2;
        KParameter kParameterFindParameterByName = KCallables.findParameterByName(kFunction, this.f71355t.getName());
        if (kParameterFindParameterByName == null) {
            throw new NoSuchPropertyException(null, 1, null);
        }
        KParameter instanceParameter = KCallables.getInstanceParameter(kFunction);
        Intrinsics.checkNotNull(instanceParameter);
        R rCallBy = kFunction.callBy(MapsKt.mapOf(TuplesKt.to(instanceParameter, receiver), TuplesKt.to(kParameterFindParameterByName, obj)));
        Intrinsics.checkNotNull(rCallBy, "null cannot be cast to non-null type FROMCLASS of com.alightcreative.lens.LensBase");
        return rCallBy;
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        String qualifiedName = J2().getQualifiedName();
        if (qualifiedName == null) {
            qualifiedName = "";
        }
        return qualifiedName + "::" + this.f71355t.getName();
    }
}
