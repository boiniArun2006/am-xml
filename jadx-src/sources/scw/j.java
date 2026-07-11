package scw;

import Rxk.n;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f73278n = {R.attr.theme, n.f8793B};
    private static final int[] rl = {n.f8806g};

    private static int n(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f73278n);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int rl(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rl, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context t(Context context, AttributeSet attributeSet, int i2, int i3) {
        boolean z2;
        int iRl = rl(context, attributeSet, i2, i3);
        if ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).t() == iRl) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iRl != 0 && !z2) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, iRl);
            int iN = n(context, attributeSet);
            if (iN != 0) {
                contextThemeWrapper.getTheme().applyStyle(iN, true);
            }
            return contextThemeWrapper;
        }
        return context;
    }
}
