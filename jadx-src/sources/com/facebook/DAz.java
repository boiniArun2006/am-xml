package com.facebook;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.vd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class DAz {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static volatile DAz f52143O;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalBroadcastManager f52144n;
    public final nKK rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Profile f52145t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized DAz n() {
            DAz dAz;
            try {
                if (DAz.f52143O == null) {
                    LocalBroadcastManager localBroadcastManagerRl = LocalBroadcastManager.rl(s4.qie());
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManagerRl, "getInstance(applicationContext)");
                    DAz.f52143O = new DAz(localBroadcastManagerRl, new nKK());
                }
                dAz = DAz.f52143O;
                if (dAz == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    dAz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return dAz;
        }

        public j() {
        }
    }

    public final void J2(Profile profile) {
        Uo(profile, true);
    }

    public DAz(LocalBroadcastManager localBroadcastManager, nKK profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f52144n = localBroadcastManager;
        this.rl = profileCache;
    }

    private final void O(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f52144n.nr(intent);
    }

    private final void Uo(Profile profile, boolean z2) {
        Profile profile2 = this.f52145t;
        this.f52145t = profile;
        if (z2) {
            if (profile != null) {
                this.rl.t(profile);
            } else {
                this.rl.n();
            }
        }
        if (vd.O(profile2, profile)) {
            return;
        }
        O(profile2, profile);
    }

    public final boolean nr() {
        Profile profileRl = this.rl.rl();
        if (profileRl == null) {
            return false;
        }
        Uo(profileRl, false);
        return true;
    }

    public final Profile t() {
        return this.f52145t;
    }
}
