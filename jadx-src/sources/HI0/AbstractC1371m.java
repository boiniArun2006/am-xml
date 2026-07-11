package HI0;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: HI0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1371m {
    public static final P n(int i2, View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Context context = parentView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) frameLayout, true);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, -2, -2, true);
        viewInflate.measure(0, 0);
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getSize(new Point());
        popupWindow.showAtLocation(parentView, 17, 0, 0);
        Intrinsics.checkNotNull(viewInflate);
        return new P(viewInflate, popupWindow);
    }
}
