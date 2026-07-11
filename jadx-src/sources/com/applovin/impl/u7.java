package com.applovin.impl;

import android.content.Context;
import android.graphics.Trmy.yioUaKMByL;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class u7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f50582a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f50583b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f50584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f50585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50587f;

    public static u7 a(p8 p8Var, C1802k c1802k) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        p8 p8VarC = p8Var.c("StaticResource");
        if (p8VarC == null || !URLUtil.isValidUrl(p8VarC.d())) {
            c1802k.O();
            if (!C1804o.a()) {
                return null;
            }
            c1802k.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        u7 u7Var = new u7();
        u7Var.f50584c = Uri.parse(p8VarC.d());
        p8 p8VarB = p8Var.b("IconClickThrough");
        if (p8VarB != null && URLUtil.isValidUrl(p8VarB.d())) {
            u7Var.f50585d = Uri.parse(p8VarB.d());
        }
        String str = (String) p8Var.a().get(inFlMLxL.rDV);
        int i2 = 0;
        int i3 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) p8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i2 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) c1802k.a(x4.W4)).intValue();
        if (i3 <= 0 || i2 <= 0) {
            u7Var.f50587f = iIntValue;
            u7Var.f50586e = iIntValue;
            return u7Var;
        }
        double d2 = i3 / i2;
        int iMin = Math.min(Math.max(i3, i2), iIntValue);
        if (i3 >= i2) {
            u7Var.f50586e = iMin;
            u7Var.f50587f = (int) (((double) iMin) / d2);
            return u7Var;
        }
        u7Var.f50587f = iMin;
        u7Var.f50586e = (int) (((double) iMin) * d2);
        return u7Var;
    }

    public Set b() {
        return this.f50582a;
    }

    public Uri c() {
        return this.f50585d;
    }

    public int d() {
        return this.f50587f;
    }

    public Uri e() {
        return this.f50584c;
    }

    public Set f() {
        return this.f50583b;
    }

    public int g() {
        return this.f50586e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, C1802k c1802k) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, c1802k);
        return imageView;
    }

    public static u7 a(JSONObject jSONObject, C1802k c1802k) {
        y7 y7VarA;
        y7 y7VarA2;
        if (jSONObject == null) {
            return null;
        }
        u7 u7Var = new u7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        u7Var.f50584c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null && (y7VarA2 = y7.a(jSONObject2, c1802k)) != null) {
                u7Var.f50582a.add(y7VarA2);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null);
            if (jSONObject3 != null && (y7VarA = y7.a(jSONObject3, c1802k)) != null) {
                u7Var.f50583b.add(y7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        u7Var.f50585d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        u7Var.f50586e = JsonUtils.getInt(jSONObject, "width", 0);
        u7Var.f50587f = JsonUtils.getInt(jSONObject, "height", 0);
        return u7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f50582a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, yioUaKMByL.XeQSpW, jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f50583b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f50584c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f50585d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f50586e);
        JsonUtils.putInt(jSONObject, "height", this.f50587f);
        return jSONObject;
    }
}
