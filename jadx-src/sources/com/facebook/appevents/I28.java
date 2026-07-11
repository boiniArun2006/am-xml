package com.facebook.appevents;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f52265n = new HashMap();

    private final synchronized psW O(j jVar) {
        Context contextQie;
        com.facebook.internal.j jVarO;
        psW psw = (psW) this.f52265n.get(jVar);
        if (psw == null && (jVarO = com.facebook.internal.j.J2.O((contextQie = com.facebook.s4.qie()))) != null) {
            psw = new psW(jVarO, Xo.rl.t(contextQie));
        }
        if (psw == null) {
            return null;
        }
        this.f52265n.put(jVar, psw);
        return psw;
    }

    public final synchronized Set J2() {
        Set setKeySet;
        setKeySet = this.f52265n.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "stateMap.keys");
        return setKeySet;
    }

    public final synchronized void n(j accessTokenAppIdPair, Ml appEvent) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        psW pswO = O(accessTokenAppIdPair);
        if (pswO != null) {
            pswO.n(appEvent);
        }
    }

    public final synchronized int nr() {
        int iT;
        Iterator it = this.f52265n.values().iterator();
        iT = 0;
        while (it.hasNext()) {
            iT += ((psW) it.next()).t();
        }
        return iT;
    }

    public final synchronized void rl(K k2) {
        if (k2 == null) {
            return;
        }
        for (Map.Entry entry : k2.rl()) {
            psW pswO = O((j) entry.getKey());
            if (pswO != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    pswO.n((Ml) it.next());
                }
            }
        }
    }

    public final synchronized psW t(j accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (psW) this.f52265n.get(accessTokenAppIdPair);
    }
}
