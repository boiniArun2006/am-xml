package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi28Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/app/Activity;)Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoundsHelperApi28Impl implements BoundsHelper {
    public static final BoundsHelperApi28Impl rl = new BoundsHelperApi28Impl();

    @Override // androidx.compose.ui.platform.BoundsHelper
    public Rect n(Activity activity) throws Exception {
        DisplayCutout displayCutoutJ2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof IllegalAccessException ? true : e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            AndroidWindowInfo_androidKt.KN(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iUo = AndroidWindowInfo_androidKt.Uo(activity);
            int i2 = rect.bottom;
            if (i2 + iUo == point.y) {
                rect.bottom = i2 + iUo;
            } else {
                int i3 = rect.right;
                if (i3 + iUo == point.x) {
                    rect.right = i3 + iUo;
                } else if (rect.left == iUo) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (displayCutoutJ2 = AndroidWindowInfo_androidKt.J2(defaultDisplay)) != null) {
            if (rect.left == displayCutoutJ2.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCutoutJ2.getSafeInsetRight()) {
                rect.right += displayCutoutJ2.getSafeInsetRight();
            }
            if (rect.top == displayCutoutJ2.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCutoutJ2.getSafeInsetBottom()) {
                rect.bottom += displayCutoutJ2.getSafeInsetBottom();
            }
        }
        return rect;
    }

    private BoundsHelperApi28Impl() {
    }
}
