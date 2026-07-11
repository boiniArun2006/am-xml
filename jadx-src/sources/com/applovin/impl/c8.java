package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class c8 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f48200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f48201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f48202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f48203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f48206g;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum a {
        Progressive,
        Streaming
    }

    public static c8 a(p8 p8Var, C1802k c1802k) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                c1802k.O();
                if (!C1804o.a()) {
                    return null;
                }
                c1802k.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            c8 c8Var = new c8();
            c8Var.f48200a = uri;
            c8Var.f48201b = uri;
            c8Var.f48206g = a(p8Var);
            c8Var.f48202c = a((String) p8Var.a().get("delivery"));
            c8Var.f48205f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.f48204e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.f48203d = ((String) p8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("VastVideoFile", "Error occurred while initializing", th);
            }
            c1802k.D().a("VastVideoFile", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f48204e != c8Var.f48204e || this.f48205f != c8Var.f48205f || this.f48206g != c8Var.f48206g) {
            return false;
        }
        Uri uri = this.f48200a;
        if (uri == null ? c8Var.f48200a != null : !uri.equals(c8Var.f48200a)) {
            return false;
        }
        Uri uri2 = this.f48201b;
        if (uri2 == null ? c8Var.f48201b != null : !uri2.equals(c8Var.f48201b)) {
            return false;
        }
        if (this.f48202c != c8Var.f48202c) {
            return false;
        }
        String str = this.f48203d;
        String str2 = c8Var.f48203d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public long b() {
        return this.f48206g;
    }

    public String c() {
        return this.f48203d;
    }

    public Uri d() {
        return this.f48200a;
    }

    public Uri e() {
        return this.f48201b;
    }

    public int hashCode() {
        Uri uri = this.f48200a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f48201b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f48202c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f48203d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f48204e) * 31) + this.f48205f) * 31) + Long.valueOf(this.f48206g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f48200a + ", videoUri=" + this.f48201b + ", deliveryType=" + this.f48202c + ", fileType='" + this.f48203d + "', width=" + this.f48204e + ", height=" + this.f48205f + ", bitrate=" + this.f48206g + '}';
    }

    private c8() {
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(p8 p8Var) {
        Map mapA = p8Var.a();
        long j2 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        return j2 != 0 ? j2 : (StringUtils.parseLong((String) mapA.get("minBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f48201b = uri;
    }

    public static c8 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, FijIa.ZxoJtaXgngygQ, null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i2 = JsonUtils.getInt(jSONObject, "width", 0);
        int i3 = JsonUtils.getInt(jSONObject, "height", 0);
        int i5 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        c8 c8Var = new c8();
        c8Var.f48200a = uri;
        c8Var.f48201b = uri2;
        c8Var.f48202c = aVarValueOf;
        c8Var.f48203d = string2;
        c8Var.f48204e = i2;
        c8Var.f48205f = i3;
        c8Var.f48206g = i5;
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f48200a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f48201b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f48202c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f48203d);
        JsonUtils.putInt(jSONObject, "width", this.f48204e);
        JsonUtils.putInt(jSONObject, "height", this.f48205f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f48206g);
        return jSONObject;
    }
}
