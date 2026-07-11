package Mms;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f6721n = SPz.n(16);

    public static final class j {
    }

    public final Object n(EJn.Wre descriptor, j key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f6721n.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object rl(EJn.Wre descriptor, j key, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object objN = n(descriptor, key);
        if (objN != null) {
            return objN;
        }
        Object objInvoke = defaultValue.invoke();
        t(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void t(EJn.Wre descriptor, j key, Object value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map map = this.f6721n;
        Object objN = map.get(descriptor);
        if (objN == null) {
            objN = SPz.n(2);
            map.put(descriptor, objN);
        }
        ((Map) objN).put(key, value);
    }
}
