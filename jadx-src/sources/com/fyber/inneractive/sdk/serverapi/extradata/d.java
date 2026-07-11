package com.fyber.inneractive.sdk.serverapi.extradata;

import android.util.Base64;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.bidder.k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.g;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.v;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f56922f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f56917a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f56918b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f56919c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f56920d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f56921e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56923g = -1;

    public final TokenParametersOuterClass$TokenParameters a(int i2) {
        if (i2 <= 0) {
            IAlog.a("%sExtra data size limit is invalid: %s", "UserExtraDataManager", Integer.valueOf(i2));
            return null;
        }
        IAlog.a("%sExtra data token size limit: %s", "UserExtraDataManager", Integer.valueOf(i2));
        k kVar = (k) a(TokenParametersOuterClass$TokenParameters.newBuilder(), new a());
        if (kVar == null) {
            IAlog.a("%sExtra data token is empty", "UserExtraDataManager");
            return null;
        }
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = (TokenParametersOuterClass$TokenParameters) kVar.a();
        String strEncodeToString = Base64.encodeToString(tokenParametersOuterClass$TokenParameters.toByteArray(), 2);
        if (strEncodeToString == null) {
            return null;
        }
        int length = strEncodeToString.length();
        IAlog.a("%sExtra data token size is: %s", "UserExtraDataManager", Integer.valueOf(length));
        if (length <= i2) {
            IAlog.a("%sReturning extra data token", "UserExtraDataManager");
            return tokenParametersOuterClass$TokenParameters;
        }
        IAlog.a("%sTrimming extra data from token", "UserExtraDataManager");
        if (this.f56919c.compareAndSet(false, true)) {
            HashMap map = new HashMap();
            map.put(JavetError.PARAMETER_REASON, "Token with extra data exceeded limit");
            map.put(IV8ValueMap.FUNCTION_KEYS, new JSONArray((Collection) this.f56920d.keySet()));
            a(map);
        }
        return null;
    }

    public final Object a(Object obj, c cVar) {
        Integer num;
        int i2;
        r rVar = this.f56922f;
        if (rVar != null) {
            Boolean boolC = ((g) rVar.a(g.class)).c("enable");
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            IAlog.a("ExtraDataFeature %s", String.valueOf(zBooleanValue));
            if (zBooleanValue) {
                if (this.f56920d.isEmpty()) {
                    return null;
                }
                for (Map.Entry entry : this.f56920d.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!this.f56921e.containsKey(str)) {
                        if (str != null) {
                            Set hashSet = (Set) this.f56917a.get("unsupported_keys");
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(str);
                            this.f56917a.put("unsupported_keys", hashSet);
                        }
                        IAlog.a("%sCould not set extra data for unsupported key: %s", "UserExtraDataManager", str);
                        this.f56920d.remove(str);
                    } else {
                        if (this.f56923g == -1) {
                            s sVar = IAConfigManager.f53260M.f53294t;
                            if (sVar == null) {
                                IAlog.b("%sGlobalConfigResolver is null, cannot resolve ExtraDataValueMaxLength", new Object[0]);
                            } else {
                                o oVar = sVar.f53466b;
                                oVar.getClass();
                                try {
                                    i2 = Integer.parseInt(oVar.a("edvml", Integer.toString(512)));
                                } catch (Throwable unused) {
                                    i2 = 512;
                                }
                                int i3 = i2 >= 1 ? i2 : 512;
                                this.f56923g = i3;
                                IAlog.a("%sExtraDataValueMaxLength: %s", "UserExtraDataManager", Integer.valueOf(i3));
                            }
                        }
                        if (str2.length() > this.f56923g) {
                            if (str != null) {
                                Set hashSet2 = (Set) this.f56917a.get("value_too_long_keys");
                                if (hashSet2 == null) {
                                    hashSet2 = new HashSet();
                                }
                                hashSet2.add(str);
                                this.f56917a.put("value_too_long_keys", hashSet2);
                            }
                            IAlog.a("%sCould not set extra data for key: %s, value is too long", "UserExtraDataManager", str);
                            this.f56920d.remove(str);
                        } else {
                            if (str != null && (num = (Integer) this.f56921e.get(str)) != null) {
                                if (num.intValue() == 1) {
                                    if (!InneractiveAdManager.isCurrentUserAChild()) {
                                        v vVar = u.f53482a.f53490b;
                                        if (vVar != null ? vVar.f53487b : false) {
                                        }
                                    }
                                }
                                try {
                                    cVar.a(str, str2, obj);
                                } catch (Exception e2) {
                                    IAlog.b("%sCouldn't process entry for %s. %s", "UserExtraDataManager", str, e2.getMessage());
                                }
                            }
                            IAlog.a("%sCould not set extra data for key: %s, limited tracking is on", "UserExtraDataManager", str);
                            this.f56920d.remove(str);
                        }
                    }
                }
                if (!this.f56917a.isEmpty() && this.f56918b.compareAndSet(false, true)) {
                    HashMap map = new HashMap();
                    map.put(JavetError.PARAMETER_REASON, "Publisher failed to set extra data");
                    for (Map.Entry entry2 : this.f56917a.entrySet()) {
                        if (entry2.getValue() != null) {
                            map.put((String) entry2.getKey(), new JSONArray((Collection) new ArrayList((Collection) entry2.getValue())));
                        }
                    }
                    a(map);
                }
                if (cVar.a(obj)) {
                    return null;
                }
                return obj;
            }
        }
        IAlog.a("%sFeature is disabled, not providing extra data", "UserExtraDataManager");
        return null;
    }

    public static void a(HashMap map) {
        w wVar = new w(t.FIRST_PARTY_EXTRA_DATA_ERROR);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                jSONObject.put(str, value);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", str, value);
            }
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
    }
}
