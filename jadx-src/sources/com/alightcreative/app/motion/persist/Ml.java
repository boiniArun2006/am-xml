package com.alightcreative.app.motion.persist;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f45797O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f45798n;
    private Object nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f45799t;

    public Ml(Object defaultValue, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f45798n = defaultValue;
        this.rl = z2;
        this.f45799t = z3;
    }

    public /* synthetic */ Ml(Object obj, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3);
    }

    public final Object rl(Object obj, KProperty property) {
        Object objRl;
        List listSplit$default;
        Object obj2;
        Intrinsics.checkNotNullParameter(property, "property");
        String str = "com.alightcreative.motion." + property.getName();
        if (this.rl && (obj2 = this.nr) != null) {
            return obj2;
        }
        try {
            Object obj3 = this.f45798n;
            if (obj3 instanceof Enum) {
                String string = n().getString(str, ((Enum) this.f45798n).name());
                Object[] enumConstants = this.f45798n.getClass().getEnumConstants();
                Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
                int length = enumConstants.length;
                for (int i2 = 0; i2 < length; i2++) {
                    objRl = enumConstants[i2];
                    Intrinsics.checkNotNull(objRl, "null cannot be cast to non-null type kotlin.Enum<*>");
                    if (!Intrinsics.areEqual(((Enum) objRl).name(), string)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            if (obj3 instanceof String) {
                objRl = n().getString(str, (String) this.f45798n);
            } else if (obj3 instanceof Boolean) {
                objRl = Boolean.valueOf(n().getBoolean(str, ((Boolean) this.f45798n).booleanValue()));
            } else if (obj3 instanceof Integer) {
                objRl = Integer.valueOf(n().getInt(str, ((Number) this.f45798n).intValue()));
            } else if (obj3 instanceof Float) {
                objRl = Float.valueOf(n().getFloat(str, ((Number) this.f45798n).floatValue()));
            } else if (obj3 instanceof Long) {
                objRl = Long.valueOf(n().getLong(str, ((Number) this.f45798n).longValue()));
            } else if (obj3 instanceof Set) {
                SharedPreferences sharedPreferencesN = n();
                Object obj4 = this.f45798n;
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                objRl = sharedPreferencesN.getStringSet(str, (Set) obj4);
            } else {
                if (!(obj3 instanceof w6)) {
                    throw new UnsupportedOperationException();
                }
                String string2 = n().getString(str, null);
                if (string2 == null || (listSplit$default = StringsKt.split$default((CharSequence) string2, new String[]{"\u001f"}, false, 0, 6, (Object) null)) == null || (objRl = w6.rl((w6) this.f45798n, 0, listSplit$default, 1, null)) == null) {
                    objRl = (w6) this.f45798n;
                }
            }
        } catch (ClassCastException unused) {
            objRl = this.f45798n;
        }
        Intrinsics.checkNotNull(objRl, "null cannot be cast to non-null type T of com.alightcreative.app.motion.persist.SharedPref");
        if (this.rl) {
            this.nr = objRl;
        }
        if (this.f45799t && !this.f45797O && !n().contains(str)) {
            t(obj, property, objRl);
            this.f45797O = true;
        }
        return objRl;
    }

    public final void t(Object obj, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = "com.alightcreative.motion." + property.getName();
        if (this.rl) {
            this.nr = value;
        }
        Object obj2 = this.f45798n;
        if (obj2 instanceof Enum) {
            n().edit().putString(str, ((Enum) value).name()).apply();
            return;
        }
        if (obj2 instanceof String) {
            n().edit().putString(str, (String) value).apply();
            return;
        }
        if (obj2 instanceof Boolean) {
            n().edit().putBoolean(str, ((Boolean) value).booleanValue()).apply();
            return;
        }
        if (obj2 instanceof Integer) {
            n().edit().putInt(str, ((Integer) value).intValue()).apply();
            return;
        }
        if (obj2 instanceof Float) {
            n().edit().putFloat(str, ((Float) value).floatValue()).apply();
            return;
        }
        if (obj2 instanceof Long) {
            n().edit().putLong(str, ((Long) value).longValue()).apply();
        } else if (obj2 instanceof Set) {
            n().edit().putStringSet(str, (Set) value).apply();
        } else {
            if (!(obj2 instanceof w6)) {
                throw new UnsupportedOperationException();
            }
            n().edit().putString(str, CollectionsKt.joinToString$default(((w6) value).t(), "\u001f", null, null, 0, null, null, 62, null)).apply();
        }
    }

    private final SharedPreferences n() {
        return PreferenceManager.getDefaultSharedPreferences(IvA.n.rl().getApplicationContext());
    }
}
