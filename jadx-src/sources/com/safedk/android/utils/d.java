package com.safedk.android.utils;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class d {
    public static Map<String, String> a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objB = jSONObject.get(next);
            if (objB instanceof JSONArray) {
                objB = a((JSONArray) objB);
            } else if (objB instanceof JSONObject) {
                objB = b((JSONObject) objB);
            }
            map.put(next, (String) objB);
        }
        return map;
    }

    public static Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objB = jSONObject.get(next);
            if (objB instanceof JSONArray) {
                objB = a((JSONArray) objB);
            } else if (objB instanceof JSONObject) {
                objB = b((JSONObject) objB);
            }
            map.put(next, objB);
        }
        return map;
    }

    public static List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object objB = jSONArray.get(i2);
                if (objB instanceof JSONArray) {
                    objB = a((JSONArray) objB);
                } else if (objB instanceof JSONObject) {
                    objB = b((JSONObject) objB);
                }
                arrayList.add(objB);
            }
        }
        return arrayList;
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
        }
        return arrayList;
    }

    public static JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            synchronized (collection) {
                for (Object obj : collection) {
                    if (obj != null) {
                        jSONArray.put(obj);
                    }
                }
            }
        }
        return jSONArray;
    }

    public static <T> JSONObject a(Map<T, ?> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<T, ?> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        if (entry.getValue() instanceof Collection) {
                            jSONObject.put(String.valueOf(entry.getKey()), a((Collection<?>) entry.getValue()));
                        } else if (entry.getValue() instanceof Map) {
                            jSONObject.put(String.valueOf(entry.getKey()), a((Map) entry.getValue()));
                        } else {
                            jSONObject.put(String.valueOf(entry.getKey()), entry.getValue());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    if (obj instanceof Collection) {
                        jSONObject.put(str, a((Collection<?>) obj));
                    } else if (obj instanceof Map) {
                        jSONObject.put(str, a((Map) obj));
                    } else {
                        jSONObject.put(str, obj);
                    }
                }
            }
        }
        return jSONObject;
    }
}
