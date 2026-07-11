package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.vd;
import com.pairip.VMRunner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static AuthenticationTokenManager f52114O;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalBroadcastManager f52115n;
    public final fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AuthenticationToken f52116t;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("sUCoey4zb6BlY1Qp", new Object[]{this, context, intent});
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public j() {
        }

        public final AuthenticationTokenManager n() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f52114O;
            if (authenticationTokenManager2 == null) {
                synchronized (this) {
                    authenticationTokenManager = AuthenticationTokenManager.f52114O;
                    if (authenticationTokenManager == null) {
                        LocalBroadcastManager localBroadcastManagerRl = LocalBroadcastManager.rl(s4.qie());
                        Intrinsics.checkNotNullExpressionValue(localBroadcastManagerRl, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(localBroadcastManagerRl, new fuX());
                        AuthenticationTokenManager.f52114O = authenticationTokenManager3;
                        authenticationTokenManager = authenticationTokenManager3;
                    }
                }
                return authenticationTokenManager;
            }
            return authenticationTokenManager2;
        }
    }

    public final void O(AuthenticationToken authenticationToken) {
        J2(authenticationToken, true);
    }

    public AuthenticationTokenManager(LocalBroadcastManager localBroadcastManager, fuX authenticationTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.f52115n = localBroadcastManager;
        this.rl = authenticationTokenCache;
    }

    private final void nr(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        Intent intent = new Intent(s4.qie(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken2);
        this.f52115n.nr(intent);
    }

    public final AuthenticationToken t() {
        return this.f52116t;
    }

    private final void J2(AuthenticationToken authenticationToken, boolean z2) {
        AuthenticationToken authenticationTokenT = t();
        this.f52116t = authenticationToken;
        if (z2) {
            if (authenticationToken != null) {
                this.rl.rl(authenticationToken);
            } else {
                this.rl.n();
                vd.xMQ(s4.qie());
            }
        }
        if (!vd.O(authenticationTokenT, authenticationToken)) {
            nr(authenticationTokenT, authenticationToken);
        }
    }
}
