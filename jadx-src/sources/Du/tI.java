package Du;

import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class tI {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f2052n = AbstractC1341t.xMQ();

    public static final EJn.Wre n(String serialName, EJn.I28 kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        t(serialName);
        return new lS(serialName, kind);
    }

    public static final XA.Ml rl(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, YjqZUJsVmhcjko.BCKIRWMYLKYXUBu);
        return (XA.Ml) f2052n.get(kClass);
    }

    public static final void t(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (XA.Ml ml : f2052n.values()) {
            if (Intrinsics.areEqual(serialName, ml.getDescriptor().KN())) {
                throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + Reflection.getOrCreateKotlinClass(ml.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
