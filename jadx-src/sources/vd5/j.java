package vd5;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1242j f74693n = C1242j.f74694n;

    /* JADX INFO: renamed from: vd5.j$j, reason: collision with other inner class name */
    public static final class C1242j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C1242j f74694n = new C1242j();

        public final j n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("tracking-settings-repository", 0);
            Intrinsics.checkNotNull(sharedPreferences);
            return new h5U.j(sharedPreferences);
        }

        private C1242j() {
        }
    }

    boolean n();

    void rl(boolean z2);

    boolean t();
}
