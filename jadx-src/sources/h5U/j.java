package h5U;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements vd5.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0955j f67952t = new C0955j(null);
    private final SharedPreferences rl;

    /* JADX INFO: renamed from: h5U.j$j, reason: collision with other inner class name */
    public static final class C0955j {
        public /* synthetic */ C0955j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0955j() {
        }
    }

    public j(SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.rl = preferences;
    }

    @Override // vd5.j
    public boolean n() {
        return this.rl.getBoolean("is-analytics-tracking-enabled", true);
    }

    @Override // vd5.j
    public void rl(boolean z2) {
        this.rl.edit().putBoolean("is-profiling-tracking-enabled", z2).apply();
    }

    @Override // vd5.j
    public boolean t() {
        return this.rl.getBoolean("is-profiling-tracking-enabled", false);
    }
}
