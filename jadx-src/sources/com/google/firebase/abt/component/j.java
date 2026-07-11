package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import oSp.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f60051n = new HashMap();
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f60052t;

    public synchronized ED.n rl(String str) {
        try {
            if (!this.f60051n.containsKey(str)) {
                this.f60051n.put(str, n(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ED.n) this.f60051n.get(str);
    }

    protected ED.n n(String str) {
        return new ED.n(this.rl, this.f60052t, str);
    }

    protected j(Context context, n nVar) {
        this.rl = context;
        this.f60052t = nVar;
    }
}
