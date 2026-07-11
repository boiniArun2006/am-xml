package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f60167n = new Logger("JSONParser", new String[0]);

    public static List n(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object objT = jSONArray.get(i2);
            if (objT instanceof JSONArray) {
                objT = n((JSONArray) objT);
            } else if (objT instanceof JSONObject) {
                objT = t((JSONObject) objT);
            }
            arrayList.add(objT);
        }
        return arrayList;
    }

    public static Map t(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objT = jSONObject.get(next);
            if (objT instanceof JSONArray) {
                objT = n((JSONArray) objT);
            } else if (objT instanceof JSONObject) {
                objT = t((JSONObject) objT);
            }
            arrayMap.put(next, objT);
        }
        return arrayMap;
    }

    public static Map nr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return t(jSONObject);
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaag(e2);
        }
    }

    public static Map rl(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzv.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            f60167n.e("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map mapNr = nr(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), C.UTF8_NAME));
            if (mapNr == null) {
                return new HashMap();
            }
            return mapNr;
        } catch (UnsupportedEncodingException e2) {
            f60167n.e("Unable to decode token", e2, new Object[0]);
            return new HashMap();
        }
    }
}
