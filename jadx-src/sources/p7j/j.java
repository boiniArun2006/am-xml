package p7j;

import j9J.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j {
    public static Object n(Object obj, Class cls) {
        if (obj instanceof j9J.j) {
            return cls.cast(obj);
        }
        if (obj instanceof n) {
            return n(((n) obj).Z(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), j9J.j.class, n.class));
    }
}
