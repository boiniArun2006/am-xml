package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.splashscreen.SplashScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/core/splashscreen/SplashScreen$Impl$setKeepOnScreenCondition$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplashScreen$Impl$setKeepOnScreenCondition$1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ SplashScreen.Impl f36609n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ View f36610t;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (this.f36609n.getSplashScreenWaitPredicate().n()) {
            return false;
        }
        this.f36610t.getViewTreeObserver().removeOnPreDrawListener(this);
        SplashScreenViewProvider splashScreenViewProvider = this.f36609n.mSplashScreenViewProvider;
        if (splashScreenViewProvider == null) {
            return true;
        }
        this.f36609n.O(splashScreenViewProvider);
        return true;
    }
}
