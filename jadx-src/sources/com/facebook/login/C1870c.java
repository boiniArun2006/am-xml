package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.rv6;
import com.facebook.login.LoginClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.login.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1870c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f52967n;
    private final rv6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f52968t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ScheduledExecutorService f52966O = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: com.facebook.login.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle rl(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public C1870c(Context context, String applicationId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f52967n = applicationId;
        this.rl = new rv6(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.f52968t = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(C1870c this$0, Bundle bundle) {
        if (VmF.j.nr(C1870c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            this$0.rl.Uo("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th) {
            VmF.j.rl(th, C1870c.class);
        }
    }

    public static /* synthetic */ void gh(C1870c c1870c, String str, String str2, String str3, int i2, Object obj) {
        if (VmF.j.nr(C1870c.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        try {
            c1870c.mUb(str, str2, str3);
        } catch (Throwable th) {
            VmF.j.rl(th, C1870c.class);
        }
    }

    private final void Uo(String str) {
        if (!VmF.j.nr(this)) {
            try {
                final Bundle bundleRl = nr.rl(str);
                f52966O.schedule(new Runnable() { // from class: com.facebook.login.l3D
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1870c.KN(this.f52976n, bundleRl);
                    }
                }, 5L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void J2(String str, Map loggingExtras, LoginClient.Result.j jVar, Map map, Exception exc, String str2) {
        String message;
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
                Bundle bundleRl = nr.rl(str);
                if (jVar != null) {
                    bundleRl.putString("2_result", jVar.rl());
                }
                JSONObject jSONObject = null;
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                if (message != null) {
                    bundleRl.putString("5_error_message", exc.getMessage());
                }
                if (!loggingExtras.isEmpty()) {
                    jSONObject = new JSONObject(loggingExtras);
                }
                if (map != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            if (str3 != null) {
                                jSONObject.put(str3, str4);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    bundleRl.putString("6_extras", jSONObject.toString());
                }
                this.rl.Uo(str2, bundleRl);
                if (jVar == LoginClient.Result.j.SUCCESS) {
                    Uo(str);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void O(String str, String str2, String str3) {
        if (!VmF.j.nr(this)) {
            try {
                Bundle bundleRl = nr.rl(str);
                bundleRl.putString("3_method", str2);
                this.rl.Uo(str3, bundleRl);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void mUb(String str, String str2, String str3) {
        if (!VmF.j.nr(this)) {
            try {
                Bundle bundleRl = nr.rl("");
                bundleRl.putString("2_result", LoginClient.Result.j.ERROR.rl());
                bundleRl.putString("5_error_message", str2);
                bundleRl.putString("3_method", str3);
                this.rl.Uo(str, bundleRl);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void nr(String str, String str2, String str3) {
        if (!VmF.j.nr(this)) {
            try {
                Bundle bundleRl = nr.rl(str);
                bundleRl.putString("3_method", str2);
                this.rl.Uo(str3, bundleRl);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final String rl() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return this.f52967n;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final void t(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (!VmF.j.nr(this)) {
            try {
                Bundle bundleRl = nr.rl(str);
                if (str3 != null) {
                    bundleRl.putString("2_result", str3);
                }
                if (str4 != null) {
                    bundleRl.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    bundleRl.putString("4_error_code", str5);
                }
                if (map != null && !map.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    bundleRl.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                bundleRl.putString("3_method", str2);
                this.rl.Uo(str6, bundleRl);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void xMQ(LoginClient.Request pendingLoginRequest, String str) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
                Bundle bundleRl = nr.rl(pendingLoginRequest.getAuthId());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", pendingLoginRequest.getLoginBehavior().toString());
                    jSONObject.put("request_code", LoginClient.INSTANCE.rl());
                    jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.getPermissions()));
                    jSONObject.put("default_audience", pendingLoginRequest.getDefaultAudience().toString());
                    jSONObject.put("isReauthorize", pendingLoginRequest.getIsRerequest());
                    String str2 = this.f52968t;
                    if (str2 != null) {
                        jSONObject.put("facebookVersion", str2);
                    }
                    if (pendingLoginRequest.getLoginTargetApp() != null) {
                        jSONObject.put("target_app", pendingLoginRequest.getLoginTargetApp().toString());
                    }
                    bundleRl.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                this.rl.Uo(str, bundleRl);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
