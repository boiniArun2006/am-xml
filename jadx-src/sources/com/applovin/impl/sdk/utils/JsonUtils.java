package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C1804o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class JsonUtils {
    public static final String EMPTY_JSON = "{}";

    private static List a(JSONArray jSONArray, List list) {
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(a(jSONArray.get(i2)));
        }
        return arrayList;
    }

    public static boolean containsCaseInsensitiveString(String str, JSONArray jSONArray) {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                Object obj = jSONArray.get(i2);
                if ((obj instanceof String) && ((String) obj).equalsIgnoreCase(str)) {
                    return true;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    public static boolean containsJSONObjectContainingInt(JSONArray jSONArray, int i2, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt(str) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject deepCopy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    jSONObject2.put(next, deepCopy((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONObject2.put(next, deepCopy((JSONArray) obj));
                } else {
                    jSONObject2.put(next, obj);
                }
            } catch (JSONException unused) {
                C1804o.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject deep copy");
            }
        }
        return jSONObject2;
    }

    public static double getDouble(JSONObject jSONObject, String str, double d2) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getDouble(str);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve double property for key = " + str, e2);
            }
        }
        return d2;
    }

    public static float getFloat(JSONObject jSONObject, String str, float f3) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                double d2 = jSONObject.getDouble(str);
                if (-3.4028234663852886E38d < d2 && d2 < 3.4028234663852886E38d) {
                    return (float) d2;
                }
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve float property for key = " + str, e2);
            }
        }
        return f3;
    }

    public static List<Integer> getIntegerList(JSONObject jSONObject, String str, List<Integer> list) {
        JSONArray jSONArray = getJSONArray(jSONObject, str, null);
        return jSONArray != null ? toIntegerList(jSONArray) : list;
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getJSONArray(str);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve JSON array for key = " + str, e2);
            }
        }
        return jSONArray;
    }

    @Nullable
    public static JSONObject getJSONObject(JSONObject jSONObject, String str) {
        return getJSONObject(jSONObject, str, (JSONObject) null);
    }

    public static List getList(JSONObject jSONObject, String str, List list) {
        try {
            JSONArray jSONArray = getJSONArray(jSONObject, str, null);
            if (jSONArray != null) {
                return toList(jSONArray);
            }
        } catch (JSONException unused) {
        }
        return list;
    }

    public static List<String> getStringList(JSONObject jSONObject, String str, List<String> list) {
        JSONArray jSONArray = getJSONArray(jSONObject, str, null);
        return jSONArray != null ? toStringList(jSONArray) : list;
    }

    public static String maybeConvertToIndentedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString(4);
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }

    public static void putAll(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object object = getObject(jSONObject2, next, null);
            if (object != null) {
                putObject(jSONObject, next, object);
            }
        }
    }

    public static void putStringIfValid(JSONArray jSONArray, String str) {
        if (StringUtils.isValidString(str)) {
            jSONArray.put(str);
        }
    }

    public static void removeObjectsForKeys(JSONObject jSONObject, String[] strArr) {
        for (String str : strArr) {
            jSONObject.remove(str);
        }
    }

    public static JSONObject shallowCopy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.get(next));
            } catch (JSONException unused) {
                C1804o.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject copy");
            }
        }
        return jSONObject2;
    }

    public static Bundle toBundle(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj instanceof String) {
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException unused) {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        return toBundle(jSONObject);
    }

    public static Map<String, Object> toStringObjectMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }

    public static boolean valueExists(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static Boolean getBoolean(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            return Boolean.valueOf(getInt(jSONObject, str, (bool == null || !bool.booleanValue()) ? 0 : 1) > 0);
        }
    }

    public static int getInt(JSONObject jSONObject, String str, int i2) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve int property for key = " + str, e2);
            }
        }
        return i2;
    }

    @Nullable
    public static Integer getInteger(@Nullable JSONObject jSONObject, String str, @Nullable Integer num) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve int property for key = " + str, e2);
            }
        }
        return num;
    }

    @Nullable
    public static JSONObject getJSONObject(JSONObject jSONObject, String str, @Nullable JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getJSONObject(str);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve JSON property for key = " + str, e2);
            }
        }
        return jSONObject2;
    }

    public static long getLong(JSONObject jSONObject, String str, long j2) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve long property for key = " + str, e2);
            }
        }
        return j2;
    }

    public static Object getObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                Object obj2 = jSONObject.get(str);
                if (obj2 != null) {
                    return obj2;
                }
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve Object for key = " + str, e2);
            }
        }
        return obj;
    }

    public static Object getObjectAtIndex(JSONArray jSONArray, int i2, Object obj) {
        if (jSONArray != null && jSONArray.length() > i2) {
            try {
                return jSONArray.get(i2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve object at index " + i2 + " for JSON array", e2);
            }
        }
        return obj;
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    return jSONObject.getString(str);
                }
            } catch (Exception e2) {
                C1804o.b("JsonUtils", "Failed to retrieve string property for key = " + str, e2);
            }
        }
        return str2;
    }

    public static boolean isValid(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static JSONObject jsonObjectFromJsonString(String str, JSONObject jSONObject) {
        try {
            return new JSONObject(str);
        } catch (JSONException e2) {
            C1804o.b("JsonUtils", "Failed to convert JSON string '" + str + "' to JSONObject", e2);
            return jSONObject;
        }
    }

    public static void putBoolean(JSONObject jSONObject, String str, boolean z2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, z2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put boolean property for key = " + str, e2);
            }
        }
    }

    public static void putDouble(JSONObject jSONObject, String str, double d2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, d2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put double property for key = " + str, e2);
            }
        }
    }

    public static void putInt(JSONObject jSONObject, String str, int i2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put int property for key = " + str, e2);
            }
        }
    }

    public static void putJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put JSON property for key = " + str, e2);
            }
        }
    }

    public static void putJSONObjectIfValid(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 == null || jSONObject2.length() == 0) {
            return;
        }
        putJSONObject(jSONObject, str, jSONObject2);
    }

    public static void putJsonArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONArray);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put JSONArray property for key = " + str, e2);
            }
        }
    }

    public static void putJsonArrayIfValid(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        putJsonArray(jSONObject, str, jSONArray);
    }

    public static void putLong(JSONObject jSONObject, String str, long j2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put long property for key = " + str, e2);
            }
        }
    }

    public static void putObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put Object property for key = " + str, e2);
            }
        }
    }

    public static void putString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to put String property for key = " + str, e2);
            }
        }
    }

    public static List<Integer> toIntegerList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                arrayList.add((Integer) jSONArray.get(i2));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static JSONArray toJsonArray(String str, JSONArray jSONArray) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return jSONArray;
        }
    }

    public static <T> List<T> toList(JSONArray jSONArray) throws JSONException {
        return a(jSONArray, new ArrayList());
    }

    public static List<String> toStringList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                arrayList.add((String) jSONArray.get(i2));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static Map<String, String> toStringMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)).toString());
        }
        return map;
    }

    public static Map<String, String> tryToStringMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objA = a(jSONObject.get(next));
                map.put(next, objA != null ? objA.toString() : null);
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static boolean valueExists(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && obj != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (obj.equals(getObjectAtIndex(jSONArray, i2, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public static JSONObject deserialize(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable th) {
            C1804o.b("JsonUtils", "Failed to deserialize into JSON: " + str, th);
            return null;
        }
    }

    public static String maybeConvertToIndentedString(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new JSONObject(str).toString(i2);
        } catch (JSONException unused) {
            return str;
        }
    }

    public static <T> List<T> optList(JSONArray jSONArray, List<T> list) {
        try {
            return a(jSONArray, list);
        } catch (JSONException unused) {
            return list;
        }
    }

    public static void putBooleanIfValid(JSONObject jSONObject, String str, Boolean bool) {
        if (StringUtils.isValidString(str) && bool != null) {
            putBoolean(jSONObject, str, bool.booleanValue());
        }
    }

    public static void putStringIfValid(JSONObject jSONObject, String str, String str2) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            putString(jSONObject, str, str2);
        }
    }

    private static Object a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return toStringObjectMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj;
    }

    @Nullable
    public static Double getDouble(JSONObject jSONObject, String str, @Nullable Double d2) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Double.valueOf(jSONObject.getDouble(str));
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve Double property for key = " + str, e2);
            }
        }
        return d2;
    }

    @Nullable
    public static Float getFloat(JSONObject jSONObject, String str, @Nullable Float f3) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                double d2 = jSONObject.getDouble(str);
                if (-3.4028234663852886E38d < d2 && d2 < 3.4028234663852886E38d) {
                    return Float.valueOf((float) d2);
                }
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve float property for key = " + str, e2);
            }
        }
        return f3;
    }

    public static JSONArray getJSONArray(Object obj) {
        if (obj == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    public static JSONObject getJSONObject(JSONArray jSONArray, int i2, JSONObject jSONObject) {
        if (jSONArray != null && i2 < jSONArray.length()) {
            try {
                return jSONArray.getJSONObject(i2);
            } catch (JSONException e2) {
                C1804o.b("JsonUtils", "Failed to retrieve JSON object from array for index = " + i2, e2);
            }
        }
        return jSONObject;
    }

    public static void putAll(JSONObject jSONObject, Map<String, ?> map) {
        if (jSONObject == null || map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                putObject(jSONObject, key, value);
            }
        }
    }

    public static Map<String, Object> toStringObjectMap(String str) {
        try {
            return toStringObjectMap(new JSONObject(str));
        } catch (JSONException e2) {
            C1804o.b("JsonUtils", "Failed to convert json string '" + str + "' to map", e2);
            return new HashMap();
        }
    }

    public static JSONArray shallowCopy(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            jSONArray2.put(jSONArray.opt(i2));
        }
        return jSONArray2;
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject.isNull(next)) {
                    bundle.putString(next, null);
                } else {
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt instanceof JSONObject) {
                        bundle.putBundle(next, toBundle((JSONObject) objOpt));
                    } else if (objOpt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (jSONArray.length() == 0) {
                            bundle.putStringArrayList(next, new ArrayList<>(0));
                        } else if (getObjectAtIndex(jSONArray, 0, null) instanceof String) {
                            ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                arrayList.add((String) getObjectAtIndex(jSONArray, i2, null));
                            }
                            bundle.putStringArrayList(next, arrayList);
                        } else {
                            bundle.putParcelableArrayList(next, toBundle(jSONArray));
                        }
                    } else if (objOpt instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                    } else if (objOpt instanceof String) {
                        bundle.putString(next, (String) objOpt);
                    } else if (objOpt instanceof Integer) {
                        bundle.putInt(next, ((Integer) objOpt).intValue());
                    } else if (objOpt instanceof Long) {
                        bundle.putLong(next, ((Long) objOpt).longValue());
                    } else if (objOpt instanceof Double) {
                        bundle.putDouble(next, ((Double) objOpt).doubleValue());
                    }
                }
            }
            return bundle;
        }
        return new Bundle();
    }

    public static JSONArray deepCopy(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                Object obj = jSONArray.get(i2);
                if (obj instanceof JSONObject) {
                    jSONArray2.put(i2, deepCopy((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONArray2.put(i2, deepCopy((JSONArray) obj));
                } else {
                    jSONArray2.put(i2, obj);
                }
            } catch (JSONException unused) {
                C1804o.l("JsonUtils", "Failed to copy over item at index " + i2 + " to JSONArray deep copy");
            }
        }
        return jSONArray2;
    }

    public static ArrayList<Bundle> toBundle(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList<Bundle> arrayList = new ArrayList<>(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(toBundle(jSONArray.optJSONObject(i2)));
            }
            return arrayList;
        }
        return new ArrayList<>();
    }
}
