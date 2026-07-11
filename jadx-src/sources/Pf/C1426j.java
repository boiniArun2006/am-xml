package Pf;

import Rxk.o;
import X4.n;
import X4.w6;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: Pf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1426j extends AppCompatTextView {
    public C1426j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private static int WPU(Context context, TypedArray typedArray, int... iArr) {
        int iT = -1;
        for (int i2 = 0; i2 < iArr.length && iT < 0; i2++) {
            iT = w6.t(context, typedArray, iArr[i2], -1);
        }
        return iT;
    }

    public C1426j(Context context, AttributeSet attributeSet, int i2) {
        super(scw.j.t(context, attributeSet, i2, 0), attributeSet, i2);
        S(attributeSet, i2, 0);
    }

    private static int XQ(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, o.xJ, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o.zB, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static boolean Z(Context context) {
        return n.rl(context, Rxk.n.f8794E, true);
    }

    private static boolean aYN(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, o.xJ, i2, i3);
        int iWPU = WPU(context, typedArrayObtainStyledAttributes, o.g7, o.pE);
        typedArrayObtainStyledAttributes.recycle();
        return iWPU != -1;
    }

    private void o(Resources.Theme theme, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i2, o.f8859cB);
        int iWPU = WPU(getContext(), typedArrayObtainStyledAttributes, o.rqO, o.x8);
        typedArrayObtainStyledAttributes.recycle();
        if (iWPU >= 0) {
            setLineHeight(iWPU);
        }
    }

    private void S(AttributeSet attributeSet, int i2, int i3) {
        int iXQ;
        Context context = getContext();
        if (Z(context)) {
            Resources.Theme theme = context.getTheme();
            if (!aYN(context, theme, attributeSet, i2, i3) && (iXQ = XQ(theme, attributeSet, i2, i3)) != -1) {
                o(theme, iXQ);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (Z(context)) {
            o(context.getTheme(), i2);
        }
    }
}
