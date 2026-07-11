package Du;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class ci implements c7r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f2009n;
    private final ConcurrentHashMap rl;

    public ci(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f2009n = compute;
        this.rl = new ConcurrentHashMap();
    }

    @Override // Du.c7r
    public Object n(KClass key, List types) {
        Object objM313constructorimpl;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap = this.rl;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object xuvVar = concurrentHashMap.get(javaClass);
        if (xuvVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (xuvVar = new xuv()))) != null) {
            xuvVar = objPutIfAbsent;
        }
        xuv xuvVar2 = (xuv) xuvVar;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new pO((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = xuvVar2.f2054n;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl((XA.Ml) this.f2009n.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM312boximpl = Result.m312boximpl(objM313constructorimpl);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, resultM312boximpl);
            obj = objPutIfAbsent2 == null ? resultM312boximpl : objPutIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).getValue();
    }
}
