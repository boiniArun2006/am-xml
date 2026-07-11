package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class ProtobufMessageParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62040a = "ProtobufMessageParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62041b = "array";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62042c = "string";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62043d = "undefined_key";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f62045f = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62044e = 0;

    public static class ProtobufParserException extends Exception {
    }

    private ProtobufMessageParser() {
    }

    public static JSONObject a(byte[] bArr, String str) {
        return new ProtobufMessageParser().b(bArr, str);
    }

    private JSONObject b(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0 || str == null || str.isEmpty()) {
            Logger.d(f62040a, "parse protobuf message - invalid input");
            return new JSONObject();
        }
        this.f62044e = 0;
        this.f62045f = bArr;
        JSONObject jSONObject = new JSONObject();
        try {
            a(new JSONObject(str), jSONObject, bArr.length);
            return jSONObject;
        } catch (ProtobufParserException | JSONException e2) {
            Logger.d(f62040a, "parse protobuf message - invalid json template: ", str);
            return jSONObject;
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, int i2) throws ProtobufParserException {
        while (this.f62044e != i2) {
            int iC = c();
            String strValueOf = String.valueOf(b(iC));
            int iC2 = c(iC);
            Object objOpt = jSONObject.opt(strValueOf);
            if (iC2 == 0) {
                b(jSONObject2, objOpt);
            } else if (iC2 == 1) {
                b();
            } else if (iC2 == 2) {
                a(jSONObject2, objOpt);
            } else if (iC2 == 5) {
                a();
            }
        }
    }

    private String a(JSONArray jSONArray) {
        String strOptString = jSONArray.optString(0);
        if (strOptString == null || strOptString.isEmpty()) {
            return f62043d;
        }
        return strOptString;
    }

    private String b(JSONArray jSONArray) {
        return jSONArray.optString(1, "");
    }

    private Object c(JSONArray jSONArray) {
        return jSONArray.opt(2);
    }

    private String a(int i2) {
        if (this.f62044e + i2 <= this.f62045f.length) {
            return new String(this.f62045f, this.f62044e, i2);
        }
        return "";
    }

    private JSONArray a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        a(jSONObject, str, jSONArrayOptJSONArray);
        return jSONArrayOptJSONArray;
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e2) {
            }
        }
    }

    private void a(JSONObject jSONObject, Object obj) throws ProtobufParserException {
        JSONObject jSONObject2;
        String strA;
        int iC = c();
        JSONArray jSONArrayA = null;
        if (!(obj instanceof JSONArray)) {
            jSONObject2 = jSONObject;
            strA = null;
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            strA = a(jSONArray);
            String strB = b(jSONArray);
            if (strB.equals(f62041b)) {
                jSONArrayA = a(jSONObject, strA);
                obj = c(jSONArray);
                jSONObject2 = new JSONObject();
            } else if (!strB.equals(f62042c)) {
                jSONObject2 = jSONObject;
            } else {
                obj = "";
                jSONObject2 = jSONObject;
            }
        }
        if (obj instanceof JSONObject) {
            if (jSONArrayA != null) {
                jSONArrayA.put(jSONObject2);
            }
            a((JSONObject) obj, jSONObject2, this.f62044e + iC);
            return;
        }
        if (obj instanceof String) {
            String strA2 = a(iC);
            if (jSONArrayA != null) {
                jSONArrayA.put(strA2);
            } else if (strA != null) {
                a(jSONObject, strA, strA2);
            }
        }
        this.f62044e += iC;
    }

    private void b(JSONObject jSONObject, Object obj) throws ProtobufParserException {
        int iC = c();
        if (obj instanceof JSONArray) {
            a(jSONObject, a((JSONArray) obj), Integer.valueOf(iC));
        }
    }

    private void a() {
        this.f62044e += 4;
    }

    private void b() {
        this.f62044e += 8;
    }

    private int c() throws ProtobufParserException {
        byte bD;
        ArrayList arrayList = new ArrayList();
        do {
            bD = d();
            arrayList.add(Byte.valueOf(bD));
        } while (!a(bD));
        Collections.reverse(arrayList);
        int iByteValue = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iByteValue = (iByteValue << 7) | ((byte) (((Byte) it.next()).byteValue() & ByteCompanionObject.MAX_VALUE));
        }
        return iByteValue;
    }

    private byte d() throws ProtobufParserException {
        int i2 = this.f62044e;
        if (i2 >= 0) {
            byte[] bArr = this.f62045f;
            if (i2 < bArr.length) {
                this.f62044e = i2 + 1;
                return bArr[i2];
            }
        }
        throw new ProtobufParserException();
    }

    private boolean a(byte b2) {
        return (b2 & ByteCompanionObject.MIN_VALUE) == 0;
    }

    private int b(int i2) {
        return i2 >> 3;
    }

    private int c(int i2) {
        return i2 & 7;
    }
}
