package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.s;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.sdk.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f53379a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f53380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f53381c;

    public static r a() {
        int i2 = com.fyber.inneractive.sdk.config.k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z2 = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.f53260M.f53299y.f53346a = l.a(new JSONObject(property));
                z2 = true;
            } catch (Exception unused) {
                IAlog.a("failed parsing local features json", new Object[0]);
            }
        }
        r rVar = new r();
        if (z2) {
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            iAConfigManager.f53273K.a(true, "");
            iAConfigManager.f53266D.a(iAConfigManager.f53273K);
        }
        return rVar;
    }

    public final JSONArray b() {
        JSONArray jSONArray = this.f53381c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray jSONArrayA = g.a(this.f53380b, false);
            this.f53381c = jSONArrayA;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
        }
        return this.f53381c;
    }

    public r() {
        HashMap map = new HashMap();
        map.put(v.class, new v());
        map.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        map.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        map.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        map.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        map.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        map.put(s.class, new s());
        map.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        map.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        map.put(com.fyber.inneractive.sdk.config.global.features.o.class, new com.fyber.inneractive.sdk.config.global.features.o());
        map.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        map.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        map.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        map.put(com.fyber.inneractive.sdk.config.global.features.h.class, new com.fyber.inneractive.sdk.config.global.features.h());
        map.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        map.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        this.f53380b = map;
        this.f53381c = null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.i) entry.getValue()).b());
        }
        this.f53380b = map2;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", map2);
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.f53380b.values()) {
            iVar.getClass();
            ArrayList arrayList = new ArrayList(iVar.f53362c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                ArrayList arrayList2 = bVar.f53351d;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d dVar = (d) it.next();
                        if (dVar.a(eVar)) {
                            iVar.f53362c.remove(bVar.f53348a);
                            iVar.f53363d.remove(bVar.f53348a);
                            this.f53381c = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f53348a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.i a(Class cls) {
        if (this.f53380b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) this.f53380b.get(cls);
            if (cls.isInstance(iVar)) {
                return iVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.i) cls.getConstructor(null).newInstance(null);
        } catch (Exception e2) {
            IAlog.a("Couldn't create a feature for %s", e2, cls.getName());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2, String str) {
        boolean z3;
        e eVar;
        k kVar;
        this.f53379a = str;
        a aVar = IAConfigManager.f53260M.f53299y;
        aVar.f53347b = this;
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.f53380b.values()) {
            boolean z4 = iVar instanceof com.fyber.inneractive.sdk.config.global.features.p;
            if ((z4 && z2) || (!z4 && !z2)) {
                l lVar = aVar.f53346a;
                if (iVar != null && lVar != null) {
                    q qVar = (q) lVar.f53374a.get(iVar.f53361b);
                    if (qVar != null) {
                        iVar.f53376a = qVar.f53376a;
                        IAlog.a("%s: Feature before variant merge: %s", CmcdData.OBJECT_TYPE_AUDIO_ONLY, iVar);
                        HashMap map = qVar.f53378c;
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            b bVar = (b) map.get((String) it.next());
                            if (bVar != null) {
                                int iNextInt = new Random().nextInt(100) + 1;
                                int i2 = 0;
                                if (bVar.f53349b < iNextInt) {
                                    IAlog.a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.f53349b));
                                } else {
                                    ArrayList<d> arrayList = bVar.f53351d;
                                    if (arrayList != null) {
                                        for (d dVar : arrayList) {
                                            try {
                                                Long lValueOf = Long.valueOf(IAConfigManager.f53260M.f53278d);
                                                eVar = new e();
                                                eVar.f53355b = lValueOf;
                                                eVar.f53356c = com.fyber.inneractive.sdk.serverapi.b.a(aVar.f53347b.f53379a);
                                            } catch (NumberFormatException unused) {
                                                IAlog.a("%s: invalid publisherId", CmcdData.OBJECT_TYPE_AUDIO_ONLY);
                                            }
                                            if (dVar.a(eVar)) {
                                                IAlog.a("%s: Experiment '%s' filtered! with %s", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a, dVar);
                                                break;
                                            }
                                        }
                                        if (iVar instanceof v) {
                                            for (k kVar2 : bVar.f53350c) {
                                                n nVar = kVar2.f53376a;
                                                if (nVar != null && nVar.a() != null && kVar2.f53376a.a().containsKey("use_fmp_cache_mechanism")) {
                                                    w wVar = (w) IAConfigManager.f53260M.f53269G.get(x.Video);
                                                    if (!(wVar != null ? wVar.a() : false)) {
                                                    }
                                                }
                                            }
                                        }
                                        IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.f53349b));
                                        z3 = false;
                                        if (!z3) {
                                            ArrayList arrayList2 = bVar.f53350c;
                                            int iNextInt2 = new Random().nextInt(100) + 1;
                                            IAlog.a("%s: selectVariant for experiment '%s' generated random number: %d", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a, Integer.valueOf(iNextInt2));
                                            Iterator it2 = arrayList2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    kVar = null;
                                                    break;
                                                }
                                                kVar = (k) it2.next();
                                                i2 += kVar.f53373c;
                                                IAlog.a("%s: selectVariant variant found: %s", CmcdData.OBJECT_TYPE_AUDIO_ONLY, kVar);
                                                if (i2 >= iNextInt2) {
                                                    break;
                                                } else {
                                                    IAlog.a("%s: selectVariant variant '%s' percentage outside selected range", CmcdData.OBJECT_TYPE_AUDIO_ONLY, kVar.f53372b);
                                                }
                                            }
                                            if (kVar != null) {
                                                IAlog.a("%s: experiment '%s' variant selected! %s", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a, kVar);
                                            } else {
                                                IAlog.a("%s: experiment '%s' no variant was selected! using control group", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a);
                                            }
                                            iVar.f53362c.put(bVar.f53348a, bVar);
                                            if (kVar != null) {
                                                iVar.f53363d.put(bVar.f53348a, kVar);
                                            }
                                        }
                                    } else {
                                        if (iVar instanceof v) {
                                        }
                                        IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", CmcdData.OBJECT_TYPE_AUDIO_ONLY, bVar.f53348a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.f53349b));
                                        z3 = false;
                                        if (!z3) {
                                        }
                                    }
                                }
                                z3 = true;
                                if (!z3) {
                                }
                            }
                        }
                    }
                    IAlog.a("%s: Feature after variant merge: %s", CmcdData.OBJECT_TYPE_AUDIO_ONLY, iVar);
                }
            }
        }
    }
}
