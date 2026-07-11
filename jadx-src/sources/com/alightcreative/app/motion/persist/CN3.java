package com.alightcreative.app.motion.persist;

import HI0.gnv;
import Hr.CQ.USEaHtCMH;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f45794n;

    public CN3(Object defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f45794n = defaultValue;
    }

    public final Object rl(Object obj, KProperty property) {
        Object stringSet;
        Intrinsics.checkNotNullParameter(property, "property");
        String string = n().getString("com.alightcreative.motion.vdat", "");
        SharedPreferences sharedPreferencesN = n();
        byte[] bArrAz = gnv.az(property.getName());
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        String strSubstring = gnv.o(bArrAz).substring(0, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string2 = sharedPreferencesN.getString("com.alightcreative.motion." + strSubstring + ".ex", "");
        if (!Intrinsics.areEqual(string, n.t(null, 1, null)) || !Intrinsics.areEqual(string2, n.rl(property.getName()))) {
            return this.f45794n;
        }
        byte[] bArrAz2 = gnv.az("com.alightcreative.motion." + property.getName());
        Intrinsics.checkNotNullExpressionValue(bArrAz2, "sha1(...)");
        String strSubstring2 = gnv.o(bArrAz2).substring(0, 20);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String str = "AC" + strSubstring2 + "X";
        Object obj2 = this.f45794n;
        if (obj2 instanceof Enum) {
            String string3 = n().getString(str, ((Enum) this.f45794n).name());
            Object[] enumConstants = this.f45794n.getClass().getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, USEaHtCMH.UnBxMONMUo);
            int length = enumConstants.length;
            for (int i2 = 0; i2 < length; i2++) {
                stringSet = enumConstants[i2];
                Intrinsics.checkNotNull(stringSet, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (!Intrinsics.areEqual(((Enum) stringSet).name(), string3)) {
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        if (obj2 instanceof String) {
            stringSet = n().getString(str, (String) this.f45794n);
        } else if (obj2 instanceof Boolean) {
            stringSet = Boolean.valueOf(n().getBoolean(str, ((Boolean) this.f45794n).booleanValue()));
        } else if (obj2 instanceof Integer) {
            stringSet = Integer.valueOf(n().getInt(str, ((Number) this.f45794n).intValue()));
        } else if (obj2 instanceof Float) {
            stringSet = Float.valueOf(n().getFloat(str, ((Number) this.f45794n).floatValue()));
        } else if (obj2 instanceof Long) {
            stringSet = Long.valueOf(n().getLong(str, ((Number) this.f45794n).longValue()));
        } else {
            if (!(obj2 instanceof Set)) {
                throw new UnsupportedOperationException();
            }
            SharedPreferences sharedPreferencesN2 = n();
            Object obj3 = this.f45794n;
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            stringSet = sharedPreferencesN2.getStringSet(str, (Set) obj3);
        }
        Intrinsics.checkNotNull(stringSet, "null cannot be cast to non-null type T of com.alightcreative.app.motion.persist.ValidatedSharedPref");
        return stringSet;
    }

    public final void t(Object obj, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bArrAz = gnv.az("com.alightcreative.motion." + property.getName());
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        String strSubstring = gnv.o(bArrAz).substring(0, 20);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String str = "AC" + strSubstring + "X";
        Object obj2 = this.f45794n;
        if (obj2 instanceof Enum) {
            nr(this, property).putString(str, ((Enum) value).name()).apply();
            return;
        }
        if (obj2 instanceof String) {
            nr(this, property).putString(str, (String) value).apply();
            return;
        }
        if (obj2 instanceof Boolean) {
            nr(this, property).putBoolean(str, ((Boolean) value).booleanValue()).apply();
            return;
        }
        if (obj2 instanceof Integer) {
            nr(this, property).putInt(str, ((Integer) value).intValue()).apply();
            return;
        }
        if (obj2 instanceof Float) {
            nr(this, property).putFloat(str, ((Float) value).floatValue()).apply();
        } else if (obj2 instanceof Long) {
            nr(this, property).putLong(str, ((Long) value).longValue()).apply();
        } else {
            if (!(obj2 instanceof Set)) {
                throw new UnsupportedOperationException();
            }
            nr(this, property).putStringSet(str, (Set) value).apply();
        }
    }

    private final SharedPreferences n() {
        return PreferenceManager.getDefaultSharedPreferences(IvA.n.rl().getApplicationContext());
    }

    private static final SharedPreferences.Editor nr(CN3 cn3, KProperty kProperty) {
        SharedPreferences.Editor editorPutString = cn3.n().edit().putString("com.alightcreative.motion.vdat", n.t(null, 1, null));
        byte[] bArrAz = gnv.az(kProperty.getName());
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        String strSubstring = gnv.o(bArrAz).substring(0, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return editorPutString.putString("com.alightcreative.motion." + strSubstring + ".ex", n.rl(kProperty.getName()));
    }
}
