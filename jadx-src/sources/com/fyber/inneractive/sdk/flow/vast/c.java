package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.q;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.model.vast.t;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.model.vast.w;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.player.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53940b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53941c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53942d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53943e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53944f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f53945g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f53946h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f53947i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f53948j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f53949k = new ArrayList();

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i2) throws b {
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        ArrayList<String> arrayList = hVar.f54150h;
        if (arrayList.size() > 0) {
            for (String str : arrayList) {
                if (!h0.f(str)) {
                    throw new b("Found non-secure click tracking url for companion. url: " + str, 0);
                }
            }
            if (i2 > 0) {
                this.f53947i.add(hVar);
            }
        }
        String str2 = hVar.f54149g;
        if (!h0.f(str2)) {
            throw new b("Found non-secure click through url: " + str2, 0);
        }
        if (!hVar.a()) {
            if (this.f53948j.contains(hVar)) {
                return;
            }
            this.f53948j.add(hVar);
            return;
        }
        Integer num = hVar.f54143a;
        Integer num2 = hVar.f54144b;
        if (num == null || num2 == null || num.intValue() < 100 || num2.intValue() < 100) {
            throw new b("Incompatible size: " + num + "," + num2, 16);
        }
        ArrayList<w> arrayList2 = hVar.f54152j;
        for (w wVar : arrayList2) {
            if (!h0.f(wVar.f54187b)) {
                throw new b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        String str3 = hVar.f54145c;
        l lVar = hVar.f54146d;
        if (lVar != null) {
            k kVarA = k.a(lVar.f54154a);
            if (kVarA == null) {
                throw new b("Found invalid creative type: " + lVar.f54154a, 32);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i2, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, lVar.f54155b, kVarA);
        }
        String str4 = hVar.f54147e;
        if (!TextUtils.isEmpty(str4)) {
            if (!h0.f(str4)) {
                throw new b("Found non-secure iframe url: " + str4, 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i2, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str4, null);
        }
        String str5 = hVar.f54148f;
        if (TextUtils.isEmpty(str5)) {
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            a(bVar2, com.fyber.inneractive.sdk.model.vast.i.Html, i2, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str5, null);
        }
        bVar2.f54109g.size();
    }

    public c(boolean z2) {
        this.f53939a = true;
        this.f53939a = z2;
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, List list, String str) {
        int iE = o.e();
        int iD = o.d();
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar != null && fVar.f54134c != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new g(this.f53942d, iE, iD), new d(iE, iD));
            bVar.f54103a = str;
            ArrayList arrayList = fVar.f54134c.f54137c;
            if (arrayList != null) {
                List list2 = list;
                if (!arrayList.isEmpty()) {
                    if (list == null) {
                        list2 = list;
                        if (fVar.f54133b != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(fVar);
                            list2 = arrayList2;
                        }
                    }
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).f54133b;
                            if (a0Var != null) {
                                a(bVar, a0Var);
                            }
                        }
                    }
                    a(bVar, fVar.f54134c);
                    if (bVar.f54106d.size() == 0) {
                        if (this.f53945g.isEmpty()) {
                            throw new h("ErrorNoMediaFiles", "No media files exist after merge");
                        }
                        throw new h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                    }
                    ArrayList<com.fyber.inneractive.sdk.model.vast.c> arrayList3 = new ArrayList(bVar.f54109g);
                    Collections.sort(arrayList3, bVar.f54110h);
                    if (!arrayList3.isEmpty()) {
                        for (com.fyber.inneractive.sdk.model.vast.h hVar : this.f53948j) {
                            if (!hVar.a()) {
                                for (com.fyber.inneractive.sdk.model.vast.c cVar : arrayList3) {
                                    ArrayList arrayList4 = hVar.f54150h;
                                    if (arrayList4 != null) {
                                        Iterator it2 = arrayList4.iterator();
                                        while (it2.hasNext()) {
                                            cVar.a(x.EVENT_CLICK, (String) it2.next());
                                        }
                                    }
                                    String str2 = hVar.f54149g;
                                    if (TextUtils.isEmpty(cVar.f54125g)) {
                                        cVar.f54125g = str2;
                                    }
                                    ArrayList<w> arrayList5 = hVar.f54152j;
                                    if (arrayList5 != null) {
                                        for (w wVar : arrayList5) {
                                            x xVarA = x.a(wVar.f54186a);
                                            String str3 = wVar.f54187b;
                                            if (xVarA != null && str3 != null) {
                                                cVar.a(xVarA, str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i2 = 0;
                    if (IAlog.f56974a == 2) {
                        IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                        Iterator it3 = new ArrayList(bVar.f54106d).iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i3), (r) it3.next());
                            i3++;
                        }
                    }
                    if (IAlog.f56974a == 2) {
                        IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                        ArrayList arrayList6 = new ArrayList(bVar.f54109g);
                        Collections.sort(arrayList6, bVar.f54110h);
                        if (arrayList6.size() > 0) {
                            Iterator it4 = arrayList6.iterator();
                            while (it4.hasNext()) {
                                IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((com.fyber.inneractive.sdk.model.vast.c) it4.next()).a());
                                i2++;
                            }
                        } else {
                            IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                        }
                    }
                    return bVar;
                }
            }
            throw new h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new h("ErrorNoMediaFiles", "Empty inline ad found");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.g gVar) {
        String[] strArrSplit;
        f fVar;
        Integer num;
        HashMap map;
        List list;
        IAlog.a("%sprocessing ad element: %s", "VastProcessor: ", gVar);
        ArrayList<String> arrayList = gVar.f54136b;
        if (arrayList != null) {
            for (String str : arrayList) {
                IAlog.a("%sadding impression url: %s", "VastProcessor: ", str);
                x xVar = x.EVENT_IMPRESSION;
                if (h0.f(str)) {
                    bVar.a(xVar, str);
                } else {
                    throw new h("VastErrorUnsecure", "found unsecure tracking event: " + xVar.a());
                }
            }
        }
        String str2 = gVar.f54135a;
        if (!TextUtils.isEmpty(str2)) {
            IAlog.a("%sadding error url: %s", "VastProcessor: ", str2);
            bVar.a(x.EVENT_ERROR, str2);
        }
        if (IAConfigManager.f53260M.f53271I != null) {
            for (com.fyber.inneractive.sdk.measurement.h hVar : gVar.f54138d) {
                if (hVar.b()) {
                    bVar.f54107e.add(hVar);
                } else {
                    x xVar2 = x.EVENT_VERIFICATION_NOT_EXECUTED;
                    if (((xVar2 == null || (map = hVar.f54056c) == null || (list = (List) map.get(xVar2)) == null) ? 0 : list.size()) > 0) {
                        n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar2), com.fyber.inneractive.sdk.measurement.i.VERIFICATION_NOT_SUPPORTED), xVar2);
                    }
                    this.f53949k.add(hVar);
                }
            }
        }
        for (m mVar : gVar.f54137c) {
            q qVar = mVar.f54156a;
            if (qVar != null) {
                ArrayList<r> arrayList2 = qVar.f54163a;
                if (arrayList2 != null) {
                    bVar.f54112j = arrayList2.size();
                    for (r rVar : arrayList2) {
                        String str3 = rVar.f54168a;
                        s sVar = s.progressive;
                        if (!str3.equals(sVar.a())) {
                            fVar = new f(e.UNSUPPORTED_DELIVERY, sVar.a());
                        } else if (this.f53941c > -1 && (num = rVar.f54172e) != null && num.intValue() != 0) {
                            int iIntValue = rVar.f54172e.intValue();
                            int i2 = this.f53940b;
                            if (iIntValue < i2) {
                                fVar = new f(e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i2));
                            } else {
                                int iIntValue2 = rVar.f54172e.intValue();
                                int i3 = this.f53941c;
                                if (iIntValue2 > i3) {
                                    fVar = new f(e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i3));
                                }
                            }
                        } else if (t.a(rVar.f54171d) != t.UNKNOWN) {
                            if (this.f53943e && rVar.f54169b.intValue() >= rVar.f54170c.intValue()) {
                                fVar = new f(e.VERTICAL_VIDEO_EXPECTED);
                            } else {
                                String str4 = rVar.f54173f;
                                if (str4 != null && this.f53944f && str4.equalsIgnoreCase("VPAID")) {
                                    fVar = new f(e.FILTERED_BY_APP_OR_UNIT);
                                } else if (TextUtils.isEmpty(rVar.f54174g)) {
                                    fVar = new f(e.NO_CONTENT);
                                } else {
                                    fVar = !h0.f(rVar.f54174g) ? new f(e.UNSECURED_VIDEO_URL) : null;
                                }
                            }
                        } else {
                            fVar = new f(e.UNSUPPORTED_MIME_TYPE);
                        }
                        if (fVar != null) {
                            IAlog.a("%smedia file filtered!: %s", "VastProcessor: ", rVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", rVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", fVar);
                            this.f53945g.put(rVar, fVar);
                        } else {
                            IAlog.a("%sadding media file: %s", "VastProcessor: ", rVar);
                            bVar.f54106d.add(rVar);
                            bVar.f54113k.add(rVar);
                            bVar.f54111i++;
                        }
                    }
                }
                ArrayList<String> arrayList3 = qVar.f54166d;
                if (arrayList3 != null) {
                    for (String str5 : arrayList3) {
                        x xVar3 = x.EVENT_CLICK;
                        if (h0.f(str5)) {
                            bVar.a(xVar3, str5);
                        } else {
                            throw new h("VastErrorUnsecure", "found unsecure tracking event: " + xVar3.a());
                        }
                    }
                }
                ArrayList<w> arrayList4 = qVar.f54164b;
                if (arrayList4 != null) {
                    for (w wVar : arrayList4) {
                        x xVarA = x.a(wVar.f54186a);
                        if (xVarA != x.UNKNOWN) {
                            bVar.a(xVarA, wVar.f54187b);
                        }
                        if (xVarA == x.EVENT_PROGRESS) {
                            String str6 = wVar.f54187b;
                            String str7 = wVar.f54188c;
                            com.fyber.inneractive.sdk.model.vast.e eVar = new com.fyber.inneractive.sdk.model.vast.e(str6, str7);
                            if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7) && eVar.f54131d != 0) {
                                bVar.f54115m.add(eVar);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(qVar.f54165c)) {
                    bVar.f54104b = qVar.f54165c;
                }
                String str8 = qVar.f54167e;
                if (!TextUtils.isEmpty(str8) && (strArrSplit = str8.split(":")) != null && strArrSplit.length <= 3) {
                    if (strArrSplit.length == 1) {
                        try {
                            Integer.parseInt(str8);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (strArrSplit.length == 2) {
                        Integer.parseInt(strArrSplit[1]);
                        Integer.parseInt(strArrSplit[0]);
                    } else {
                        Integer.parseInt(strArrSplit[2]);
                        Integer.parseInt(strArrSplit[1]);
                        Integer.parseInt(strArrSplit[0]);
                    }
                }
            }
            if (this.f53939a) {
                com.fyber.inneractive.sdk.model.vast.o oVar = gVar.f54139e;
                if (oVar != null) {
                    bVar.f54108f = oVar;
                }
                v vVar = gVar.f54141g;
                if (vVar != null) {
                    bVar.f54118p = vVar;
                }
                com.fyber.inneractive.sdk.model.vast.j jVar = mVar.f54157b;
                ArrayList<com.fyber.inneractive.sdk.model.vast.h> arrayList5 = jVar == null ? null : jVar.f54153a;
                if (arrayList5 != null) {
                    for (com.fyber.inneractive.sdk.model.vast.h hVar2 : arrayList5) {
                        try {
                            a(bVar, hVar2, gVar.f54140f);
                        } catch (b e2) {
                            IAlog.a("Failed processing companion ad: %s error = %s", hVar2, e2.getMessage());
                            hVar2.f54151i = e2;
                            this.f53946h.add(hVar2);
                        }
                    }
                }
                ArrayList arrayList6 = gVar.f54142h;
                String str9 = !arrayList6.isEmpty() ? ((com.fyber.inneractive.sdk.model.vast.n) arrayList6.get(0)).f54158a : null;
                if (!TextUtils.isEmpty(str9)) {
                    bVar.f54116n = str9;
                }
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public final void a(com.fyber.inneractive.sdk.model.vast.b r7, com.fyber.inneractive.sdk.model.vast.i r8, int r9, int r10, int r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.List r15, java.lang.String r16, com.fyber.inneractive.sdk.model.vast.k r17) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.vast.c.a(com.fyber.inneractive.sdk.model.vast.b, com.fyber.inneractive.sdk.model.vast.i, int, int, int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.fyber.inneractive.sdk.model.vast.k):void");
    }
}
