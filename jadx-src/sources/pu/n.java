package pu;

import android.content.Context;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import pu.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n implements qz {
    private static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bundle f72092n;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public n(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f72092n = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // pu.qz
    public Boolean n() {
        if (this.f72092n.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f72092n.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // pu.qz
    public Duration rl() {
        if (this.f72092n.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Duration.m1650boximpl(DurationKt.toDuration(this.f72092n.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // pu.qz
    public Double t() {
        if (this.f72092n.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f72092n.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // pu.qz
    public Object nr(Continuation continuation) {
        return qz.j.n(this, continuation);
    }
}
