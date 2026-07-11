package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class r extends I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52816t = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Uri n(String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, "oauth")) {
                return vd.Uo(qf.gh(), "oauth/authorize", bundle);
            }
            return vd.Uo(qf.gh(), com.facebook.s4.WPU() + "/dialog/" + action, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String action, Bundle bundle) {
        super(action, bundle);
        Intrinsics.checkNotNullParameter(action, "action");
        rl(f52816t.n(action, bundle == null ? new Bundle() : bundle));
    }
}
