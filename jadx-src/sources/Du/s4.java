package Du;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class s4 implements c7r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f2049n;
    private final UGc rl;

    public static final class j implements Function0 {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new xuv();
        }
    }

    public s4(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f2049n = compute;
        this.rl = new UGc();
    }

    @Override // Du.c7r
    public Object n(KClass key, List types) {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj = this.rl.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        M5 m5 = (M5) obj;
        Object objN = m5.f1970n.get();
        if (objN == null) {
            objN = m5.n(new j());
        }
        xuv xuvVar = (xuv) objN;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new pO((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = xuvVar.f2054n;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl((XA.Ml) this.f2049n.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM312boximpl = Result.m312boximpl(objM313constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM312boximpl);
            obj2 = objPutIfAbsent == null ? resultM312boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).getValue();
    }
}
