package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.ci;
import com.facebook.internal.vd;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {
    public static final j J2 = new j(null);
    public static Wre Uo;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Date f52218O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalBroadcastManager f52219n;
    public final AtomicBoolean nr;
    public final com.facebook.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AccessToken f52220t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public interface I28 {
        String n();

        String rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Ml {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public String f52221O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f52222n;
        public Long nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f52223t;

        public final void J2(String str) {
            this.f52222n = str;
        }

        public final void KN(int i2) {
            this.rl = i2;
        }

        public final String O() {
            return this.f52221O;
        }

        public final void Uo(Long l2) {
            this.nr = l2;
        }

        public final void mUb(String str) {
            this.f52221O = str;
        }

        public final String n() {
            return this.f52222n;
        }

        public final int nr() {
            return this.f52223t;
        }

        public final Long rl() {
            return this.nr;
        }

        public final int t() {
            return this.rl;
        }

        public final void xMQ(int i2) {
            this.f52223t = i2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest nr(AccessToken accessToken, GraphRequest.n nVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestAYN = GraphRequest.ty.aYN(accessToken, "me/permissions", nVar);
            graphRequestAYN.T(bundle);
            graphRequestAYN.X(afx.GET);
            return graphRequestAYN;
        }

        private final I28 J2(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = "facebook";
            }
            if (Intrinsics.areEqual(graphDomain, "instagram")) {
                return new w6();
            }
            return new n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest t(AccessToken accessToken, GraphRequest.n nVar) {
            I28 i28J2 = J2(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", i28J2.n());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestAYN = GraphRequest.ty.aYN(accessToken, i28J2.rl(), nVar);
            graphRequestAYN.T(bundle);
            graphRequestAYN.X(afx.GET);
            return graphRequestAYN;
        }

        public final Wre O() {
            Wre wre;
            Wre wre2 = Wre.Uo;
            if (wre2 == null) {
                synchronized (this) {
                    wre = Wre.Uo;
                    if (wre == null) {
                        LocalBroadcastManager localBroadcastManagerRl = LocalBroadcastManager.rl(s4.qie());
                        Intrinsics.checkNotNullExpressionValue(localBroadcastManagerRl, "getInstance(applicationContext)");
                        Wre wre3 = new Wre(localBroadcastManagerRl, new com.facebook.j());
                        Wre.Uo = wre3;
                        wre = wre3;
                    }
                }
                return wre;
            }
            return wre2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f52224n = "oauth/access_token";
        public final String rl = "fb_extend_sso_token";

        @Override // com.facebook.Wre.I28
        public String n() {
            return this.rl;
        }

        @Override // com.facebook.Wre.I28
        public String rl() {
            return this.f52224n;
        }
    }

    public static final class w6 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f52225n = "refresh_access_token";
        public final String rl = "ig_refresh_token";

        @Override // com.facebook.Wre.I28
        public String n() {
            return this.rl;
        }

        @Override // com.facebook.Wre.I28
        public String rl() {
            return this.f52225n;
        }
    }

    public final void r(AccessToken accessToken) {
        o(accessToken, true);
    }

    public Wre(LocalBroadcastManager localBroadcastManager, com.facebook.j accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f52219n = localBroadcastManager;
        this.rl = accessTokenCache;
        this.nr = new AtomicBoolean(false);
        this.f52218O = new Date(0L);
    }

    public static final void HI(Ml refreshResult, g9s response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectNr = response.nr();
        if (jSONObjectNr == null) {
            return;
        }
        refreshResult.J2(jSONObjectNr.optString("access_token"));
        refreshResult.KN(jSONObjectNr.optInt("expires_at"));
        refreshResult.xMQ(jSONObjectNr.optInt("expires_in"));
        refreshResult.Uo(Long.valueOf(jSONObjectNr.optLong("data_access_expiration_time")));
        refreshResult.mUb(jSONObjectNr.optString("graph_domain", null));
    }

    private final void Ik(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(s4.qie(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f52219n.nr(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ck(Ml refreshResult, AccessToken accessToken, AccessToken.j jVar, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set set, Wre this$0, ci it) throws Throwable {
        AccessToken accessToken2;
        j jVar2;
        Date date;
        long j2;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Set expiredPermissions = set;
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String strN = refreshResult.n();
        int iT = refreshResult.t();
        Long lRl = refreshResult.rl();
        String strO = refreshResult.O();
        try {
            j jVar3 = J2;
            if (jVar3.O().xMQ() != null) {
                AccessToken accessTokenXMQ = jVar3.O().xMQ();
                if ((accessTokenXMQ != null ? accessTokenXMQ.getUserId() : null) != accessToken.getUserId()) {
                    if (jVar != null) {
                    }
                } else if (permissionsCallSucceeded.get() || strN != null || iT != 0) {
                    Date expires = accessToken.getExpires();
                    try {
                        if (refreshResult.t() == 0) {
                            jVar2 = jVar3;
                            if (refreshResult.nr() != 0) {
                                date = new Date((((long) refreshResult.nr()) * 1000) + new Date().getTime());
                                j2 = 1000;
                            }
                            if (strN == null) {
                                strN = accessToken.getToken();
                            }
                            String str = strN;
                            String applicationId = accessToken.getApplicationId();
                            String userId = accessToken.getUserId();
                            Set permissions2 = !permissionsCallSucceeded.get() ? permissions : accessToken.getPermissions();
                            Set declinedPermissions2 = !permissionsCallSucceeded.get() ? declinedPermissions : accessToken.getDeclinedPermissions();
                            if (permissionsCallSucceeded.get()) {
                                expiredPermissions = accessToken.getExpiredPermissions();
                            }
                            Set set2 = expiredPermissions;
                            CN3 source = accessToken.getSource();
                            Date date2 = new Date();
                            Date date3 = lRl == null ? new Date(lRl.longValue() * j2) : accessToken.getDataAccessExpirationTime();
                            if (strO == null) {
                                strO = accessToken.getGraphDomain();
                            }
                            accessToken2 = new AccessToken(str, applicationId, userId, permissions2, declinedPermissions2, set2, source, date, date2, date3, strO);
                            jVar2.O().r(accessToken2);
                            this$0.nr.set(false);
                            if (jVar == null) {
                                jVar.rl(accessToken2);
                                return;
                            }
                            return;
                        }
                        jVar2 = jVar3;
                        expires = new Date(((long) refreshResult.t()) * 1000);
                        jVar2.O().r(accessToken2);
                        this$0.nr.set(false);
                        if (jVar == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        this$0.nr.set(false);
                        if (jVar != null && accessToken2 != null) {
                            jVar.rl(accessToken2);
                        }
                        throw th;
                    }
                    date = expires;
                    j2 = 1000;
                    if (strN == null) {
                    }
                    String str2 = strN;
                    String applicationId2 = accessToken.getApplicationId();
                    String userId2 = accessToken.getUserId();
                    Set permissions22 = !permissionsCallSucceeded.get() ? permissions : accessToken.getPermissions();
                    Set declinedPermissions22 = !permissionsCallSucceeded.get() ? declinedPermissions : accessToken.getDeclinedPermissions();
                    if (permissionsCallSucceeded.get()) {
                    }
                    Set set22 = expiredPermissions;
                    CN3 source2 = accessToken.getSource();
                    Date date22 = new Date();
                    Date date32 = lRl == null ? new Date(lRl.longValue() * j2) : accessToken.getDataAccessExpirationTime();
                    if (strO == null) {
                    }
                    accessToken2 = new AccessToken(str2, applicationId2, userId2, permissions22, declinedPermissions22, set22, source2, date, date22, date32, strO);
                } else if (jVar != null) {
                    jVar.n(new FacebookException("Failed to refresh access token"));
                }
            } else if (jVar != null) {
                jVar.n(new FacebookException("No current access token to refresh"));
            }
            this$0.nr.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    private final void o(AccessToken accessToken, boolean z2) {
        AccessToken accessToken2 = this.f52220t;
        this.f52220t = accessToken;
        this.nr.set(false);
        this.f52218O = new Date(0L);
        if (z2) {
            if (accessToken != null) {
                this.rl.Uo(accessToken);
            } else {
                this.rl.n();
                vd.xMQ(s4.qie());
            }
        }
        if (vd.O(accessToken2, accessToken)) {
            return;
        }
        Ik(accessToken2, accessToken);
        Z();
    }

    public static final void qie(Wre this$0, AccessToken.j jVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.az(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, g9s response) {
        JSONArray jSONArrayOptJSONArray;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectNr = response.nr();
        if (jSONObjectNr == null || (jSONArrayOptJSONArray = jSONObjectNr.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String status = jSONObjectOptJSONObject.optString("status");
                if (!vd.I(strOptString) && !vd.I(status)) {
                    Intrinsics.checkNotNullExpressionValue(status, "status");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String status2 = status.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(status2, "this as java.lang.String).toLowerCase(locale)");
                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                    int iHashCode = status2.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(strOptString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + status2);
                            }
                        } else if (status2.equals("granted")) {
                            permissions.add(strOptString);
                        }
                    } else if (status2.equals("expired")) {
                        expiredPermissions.add(strOptString);
                    }
                }
            }
        }
    }

    public final boolean mUb() {
        AccessToken accessTokenJ2 = this.rl.J2();
        if (accessTokenJ2 == null) {
            return false;
        }
        o(accessTokenJ2, false);
        return true;
    }

    public final AccessToken xMQ() {
        return this.f52220t;
    }

    private final boolean XQ() {
        AccessToken accessTokenXMQ = xMQ();
        if (accessTokenXMQ == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!accessTokenXMQ.getSource().rl() || time - this.f52218O.getTime() <= 3600000 || time - accessTokenXMQ.getLastRefresh().getTime() <= SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            return false;
        }
        return true;
    }

    private final void Z() {
        Date expires;
        Context contextQie = s4.qie();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken accessTokenO = companion.O();
        AlarmManager alarmManager = (AlarmManager) contextQie.getSystemService("alarm");
        if (companion.Uo()) {
            if (accessTokenO != null) {
                expires = accessTokenO.getExpires();
            } else {
                expires = null;
            }
            if (expires != null && alarmManager != null) {
                Intent intent = new Intent(contextQie, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, accessTokenO.getExpires().getTime(), PendingIntent.getBroadcast(contextQie, 0, intent, androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON));
                } catch (Exception unused) {
                }
            }
        }
    }

    private final void az(final AccessToken.j jVar) {
        final AccessToken accessTokenXMQ = xMQ();
        if (accessTokenXMQ == null) {
            if (jVar != null) {
                jVar.n(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.nr.compareAndSet(false, true)) {
            if (jVar != null) {
                jVar.n(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.f52218O = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Ml ml = new Ml();
        j jVar2 = J2;
        ci ciVar = new ci(jVar2.nr(accessTokenXMQ, new GraphRequest.n() { // from class: com.facebook.w6
            @Override // com.facebook.GraphRequest.n
            public final void n(g9s g9sVar) {
                Wre.ty(atomicBoolean, hashSet, hashSet2, hashSet3, g9sVar);
            }
        }), jVar2.t(accessTokenXMQ, new GraphRequest.n() { // from class: com.facebook.Ml
            @Override // com.facebook.GraphRequest.n
            public final void n(g9s g9sVar) {
                Wre.HI(ml, g9sVar);
            }
        }));
        ciVar.nr(new ci.j(accessTokenXMQ, jVar, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: com.facebook.I28
            public final /* synthetic */ Set J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public final /* synthetic */ Set f52196O;
            public final /* synthetic */ Wre Uo;
            public final /* synthetic */ Set nr;
            public final /* synthetic */ AccessToken rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f52198t;

            {
                this.f52198t = atomicBoolean;
                this.nr = hashSet;
                this.f52196O = hashSet2;
                this.J2 = hashSet3;
                this.Uo = this;
            }

            @Override // com.facebook.ci.j
            public final void n(ci ciVar2) throws Throwable {
                Wre.ck(this.f52197n, this.rl, null, this.f52198t, this.nr, this.f52196O, this.J2, this.Uo, ciVar2);
            }
        });
        ciVar.KN();
    }

    public final void KN() {
        if (!XQ()) {
            return;
        }
        gh(null);
    }

    public final void Uo() {
        Ik(xMQ(), xMQ());
    }

    public final void gh(final AccessToken.j jVar) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            az(jVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(jVar) { // from class: com.facebook.n
                @Override // java.lang.Runnable
                public final void run() {
                    Wre.qie(this.f52991n, null);
                }
            });
        }
    }
}
