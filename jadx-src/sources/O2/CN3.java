package O2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f7241n;

    private CN3() {
        this.f7241n = null;
    }

    public static CN3 O(Object obj) {
        return new CN3(obj);
    }

    public static CN3 n() {
        return new CN3();
    }

    public static CN3 rl(Object obj) {
        return obj == null ? n() : O(obj);
    }

    public boolean nr() {
        return this.f7241n != null;
    }

    public Object t() {
        Object obj = this.f7241n;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    private CN3(Object obj) {
        if (obj != null) {
            this.f7241n = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
