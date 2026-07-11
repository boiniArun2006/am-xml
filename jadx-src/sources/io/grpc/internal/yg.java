package io.grpc.internal;

import com.safedk.android.analytics.brandsafety.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class yg {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f68823n = new ArrayList();

    public yg n(Object obj) {
        this.f68823n.add(String.valueOf(obj));
        return this;
    }

    public yg rl(String str, Object obj) {
        this.f68823n.add(str + l.ae + obj);
        return this;
    }

    public String toString() {
        return this.f68823n.toString();
    }
}
