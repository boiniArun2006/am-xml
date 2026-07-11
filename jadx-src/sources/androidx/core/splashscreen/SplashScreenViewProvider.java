package androidx.core.splashscreen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider;", "", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", c.f62177j, "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "impl", "Landroid/view/View;", "()Landroid/view/View;", "view", "ViewImpl", "ViewImpl31", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplashScreenViewProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ViewImpl impl;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "", "Landroid/app/Activity;", c.f62177j, "Landroid/app/Activity;", "()Landroid/app/Activity;", "activity", "Landroid/view/ViewGroup;", "rl", "Lkotlin/Lazy;", "t", "()Landroid/view/ViewGroup;", "_splashScreenView", "splashScreenView", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static class ViewImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Activity activity;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Lazy _splashScreenView;

        private final ViewGroup t() {
            return (ViewGroup) this._splashScreenView.getValue();
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public ViewGroup rl() {
            return t();
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "Landroid/window/SplashScreenView;", "t", "Landroid/window/SplashScreenView;", "nr", "()Landroid/window/SplashScreenView;", "setPlatformView", "(Landroid/window/SplashScreenView;)V", "platformView", "O", "splashScreenView", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class ViewImpl31 extends ViewImpl {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public SplashScreenView platformView;

        public final SplashScreenView nr() {
            SplashScreenView splashScreenView = this.platformView;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("platformView");
            return null;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public SplashScreenView rl() {
            return nr();
        }
    }

    public final View n() {
        return this.impl.rl();
    }
}
