package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f53716m = IAlog.a(f.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f53717n = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.i f53720c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f53722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f53723f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InneractiveAdRequest f53725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f53726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f53727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.j f53728k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f53718a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f53719b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f53721d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f53724g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f53729l = new e(this);

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", f53716m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        for (c cVar : this.f53718a) {
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f53724g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f53723f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f53694b, dVar.f53693a, "send_failed_native_creatives", dVar.f53699g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.f53726i = rVar;
        this.f53728k = jVar;
        this.f53725h = inneractiveAdRequest;
        this.f53720c = iVar;
        this.f53723f = dVar;
        this.f53727j = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws Throwable {
        boolean z2;
        s0 s0VarA;
        Iterator it;
        i iVar;
        String str;
        float f3;
        String strB;
        String strB2;
        synchronized (f53717n) {
            try {
                if (!this.f53718a.isEmpty()) {
                    Iterator it2 = this.f53718a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((c) it2.next()).a()) {
                                break;
                            }
                        } else if (this.f53719b.get() || this.f53724g.get()) {
                            break;
                        } else {
                            z2 = false;
                        }
                    }
                }
                z2 = true;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (z2) {
            return;
        }
        IAlog.c("%s : onResourceFinished", f53716m);
        InneractiveAdRequest inneractiveAdRequest = this.f53725h;
        com.fyber.inneractive.sdk.response.nativead.j jVar = this.f53728k;
        if (inneractiveAdRequest != null) {
            s0VarA = inneractiveAdRequest.getSelectedUnitConfig();
        } else {
            s0VarA = com.fyber.inneractive.sdk.config.a.a(jVar.f56861m);
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.f53726i;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.fyber.inneractive.sdk.response.nativead.i iVar2 = this.f53720c;
        String str2 = q.f53774a;
        ArrayList arrayList3 = new ArrayList();
        if (q.a(iVar2.f56906d) && (strB2 = q.b(iVar2.f56906d)) != null) {
            arrayList3.add(strB2);
        }
        ArrayList<com.fyber.inneractive.sdk.response.nativead.g> arrayList4 = iVar2.f56907e;
        if (arrayList4 != null) {
            ArrayList<String> arrayList5 = new ArrayList();
            for (com.fyber.inneractive.sdk.response.nativead.g gVar : arrayList4) {
                if (gVar != null && gVar.f56896a == 1 && gVar.f56897b == 2) {
                    arrayList5.add(gVar.f56898c);
                }
            }
            for (String str3 : arrayList5) {
                if (q.a(str3) && (strB = q.b(str3)) != null) {
                    arrayList3.add(strB);
                }
            }
        }
        arrayList2.addAll(arrayList3);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = iVar2.f56905c;
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            arrayList6.addAll(iVar2.f56905c);
        }
        ArrayList<com.fyber.inneractive.sdk.response.nativead.g> arrayList8 = iVar2.f56907e;
        if (arrayList8 != null) {
            ArrayList arrayList9 = new ArrayList();
            for (com.fyber.inneractive.sdk.response.nativead.g gVar2 : arrayList8) {
                if (gVar2 != null && gVar2.f56896a == 1 && gVar2.f56897b == 1) {
                    arrayList9.add(gVar2.f56898c);
                }
            }
            arrayList6.addAll(arrayList9);
        }
        arrayList.addAll(arrayList6);
        t0 t0Var = this.f53722e;
        ArrayList arrayList10 = this.f53721d;
        com.fyber.inneractive.sdk.response.nativead.h hVar = this.f53720c.f56904b;
        i iVar3 = (hVar == null || (TextUtils.isEmpty(hVar.f56900a) && TextUtils.isEmpty(hVar.f56902c) && hVar.f56901b.isEmpty())) ? null : new i(hVar.f56900a, hVar.f56902c, hVar.f56901b);
        if (iVar3 != null) {
            map.put(NativeAdContent.ViewTag.ROOT, iVar3);
        }
        Iterator it3 = this.f53720c.f56903a.iterator();
        Uri uri = null;
        String str4 = null;
        t0 t0Var2 = null;
        Float fA2 = null;
        Float f4 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it3.next();
            t0 t0Var3 = t0Var;
            com.fyber.inneractive.sdk.response.nativead.h hVar2 = fVar.f56895f;
            ArrayList arrayList11 = arrayList10;
            if (hVar2 == null || (TextUtils.isEmpty(hVar2.f56900a) && TextUtils.isEmpty(hVar2.f56902c) && hVar2.f56901b.isEmpty())) {
                it = it3;
                iVar = null;
            } else {
                it = it3;
                iVar = new i(hVar2.f56900a, hVar2.f56902c, hVar2.f56901b);
            }
            com.fyber.inneractive.sdk.response.nativead.d dVar = fVar.f56891b;
            if (dVar != null && !TextUtils.isEmpty(dVar.f56888a)) {
                String str7 = fVar.f56891b.f56888a;
                if (iVar != null) {
                    map.put(NativeAdContent.ViewTag.AD_TITLE, iVar);
                }
                str6 = str7;
            } else {
                com.fyber.inneractive.sdk.response.nativead.b bVar = fVar.f56894e;
                if (bVar != null && !TextUtils.isEmpty(bVar.f56886a)) {
                    String str8 = fVar.f56894e.f56886a;
                    int i2 = fVar.f56890a;
                    if (i2 == 5) {
                        str = NativeAdContent.ViewTag.AD_DESCRIPTION;
                        str5 = str8;
                    } else if (i2 != 6) {
                        if (i2 != 7) {
                            str = null;
                        } else {
                            str = NativeAdContent.ViewTag.CTA;
                            str4 = str8;
                        }
                    } else if (TextUtils.isEmpty(str8)) {
                        f3 = -1.0f;
                        if (f3 < 0.0f) {
                        }
                    } else {
                        try {
                            f3 = Float.parseFloat(str8);
                        } catch (NumberFormatException unused) {
                            f3 = -1.0f;
                        }
                        if (f3 < 0.0f) {
                            Float fValueOf = Float.valueOf(f3);
                            str = NativeAdContent.ViewTag.RATING;
                            f4 = fValueOf;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        map.put(str, iVar);
                    }
                } else {
                    Iterator it4 = arrayList11.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            g gVar3 = (g) it4.next();
                            if (gVar3 != null) {
                                int i3 = gVar3.f53730a;
                                Iterator it5 = it4;
                                if (i3 == fVar.f56890a) {
                                    if (i3 == 2) {
                                        uri2 = gVar3.f53731b;
                                        fA2 = com.fyber.inneractive.sdk.util.u.a(uri2);
                                        if (iVar != null) {
                                            map.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                        }
                                    } else if (i3 == 4) {
                                        uri = gVar3.f53731b;
                                        if (iVar != null) {
                                            map.put(NativeAdContent.ViewTag.AD_ICON, iVar);
                                        }
                                    }
                                }
                                it4 = it5;
                            }
                        } else {
                            com.fyber.inneractive.sdk.response.nativead.e eVar = fVar.f56892c;
                            if (eVar == null || TextUtils.isEmpty(eVar.f56889a) || t0Var3 == null) {
                                IAlog.c("%s : handleAsset failed: %d: ", f53716m, Integer.valueOf(fVar.f56890a));
                            } else {
                                if (iVar != null) {
                                    map.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                }
                                t0Var = t0Var3;
                                t0Var2 = t0Var;
                            }
                        }
                    }
                }
                t0Var = t0Var3;
                arrayList10 = arrayList11;
                it3 = it;
            }
            t0Var = t0Var3;
            arrayList10 = arrayList11;
            it3 = it;
        }
        w0 w0Var = new w0(s0VarA, rVar);
        w0Var.f53959g = str6;
        w0Var.f53960h = str5;
        w0Var.f53961i = str4;
        w0Var.f53962j = null;
        w0Var.f53963k = null;
        w0Var.f53964l = uri;
        w0Var.f53965m = uri2;
        w0Var.f53967o = f4;
        w0Var.f53968p = fA2;
        w0Var.f53971s = t0Var2;
        w0Var.f53972t.putAll(map);
        w0Var.f53973u = new j((i) map.get(NativeAdContent.ViewTag.ROOT));
        w0Var.f53975w.addAll(arrayList);
        w0Var.f53976x.addAll(arrayList2);
        map.clear();
        this.f53719b.set(true);
        w0Var.f53978b = this.f53728k;
        d dVar2 = this.f53723f;
        dVar2.f53695c = w0Var;
        dVar2.f();
    }
}
