package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54104b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue f54106d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f54108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PriorityQueue f54109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f54110h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.k f54117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f54118p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f54107e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54111i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54112j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f54113k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f54114l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f54115m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f54116n = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f54105c = new HashMap();

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f54105c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.f54106d = new PriorityQueue(1, gVar);
        this.f54110h = dVar;
        this.f54109g = new PriorityQueue(1, dVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f54105c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f54105c.put(xVar, arrayList);
        }
        arrayList.add(str);
    }
}
