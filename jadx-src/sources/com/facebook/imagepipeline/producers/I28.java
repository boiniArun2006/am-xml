package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ln.InterfaceC2265c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class I28 implements mz {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Set f52472N = Hh.fuX.rl("id", "uri_source");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f52473v = new Object();
    private boolean E2;
    private final InterfaceC1866p J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f52474O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f52475S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final InterfaceC2265c f52476T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final List f52477X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Map f52478Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52479e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private dX.Wre f52480g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.facebook.imagepipeline.request.j f52481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j.w6 f52482o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f52483r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f52484t;

    public I28(com.facebook.imagepipeline.request.j jVar, String str, InterfaceC1866p interfaceC1866p, Object obj, j.w6 w6Var, boolean z2, boolean z3, dX.Wre wre, InterfaceC2265c interfaceC2265c) {
        this(jVar, str, null, null, interfaceC1866p, obj, w6Var, z2, z3, wre, interfaceC2265c);
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public synchronized boolean a() {
        return this.f52475S;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public synchronized dX.Wre eF() {
        return this.f52480g;
    }

    public synchronized List gh(boolean z2) {
        if (z2 == this.f52475S) {
            return null;
        }
        this.f52475S = z2;
        return new ArrayList(this.f52477X);
    }

    public synchronized List mUb(boolean z2) {
        if (z2 == this.E2) {
            return null;
        }
        this.E2 = z2;
        return new ArrayList(this.f52477X);
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public synchronized boolean p5() {
        return this.E2;
    }

    public synchronized List qie(dX.Wre wre) {
        if (wre == this.f52480g) {
            return null;
        }
        this.f52480g = wre;
        return new ArrayList(this.f52477X);
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public void rl(OU ou2) {
        boolean z2;
        synchronized (this) {
            this.f52477X.add(ou2);
            z2 = this.f52479e;
        }
        if (z2) {
            ou2.rl();
        }
    }

    public synchronized List xMQ() {
        if (this.f52479e) {
            return null;
        }
        this.f52479e = true;
        return new ArrayList(this.f52477X);
    }

    public I28(com.facebook.imagepipeline.request.j jVar, String str, String str2, Map map, InterfaceC1866p interfaceC1866p, Object obj, j.w6 w6Var, boolean z2, boolean z3, dX.Wre wre, InterfaceC2265c interfaceC2265c) {
        this.f52481n = jVar;
        this.f52484t = str;
        HashMap map2 = new HashMap();
        this.f52478Z = map2;
        map2.put("id", str);
        map2.put("uri_source", jVar == null ? "null-request" : jVar.WPU());
        FX(map);
        this.f52474O = str2;
        this.J2 = interfaceC1866p;
        this.f52483r = obj == null ? f52473v : obj;
        this.f52482o = w6Var;
        this.f52475S = z2;
        this.f52480g = wre;
        this.E2 = z3;
        this.f52479e = false;
        this.f52477X = new ArrayList();
        this.f52476T = interfaceC2265c;
    }

    public static void J2(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((OU) it.next()).t();
        }
    }

    public static void O(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((OU) it.next()).nr();
        }
    }

    public static void nr(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((OU) it.next()).n();
        }
    }

    public static void t(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((OU) it.next()).rl();
        }
    }

    @Override // hVe.j
    public void FX(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            jB((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public com.facebook.imagepipeline.request.j M() {
        return this.f52481n;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public InterfaceC1866p M7() {
        return this.J2;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public j.w6 Mx() {
        return this.f52482o;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public String T() {
        return this.f52474O;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public void U(String str) {
        Z(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public InterfaceC2265c Uo() {
        return this.f52476T;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public void Z(String str, String str2) {
        this.f52478Z.put("origin", str);
        this.f52478Z.put("origin_sub", str2);
    }

    @Override // hVe.j
    public Map getExtras() {
        return this.f52478Z;
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public String getId() {
        return this.f52484t;
    }

    @Override // hVe.j
    public void jB(String str, Object obj) {
        if (f52472N.contains(str)) {
            return;
        }
        this.f52478Z.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.mz
    public Object n() {
        return this.f52483r;
    }

    @Override // hVe.j
    public Object z(String str) {
        return this.f52478Z.get(str);
    }

    public void KN() {
        t(xMQ());
    }
}
