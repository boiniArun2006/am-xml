package nv;

import Rxk.C;
import Rxk.o;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import mfo.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n extends AlertDialog.Builder {
    private final Rect nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f71236t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f71235O = Rxk.n.f8807n;
    private static final int J2 = C.f8726n;
    private static final int Uo = Rxk.n.f8800S;

    public n(Context context) {
        this(context, 0);
    }

    public n(Context context, int i2) {
        super(S(context), aYN(context, i2));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i3 = f71235O;
        int i5 = J2;
        this.nr = w6.n(context2, i3, i5);
        int iT = W3.j.t(context2, Rxk.n.ty, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, o.lRt, i3, i5);
        int color = typedArrayObtainStyledAttributes.getColor(o.f8857c, iT);
        typedArrayObtainStyledAttributes.recycle();
        CN3 cn3 = new CN3(context2, null, i3, i5);
        cn3.nHg(context2);
        cn3.p5(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                cn3.U(dimension);
            }
        }
        this.f71236t = cn3;
    }

    private static int WPU(Context context) {
        TypedValue typedValueN = X4.n.n(context, Uo);
        if (typedValueN == null) {
            return 0;
        }
        return typedValueN.data;
    }

    private static int aYN(Context context, int i2) {
        return i2 == 0 ? WPU(context) : i2;
    }

    private static Context S(Context context) {
        int iWPU = WPU(context);
        Context contextT = scw.j.t(context, null, f71235O, J2);
        if (iWPU == 0) {
            return contextT;
        }
        return new ContextThemeWrapper(contextT, iWPU);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
    public n Uo(int i2) {
        return (n) super.Uo(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: M7, reason: merged with bridge method [inline-methods] */
    public n setTitle(CharSequence charSequence) {
        return (n) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public n mUb(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (n) super.mUb(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public n o(int i2) {
        return (n) super.o(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public n setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (n) super.setNegativeButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public n r(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        return (n) super.r(charSequenceArr, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public n n(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (n) super.n(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public n xMQ(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (n) super.xMQ(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: Xw, reason: merged with bridge method [inline-methods] */
    public n ck(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (n) super.ck(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: bzg, reason: merged with bridge method [inline-methods] */
    public n setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (n) super.setPositiveButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        Window window = alertDialogCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f71236t;
        if (drawable instanceof CN3) {
            ((CN3) drawable).M7(ViewCompat.XQ(decorView));
        }
        window.setBackgroundDrawable(w6.rl(this.f71236t, this.nr));
        decorView.setOnTouchListener(new j(alertDialogCreate, this.nr));
        return alertDialogCreate;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n KN(CharSequence charSequence) {
        return (n) super.KN(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: eF, reason: merged with bridge method [inline-methods] */
    public n setView(View view) {
        return (n) super.setView(view);
    }

    public n fD(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (n) super.J2(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n t(View view) {
        return (n) super.t(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public n O(Drawable drawable) {
        return (n) super.O(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: jB, reason: merged with bridge method [inline-methods] */
    public n Ik(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
        return (n) super.Ik(listAdapter, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: nHg, reason: merged with bridge method [inline-methods] */
    public n gh(int i2, DialogInterface.OnClickListener onClickListener) {
        return (n) super.gh(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public n rl(boolean z2) {
        return (n) super.rl(z2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: p5, reason: merged with bridge method [inline-methods] */
    public n Z(int i2) {
        return (n) super.Z(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: rV9, reason: merged with bridge method [inline-methods] */
    public n HI(DialogInterface.OnKeyListener onKeyListener) {
        return (n) super.HI(onKeyListener);
    }

    public n s7N(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (n) super.qie(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public n nr(int i2) {
        return (n) super.nr(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public n ty(DialogInterface.OnDismissListener onDismissListener) {
        return (n) super.ty(onDismissListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: wTp, reason: merged with bridge method [inline-methods] */
    public n az(DialogInterface.OnCancelListener onCancelListener) {
        return (n) super.az(onCancelListener);
    }
}
