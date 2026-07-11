package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinSdkUtils;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class BundleUtils {
    public static boolean getBoolean(String str, Bundle bundle) {
        return getBoolean(str, false, bundle);
    }

    public static Bundle getBundle(String str, Bundle bundle) {
        return getBundle(str, null, bundle);
    }

    public static int getInt(String str, Bundle bundle) {
        return getInt(str, 0, bundle);
    }

    public static long getLong(String str, Bundle bundle) {
        return getLong(str, 0L, bundle);
    }

    public static String getString(String str, Bundle bundle) {
        return getString(str, null, bundle);
    }

    public static boolean getBoolean(String str, boolean z2, Bundle bundle) {
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() != 0;
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("1")) {
                    return true;
                }
                if (str2.equalsIgnoreCase(V8ValueBoolean.FALSE) || str2.equalsIgnoreCase("0")) {
                    return false;
                }
            }
        }
        return z2;
    }

    public static Bundle getBundle(String str, Bundle bundle, Bundle bundle2) {
        Bundle bundle3;
        return (TextUtils.isEmpty(str) || bundle2 == null || (bundle3 = bundle2.getBundle(str)) == null) ? bundle : bundle3;
    }

    public static int getInt(String str, int i2, Bundle bundle) {
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                try {
                    return Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return i2;
    }

    public static long getLong(String str, long j2, Bundle bundle) {
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof String) {
                try {
                    return Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return j2;
    }

    public static String getString(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str) || bundle == null || !bundle.containsKey(str)) {
            return str2;
        }
        Object obj = bundle.get(str);
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    public static void put(String str, @Nullable Object obj, Bundle bundle) {
        if (obj == null) {
            C1804o.h("AppLovinSdk", "Skipped insertion into Bundle because value is null.");
            return;
        }
        if (obj instanceof String) {
            putString(str, (String) obj, bundle);
            return;
        }
        if (obj instanceof Boolean) {
            putBoolean(str, (Boolean) obj, bundle);
            return;
        }
        if (obj instanceof Integer) {
            putInt(str, (Integer) obj, bundle);
            return;
        }
        if (obj instanceof Long) {
            putLong(str, (Long) obj, bundle);
            return;
        }
        if (obj instanceof Double) {
            putDouble(str, (Double) obj, bundle);
            return;
        }
        if (obj instanceof Byte) {
            putByte(str, (Byte) obj, bundle);
            return;
        }
        if (obj instanceof Character) {
            putChar(str, (Character) obj, bundle);
            return;
        }
        if (obj instanceof Float) {
            putFloat(str, (Float) obj, bundle);
            return;
        }
        if (obj instanceof Short) {
            putShort(str, (Short) obj, bundle);
            return;
        }
        if (obj instanceof CharSequence) {
            putCharSequence(str, (CharSequence) obj, bundle);
            return;
        }
        if (obj instanceof String[]) {
            putStringArray(str, (String[]) obj, bundle);
            return;
        }
        if (obj instanceof boolean[]) {
            putBooleanArray(str, (boolean[]) obj, bundle);
            return;
        }
        if (obj instanceof int[]) {
            putIntArray(str, (int[]) obj, bundle);
            return;
        }
        if (obj instanceof long[]) {
            putLongArray(str, (long[]) obj, bundle);
            return;
        }
        if (obj instanceof double[]) {
            putDoubleArray(str, (double[]) obj, bundle);
            return;
        }
        if (obj instanceof byte[]) {
            putByteArray(str, (byte[]) obj, bundle);
            return;
        }
        if (obj instanceof char[]) {
            putCharArray(str, (char[]) obj, bundle);
            return;
        }
        if (obj instanceof float[]) {
            putFloatArray(str, (float[]) obj, bundle);
            return;
        }
        if (obj instanceof short[]) {
            putShortArray(str, (short[]) obj, bundle);
            return;
        }
        if (obj instanceof CharSequence[]) {
            putCharSequenceArray(str, (CharSequence[]) obj, bundle);
            return;
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.size() > 0) {
                if (arrayList.get(0) instanceof String) {
                    putStringArrayList(str, arrayList, bundle);
                    return;
                } else if (arrayList.get(0) instanceof Integer) {
                    putIntegerArrayList(str, arrayList, bundle);
                    return;
                } else {
                    if (arrayList.get(0) instanceof CharSequence) {
                        putCharSequenceArrayList(str, arrayList, bundle);
                        return;
                    }
                    return;
                }
            }
        }
        C1804o.h("AppLovinSdk", "Skipped insertion of " + obj + " into Bundle");
    }

    public static void putBoolean(String str, @Nullable Boolean bool, Bundle bundle) {
        if (bool != null) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public static void putBooleanArray(String str, @Nullable boolean[] zArr, Bundle bundle) {
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static void putByte(String str, @Nullable Byte b2, Bundle bundle) {
        if (b2 != null) {
            bundle.putByte(str, b2.byteValue());
        }
    }

    public static void putByteArray(String str, @Nullable byte[] bArr, Bundle bundle) {
        if (bArr != null) {
            bundle.putByteArray(str, bArr);
        }
    }

    public static void putChar(String str, @Nullable Character ch, Bundle bundle) {
        if (ch != null) {
            bundle.putChar(str, ch.charValue());
        }
    }

    public static void putCharArray(String str, @Nullable char[] cArr, Bundle bundle) {
        if (cArr != null) {
            bundle.putCharArray(str, cArr);
        }
    }

    public static void putCharSequence(String str, @Nullable CharSequence charSequence, Bundle bundle) {
        if (charSequence != null) {
            bundle.putCharSequence(str, charSequence);
        }
    }

    public static void putCharSequenceArray(String str, @Nullable CharSequence[] charSequenceArr, Bundle bundle) {
        if (charSequenceArr != null) {
            bundle.putCharSequenceArray(str, charSequenceArr);
        }
    }

    public static void putCharSequenceArrayList(String str, @Nullable ArrayList<CharSequence> arrayList, Bundle bundle) {
        if (arrayList != null) {
            bundle.putCharSequenceArrayList(str, arrayList);
        }
    }

    public static void putDouble(String str, @Nullable Double d2, Bundle bundle) {
        if (d2 != null) {
            bundle.putDouble(str, d2.doubleValue());
        }
    }

    public static void putDoubleArray(String str, @Nullable double[] dArr, Bundle bundle) {
        if (dArr != null) {
            bundle.putDoubleArray(str, dArr);
        }
    }

    public static void putFloat(String str, @Nullable Float f3, Bundle bundle) {
        if (f3 != null) {
            bundle.putFloat(str, f3.floatValue());
        }
    }

    public static void putFloatArray(String str, @Nullable float[] fArr, Bundle bundle) {
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        }
    }

    public static void putInt(String str, @Nullable Integer num, Bundle bundle) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    public static void putIntArray(String str, @Nullable int[] iArr, Bundle bundle) {
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        }
    }

    public static void putIntegerArrayList(String str, @Nullable ArrayList<Integer> arrayList, Bundle bundle) {
        if (arrayList != null) {
            bundle.putIntegerArrayList(str, arrayList);
        }
    }

    public static void putLong(String str, @Nullable Long l2, Bundle bundle) {
        if (l2 != null) {
            bundle.putLong(str, l2.longValue());
        }
    }

    public static void putLongArray(String str, @Nullable long[] jArr, Bundle bundle) {
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        }
    }

    public static void putShort(String str, @Nullable Short sh, Bundle bundle) {
        if (sh != null) {
            bundle.putShort(str, sh.shortValue());
        }
    }

    public static void putShortArray(String str, @Nullable short[] sArr, Bundle bundle) {
        if (sArr != null) {
            bundle.putShortArray(str, sArr);
        }
    }

    public static void putString(String str, @Nullable String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void putStringArray(String str, @Nullable String[] strArr, Bundle bundle) {
        if (strArr != null) {
            bundle.putStringArray(str, strArr);
        }
    }

    public static void putStringArrayList(String str, @Nullable ArrayList<String> arrayList, Bundle bundle) {
        if (arrayList != null) {
            bundle.putStringArrayList(str, arrayList);
        }
    }

    public static JSONObject toJSONObject(Bundle bundle) {
        if (bundle == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    if (obj instanceof Bundle) {
                        jSONObject.put(str, toJSONObject((Bundle) obj));
                    } else if ((obj instanceof Collection) || (obj instanceof Parcelable[])) {
                        Collection collectionAsList = obj instanceof Collection ? (Collection) obj : Arrays.asList((Parcelable[]) obj);
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj2 : collectionAsList) {
                            if (obj2 instanceof Bundle) {
                                jSONArray.put(toJSONObject((Bundle) obj2));
                            } else {
                                jSONArray.put(obj2);
                            }
                        }
                        jSONObject.put(str, jSONArray);
                    } else {
                        jSONObject.put(str, obj);
                    }
                }
            }
        } catch (JSONException e2) {
            C1804o.c("AppLovinSdk", "Failed to convert Bundle to JSONObject", e2);
        }
        return jSONObject;
    }

    public static Map<String, Object> toMap(Bundle bundle) {
        if (bundle == null) {
            return new HashMap();
        }
        HashMap map = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    map.put(str, toMap((Bundle) obj));
                } else {
                    boolean z2 = obj instanceof Collection;
                    if (z2 || (obj instanceof Parcelable[])) {
                        Collection collectionAsList = z2 ? (Collection) obj : Arrays.asList((Parcelable[]) obj);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : collectionAsList) {
                            if (obj2 instanceof Bundle) {
                                arrayList.add(toMap((Bundle) obj2));
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        map.put(str, arrayList);
                    } else {
                        map.put(str, obj);
                    }
                }
            }
        }
        return map;
    }

    public static Map<String, String> toStringMap(Bundle bundle) {
        if (bundle == null) {
            return new HashMap(0);
        }
        HashMap map = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            map.put(str, String.valueOf(bundle.get(str)));
        }
        return map;
    }

    public static void putStringIfValid(String str, @Nullable String str2, Bundle bundle) {
        if (AppLovinSdkUtils.isValidString(str2)) {
            bundle.putString(str, str2);
        }
    }
}
