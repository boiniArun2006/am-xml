package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1802k f50886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f50887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f50888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50889d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50890e = new Object();

    public Object a(x4 x4Var) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f50890e) {
            try {
                Object obj = this.f50889d.get(x4Var.b());
                if (obj == null) {
                    return x4Var.a();
                }
                return x4Var.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List b(x4 x4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(x4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(x4 x4Var) {
        return CollectionUtils.explode((String) a(x4Var));
    }

    private void d() {
        String strB = ((Boolean) a5.a(z4.f51007j, Boolean.FALSE, C1802k.o())).booleanValue() ? "" : b();
        synchronized (this.f50890e) {
            try {
                for (x4 x4Var : x4.c()) {
                    try {
                        Object objA = this.f50886a.a(strB + x4Var.b(), null, x4Var.a().getClass(), this.f50888c);
                        if (objA != null) {
                            this.f50889d.put(x4Var.b(), objA);
                        }
                    } catch (Throwable th) {
                        C1804o.c("SettingsManager", "Unable to load \"" + x4Var.b() + "\"", th);
                        this.f50886a.D().a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        Boolean bool = (Boolean) a5.a(z4.f51007j, Boolean.FALSE, C1802k.o());
        String strB = b();
        synchronized (this.f50890e) {
            try {
                SharedPreferences.Editor editorEdit = this.f50888c.edit();
                for (x4 x4Var : x4.c()) {
                    Object obj = this.f50889d.get(x4Var.b());
                    if (obj != null) {
                        String strB2 = x4Var.b();
                        this.f50886a.a(strB + x4Var.b(), obj, editorEdit);
                        if (bool.booleanValue()) {
                            this.f50886a.a(strB2, obj, editorEdit);
                        }
                    }
                }
                if (((Boolean) this.f50886a.a(x4.f50762F6)).booleanValue()) {
                    a5.a(editorEdit);
                } else {
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public y4(C1802k c1802k) {
        this.f50886a = c1802k;
        Context contextO = C1802k.o();
        this.f50887b = contextO;
        this.f50888c = contextO.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(x4.class.getName());
            Class.forName(r3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public boolean c() {
        return this.f50886a.n0().isVerboseLoggingEnabled() || ((Boolean) a(x4.f50826k)).booleanValue();
    }

    private String b() {
        return qfEYuUHwj.HZPyfCfajzCf + n7.f(this.f50886a.i0()) + ".";
    }

    public void a(x4 x4Var, Object obj) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f50890e) {
                this.f50889d.put(x4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f50890e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, x4.f50846u.b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            x4 x4VarA = x4.a(next);
                            if (x4VarA != null) {
                                Object objA = zBooleanValue ? a(x4VarA) : null;
                                Object objA2 = a(next, jSONObject, x4VarA.a());
                                this.f50889d.put(x4VarA.b(), objA2);
                                if (x4VarA == x4.H5) {
                                    this.f50889d.put(x4.I5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objA2.equals(objA)) {
                                    map.put(x4VarA, objA);
                                }
                            }
                        } catch (JSONException e2) {
                            C1804o.c("SettingsManager", "Unable to parse JSON settingsValues array", e2);
                            this.f50886a.D().a("SettingsManager", "loadSettingsException", e2);
                        } catch (Throwable th) {
                            C1804o.c("SettingsManager", "Unable to convert setting object ", th);
                            this.f50886a.D().a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    v2 v2Var = new v2();
                    v2Var.a("========== UPDATED SETTINGS ==========");
                    for (x4 x4Var : map.keySet()) {
                        v2Var.a(x4Var.b(), a(x4Var) + " (" + map.get(x4Var) + ")");
                    }
                    v2Var.a("========== END ==========");
                    this.f50886a.O();
                    if (C1804o.a()) {
                        this.f50886a.O().a("SettingsManager", v2Var.toString());
                    }
                }
                a5.b(z4.f51007j, (Boolean) a(x4.T6), C1802k.o());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f50890e) {
            this.f50889d.clear();
        }
        this.f50886a.a(this.f50888c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
