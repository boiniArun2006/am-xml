package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.AppLovinBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "androidComposeView", "Landroidx/compose/ui/unit/IntSize;", "nr", "(Landroidx/compose/ui/platform/AndroidComposeView;)J", "Landroid/content/Context;", "Landroid/app/Activity;", "O", "(Landroid/content/Context;)Landroid/app/Activity;", "context", "", "Uo", "(Landroid/content/Context;)I", "activity", "Landroid/graphics/Rect;", "bounds", "", "KN", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "J2", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidWindowInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/AndroidWindowInfo_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,392:1\n30#2:393\n30#2:397\n80#3:394\n80#3:398\n26#4:395\n26#4:396\n*S KotlinDebug\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/AndroidWindowInfo_androidKt\n*L\n88#1:393\n95#1:397\n88#1:394\n95#1:398\n93#1:395\n94#1:396\n*E\n"})
public final class AndroidWindowInfo_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCutout J2(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (s4.n(obj)) {
                return UGc.n(obj);
            }
            return null;
        } catch (Exception e2) {
            if (e2 instanceof ClassNotFoundException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof NoSuchFieldException ? true : e2 instanceof IllegalAccessException ? true : e2 instanceof InvocationTargetException ? true : e2 instanceof InstantiationException) {
                return null;
            }
            throw e2;
        }
    }

    private static final Activity O(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Uo(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", AppLovinBridge.f61290h);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final long nr(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity activityO = O(context);
        if (activityO != null) {
            Rect rectN = BoundsHelper.INSTANCE.n().n(activityO);
            return IntSize.t((((long) rectN.height()) & 4294967295L) | (((long) rectN.width()) << 32));
        }
        Configuration configuration = context.getResources().getConfiguration();
        float f3 = context.getResources().getDisplayMetrics().density;
        return IntSize.t((((long) Math.round(configuration.screenHeightDp * f3)) & 4294967295L) | (((long) Math.round(configuration.screenWidthDp * f3)) << 32));
    }
}
