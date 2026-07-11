package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n extends BroadcastReceiver {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static n f52804t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f52805n;
    public static final j rl = new j(null);
    private static final String nr = "com.parse.bolts.measurement_event";

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final n n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (n.n() != null) {
                return n.n();
            }
            n nVar = new n(context, null);
            n.rl(nVar);
            n.t(nVar);
            return n.n();
        }
    }

    public /* synthetic */ n(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private n(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f52805n = applicationContext;
    }

    public static final /* synthetic */ n n() {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            return f52804t;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public static final /* synthetic */ void rl(n nVar) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            nVar.O();
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final /* synthetic */ void t(n nVar) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            f52804t = nVar;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            com.facebook.appevents.rv6 rv6Var = new com.facebook.appevents.rv6(context);
            StringBuilder sb = new StringBuilder();
            sb.append("bf_");
            sb.append(intent != null ? intent.getStringExtra("event_name") : null);
            String string = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            rv6Var.nr(string, bundle);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void O() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManagerRl = LocalBroadcastManager.rl(this.f52805n);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManagerRl, "getInstance(applicationContext)");
            localBroadcastManagerRl.t(this, new IntentFilter(nr));
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void nr() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManagerRl = LocalBroadcastManager.rl(this.f52805n);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManagerRl, "getInstance(applicationContext)");
            localBroadcastManagerRl.O(this);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void finalize() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            nr();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
