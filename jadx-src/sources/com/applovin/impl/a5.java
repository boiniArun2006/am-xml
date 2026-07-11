package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class a5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C1802k f47924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f47925c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f47926a;

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void b(z4 z4Var, Object obj) {
        b(z4Var, obj, this.f47926a);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public void b(z4 z4Var, Object obj, SharedPreferences sharedPreferences) {
        a(z4Var.a(), obj, sharedPreferences);
    }

    public a5(C1802k c1802k) {
        this.f47926a = C1802k.o().getSharedPreferences("com.applovin.sdk.preferences." + c1802k.i0(), 0);
        f47924b = c1802k;
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                C1804o.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z2) {
            return;
        }
        a(editor);
    }

    public static void b(z4 z4Var, Object obj, Context context) {
        a(z4Var.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public void b(z4 z4Var) {
        a(this.f47926a.edit().remove(z4Var.a()));
    }

    public Object a(z4 z4Var, Object obj) {
        return a(z4Var, obj, this.f47926a);
    }

    public Object a(z4 z4Var, Object obj, SharedPreferences sharedPreferences) {
        return a(z4Var.a(), obj, z4Var.b(), sharedPreferences);
    }

    public static Object a(z4 z4Var, Object obj, Context context) {
        return a(z4Var.a(), obj, z4Var.b(), a(context));
    }

    public static Object a(z4 z4Var, Object obj, SharedPreferences sharedPreferences, boolean z2) {
        return a(z4Var.a(), obj, z4Var.b(), sharedPreferences, z2);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z2) {
        Object stringSet;
        long jLongValue;
        int iIntValue;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        iIntValue = ((Long) obj).intValue();
                    } else {
                        iIntValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) obj).longValue();
                    } else {
                        jLongValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            return stringSet != null ? cls.cast(stringSet) : obj;
        } catch (Throwable th) {
            if (z2) {
                try {
                    C1804o.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(z4 z4Var) {
        Object objA = a(z4Var, null);
        b(z4Var);
        return objA;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public static void a(final SharedPreferences.Editor editor) {
        try {
            if (n7.i()) {
                C1802k c1802k = f47924b;
                if (c1802k != null && c1802k.q0() != null) {
                    d6 d6VarQ0 = f47924b.q0();
                    C1802k c1802k2 = f47924b;
                    Objects.requireNonNull(editor);
                    d6VarQ0.a((AbstractRunnableC1782i5) new C1797r6(c1802k2, true, "commitSharedPreferencesChanges", new Runnable() { // from class: com.applovin.impl.QJ
                        @Override // java.lang.Runnable
                        public final void run() {
                            editor.commit();
                        }
                    }), d6.b.OTHER);
                    return;
                }
                editor.apply();
                return;
            }
            editor.commit();
        } catch (Throwable th) {
            C1804o.c("SharedPreferencesManager", "Unable to apply changes", th);
            try {
                f47924b.D().a("SharedPreferencesManager", "persistChanges", th);
            } catch (Throwable unused) {
            }
        }
    }

    private static SharedPreferences a(Context context) {
        if (f47925c == null) {
            f47925c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f47925c;
    }
}
