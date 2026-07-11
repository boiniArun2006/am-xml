package mCM;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mCM.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2292c {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DateFormat f70663n;

    /* JADX INFO: renamed from: mCM.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                if (obj == JSONObject.NULL) {
                    return null;
                }
                throw new IllegalArgumentException("Object cannot be decoded from JSON: " + obj);
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(n(jSONArray.opt(i2)));
            }
            return arrayList;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.has("@type")) {
            String strOptString = jSONObject.optString("@type");
            String value = jSONObject.optString("value");
            if (Intrinsics.areEqual(strOptString, "type.googleapis.com/google.protobuf.Int64Value")) {
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    return Long.valueOf(Long.parseLong(value));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Invalid Long format:" + value);
                }
            }
            if (Intrinsics.areEqual(strOptString, "type.googleapis.com/google.protobuf.UInt64Value")) {
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    return Long.valueOf(Long.parseLong(value));
                } catch (NumberFormatException unused2) {
                    throw new IllegalArgumentException("Invalid Long format:" + value);
                }
            }
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object objN = n(jSONObject.opt(key));
            Intrinsics.checkNotNullExpressionValue(key, "key");
            map.put(key, objN);
        }
        return map;
    }

    public final Object rl(Object obj) {
        boolean z2;
        boolean z3;
        if (obj == null || obj == JSONObject.NULL) {
            Object NULL = JSONObject.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            return NULL;
        }
        if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", String.valueOf(((Number) obj).longValue()));
                return jSONObject;
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding Long.", e2);
            }
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z2 = obj instanceof JSONObject)) || ((z3 = obj instanceof JSONArray))) {
            return obj;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject2 = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Object keys must be strings.");
                }
                try {
                    jSONObject2.put((String) obj2, rl(map.get(obj2)));
                } catch (JSONException e3) {
                    throw new RuntimeException(e3);
                }
            }
            return jSONObject2;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(rl(it.next()));
            }
            return jSONArray;
        }
        if (z2) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next == null) {
                    throw new IllegalArgumentException("Object keys cannot be null.");
                }
                try {
                    jSONObject3.put(next, rl(jSONObject4.opt(next)));
                } catch (JSONException e4) {
                    throw new RuntimeException(e4);
                }
            }
            return jSONObject3;
        }
        if (!z3) {
            throw new IllegalArgumentException("Object cannot be encoded in JSON: " + obj);
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = (JSONArray) obj;
        int length = jSONArray3.length();
        for (int i2 = 0; i2 < length; i2++) {
            jSONArray2.put(rl(jSONArray3.opt(i2)));
        }
        return jSONArray2;
    }

    public C2292c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        this.f70663n = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }
}
