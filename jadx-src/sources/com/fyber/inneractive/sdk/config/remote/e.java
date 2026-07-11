package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f53433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f53434b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53435c;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(JSONObject jSONObject) {
        a aVar;
        JSONArray jSONArray;
        int i2;
        String str;
        String str2;
        Object obj;
        String str3;
        ArrayList arrayList;
        int i3;
        String str4;
        g gVar;
        String str5 = null;
        String strOptString = jSONObject.optString("updateHash", null);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        e eVar = new e();
        eVar.f53435c = strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(PangleCreativeInfo.f62498a);
        int iOptInt = jSONObjectOptJSONObject == null ? -1 : jSONObjectOptJSONObject.optInt("id", -1);
        String str6 = "isActive";
        if (iOptInt == -1) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.f53422a = String.valueOf(iOptInt);
            aVar.f53423b = jSONObjectOptJSONObject.optString("publisherId", null);
            aVar.f53424c = f.a(jSONObjectOptJSONObject.optJSONObject("monitor"));
            aVar.f53425d = j.a(jSONObjectOptJSONObject.optJSONObject("video"));
            aVar.f53426e = b.a(jSONObjectOptJSONObject.optJSONObject("display"));
            aVar.f53427f = k.a(jSONObjectOptJSONObject.optJSONObject("viewability"));
            aVar.f53428g = jSONObjectOptJSONObject.optString("isActive", null);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject2 != null) {
                UnitDisplayType.fromValue(jSONObjectOptJSONObject2.optString("unitDisplayType"));
            }
        }
        if (aVar == null) {
            return null;
        }
        eVar.f53433a = aVar;
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spots");
        if (jSONArrayOptJSONArray != null) {
            int i5 = 0;
            while (i5 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                    String str7 = str5;
                    i2 = i5;
                    str = str6;
                    str2 = str7;
                    obj = str7;
                } else {
                    String strOptString2 = jSONObjectOptJSONObject3.optString("id", str5);
                    if (!TextUtils.isEmpty(strOptString2)) {
                        h hVar = new h();
                        hVar.f53437a = strOptString2;
                        hVar.f53438b = jSONObjectOptJSONObject3.optString(str6, str5);
                        hVar.f53439c = b.a(jSONObjectOptJSONObject3.optJSONObject("display"));
                        hVar.f53440d = f.a(jSONObjectOptJSONObject3.optJSONObject("monitor"));
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("native");
                        if (jSONObjectOptJSONObject4 != null) {
                            UnitDisplayType.fromValue(jSONObjectOptJSONObject4.optString("unitDisplayType"));
                        }
                        hVar.f53441e = j.a(jSONObjectOptJSONObject3.optJSONObject("video"));
                        hVar.f53442f = k.a(jSONObjectOptJSONObject3.optJSONObject("viewability"));
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("units");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            jSONArray = jSONArrayOptJSONArray;
                            i2 = i5;
                            str = str6;
                            str3 = str5;
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            jSONArray = jSONArrayOptJSONArray;
                            int i7 = 0;
                            while (i7 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i7);
                                int i8 = i7;
                                if (jSONObjectOptJSONObject5 != null) {
                                    i iVar = new i();
                                    i3 = i5;
                                    str4 = str6;
                                    iVar.f53444a = jSONObjectOptJSONObject5.optString("id", null);
                                    iVar.f53445b = jSONObjectOptJSONObject5.optString("spotId", null);
                                    iVar.f53446c = b.a(jSONObjectOptJSONObject5.optJSONObject("display"));
                                    iVar.f53447d = f.a(jSONObjectOptJSONObject5.optJSONObject("monitor"));
                                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("native");
                                    if (jSONObjectOptJSONObject6 == null) {
                                        gVar = null;
                                        iVar.f53448e = gVar;
                                        iVar.f53449f = j.a(jSONObjectOptJSONObject5.optJSONObject("video"));
                                        iVar.f53450g = k.a(jSONObjectOptJSONObject5.optJSONObject("viewability"));
                                        arrayList.add(iVar);
                                    } else {
                                        g gVar2 = new g();
                                        if (UnitDisplayType.fromValue(jSONObjectOptJSONObject6.optString("unitDisplayType")) != null) {
                                            gVar = gVar2;
                                        }
                                        iVar.f53448e = gVar;
                                        iVar.f53449f = j.a(jSONObjectOptJSONObject5.optJSONObject("video"));
                                        iVar.f53450g = k.a(jSONObjectOptJSONObject5.optJSONObject("viewability"));
                                        arrayList.add(iVar);
                                    }
                                } else {
                                    i3 = i5;
                                    str4 = str6;
                                }
                                i7 = i8 + 1;
                                str6 = str4;
                                i5 = i3;
                            }
                            i2 = i5;
                            str = str6;
                            str3 = null;
                        }
                        hVar.f53443g = arrayList;
                        obj = hVar;
                        str2 = str3;
                    }
                }
                if (obj != null) {
                    arrayList2.add(obj);
                }
                str5 = str2;
                str6 = str;
                i5 = i2 + 1;
                jSONArrayOptJSONArray = jSONArray;
            }
        }
        eVar.f53434b = arrayList2;
        return eVar;
    }
}
