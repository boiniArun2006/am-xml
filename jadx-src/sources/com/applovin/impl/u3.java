package com.applovin.impl;

import com.applovin.impl.s3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class u3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f50563d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f50564e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f50565f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f50566g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f50567h = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f50568i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f50570b = a(r3.r8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f50571c = a(r3.q8);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l2, Long l5) {
        return l2;
    }

    private Map b(s3 s3Var, t3 t3Var, s3.b bVar) {
        if (!a(s3Var, t3Var, bVar) || !b(s3Var, t3Var)) {
            return null;
        }
        String strB = t3Var.b();
        HashMap mapA = a(t3Var.a());
        Object objB = b(t3Var.a());
        HashMap map = new HashMap();
        synchronized (objB) {
            try {
                if (t3Var instanceof q3) {
                    a((q3) t3Var, mapA);
                }
                HashMap map2 = (HashMap) mapA.get(strB);
                if (map2 == null) {
                    map2 = new HashMap();
                    mapA.put(strB, map2);
                }
                Iterator it = s3Var.b().iterator();
                while (it.hasNext()) {
                    String strB2 = ((s3.a) it.next()).b();
                    HashMap map3 = (HashMap) map2.get(strB2);
                    if (map3 == null) {
                        map3 = new HashMap();
                        map2.put(strB2, map3);
                    }
                    Object objA = bVar.a(map3.get(s3Var));
                    map3.put(s3Var, objA);
                    map.put(strB2, objA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Boolean bool = (Boolean) this.f50569a.a(r3.t8);
        if (s3Var.a(s3.a.INSTALL) && bool.booleanValue()) {
            b(t3Var);
        }
        return map;
    }

    private JSONObject a(x4 x4Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f50569a.a(x4Var), new JSONObject());
    }

    private z4 c(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return z4.f50990K;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return z4.f50991L;
        }
        return null;
    }

    public u3(C1802k c1802k) {
        this.f50569a = c1802k;
        a((String) a5.a(z4.f50990K, (Object) null, C1802k.o()), t3.a.AD_UNIT_ID);
        a((String) a5.a(z4.f50991L, (Object) null, C1802k.o()), t3.a.AD_FORMAT);
    }

    public Map a(s3 s3Var, t3 t3Var) {
        return b(s3Var, t3Var, new s3.b() { // from class: com.applovin.impl.cv
            @Override // com.applovin.impl.s3.b
            public final Object a(Object obj) {
                return u3.a((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l2) {
        return Long.valueOf(l2 != null ? 1 + l2.longValue() : 1L);
    }

    public void a(s3 s3Var, t3 t3Var, final Long l2) {
        b(s3Var, t3Var, new s3.b() { // from class: com.applovin.impl.mf
            @Override // com.applovin.impl.s3.b
            public final Object a(Object obj) {
                return u3.a(l2, (Long) obj);
            }
        });
    }

    public Map a(s3 s3Var, t3.a aVar) {
        return a(s3Var, aVar, s3.a.SESSION);
    }

    private Map a(s3 s3Var, t3.a aVar, s3.a aVar2) {
        HashMap mapA = a(aVar);
        Object objB = b(aVar);
        HashMap map = new HashMap();
        synchronized (objB) {
            try {
                for (String str : mapA.keySet()) {
                    HashMap map2 = (HashMap) mapA.get(str);
                    String strB = aVar2.b();
                    if (map2 != null && map2.containsKey(strB)) {
                        HashMap map3 = (HashMap) map2.get(strB);
                        if (aVar == t3.a.AD) {
                            map.put(j3.a(str).b(), map3.get(s3Var));
                        } else {
                            map.put(str, map3.get(s3Var));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    private void a(q3 q3Var, Map map) {
        MaxAdFormat maxAdFormatA = q3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.f50571c, maxAdFormatA.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (j3.a((String) it.next()).a().equals(maxAdFormatA)) {
                i2++;
            }
        }
        if (i2 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i2 >= integer.intValue()) {
            if (j3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(maxAdFormatA)) {
                it2.remove();
                i2--;
            }
        }
    }

    private Object b(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return f50564e;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return f50566g;
        }
        return f50568i;
    }

    private boolean b(s3 s3Var, t3 t3Var) {
        Iterator<String> itKeys = this.f50570b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(t3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.f50570b, next, new JSONArray()), s3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return f50563d;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return f50565f;
        }
        return f50567h;
    }

    private void b(t3 t3Var) {
        z4 z4VarC = c(t3Var.a());
        if (z4VarC == null) {
            return;
        }
        a5.b(z4VarC, a((Map) a(t3Var)), C1802k.o());
    }

    private boolean a(s3 s3Var, t3 t3Var, s3.b bVar) {
        if (s3Var == null) {
            this.f50569a.O();
            if (C1804o.a()) {
                this.f50569a.O().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (t3Var == null) {
            this.f50569a.O();
            if (C1804o.a()) {
                this.f50569a.O().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f50569a.O();
        if (C1804o.a()) {
            this.f50569a.O().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private HashMap a(t3 t3Var) {
        HashMap map = new HashMap();
        HashMap mapA = a(t3Var.a());
        synchronized (b(t3Var.a())) {
            try {
                for (Map.Entry entry : mapA.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap map2 = (HashMap) entry.getValue();
                    if (!CollectionUtils.isEmpty(map2)) {
                        HashMap map3 = (HashMap) map2.get(s3.a.INSTALL.b());
                        if (!CollectionUtils.isEmpty(map3)) {
                            map.put(str, new HashMap(map3));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                s3 s3Var = (s3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, s3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, t3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap mapA = a(aVar);
            Object objB = b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (objB) {
                try {
                    for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                        String key = entry.getKey();
                        HashMap map = new HashMap();
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            s3 s3VarA = s3.a((String) entry2.getKey());
                            if (s3VarA != null) {
                                map.put(s3VarA, a(entry2.getValue()));
                            }
                        }
                        if (!CollectionUtils.isEmpty(map)) {
                            HashMap map2 = new HashMap();
                            map2.put(s3.a.INSTALL.b(), map);
                            mapA.put(key, map2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
