package com.applovin.impl;

import Hr.CQ.USEaHtCMH;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class b8 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f48149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f48150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f48152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f48153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u7 f48154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f48155g;

    private b8() {
        List list = Collections.EMPTY_LIST;
        this.f48149a = list;
        this.f48150b = list;
        this.f48153e = new HashSet();
        this.f48155g = new HashMap();
    }

    public static b8 a(p8 p8Var, b8 b8Var, s7 s7Var, C1802k c1802k) {
        p8 p8VarC;
        u7 u7VarA;
        List listA;
        p8 p8VarC2;
        List listA2;
        p8 p8VarC3;
        int iA;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (b8Var == null) {
            try {
                b8Var = new b8(s7Var);
            } catch (Throwable th) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                c1802k.D().a("VastVideoCreative", th);
                return null;
            }
        }
        if (b8Var.f48151c == 0 && (p8VarC3 = p8Var.c("Duration")) != null && (iA = a(p8VarC3.d(), c1802k)) > 0) {
            b8Var.f48151c = iA;
        }
        p8 p8VarC4 = p8Var.c("MediaFiles");
        if (p8VarC4 != null && (listA2 = a(p8VarC4, c1802k)) != null && listA2.size() > 0) {
            List list = b8Var.f48149a;
            if (list != null) {
                listA2.addAll(list);
            }
            b8Var.f48149a = listA2;
        }
        p8 p8VarC5 = p8Var.c("VideoClicks");
        if (p8VarC5 != null) {
            if (b8Var.f48152d == null && (p8VarC2 = p8VarC5.c("ClickThrough")) != null) {
                String strD = p8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    b8Var.f48152d = Uri.parse(strD);
                }
            }
            a8.a(p8VarC5.a("ClickTracking"), b8Var.f48153e, s7Var, c1802k);
        }
        p8 p8VarC6 = p8Var.c("Icons");
        if (p8VarC6 != null && (u7VarA = u7.a((p8VarC = p8VarC6.c("Icon")), c1802k)) != null) {
            p8 p8VarC7 = p8VarC.c("IconClicks");
            if (p8VarC7 != null && (listA = p8VarC7.a("IconClickTracking")) != null) {
                a8.a(listA, u7VarA.f50582a, s7Var, c1802k);
            }
            List listA3 = p8VarC.a("IconViewTracking");
            if (listA3 != null) {
                a8.a(listA3, u7VarA.f50583b, s7Var, c1802k);
            }
            b8Var.f48154f = u7VarA;
        }
        a8.a(p8Var, b8Var.f48155g, s7Var, c1802k);
        return b8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.f48151c != b8Var.f48151c) {
            return false;
        }
        List list = this.f48149a;
        if (list == null ? b8Var.f48149a != null : !list.equals(b8Var.f48149a)) {
            return false;
        }
        Uri uri = this.f48152d;
        if (uri == null ? b8Var.f48152d != null : !uri.equals(b8Var.f48152d)) {
            return false;
        }
        Set set = this.f48153e;
        if (set == null ? b8Var.f48153e != null : !set.equals(b8Var.f48153e)) {
            return false;
        }
        Map map = this.f48155g;
        Map map2 = b8Var.f48155g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public Set b() {
        return this.f48153e;
    }

    public Uri c() {
        return this.f48152d;
    }

    public int d() {
        return this.f48151c;
    }

    public Map e() {
        return this.f48155g;
    }

    public u7 f() {
        return this.f48154f;
    }

    public List g() {
        return this.f48149a;
    }

    public int hashCode() {
        List list = this.f48149a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f48151c) * 31;
        Uri uri = this.f48152d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f48153e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f48155g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return USEaHtCMH.twhTQc + this.f48149a + ", durationSeconds=" + this.f48151c + ", destinationUri=" + this.f48152d + ", clickTrackers=" + this.f48153e + ", eventTrackers=" + this.f48155g + ", industryIcon=" + this.f48154f + '}';
    }

    private b8(s7 s7Var) {
        List list = Collections.EMPTY_LIST;
        this.f48149a = list;
        this.f48150b = list;
        this.f48153e = new HashSet();
        this.f48155g = new HashMap();
        this.f48150b = s7Var.f();
    }

    private static int a(String str, C1802k c1802k) {
        try {
            List<String> listExplode = CollectionUtils.explode(str, ":");
            if (listExplode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(listExplode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(listExplode.get(1))) + ((long) StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (Throwable unused) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(p8 p8Var, C1802k c1802k) {
        List listA = p8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) c1802k.a(x4.S4));
        List<String> listExplode2 = CollectionUtils.explode((String) c1802k.a(x4.R4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            c8 c8VarA = c8.a((p8) it.next(), c1802k);
            if (c8VarA != null) {
                try {
                    String strC = c8VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(c8VarA);
                    } else {
                        if (((Boolean) c1802k.a(x4.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(c8VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(c8VarA);
                            }
                        }
                        c1802k.O();
                        if (C1804o.a()) {
                            c1802k.O().k("VastVideoCreative", "Video file not supported: " + c8VarA);
                        }
                    }
                } catch (Throwable th) {
                    c1802k.O();
                    if (C1804o.a()) {
                        c1802k.O().a("VastVideoCreative", "Failed to validate video file: " + c8VarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public c8 a(long j2) {
        List list = this.f48149a;
        c8 c8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<c8> arrayList = new ArrayList(3);
        for (String str : this.f48150b) {
            for (c8 c8Var2 : this.f48149a) {
                String strC = c8Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(c8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f48149a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.ci
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b8.a((c8) obj, (c8) obj2);
            }
        });
        for (c8 c8Var3 : arrayList) {
            if (c8Var3.b() > j2) {
                break;
            }
            c8Var = c8Var3;
        }
        return c8Var != null ? c8Var : (c8) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(c8 c8Var, c8 c8Var2) {
        return Long.compare(c8Var.b(), c8Var2.b());
    }

    public static b8 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        b8Var.f48149a = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            c8 c8VarA = c8.a(JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), c1802k);
            if (c8VarA != null) {
                b8Var.f48149a.add(c8VarA);
            }
        }
        b8Var.f48150b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        b8Var.f48151c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        b8Var.f48152d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null), c1802k);
            if (y7VarA != null) {
                b8Var.f48153e.add(y7VarA);
            }
        }
        b8Var.f48154f = u7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), c1802k);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i5 = 0; i5 < jSONArray3.length(); i5++) {
                y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArray3, i5, (JSONObject) null), c1802k);
                if (y7VarA2 != null) {
                    hashSet.add(y7VarA2);
                }
            }
            b8Var.f48155g.put(next, hashSet);
        }
        return b8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f48149a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f48150b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f48151c);
        Uri uri = this.f48152d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f48153e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        u7 u7Var = this.f48154f;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", u7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f48155g.keySet()) {
            Set set = (Set) this.f48155g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((y7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
