package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f48373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f48374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f48375j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d8 d8Var = (d8) obj;
            if (this.f48366a == d8Var.f48366a && this.f48367b == d8Var.f48367b && this.f48368c == d8Var.f48368c && this.f48369d == d8Var.f48369d && this.f48370e == d8Var.f48370e && this.f48371f == d8Var.f48371f && this.f48372g == d8Var.f48372g && this.f48373h == d8Var.f48373h && Float.compare(d8Var.f48374i, this.f48374i) == 0 && Float.compare(d8Var.f48375j, this.f48375j) == 0) {
                return true;
            }
        }
        return false;
    }

    public float a() {
        return this.f48374i;
    }

    public long b() {
        return this.f48372g;
    }

    public float c() {
        return this.f48375j;
    }

    public long d() {
        return this.f48373h;
    }

    public int e() {
        return this.f48369d;
    }

    public int f() {
        return this.f48367b;
    }

    public int g() {
        return this.f48368c;
    }

    public long h() {
        return this.f48371f;
    }

    public int hashCode() {
        int i2 = ((((((((((((((this.f48366a * 31) + this.f48367b) * 31) + this.f48368c) * 31) + this.f48369d) * 31) + (this.f48370e ? 1 : 0)) * 31) + this.f48371f) * 31) + this.f48372g) * 31) + this.f48373h) * 31;
        float f3 = this.f48374i;
        int iFloatToIntBits = (i2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.f48375j;
        return iFloatToIntBits + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0);
    }

    public int i() {
        return this.f48366a;
    }

    public boolean j() {
        return this.f48370e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f48366a + ", heightPercentOfScreen=" + this.f48367b + ", margin=" + this.f48368c + ", gravity=" + this.f48369d + ", tapToFade=" + this.f48370e + ", tapToFadeDurationMillis=" + this.f48371f + ", fadeInDurationMillis=" + this.f48372g + ", fadeOutDurationMillis=" + this.f48373h + ", fadeInDelay=" + this.f48374i + ", fadeOutDelay=" + this.f48375j + '}';
    }

    public d8(JSONObject jSONObject, C1802k c1802k) {
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f48366a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f48367b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f48368c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f48369d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f48370e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f48371f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f48372g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f48373h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f48374i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f48375j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }
}
