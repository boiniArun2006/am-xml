package com.applovin.impl.mediation;

import android.text.TextUtils;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f49348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1804o f49349c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f49347a = Collections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f49350d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f49351e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f49352f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f49353g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f49354h = new HashSet();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f49357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f49358d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f49355a.equals(aVar.f49355a) || !this.f49356b.equals(aVar.f49356b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f49357c;
            MaxAdFormat maxAdFormat2 = aVar.f49357c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        JSONObject a() {
            return this.f49358d;
        }

        public int hashCode() {
            int iHashCode = ((this.f49355a.hashCode() * 31) + this.f49356b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f49357c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f49355a + "', operationTag='" + this.f49356b + "', format=" + this.f49357c + '}';
        }

        a(String str, String str2, y2 y2Var, C1802k c1802k) {
            this.f49355a = str;
            this.f49356b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f49358d = jSONObject;
            JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var != null) {
                this.f49357c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            } else {
                this.f49357c = null;
            }
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f49353g) {
            try {
                arrayList = new ArrayList(this.f49354h.size());
                Iterator it = this.f49354h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f49350d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f49352f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f49350d) {
            try {
                HashSet hashSet = new HashSet(this.f49351e.size());
                Iterator it = this.f49351e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return setUnmodifiableSet;
    }

    public g(C1802k c1802k) {
        if (c1802k != null) {
            this.f49348b = c1802k;
            this.f49349c = c1802k.O();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    h a(k3 k3Var) {
        return a(k3Var, false);
    }

    h a(k3 k3Var, boolean z2) {
        Class clsA;
        h hVar;
        if (k3Var != null) {
            String strC = k3Var.c();
            String strB = k3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (C1804o.a()) {
                    this.f49349c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (C1804o.a()) {
                    this.f49349c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z2 && (hVar = (h) this.f49347a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f49350d) {
                try {
                    if (!this.f49352f.contains(strB)) {
                        if (this.f49351e.containsKey(strB)) {
                            clsA = (Class) this.f49351e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (C1804o.a()) {
                                    this.f49349c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f49352f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(k3Var, clsA, z2);
                        if (hVarA != null) {
                            if (C1804o.a()) {
                                this.f49349c.a(obbPUqyhtS.xDgZthYBaxMy, "Loaded " + strC);
                            }
                            this.f49351e.put(strB, clsA);
                            if (z2) {
                                this.f49347a.put(k3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (C1804o.a()) {
                            this.f49349c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f49352f.add(strB);
                        return null;
                    }
                    if (C1804o.a()) {
                        this.f49349c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.f49353g) {
            try {
                this.f49348b.O();
                if (C1804o.a()) {
                    this.f49348b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f49354h.add(new a(str, str2, y2Var, this.f49348b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private h a(k3 k3Var, Class cls, boolean z2) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f49348b.y0()), z2, this.f49348b);
        } catch (Throwable th) {
            C1804o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            C1804o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
