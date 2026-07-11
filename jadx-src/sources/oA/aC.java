package oA;

import java.util.NoSuchElementException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.full.NoSuchPropertyException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71352n;
    private final KProperty1 nr;
    private final KType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f71353t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return Intrinsics.areEqual(this.f71352n, aCVar.f71352n) && Intrinsics.areEqual(this.rl, aCVar.rl) && Intrinsics.areEqual(this.f71353t, aCVar.f71353t) && Intrinsics.areEqual(this.nr, aCVar.nr);
    }

    public aC(KClass fromClass, KType toType, j parentPath, KProperty1 prop) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        Intrinsics.checkNotNullParameter(prop, "prop");
        this.f71352n = fromClass;
        this.rl = toType;
        this.f71353t = parentPath;
        this.nr = prop;
    }

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Object objO = this.f71353t.O(receiver);
        if (objO != null) {
            return this.nr.get(objO);
        }
        return null;
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return this.nr.get(this.f71353t.get(receiver));
    }

    public int hashCode() {
        return (((((this.f71352n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f71353t.hashCode()) * 31) + this.nr.hashCode();
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
    public Object rl(Object receiver, Object value) throws NoSuchPropertyException {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(value, "value");
        Object obj = this.f71353t.get(receiver);
        boolean z2 = false;
        Object obj2 = null;
        for (Object obj3 : KClasses.getDeclaredMemberFunctions(Reflection.getOrCreateKotlinClass(obj.getClass()))) {
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
        KParameter kParameterFindParameterByName = KCallables.findParameterByName(kFunction, this.nr.getName());
        if (kParameterFindParameterByName == null) {
            throw new NoSuchPropertyException(null, 1, null);
        }
        KParameter instanceParameter = KCallables.getInstanceParameter(kFunction);
        Intrinsics.checkNotNull(instanceParameter);
        Object objCallBy = kFunction.callBy(MapsKt.mapOf(TuplesKt.to(instanceParameter, obj), TuplesKt.to(kParameterFindParameterByName, value)));
        Intrinsics.checkNotNull(objCallBy, "null cannot be cast to non-null type MIDCLASS of com.alightcreative.lens.LensProp");
        return this.f71353t.rl(receiver, objCallBy);
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        return this.f71353t + "." + this.nr.getName();
    }
}
