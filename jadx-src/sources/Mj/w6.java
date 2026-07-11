package Mj;

import android.text.TextUtils;
import android.util.Base64;
import androidx.collection.ArrayMap;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    private static Map nr(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objNr = jSONObject.get(next);
            if (objNr instanceof JSONArray) {
                objNr = t((JSONArray) objNr);
            } else if (objNr instanceof JSONObject) {
                objNr = nr((JSONObject) objNr);
            } else if (objNr.equals(JSONObject.NULL)) {
                objNr = null;
            }
            arrayMap.put(next, objNr);
        }
        return arrayMap;
    }

    private static List t(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object objNr = jSONArray.get(i2);
            if (objNr instanceof JSONArray) {
                objNr = t((JSONArray) objNr);
            } else if (objNr instanceof JSONObject) {
                objNr = nr((JSONObject) objNr);
            }
            arrayList.add(objNr);
        }
        return arrayList;
    }

    private static Map n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return nr(jSONObject);
        } catch (Exception e2) {
            n.J2().rl("Failed to parse JSONObject into Map:\n" + e2);
            return Collections.EMPTY_MAP;
        }
    }

    public static Map rl(String str) {
        Preconditions.checkNotEmpty(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            n.J2().nr("Invalid token (too few subsections):\n" + str);
            return Collections.EMPTY_MAP;
        }
        try {
            Map mapN = n(new String(Base64.decode(strArrSplit[1], 11), C.UTF8_NAME));
            if (mapN == null) {
                return Collections.EMPTY_MAP;
            }
            return mapN;
        } catch (UnsupportedEncodingException e2) {
            n.J2().nr("Unable to decode token (charset unknown):\n" + e2);
            return Collections.EMPTY_MAP;
        }
    }
}
