package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ActivityOptionsCompat {

    private static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ActivityOptions f36208n;

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle rl() {
            return this.f36208n.toBundle();
        }

        ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.f36208n = activityOptions;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BackgroundActivityStartMode {
    }

    public Bundle rl() {
        return null;
    }

    public static ActivityOptionsCompat n(Context context, int i2, int i3) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i2, i3));
    }

    protected ActivityOptionsCompat() {
    }
}
