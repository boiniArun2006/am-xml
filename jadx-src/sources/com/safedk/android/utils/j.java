package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63188a = "sdk_key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63189b = "userUUID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f63190c = "configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f63191d = "last_reported_device_at";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f63192e = "last_reported_version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f63193f = "configETag";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f63194g = "sdk_version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f63195h = "versionCode";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f63196i = "randomToken";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f63197j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f63198k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63199l = "SharedPreferencesUtils";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f63200m = "offlineMode";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f63201n = "age";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f63202o = "region";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f63203p = "last_foreground_time";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f63204q = "last_foreground_report";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63205r = "sdk_versions";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63206s = "is_reported";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f63207w = "safedk_stored_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f63208x = "§§";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SharedPreferences f63209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f63210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f63211v;

    public j(SharedPreferences sharedPreferences, boolean z2) {
        this.f63209t = sharedPreferences;
        this.f63210u = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: JSONException -> 0x006b, all -> 0x008f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x006b, blocks: (B:8:0x0057, B:11:0x005f, B:13:0x0065, B:16:0x006d), top: B:25:0x0057, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Map<String, String> map) {
        try {
            this.f63211v = new JSONObject(this.f63209t.getString(f63205r, JsonUtils.EMPTY_JSON));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(key);
                Logger.d(f63199l, "addDiscoveredVersionsToVersionsJson sdkPackage=", key, ", version=", value, ", uuid=", sdkUUIDByPackage);
                if (sdkUUIDByPackage != null) {
                    try {
                        if (sdkUUIDByPackage.length() <= 0 || value == null || value.length() <= 0) {
                            Logger.d(f63199l, "UUID for sdkPackage ", key, "is empty and will not be added to sdkVersionsJson");
                        } else {
                            this.f63211v.put(sdkUUIDByPackage, value);
                        }
                    } catch (JSONException e2) {
                        Logger.d(f63199l, "error in addDiscoveredVersionsToVersionsJson", e2);
                    }
                }
            }
            a(this.f63211v);
        } catch (Throwable th) {
            Logger.e(f63199l, "Exception in addDiscoveredVersionsToVersionsJson", th);
        }
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = this.f63209t.edit();
        editorEdit.putString(f63205r, jSONObject.toString());
        Logger.d(f63199l, "saveSdkVersions saved (", Integer.valueOf(jSONObject.length()), " items) : ", jSONObject.toString());
        editorEdit.apply();
    }

    public String a() {
        return this.f63209t.getString(f63189b, null);
    }

    public boolean b() {
        return this.f63209t.getBoolean(f63200m, this.f63210u);
    }

    public Integer c() {
        int i2 = this.f63209t.getInt("age", -1);
        if (i2 < 0) {
            return null;
        }
        return new Integer(i2);
    }

    public String d() {
        return this.f63209t.getString("region", null);
    }

    public Bundle e() {
        Logger.d(f63199l, "getConfiguration started");
        return a(this.f63209t, f63190c);
    }

    public long f() {
        return this.f63209t.getLong(f63191d, 0L);
    }

    public int g() {
        return this.f63209t.getInt(f63192e, 0);
    }

    public long h() {
        return this.f63209t.getLong(f63203p, 0L);
    }

    public long i() {
        return this.f63209t.getLong(f63204q, 0L);
    }

    public JSONObject j() {
        return this.f63211v;
    }

    public void a(long j2) {
        SharedPreferences.Editor editorEdit = this.f63209t.edit();
        editorEdit.putLong(f63203p, j2);
        editorEdit.apply();
    }

    public String k() {
        return this.f63209t.getString(f63193f, null);
    }

    public void a(String str) {
        SharedPreferences.Editor editorEdit = this.f63209t.edit();
        editorEdit.putString(f63189b, str);
        editorEdit.apply();
    }

    public boolean l() {
        return this.f63209t.contains(f63190c);
    }

    public void a(Bundle bundle) {
        try {
            SharedPreferences.Editor editorEdit = this.f63209t.edit();
            String strP = p();
            String strA = a();
            editorEdit.clear();
            a(editorEdit, f63190c, bundle);
            if (strP != null) {
                editorEdit.putString(f63207w, strP);
            }
            if (strA != null) {
                editorEdit.putString(f63189b, strA);
            }
            editorEdit.apply();
        } catch (Throwable th) {
            Logger.e(f63199l, "Caught exception : ", th.getMessage(), th);
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, Bundle bundle) {
        String str2 = str + f63208x;
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj == null) {
                editor.remove(str2 + str3);
            } else if (obj instanceof Integer) {
                editor.putInt(str2 + str3, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str2 + str3, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str2 + str3, ((Boolean) obj).booleanValue());
            } else if (obj instanceof CharSequence) {
                editor.putString(str2 + str3, ((CharSequence) obj).toString());
            } else {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 0 && (arrayList.get(0) instanceof String)) {
                        editor.putStringSet(str2 + str3, new HashSet(arrayList));
                    }
                }
                if (obj instanceof Bundle) {
                    a(editor, str2 + str3, (Bundle) obj);
                }
            }
        }
    }

    public static Bundle a(SharedPreferences sharedPreferences, String str) {
        Logger.d(f63199l, "loadPreferencesBundle started, key=", str);
        Bundle bundle = new Bundle();
        Map<String, ?> all = sharedPreferences.getAll();
        String str2 = str + f63208x;
        HashSet<String> hashSet = new HashSet();
        for (String str3 : all.keySet()) {
            if (str3.startsWith(str2)) {
                String strB = b(str3, str2);
                if (!strB.contains(f63208x)) {
                    Object obj = all.get(str3);
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            bundle.putInt(strB, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strB, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(strB, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof CharSequence) {
                            bundle.putString(strB, ((CharSequence) obj).toString());
                        } else if (obj instanceof HashSet) {
                            bundle.putStringArrayList(strB, new ArrayList<>((HashSet) obj));
                        }
                    }
                } else {
                    hashSet.add(a(strB, f63208x));
                }
            }
        }
        for (String str4 : hashSet) {
            bundle.putBundle(str4, a(sharedPreferences, str2 + str4));
        }
        return bundle;
    }

    public static String a(String str, String str2) {
        if (b(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return str;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String b(String str, String str2) {
        if (!b(str) && !b(str2) && str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public void a(int i2, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f63209t.edit();
            editorEdit.putInt(f63195h, i2);
            editorEdit.putString(f63196i, str);
            editorEdit.putString("sdk_key", str2);
            Logger.d(f63199l, "save sdk key ", str2, ", token ", str, ", version code ", Integer.valueOf(i2));
            editorEdit.apply();
        } catch (Throwable th) {
            Logger.d(f63199l, "Caught exception", th);
        }
    }

    public String m() {
        String string = this.f63209t.getString("sdk_key", null);
        Logger.d(f63199l, "read sdk key ", string);
        return string;
    }

    public int n() {
        int i2 = this.f63209t.getInt(f63195h, 0);
        Logger.d(f63199l, "read version code ", Integer.valueOf(i2));
        return i2;
    }

    public String o() {
        String string = this.f63209t.getString(f63196i, null);
        Logger.d(f63199l, "read token ", string);
        return string;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f63209t.edit();
        editorEdit.putString(f63207w, str);
        editorEdit.apply();
    }

    public String p() {
        return this.f63209t.getString(f63207w, null);
    }
}
