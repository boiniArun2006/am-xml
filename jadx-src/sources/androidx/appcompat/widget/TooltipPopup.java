package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import com.safedk.android.analytics.AppLovinBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
class TooltipPopup {
    private final int[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Rect f14444O;
    private final int[] Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f14445n;
    private final WindowManager.LayoutParams nr;
    private final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextView f14446t;

    boolean nr() {
        return this.rl.getParent() != null;
    }

    TooltipPopup(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.nr = layoutParams;
        this.f14444O = new Rect();
        this.J2 = new int[2];
        this.Uo = new int[2];
        this.f14445n = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.f13482o, (ViewGroup) null);
        this.rl = viewInflate;
        this.f14446t = (TextView) viewInflate.findViewById(R.id.ViF);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f13488n;
        layoutParams.flags = 24;
    }

    private void n(View view, int i2, int i3, boolean z2, WindowManager.LayoutParams layoutParams) {
        int height;
        int i5;
        int i7;
        int dimensionPixelSize;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f14445n.getResources().getDimensionPixelOffset(R.dimen.az);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f14445n.getResources().getDimensionPixelOffset(R.dimen.qie);
            height = i3 + dimensionPixelOffset2;
            i5 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i5 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f14445n.getResources();
        if (z2) {
            i7 = R.dimen.HI;
        } else {
            i7 = R.dimen.ty;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i7);
        View viewRl = rl(view);
        if (viewRl == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewRl.getWindowVisibleDisplayFrame(this.f14444O);
        Rect rect = this.f14444O;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f14445n.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            } else {
                dimensionPixelSize = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f14444O.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewRl.getLocationOnScreen(this.Uo);
        view.getLocationOnScreen(this.J2);
        int[] iArr = this.J2;
        int i8 = iArr[0];
        int[] iArr2 = this.Uo;
        int i9 = i8 - iArr2[0];
        iArr[0] = i9;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i9 + i2) - (viewRl.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.rl.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.rl.getMeasuredHeight();
        int i10 = this.J2[1];
        int i11 = ((i5 + i10) - dimensionPixelOffset3) - measuredHeight;
        int i12 = i10 + height + dimensionPixelOffset3;
        if (z2) {
            if (i11 >= 0) {
                layoutParams.y = i11;
                return;
            } else {
                layoutParams.y = i12;
                return;
            }
        }
        if (measuredHeight + i12 <= this.f14444O.height()) {
            layoutParams.y = i12;
        } else {
            layoutParams.y = i11;
        }
    }

    private static View rl(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void O(View view, int i2, int i3, boolean z2, CharSequence charSequence) {
        if (nr()) {
            t();
        }
        this.f14446t.setText(charSequence);
        n(view, i2, i3, z2, this.nr);
        ((WindowManager) this.f14445n.getSystemService("window")).addView(this.rl, this.nr);
    }

    void t() {
        if (!nr()) {
            return;
        }
        ((WindowManager) this.f14445n.getSystemService("window")).removeView(this.rl);
    }
}
