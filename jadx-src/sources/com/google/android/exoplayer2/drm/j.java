package com.google.android.exoplayer2.drm;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class j {
    public static byte[] n(byte[] bArr) {
        return Util.SDK_INT >= 27 ? bArr : Util.getUtf8Bytes(t(Util.fromUtf8Bytes(bArr)));
    }

    private static String nr(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] rl(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.fromUtf8Bytes(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(IV8ValueMap.FUNCTION_KEYS);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(nr(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(nr(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return Util.getUtf8Bytes(sb.toString());
        } catch (JSONException e2) {
            Log.e("ClearKeyUtil", "Failed to adjust response data: " + Util.fromUtf8Bytes(bArr), e2);
            return bArr;
        }
    }

    private static String t(String str) {
        return str.replace('+', '-').replace('/', '_');
    }
}
