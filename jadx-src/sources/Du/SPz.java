package Du;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class SPz implements Pp {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f1990n;
    private final ConcurrentHashMap rl;

    public SPz(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f1990n = compute;
        this.rl = new ConcurrentHashMap();
    }

    @Override // Du.Pp
    public XA.Ml n(KClass key) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.rl;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object qzVar = concurrentHashMap.get(javaClass);
        if (qzVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (qzVar = new qz((XA.Ml) this.f1990n.invoke(key))))) != null) {
            qzVar = objPutIfAbsent;
        }
        return ((qz) qzVar).f2047n;
    }
}
