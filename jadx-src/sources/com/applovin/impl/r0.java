package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f49826a = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f49827b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f49828c = {15, 13};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f49829d = {20};

    public static boolean a(int i2) {
        return i2 < 200 || i2 >= 300;
    }

    public static String b(String str, C1802k c1802k) {
        return a((String) c1802k.a(x4.n0), str, c1802k);
    }

    public static Map c(C1802k c1802k) {
        HashMap map = new HashMap();
        String str = (String) c1802k.a(x4.f50825j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) c1802k.a(x4.k5)).booleanValue()) {
            map.put("api_key", c1802k.i0());
        }
        map.putAll(n7.a(c1802k.A().e()));
        return map;
    }

    public static String a(String str, C1802k c1802k) {
        return a((String) c1802k.a(x4.o0), str, c1802k);
    }

    public static String d(C1802k c1802k) {
        return a((String) c1802k.a(x4.m0), "4.0/ad", c1802k);
    }

    public static String e(C1802k c1802k) {
        return a((String) c1802k.a(x4.f50829l0), "4.0/ad", c1802k);
    }

    public static void b(JSONObject jSONObject, C1802k c1802k) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            c1802k.b(z4.f50987H, string);
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static Long f(C1802k c1802k) {
        q0.d dVarA = c1802k.w().a();
        if (dVarA == null) {
            return null;
        }
        double dC2 = n7.c(dVarA.b());
        double d2 = n7.d(dVarA.a());
        if (d2 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (dC2 / d2));
    }

    public static String g(C1802k c1802k) {
        NetworkInfo networkInfoB = b(C1802k.o());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return "wifi";
            }
            if (type == 0) {
                if (a(subtype, f49826a)) {
                    return "2g";
                }
                if (a(subtype, f49827b)) {
                    return "3g";
                }
                if (a(subtype, f49828c)) {
                    return "4g";
                }
                if (a(subtype, f49829d)) {
                    return "5g";
                }
                return "mobile";
            }
        }
        return "unknown";
    }

    public static void a(JSONObject jSONObject, boolean z2, C1802k c1802k) {
        c1802k.t().a(jSONObject, z2);
    }

    public static void a(int i2, C1802k c1802k) {
        if (i2 == 401) {
            C1804o.h("AppLovinSdk", "SDK key \"" + c1802k.i0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i2 == 418) {
            c1802k.o0().a(x4.f50815e, Boolean.TRUE);
            c1802k.o0().e();
        } else if (i2 >= 400 && i2 < 500) {
            if (((Boolean) c1802k.a(x4.f50818g)).booleanValue()) {
                c1802k.T0();
            }
        } else if (i2 == -1 && ((Boolean) c1802k.a(x4.f50818g)).booleanValue()) {
            c1802k.T0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void c(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1802k != null) {
            try {
                if (jSONObject.has("settings")) {
                    y4 y4VarO0 = c1802k.o0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    y4VarO0.a(jSONObject2);
                    y4VarO0.e();
                    String strB = x4.J6.b();
                    if (JsonUtils.valueExists(jSONObject2, strB)) {
                        a5.b(z4.f50989J, JsonUtils.getBoolean(jSONObject2, strB, Boolean.FALSE), C1802k.o());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e2) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("ConnectionUtils", "Unable to parse settings out of API response", e2);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(C1802k c1802k) {
        return a((String) c1802k.a(x4.f50829l0), ((Boolean) c1802k.a(x4.h3)).booleanValue() ? "5.0/ad" : "4.0/ad", c1802k);
    }

    public static String a(String str, String str2, C1802k c1802k) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (c1802k != null) {
            return str + str2;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(JSONObject jSONObject, C1802k c1802k) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1802k.o()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    a5.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) c1802k.a(x4.f50762F6)).booleanValue()) {
                a5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, C1802k c1802k) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) c1802k.a(x4.a3)).intValue()];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    private static boolean a(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static String a(C1802k c1802k) {
        return a((String) c1802k.a(x4.m0), ((Boolean) c1802k.a(x4.h3)).booleanValue() ? "5.0/ad" : "4.0/ad", c1802k);
    }
}
