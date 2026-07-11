package HI0;

import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.full.KClasses;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class iF {
    public static final Object n(Object obj, Map fields) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(fields, "fields");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
        boolean z2 = false;
        Object obj2 = null;
        for (Object obj3 : KClasses.getDeclaredMemberFunctions(orCreateKotlinClass)) {
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
        ArrayList arrayList = new ArrayList(fields.size());
        for (Map.Entry entry : fields.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            boolean z3 = false;
            Object obj4 = null;
            for (Object obj5 : kFunction.getParameters()) {
                if (Intrinsics.areEqual(((KParameter) obj5).getName(), str)) {
                    if (z3) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z3 = true;
                    obj4 = obj5;
                }
            }
            if (!z3) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            arrayList.add(TuplesKt.to(obj4, value));
        }
        Map map = MapsKt.toMap(arrayList);
        KParameter instanceParameter = KCallables.getInstanceParameter(kFunction);
        Intrinsics.checkNotNull(instanceParameter);
        Object objCallBy = kFunction.callBy(MapsKt.plus(map, TuplesKt.to(instanceParameter, obj)));
        orCreateKotlinClass.isInstance(objCallBy);
        Intrinsics.checkNotNull(objCallBy, "null cannot be cast to non-null type T of com.alightcreative.ext.ReflectionExtKt.copyWith");
        return objCallBy;
    }
}
