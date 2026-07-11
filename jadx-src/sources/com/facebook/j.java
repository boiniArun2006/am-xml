package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {
    public static final C0759j nr = new C0759j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SharedPreferences f52828n;
    public final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Z f52829t;

    /* JADX INFO: renamed from: com.facebook.j$j, reason: collision with other inner class name */
    public static final class C0759j {
        public /* synthetic */ C0759j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0759j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class n {
        public final Z n() {
            return new Z(s4.qie(), null, 2, null);
        }
    }

    public j(SharedPreferences sharedPreferences, n tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f52828n = sharedPreferences;
        this.rl = tokenCachingStrategyFactory;
    }

    private final boolean O() {
        return this.f52828n.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final AccessToken rl() {
        String string = this.f52828n.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.rl(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void Uo(AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f52828n.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.HI().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final void n() {
        this.f52828n.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (KN()) {
            nr().n();
        }
    }

    private final boolean KN() {
        return s4.X();
    }

    private final Z nr() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            if (this.f52829t == null) {
                synchronized (this) {
                    try {
                        if (this.f52829t == null) {
                            this.f52829t = this.rl.n();
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
            }
            Z z2 = this.f52829t;
            if (z2 != null) {
                return z2;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final AccessToken t() {
        Bundle bundleT = nr().t();
        if (bundleT != null && Z.f52226t.Uo(bundleT)) {
            return AccessToken.INSTANCE.t(bundleT);
        }
        return null;
    }

    public final AccessToken J2() {
        if (O()) {
            return rl();
        }
        if (KN()) {
            AccessToken accessTokenT = t();
            if (accessTokenT != null) {
                Uo(accessTokenT);
                nr().n();
            }
            return accessTokenT;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new n());
    }
}
