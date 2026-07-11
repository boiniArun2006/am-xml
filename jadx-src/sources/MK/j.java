package MK;

import Pb7.Dsr;
import Pb7.I28;
import Pb7.Ml;
import Pb7.Pl;
import Pb7.aC;
import Pb7.fuX;
import Pb7.o;
import Pb7.qz;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.KTypesJvm;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean t(Object obj) {
        Collection collectionValues;
        Iterator it;
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Collection)) {
                return (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof Float);
            }
            Iterable iterable = (Iterable) obj;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!t(it2.next())) {
                    return false;
                }
            }
            return true;
        }
        Map map = (Map) obj;
        Set setKeySet = map.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            collectionValues = map.values();
            if (collectionValues instanceof Collection) {
            }
            it = collectionValues.iterator();
            while (it.hasNext()) {
            }
            return true;
        }
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            if (!(it3.next() instanceof String)) {
                break;
            }
        }
        collectionValues = map.values();
        if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!t(it.next())) {
                }
            }
        }
        return true;
        return false;
    }

    public static final V8Value J2(Object obj, V8Runtime runtime) throws JavetException {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        if (obj == null) {
            V8ValueNull v8ValueNullCreateV8ValueNull = runtime.createV8ValueNull();
            Intrinsics.checkNotNullExpressionValue(v8ValueNullCreateV8ValueNull, "createV8ValueNull(...)");
            return v8ValueNullCreateV8ValueNull;
        }
        if (t(obj)) {
            V8Value v8Value = runtime.getConverter().toV8Value(runtime, obj);
            Intrinsics.checkNotNullExpressionValue(v8Value, "toV8Value(...)");
            return v8Value;
        }
        if (obj instanceof Collection) {
            V8ValueArray v8ValueArrayCreateV8ValueArray = runtime.createV8ValueArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                v8ValueArrayCreateV8ValueArray.push(J2(it.next(), runtime));
            }
            Intrinsics.checkNotNullExpressionValue(v8ValueArrayCreateV8ValueArray, "also(...)");
            return v8ValueArrayCreateV8ValueArray;
        }
        if (obj instanceof Map) {
            V8ValueObject v8ValueObjectCreateV8ValueObject = runtime.createV8ValueObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                v8ValueObjectCreateV8ValueObject.setProperty(String.valueOf(entry.getKey()), J2(entry.getValue(), runtime));
            }
            Intrinsics.checkNotNullExpressionValue(v8ValueObjectCreateV8ValueObject, "also(...)");
            return v8ValueObjectCreateV8ValueObject;
        }
        V8ValueObject v8ValueObjectCreateV8ValueObject2 = runtime.createV8ValueObject();
        Iterator<T> it2 = KClasses.getDeclaredMembers(Reflection.getOrCreateKotlinClass(obj.getClass())).iterator();
        while (it2.hasNext()) {
            KCallable kCallable = (KCallable) it2.next();
            if (kCallable instanceof KProperty) {
                KProperty kProperty = (KProperty) kCallable;
                if (kProperty.getVisibility() == KVisibility.PUBLIC) {
                    v8ValueObjectCreateV8ValueObject2.setProperty(kProperty.getName(), J2(kProperty.getGetter().call(obj), runtime));
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(v8ValueObjectCreateV8ValueObject2, "also(...)");
        return v8ValueObjectCreateV8ValueObject2;
    }

    public static final Object O(V8Value v8Value, KType type) throws Throwable {
        Object objN;
        Intrinsics.checkNotNullParameter(v8Value, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (v8Value instanceof V8ValueInteger) {
            objN = ((V8ValueInteger) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(objN, "getValue(...)");
        } else if (v8Value instanceof V8ValueBoolean) {
            objN = ((V8ValueBoolean) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(objN, "getValue(...)");
        } else if (v8Value instanceof V8ValueString) {
            objN = ((V8ValueString) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(objN, "getValue(...)");
        } else if (v8Value instanceof V8ValueDouble) {
            objN = ((V8ValueDouble) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(objN, "getValue(...)");
        } else if (v8Value instanceof V8ValueFunction) {
            objN = new Dsr((V8ValueFunction) v8Value);
        } else if (v8Value instanceof V8ValueArray) {
            objN = rl((V8ValueArray) v8Value, type);
        } else {
            if (!(v8Value instanceof V8ValueObject)) {
                if ((v8Value instanceof V8ValueUndefined) || (v8Value instanceof V8ValueNull)) {
                    return null;
                }
                throw new IllegalStateException(("Unsupported V8Value type " + v8Value.getClass().getName() + ")").toString());
            }
            objN = n((V8ValueObject) v8Value, type);
        }
        if (KClasses.isSubclassOf(Reflection.getOrCreateKotlinClass(objN.getClass()), KTypesJvm.getJvmErasure(type))) {
            return objN;
        }
        throw new IllegalStateException(("Cannot convert argument of type " + Reflection.getOrCreateKotlinClass(v8Value.getClass()) + " to " + type).toString());
    }

    public static final Pl nr(V8Value v8Value) {
        Intrinsics.checkNotNullParameter(v8Value, "<this>");
        if (v8Value instanceof V8ValueInteger) {
            Integer value = ((V8ValueInteger) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return aC.n(aC.rl(value.intValue()));
        }
        if (v8Value instanceof V8ValueBoolean) {
            Boolean value2 = ((V8ValueBoolean) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            return Ml.n(Ml.rl(value2.booleanValue()));
        }
        if (v8Value instanceof V8ValueString) {
            String value3 = ((V8ValueString) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            return o.n(o.rl(value3));
        }
        if (v8Value instanceof V8ValueDouble) {
            Double value4 = ((V8ValueDouble) v8Value).getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            return fuX.n(fuX.rl(value4.doubleValue()));
        }
        if (v8Value instanceof V8ValueFunction) {
            return new Dsr((V8ValueFunction) v8Value);
        }
        if (v8Value instanceof V8ValueArray) {
            return Pb7.j.f7708n.n((V8ValueArray) v8Value);
        }
        if (v8Value instanceof V8ValueObject) {
            return I28.f7704n.n((V8ValueObject) v8Value);
        }
        if ((v8Value instanceof V8ValueUndefined) || (v8Value instanceof V8ValueNull)) {
            return qz.f7710n;
        }
        throw new IllegalStateException(("Cannot convert argument " + v8Value.getClass().getName() + " to any known CrisperValue").toString());
    }

    private static final Object n(V8ValueObject v8ValueObject, KType kType) throws Throwable {
        if (Intrinsics.areEqual(KTypesJvm.getJvmErasure(kType), Reflection.getOrCreateKotlinClass(Map.class))) {
            List<KTypeProjection> arguments = kType.getArguments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                KType type = ((KTypeProjection) it.next()).getType();
                if (type == null) {
                    type = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Object.class), null, false, null, 7, null);
                }
                arrayList.add(type);
            }
            KType kType2 = (KType) arrayList.get(0);
            KType kType3 = (KType) arrayList.get(1);
            if (Intrinsics.areEqual(KTypesJvm.getJvmErasure(kType2), Reflection.getOrCreateKotlinClass(String.class))) {
                List<String> ownPropertyNameStrings = v8ValueObject.getOwnPropertyNameStrings();
                Intrinsics.checkNotNullExpressionValue(ownPropertyNameStrings, "getOwnPropertyNameStrings(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(ownPropertyNameStrings, 10)), 16));
                for (Object obj : ownPropertyNameStrings) {
                    V8Value property = v8ValueObject.getProperty((String) obj);
                    Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
                    linkedHashMap.put(obj, O(property, kType3));
                }
                return linkedHashMap;
            }
            throw new IllegalStateException("Input parameter with Map type must have String keys");
        }
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(KTypesJvm.getJvmErasure(kType));
        if (primaryConstructor != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (KParameter kParameter : primaryConstructor.getParameters()) {
                V8Value property2 = v8ValueObject.getProperty(kParameter.getName());
                if (property2 != null && !(property2 instanceof V8ValueUndefined)) {
                    linkedHashMap2.put(kParameter, O(property2, kParameter.getType()));
                } else if (!kParameter.isOptional()) {
                    throw new IllegalStateException(("Cannot convert object to " + kType + ": missing required parameter " + kParameter.getName()).toString());
                }
            }
            return primaryConstructor.callBy(linkedHashMap2);
        }
        throw new IllegalStateException(("Cannot convert object to " + kType + ": no primary constructor").toString());
    }

    private static final Collection rl(V8ValueArray v8ValueArray, KType kType) throws JavetException {
        if (KClasses.isSubclassOf(KTypesJvm.getJvmErasure(kType), Reflection.getOrCreateKotlinClass(Collection.class))) {
            KType type = ((KTypeProjection) CollectionsKt.first((List) kType.getArguments())).getType();
            Intrinsics.checkNotNull(type);
            V8Value[] array = v8ValueArray.toArray();
            Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
            ArrayList arrayList = new ArrayList(array.length);
            for (V8Value v8Value : array) {
                Intrinsics.checkNotNull(v8Value);
                arrayList.add(O(v8Value, type));
            }
            if (KClasses.isSuperclassOf(KTypesJvm.getJvmErasure(kType), Reflection.getOrCreateKotlinClass(List.class))) {
                return arrayList;
            }
            if (KClasses.isSuperclassOf(KTypesJvm.getJvmErasure(kType), Reflection.getOrCreateKotlinClass(Set.class))) {
                return CollectionsKt.toSet(arrayList);
            }
            throw new IllegalStateException(("Cannot convert argument of type " + Reflection.getOrCreateKotlinClass(v8ValueArray.getClass()) + " to " + kType + ": unsupported collection").toString());
        }
        throw new IllegalStateException(("Cannot convert argument " + Reflection.getOrCreateKotlinClass(v8ValueArray.getClass()) + " to " + kType + ": not a collection").toString());
    }
}
