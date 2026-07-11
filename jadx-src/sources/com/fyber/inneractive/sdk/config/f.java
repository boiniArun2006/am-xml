package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53330a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        String str = IAConfigManager.f53260M.f53277c;
        StringBuilder sb = new StringBuilder(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u);
        int i2 = k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb.append(jhotmBbwMbr.QEpdQeoucmA);
        } else {
            sb.append(property);
        }
        sb.append(str);
        sb.append('/');
        sb.append(str);
        sb.append(".json");
        String string = sb.toString();
        IAlog.d("%s: %s", "APP_CONFIG_REQUEST", string);
        return string;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.o.f57018a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.f53260M.f53277c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        h0 h0Var = (h0) obj;
        if (h0Var == null || h0Var.f53383a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f57018a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", h0Var.f53383a).apply();
    }

    public final void a(String str, Throwable th) {
        String strSubstring;
        String name;
        String localizedMessage;
        if (this.f53330a) {
            return;
        }
        this.f53330a = true;
        if (!TextUtils.isEmpty(str)) {
            strSubstring = str.length() > 501 ? str.substring(0, 500) : str.substring(0, str.length() - 1);
        } else {
            strSubstring = "Empty Json Data";
        }
        String str2 = strSubstring;
        if (th != null) {
            name = th.getClass().getName();
            localizedMessage = th.getLocalizedMessage();
        } else {
            name = "Bad remote configuration";
            localizedMessage = "Internal error";
        }
        String str3 = name;
        String str4 = IAConfigManager.f53260M.f53277c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (localizedMessage == null) {
            localizedMessage = "No message";
        }
        String str5 = localizedMessage;
        if (TextUtils.isEmpty(str4)) {
            str4 = "EMPTY_APP_ID";
        }
        wVar.a("exception", str3, "message", str5, "data", str2, "appId", str4).a((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0420  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0 a(com.fyber.inneractive.sdk.config.remote.e eVar) {
        boolean z2;
        Iterator it;
        h0 h0Var;
        Iterator it2;
        HashMap map;
        int i2;
        ArrayList arrayList;
        UnitDisplayType unitDisplayType;
        u0 u0Var;
        Integer num;
        Integer num2;
        Set<Vendor> set;
        Integer num3;
        Boolean bool;
        UnitDisplayType unitDisplayType2;
        String strB;
        com.fyber.inneractive.sdk.config.remote.e eVar2 = eVar;
        int i3 = 2;
        int i5 = 0;
        int i7 = 1;
        h0 h0Var2 = new h0();
        h0Var2.f53385c = eVar2.f53435c;
        com.fyber.inneractive.sdk.config.remote.a aVar = eVar2.f53433a;
        h0Var2.f53384b = aVar.f53423b;
        h0Var2.f53383a = aVar.f53422a;
        Iterator it3 = eVar2.f53434b.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.config.remote.h hVar = (com.fyber.inneractive.sdk.config.remote.h) it3.next();
            HashMap map2 = h0Var2.f53386d;
            String str = hVar.f53437a;
            com.fyber.inneractive.sdk.config.remote.a aVar2 = eVar2.f53433a;
            HashMap map3 = h0Var2.f53387e;
            j0 j0Var = h0Var2.f53388f;
            q0 q0Var = new q0();
            com.fyber.inneractive.sdk.config.remote.c[] cVarArr = new com.fyber.inneractive.sdk.config.remote.c[i3];
            cVarArr[i5] = aVar2;
            cVarArr[i7] = hVar;
            int i8 = i5;
            while (true) {
                if (i8 >= i3) {
                    z2 = i7;
                    break;
                }
                com.fyber.inneractive.sdk.config.remote.c cVar = cVarArr[i8];
                if (cVar != null && (strB = cVar.b()) != null && strB.equals(V8ValueBoolean.FALSE)) {
                    z2 = i5;
                    break;
                }
                i8 += i7;
                i3 = 2;
            }
            q0Var.f53414b = z2;
            Iterator it4 = hVar.f53443g.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.config.remote.i iVar = (com.fyber.inneractive.sdk.config.remote.i) it4.next();
                r0 r0Var = new r0();
                String str2 = iVar.f53444a;
                if (str2 != null) {
                    int i9 = i5;
                    String str3 = iVar.f53445b;
                    if (str3 == null) {
                        i5 = i9;
                    } else {
                        r0Var.f53415a = str2;
                        r0Var.f53416b = str3;
                        com.fyber.inneractive.sdk.config.remote.b bVar = iVar.f53446c;
                        if (bVar != null) {
                            com.fyber.inneractive.sdk.config.remote.b bVar2 = hVar.f53439c;
                            com.fyber.inneractive.sdk.config.remote.b bVar3 = aVar2.f53426e;
                            l0 l0Var = new l0();
                            it = it4;
                            UnitDisplayType unitDisplayType3 = bVar.f53429a;
                            h0Var = h0Var2;
                            if (unitDisplayType3 == UnitDisplayType.BANNER || unitDisplayType3 == UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                l0Var.f53402b = bVar.f53429a;
                                Integer num4 = bVar.f53431c;
                                Integer num5 = bVar2 != null ? bVar2.f53431c : null;
                                if (bVar3 != null) {
                                    it2 = it3;
                                    num3 = bVar3.f53431c;
                                } else {
                                    it2 = it3;
                                    num3 = null;
                                }
                                Integer num6 = (Integer) a((Object) null, num4, num5, num3);
                                if (num6 != null && num6.intValue() >= 5 && num6.intValue() <= 60) {
                                    l0Var.f53401a = num6;
                                }
                                Boolean bool2 = Boolean.TRUE;
                                Boolean bool3 = bVar.f53430b;
                                Boolean bool4 = bVar2 != null ? bVar2.f53430b : null;
                                if (bVar3 != null) {
                                    map = map2;
                                    bool = bVar3.f53430b;
                                } else {
                                    map = map2;
                                    bool = null;
                                }
                                Boolean bool5 = (Boolean) a(bool2, bool3, bool4, bool);
                                bool5.getClass();
                                l0Var.f53403c = bool5;
                                Integer num7 = (Integer) a((Object) null, bVar.f53432d, bVar2 != null ? bVar2.f53432d : null, bVar3 != null ? bVar3.f53432d : null);
                                if (num7 != null && num7.intValue() >= 5 && num7.intValue() <= 60) {
                                    l0Var.f53404d = num7;
                                }
                                if (l0Var.f53404d == null && !l0Var.f53403c.booleanValue() && ((unitDisplayType2 = bVar.f53429a) == UnitDisplayType.INTERSTITIAL || unitDisplayType2 == UnitDisplayType.REWARDED)) {
                                    l0Var.f53403c = bool2;
                                }
                                r0Var.f53417c = l0Var;
                            } else {
                                i5 = i9;
                                it4 = it;
                                h0Var2 = h0Var;
                                i7 = 1;
                            }
                        } else {
                            it = it4;
                            h0Var = h0Var2;
                            it2 = it3;
                            map = map2;
                        }
                        com.fyber.inneractive.sdk.config.remote.j jVar = iVar.f53449f;
                        if (jVar != null || iVar.f53448e != null) {
                            if (jVar != null) {
                                UnitDisplayType unitDisplayType4 = jVar.f53460j;
                                UnitDisplayType unitDisplayType5 = UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && iVar.f53446c == null) {
                                    l0 l0Var2 = new l0();
                                    r0Var.f53417c = l0Var2;
                                    l0Var2.f53403c = Boolean.FALSE;
                                    l0Var2.f53404d = -1;
                                    l0 l0Var3 = r0Var.f53417c;
                                    l0Var3.f53402b = unitDisplayType5;
                                    l0Var3.f53401a = -1;
                                }
                            }
                            t0 t0Var = new t0();
                            com.fyber.inneractive.sdk.config.remote.j jVar2 = iVar.f53449f;
                            com.fyber.inneractive.sdk.config.remote.j jVar3 = hVar.f53441e;
                            com.fyber.inneractive.sdk.config.remote.j jVar4 = aVar2.f53425d;
                            if (jVar2 != null && ((unitDisplayType = jVar2.f53460j) == UnitDisplayType.LANDSCAPE || unitDisplayType == UnitDisplayType.SQUARE || unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.VERTICAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.MRECT)) {
                                t0Var.f53480j = unitDisplayType;
                            } else {
                                if (iVar.f53448e != null) {
                                    t0Var.f53480j = UnitDisplayType.NATIVE;
                                    r0Var.f53419e = new p0();
                                }
                                i2 = 1;
                                i5 = i9;
                                i7 = i2;
                                it4 = it;
                                h0Var2 = h0Var;
                                it3 = it2;
                                map2 = map;
                            }
                            Object objA = a((Object) null, jVar2 != null ? jVar2.f53451a : null, jVar3 != null ? jVar3.f53451a : null, jVar4 != null ? jVar4.f53451a : null);
                            if (objA != null) {
                                t0Var.f53471a = (Boolean) objA;
                                t0Var.f53472b = (Integer) a((Object) 5000, jVar2 != null ? jVar2.f53452b : null, jVar3 != null ? jVar3.f53452b : null, jVar4 != null ? jVar4.f53452b : null);
                                Integer num8 = (Integer) a(Integer.valueOf(i9), jVar2 != null ? jVar2.f53453c : null, jVar3 != null ? jVar3.f53453c : null, jVar4 != null ? jVar4.f53453c : null);
                                t0Var.f53473c = Integer.valueOf(num8.intValue() < 0 ? i9 : num8.intValue());
                                t0Var.f53474d = (Boolean) a(Boolean.TRUE, jVar2 != null ? jVar2.f53455e : null, jVar3 != null ? jVar3.f53455e : null, jVar4 != null ? jVar4.f53455e : null);
                                t0Var.f53475e = (Orientation) a(Orientation.USER, jVar2 != null ? jVar2.f53457g : null, jVar3 != null ? jVar3.f53457g : null, jVar4 != null ? jVar4.f53457g : null);
                                Integer num9 = (Integer) a(Integer.valueOf(i9), jVar2 != null ? jVar2.f53459i : null, jVar3 != null ? jVar3.f53459i : null, jVar4 != null ? jVar4.f53459i : null);
                                t0Var.f53476f = Integer.valueOf(num9.intValue() < 0 ? i9 : num9.intValue());
                                Integer num10 = (Integer) a((Object) 2048, jVar2 != null ? jVar2.f53458h : null, jVar3 != null ? jVar3.f53458h : null, jVar4 != null ? jVar4.f53458h : null);
                                if (num10.intValue() > t0Var.f53472b.intValue()) {
                                    num10 = t0Var.f53472b;
                                }
                                t0Var.f53477g = num10;
                                t0Var.f53478h = (Skip) a(Skip._0, jVar2 != null ? jVar2.f53454d : null, jVar3 != null ? jVar3.f53454d : null, jVar4 != null ? jVar4.f53454d : null);
                                t0Var.f53479i = (TapAction) a(TapAction.DO_NOTHING, jVar2 != null ? jVar2.f53456f : null, jVar3 != null ? jVar3.f53456f : null, jVar4 != null ? jVar4.f53456f : null);
                                ArrayList arrayList2 = new ArrayList();
                                com.fyber.inneractive.sdk.config.remote.d[] dVarArr = new com.fyber.inneractive.sdk.config.remote.d[1];
                                dVarArr[i9] = iVar;
                                com.fyber.inneractive.sdk.config.remote.j jVarA = dVarArr[i9].a();
                                if (jVarA != null && (arrayList = jVarA.f53461k) != null && arrayList.size() > 0) {
                                    arrayList2 = jVarA.f53461k;
                                }
                                t0Var.f53481k = arrayList2;
                                r0Var.f53420f = t0Var;
                                o0 o0Var = new o0();
                                HashSet hashSet = new HashSet();
                                com.fyber.inneractive.sdk.config.remote.f fVar = iVar.f53447d;
                                Set set2 = fVar == null ? fVar.f53436a : null;
                                com.fyber.inneractive.sdk.config.remote.f fVar2 = hVar.f53440d;
                                Set set3 = fVar2 == null ? fVar2.f53436a : null;
                                com.fyber.inneractive.sdk.config.remote.f fVar3 = aVar2.f53424c;
                                o0Var.f53410a = (Set) a(hashSet, set2, set3, fVar3 == null ? fVar3.f53436a : null);
                                r0Var.f53418d = o0Var;
                                u0Var = new u0();
                                com.fyber.inneractive.sdk.config.remote.k kVar = iVar.f53450g;
                                com.fyber.inneractive.sdk.config.remote.k kVar2 = hVar.f53442f;
                                com.fyber.inneractive.sdk.config.remote.k kVar3 = aVar2.f53427f;
                                num = (Integer) a((Object) 1, kVar == null ? kVar.f53462a : null, kVar2 == null ? kVar2.f53462a : null, kVar3 == null ? kVar3.f53462a : null);
                                if (num.intValue() > 0 && num.intValue() > 100) {
                                    i2 = 1;
                                    u0Var.f53483a = 1;
                                } else {
                                    i2 = 1;
                                    u0Var.f53483a = num;
                                }
                                num2 = (Integer) a(Integer.valueOf(i9), kVar == null ? kVar.f53463b : null, kVar2 == null ? kVar2.f53463b : null, kVar3 == null ? kVar3.f53463b : null);
                                if (num2.intValue() >= 0 && num2.intValue() > 100) {
                                    u0Var.f53484b = Integer.valueOf(i9);
                                } else {
                                    u0Var.f53484b = num2;
                                }
                                set = (Set) a(new HashSet(), kVar == null ? kVar.f53464c : null, kVar2 == null ? kVar2.f53464c : null, kVar3 == null ? kVar3.f53464c : null);
                                u0Var.f53485c = set;
                                r0Var.f53421g = u0Var;
                                if (j0Var != null && set != null) {
                                    for (Vendor vendor : set) {
                                        if (vendor != null && !j0Var.f53391a.contains(vendor)) {
                                            j0Var.f53391a.add(vendor);
                                        }
                                    }
                                }
                                q0Var.f53413a.add(r0Var);
                                map3.put(r0Var.f53415a, r0Var);
                                i5 = i9;
                                i7 = i2;
                                it4 = it;
                                h0Var2 = h0Var;
                                it3 = it2;
                                map2 = map;
                            }
                            i2 = 1;
                            i5 = i9;
                            i7 = i2;
                            it4 = it;
                            h0Var2 = h0Var;
                            it3 = it2;
                            map2 = map;
                        } else {
                            o0 o0Var2 = new o0();
                            HashSet hashSet2 = new HashSet();
                            com.fyber.inneractive.sdk.config.remote.f fVar4 = iVar.f53447d;
                            if (fVar4 == null) {
                            }
                            com.fyber.inneractive.sdk.config.remote.f fVar22 = hVar.f53440d;
                            if (fVar22 == null) {
                            }
                            com.fyber.inneractive.sdk.config.remote.f fVar32 = aVar2.f53424c;
                            o0Var2.f53410a = (Set) a(hashSet2, set2, set3, fVar32 == null ? fVar32.f53436a : null);
                            r0Var.f53418d = o0Var2;
                            u0Var = new u0();
                            com.fyber.inneractive.sdk.config.remote.k kVar4 = iVar.f53450g;
                            com.fyber.inneractive.sdk.config.remote.k kVar22 = hVar.f53442f;
                            com.fyber.inneractive.sdk.config.remote.k kVar32 = aVar2.f53427f;
                            num = (Integer) a((Object) 1, kVar4 == null ? kVar4.f53462a : null, kVar22 == null ? kVar22.f53462a : null, kVar32 == null ? kVar32.f53462a : null);
                            if (num.intValue() > 0) {
                                i2 = 1;
                                u0Var.f53483a = num;
                                num2 = (Integer) a(Integer.valueOf(i9), kVar4 == null ? kVar4.f53463b : null, kVar22 == null ? kVar22.f53463b : null, kVar32 == null ? kVar32.f53463b : null);
                                if (num2.intValue() >= 0) {
                                    u0Var.f53484b = num2;
                                    set = (Set) a(new HashSet(), kVar4 == null ? kVar4.f53464c : null, kVar22 == null ? kVar22.f53464c : null, kVar32 == null ? kVar32.f53464c : null);
                                    u0Var.f53485c = set;
                                    r0Var.f53421g = u0Var;
                                    if (j0Var != null) {
                                        while (r0.hasNext()) {
                                        }
                                    }
                                    q0Var.f53413a.add(r0Var);
                                    map3.put(r0Var.f53415a, r0Var);
                                    i5 = i9;
                                    i7 = i2;
                                    it4 = it;
                                    h0Var2 = h0Var;
                                    it3 = it2;
                                    map2 = map;
                                }
                            }
                        }
                    }
                }
            }
            map2.put(str, q0Var);
            eVar2 = eVar;
            i3 = 2;
        }
        return h0Var2;
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            iAConfigManager.f53265C.g();
            com.fyber.inneractive.sdk.config.remote.e eVarA = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.f53277c;
            if (eVarA != null && str2.equals(eVarA.f53433a.f53422a)) {
                return a(eVarA);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (eVarA != null && !str2.equals(eVarA.f53433a.f53422a)) {
                throw new InvalidAppIdException();
            }
            a(str, (Throwable) null);
            return null;
        } catch (Throwable th) {
            a(str, th);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }
}
