package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class nKK {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SharedPreferences f52992n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public j() {
        }
    }

    public final void n() {
        this.f52992n.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final Profile rl() {
        String string = this.f52992n.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void t(Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject jSONObjectRl = profile.rl();
        if (jSONObjectRl != null) {
            this.f52992n.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectRl.toString()).apply();
        }
    }

    public nKK() {
        SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.f52992n = sharedPreferences;
    }
}
