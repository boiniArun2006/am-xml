package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c8G.Fsz.qwlyMfUJj;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "()V", "Api31", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ThemeUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThemeUtils f36620n = new ThemeUtils();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "<init>", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "Landroid/view/View;", "decor", "Landroid/util/TypedValue;", "tv", "", "rl", "(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Api31 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api31 f36621n = new Api31();

        @JvmStatic
        @JvmOverloads
        @DoNotInline
        public static final void n(Resources.Theme theme, View decor) {
            Intrinsics.checkNotNullParameter(theme, qwlyMfUJj.etYTtHs);
            Intrinsics.checkNotNullParameter(decor, "decor");
            t(theme, decor, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        @DoNotInline
        public static final void rl(Resources.Theme theme, View decor, TypedValue tv) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(decor, "decor");
            Intrinsics.checkNotNullParameter(tv, "tv");
            int i2 = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
                i2 |= 16;
            }
            WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
            Intrinsics.checkNotNull(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i2, 24);
        }

        public static /* synthetic */ void t(Resources.Theme theme, View view, TypedValue typedValue, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                typedValue = new TypedValue();
            }
            rl(theme, view, typedValue);
        }

        private Api31() {
        }
    }

    private ThemeUtils() {
    }
}
