package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f52823n = new w6();
    private static final Map rl;

    public static final class CN3 implements fuX {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = jSONArray.get(i2);
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj.getClass());
                }
                arrayList.add(obj);
            }
            bundle.putStringArrayList(key, arrayList);
        }

        CN3() {
        }
    }

    public static final class I28 implements fuX {
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(key, (String) value);
        }

        I28() {
        }
    }

    public static final class Ml implements fuX {
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }

        Ml() {
        }
    }

    public static final class Wre implements fuX {
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        Wre() {
        }
    }

    public interface fuX {
        void n(Bundle bundle, String str, Object obj);
    }

    public static final class j implements fuX {
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }

        j() {
        }
    }

    public static final class n implements fuX {
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }

        n() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.w6$w6, reason: collision with other inner class name */
    public static final class C0758w6 implements fuX {
        @Override // com.facebook.internal.w6.fuX
        public void n(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }

        C0758w6() {
        }
    }

    static {
        HashMap map = new HashMap();
        rl = map;
        map.put(Boolean.class, new j());
        map.put(Integer.class, new n());
        map.put(Long.class, new C0758w6());
        map.put(Double.class, new Ml());
        map.put(String.class, new I28());
        map.put(String[].class, new Wre());
        map.put(JSONArray.class, new CN3());
    }

    public static final Bundle n(JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, n((JSONObject) value));
                } else {
                    fuX fux = (fuX) rl.get(value.getClass());
                    if (fux == null) {
                        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    fux.n(bundle, key, value);
                }
            }
        }
        return bundle;
    }

    private w6() {
    }
}
