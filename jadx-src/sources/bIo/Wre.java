package bIo;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
        I28(Object obj) {
            super(1, obj, JSONObject.class, "getString", "getString(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            return ((JSONObject) this.receiver).getString(str);
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, JSONObject.class, "getJSONArray", "getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke(String str) {
            return ((JSONObject) this.receiver).getJSONArray(str);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            return Boolean.valueOf(((JSONObject) this.receiver).getBoolean(str));
        }

        j(Object obj) {
            super(1, obj, JSONObject.class, "getBoolean", "getBoolean(Ljava/lang/String;)Z", 0);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
        n(Object obj) {
            super(1, obj, JSONObject.class, "getDouble", "getDouble(Ljava/lang/String;)D", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Double invoke(String str) {
            return Double.valueOf(((JSONObject) this.receiver).getDouble(str));
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, JSONObject.class, "getInt", "getInt(Ljava/lang/String;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String str) {
            return Integer.valueOf(((JSONObject) this.receiver).getInt(str));
        }
    }

    public static final JSONObject J2(JSONObject jSONObject, JSONObject other) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        Iterator<String> itKeys = other.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, other.get(next));
        }
        return jSONObject2;
    }

    public static final V8ValueArray KN(JSONArray jSONArray, V8Runtime runtime) throws JSONException, JavetException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        V8ValueArray v8ValueArrayCreateV8ValueArray = runtime.createV8ValueArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof Boolean) {
                v8ValueArrayCreateV8ValueArray.push(obj);
            } else if (obj instanceof Integer) {
                v8ValueArrayCreateV8ValueArray.push(obj);
            } else if (obj instanceof Long) {
                v8ValueArrayCreateV8ValueArray.push(Double.valueOf(((Number) obj).longValue()));
            } else if (obj instanceof Double) {
                v8ValueArrayCreateV8ValueArray.push(obj);
            } else if (obj instanceof String) {
                v8ValueArrayCreateV8ValueArray.push(obj);
            } else if (obj instanceof JSONArray) {
                V8ValueArray v8ValueArrayKN = KN((JSONArray) obj, runtime);
                try {
                    v8ValueArrayCreateV8ValueArray.push(v8ValueArrayKN);
                    AutoCloseableKt.closeFinally(v8ValueArrayKN, null);
                } finally {
                }
            } else if (obj instanceof JSONObject) {
                V8ValueObject v8ValueObjectXMQ = xMQ((JSONObject) obj, runtime);
                try {
                    v8ValueArrayCreateV8ValueArray.push(v8ValueObjectXMQ);
                    AutoCloseableKt.closeFinally(v8ValueObjectXMQ, null);
                } finally {
                }
            } else if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
                v8ValueArrayCreateV8ValueArray.pushNull();
            }
        }
        Intrinsics.checkNotNull(v8ValueArrayCreateV8ValueArray);
        return v8ValueArrayCreateV8ValueArray;
    }

    public static final String O(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (String) Uo(jSONObject, name, new I28(jSONObject));
    }

    public static final Boolean n(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (Boolean) Uo(jSONObject, name, new j(jSONObject));
    }

    public static final JSONArray nr(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (JSONArray) Uo(jSONObject, name, new Ml(jSONObject));
    }

    public static final Double rl(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (Double) Uo(jSONObject, name, new n(jSONObject));
    }

    public static final Integer t(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (Integer) Uo(jSONObject, name, new w6(jSONObject));
    }

    public static final V8ValueObject xMQ(JSONObject jSONObject, V8Runtime runtime) throws JSONException, JavetException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        V8ValueObject v8ValueObjectCreateV8ValueObject = runtime.createV8ValueObject();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Boolean) {
                v8ValueObjectCreateV8ValueObject.set(next, obj);
            } else if (obj instanceof Integer) {
                v8ValueObjectCreateV8ValueObject.set(next, obj);
            } else if (obj instanceof Long) {
                v8ValueObjectCreateV8ValueObject.set(next, Double.valueOf(((Number) obj).longValue()));
            } else if (obj instanceof Double) {
                v8ValueObjectCreateV8ValueObject.set(next, obj);
            } else if (obj instanceof String) {
                v8ValueObjectCreateV8ValueObject.set(next, obj);
            } else if (obj instanceof JSONArray) {
                V8ValueArray v8ValueArrayKN = KN((JSONArray) obj, runtime);
                try {
                    v8ValueObjectCreateV8ValueObject.set(next, v8ValueArrayKN);
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(v8ValueArrayKN, null);
                } finally {
                }
            } else if (obj instanceof JSONObject) {
                if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
                    v8ValueObjectCreateV8ValueObject.setNull(next);
                }
                V8ValueObject v8ValueObjectXMQ = xMQ((JSONObject) obj, runtime);
                try {
                    v8ValueObjectCreateV8ValueObject.set(next, v8ValueObjectXMQ);
                    Unit unit2 = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(v8ValueObjectXMQ, null);
                } finally {
                }
            } else if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
                v8ValueObjectCreateV8ValueObject.setNull(next);
            }
        }
        Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject);
        return v8ValueObjectCreateV8ValueObject;
    }

    private static final Object Uo(JSONObject jSONObject, String str, Function1 function1) {
        if (!jSONObject.has(str)) {
            return null;
        }
        try {
            return function1.invoke(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
