package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SPz f52767n = new SPz();

    public interface j {
        void n(String str);
    }

    public static final class n implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f52768n;
        final /* synthetic */ j rl;

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void rl() {
        }

        n(InstallReferrerClient installReferrerClient, j jVar) {
            this.f52768n = installReferrerClient;
            this.rl = jVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void n(int i2) {
            if (!VmF.j.nr(this)) {
                try {
                    if (i2 != 0) {
                        if (i2 == 2) {
                            SPz.f52767n.O();
                        }
                    } else {
                        try {
                            ReferrerDetails referrerDetailsRl = this.f52768n.rl();
                            Intrinsics.checkNotNullExpressionValue(referrerDetailsRl, "{\n                      …rer\n                    }");
                            String strNr = referrerDetailsRl.nr();
                            if (strNr != null && (StringsKt.contains$default((CharSequence) strNr, (CharSequence) "fb", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strNr, (CharSequence) "facebook", false, 2, (Object) null))) {
                                this.rl.n(strNr);
                            }
                            SPz.f52767n.O();
                        } catch (RemoteException | Exception unused) {
                            return;
                        }
                    }
                    this.f52768n.n();
                } catch (Throwable th) {
                    VmF.j.rl(th, this);
                }
            }
        }
    }

    public static final void nr(j callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SPz sPz = f52767n;
        if (sPz.rl()) {
            return;
        }
        sPz.t(callback);
    }

    private SPz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        com.facebook.s4.qie().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    private final boolean rl() {
        return com.facebook.s4.qie().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void t(j jVar) {
        InstallReferrerClient installReferrerClientN = InstallReferrerClient.t(com.facebook.s4.qie()).n();
        try {
            installReferrerClientN.nr(new n(installReferrerClientN, jVar));
        } catch (Exception unused) {
        }
    }
}
