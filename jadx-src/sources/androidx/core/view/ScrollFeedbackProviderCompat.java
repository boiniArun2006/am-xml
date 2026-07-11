package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ScrollFeedbackProviderCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScrollFeedbackProviderImpl f36753n;

    @RequiresApi
    private static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ScrollFeedbackProvider f36754n;

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void n(int i2, int i3, int i5, boolean z2) {
            this.f36754n.onScrollLimit(i2, i3, i5, z2);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void rl(int i2, int i3, int i5, int i7) {
            this.f36754n.onScrollProgress(i2, i3, i5, i7);
        }

        ScrollFeedbackProviderApi35Impl(View view) {
            this.f36754n = ScrollFeedbackProvider.createProvider(view);
        }
    }

    private static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void n(int i2, int i3, int i5, boolean z2) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void rl(int i2, int i3, int i5, int i7) {
        }
    }

    private interface ScrollFeedbackProviderImpl {
        void n(int i2, int i3, int i5, boolean z2);

        void rl(int i2, int i3, int i5, int i7);
    }

    public static ScrollFeedbackProviderCompat n(View view) {
        return new ScrollFeedbackProviderCompat(view);
    }

    public void rl(int i2, int i3, int i5, boolean z2) {
        this.f36753n.n(i2, i3, i5, z2);
    }

    public void t(int i2, int i3, int i5, int i7) {
        this.f36753n.rl(i2, i3, i5, i7);
    }

    private ScrollFeedbackProviderCompat(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f36753n = new ScrollFeedbackProviderApi35Impl(view);
        } else {
            this.f36753n = new ScrollFeedbackProviderBaseImpl();
        }
    }
}
