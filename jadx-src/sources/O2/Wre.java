package O2;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre {
    private static final yMa.j rl = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bundle f7252n;

    public Wre() {
        this(new Bundle());
    }

    public Wre(Bundle bundle) {
        this.f7252n = (Bundle) bundle.clone();
    }

    public boolean n(String str) {
        return str != null && this.f7252n.containsKey(str);
    }

    private CN3 nr(String str) {
        if (!n(str)) {
            return CN3.n();
        }
        try {
            return CN3.rl((Integer) this.f7252n.get(str));
        } catch (ClassCastException e2) {
            rl.rl("Metadata key %s contains type other than int: %s", str, e2.getMessage());
            return CN3.n();
        }
    }

    public CN3 O(String str) {
        if (nr(str).nr()) {
            return CN3.O(Long.valueOf(((Integer) r3.t()).intValue()));
        }
        return CN3.n();
    }

    public CN3 rl(String str) {
        if (!n(str)) {
            return CN3.n();
        }
        try {
            return CN3.rl((Boolean) this.f7252n.get(str));
        } catch (ClassCastException e2) {
            rl.rl("Metadata key %s contains type other than boolean: %s", str, e2.getMessage());
            return CN3.n();
        }
    }

    public CN3 t(String str) {
        if (!n(str)) {
            return CN3.n();
        }
        Object obj = this.f7252n.get(str);
        if (obj == null) {
            return CN3.n();
        }
        if (obj instanceof Float) {
            return CN3.O(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return CN3.O((Double) obj);
        }
        rl.rl("Metadata key %s contains type other than double: %s", str);
        return CN3.n();
    }
}
