package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Zs {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static SharedPreferences f52300t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Zs f52299n = new Zs();
    private static final String rl = Zs.class.getSimpleName();
    private static final AtomicBoolean nr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ConcurrentHashMap f52298O = new ConcurrentHashMap();
    private static final ConcurrentHashMap J2 = new ConcurrentHashMap();

    private final synchronized void nr() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = nr;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.s4.qie());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            f52300t = defaultSharedPreferences;
            SharedPreferences sharedPreferences = null;
            if (defaultSharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = f52300t;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f52298O.putAll(com.facebook.internal.vd.dR0(string));
            J2.putAll(com.facebook.internal.vd.dR0(string2));
            atomicBoolean.set(true);
            return;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return;
        }
    }

    public static final void O() {
        if (VmF.j.nr(Zs.class)) {
            return;
        }
        try {
            if (nr.get()) {
                return;
            }
            f52299n.nr();
        } catch (Throwable th) {
            VmF.j.rl(th, Zs.class);
        }
    }

    public static final void Uo(Map ud) {
        String[] strArr;
        List<String> listSplit;
        if (VmF.j.nr(Zs.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(ud, "ud");
            if (!nr.get()) {
                f52299n.nr();
            }
            for (Map.Entry entry : ud.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Zs zs = f52299n;
                int length = str2.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    boolean z3 = Intrinsics.compare((int) str2.charAt(!z2 ? i2 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z3) {
                        i2++;
                    } else {
                        z2 = true;
                    }
                }
                String strEWS = com.facebook.internal.vd.EWS(zs.J2(str, str2.subSequence(i2, length + 1).toString()));
                ConcurrentHashMap concurrentHashMap = J2;
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (listSplit = new Regex(",").split(str3, 0)) == null || (strArr = (String[]) listSplit.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setMutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                    if (setMutableSetOf.contains(strEWS)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strEWS);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(",");
                        sb.append(strEWS);
                    } else {
                        for (int i3 = 1; i3 < 5; i3++) {
                            sb.append(strArr[i3]);
                            sb.append(",");
                        }
                        sb.append(strEWS);
                        setMutableSetOf.remove(strArr[0]);
                    }
                    J2.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, strEWS);
                }
            }
            f52299n.KN("com.facebook.appevents.UserDataStore.internalUserData", com.facebook.internal.vd.m(J2));
        } catch (Throwable th) {
            VmF.j.rl(th, Zs.class);
        }
    }

    public static final String rl() {
        if (VmF.j.nr(Zs.class)) {
            return null;
        }
        try {
            if (!nr.get()) {
                f52299n.nr();
            }
            HashMap map = new HashMap();
            map.putAll(f52298O);
            map.putAll(f52299n.t());
            return com.facebook.internal.vd.m(map);
        } catch (Throwable th) {
            VmF.j.rl(th, Zs.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(String key, String value) {
        if (VmF.j.nr(Zs.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(value, "$value");
            if (!nr.get()) {
                f52299n.nr();
            }
            SharedPreferences sharedPreferences = f52300t;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(key, value).apply();
        } catch (Throwable th) {
            VmF.j.rl(th, Zs.class);
        }
    }

    private Zs() {
    }

    private final String J2(String str, String str2) {
        String strSubstring;
        int i2;
        boolean z2;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (Intrinsics.compare((int) str2.charAt(i2), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i3++;
                    }
                } else {
                    if (!z2) {
                        break;
                    }
                    length--;
                }
            }
            String lowerCase = str2.subSequence(i3, length + 1).toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(rl, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", str)) {
                    if (lowerCase.length() <= 0) {
                        strSubstring = "";
                    } else {
                        strSubstring = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    if (!Intrinsics.areEqual(InneractiveMediationDefs.GENDER_FEMALE, strSubstring) && !Intrinsics.areEqual("m", strSubstring)) {
                        Log.e(rl, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final void KN(final String str, final String str2) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            com.facebook.s4.Z().execute(new Runnable() { // from class: com.facebook.appevents.Md
                @Override // java.lang.Runnable
                public final void run() {
                    Zs.xMQ(str, str2);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final Map t() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set setRl = Vk7.Ml.nr.rl();
            for (String str : J2.keySet()) {
                if (setRl.contains(str)) {
                    map.put(str, J2.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
