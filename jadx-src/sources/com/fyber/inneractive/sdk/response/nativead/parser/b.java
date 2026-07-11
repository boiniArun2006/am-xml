package com.fyber.inneractive.sdk.response.nativead.parser;

import com.caoccao.javet.values.primitive.V8ValueNull;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class b {
    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(V8ValueNull.NULL)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }
}
