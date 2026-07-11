package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.l3D;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3<S> extends DialogFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f58854B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CharSequence f58855D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private CheckableImageButton f58856E;
    private CharSequence E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private Button f58857FX;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private CharSequence f58858J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private mfo.CN3 f58859M;
    private CharSequence M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private CharSequence f58860N;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private I28 f58862S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f58863T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private CharSequence f58864U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f58865X;
    private CharSequence Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CalendarConstraints f58866Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f58867e;
    private TextView eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58868g;
    private int jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o f58870o;
    private TextView p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f58871r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f58873v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Object f58853a = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final Object f58852I = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    static final Object f58851GR = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashSet f58869n = new LinkedHashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LinkedHashSet f58872t = new LinkedHashSet();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final LinkedHashSet f58861O = new LinkedHashSet();
    private final LinkedHashSet J2 = new LinkedHashSet();

    class j implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f58874O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f58875n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f58876t;

        j(int i2, View view, int i3) {
            this.f58875n = i2;
            this.f58876t = view;
            this.f58874O = i3;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
            int i2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ()).rl;
            if (this.f58875n >= 0) {
                this.f58876t.getLayoutParams().height = this.f58875n + i2;
                View view2 = this.f58876t;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f58876t;
            view3.setPadding(view3.getPaddingLeft(), this.f58874O + i2, this.f58876t.getPaddingRight(), this.f58876t.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    class n extends C {
        n() {
        }
    }

    private void T(Context context) {
        this.f58856E.setTag(f58851GR);
        this.f58856E.setImageDrawable(nY(context));
        this.f58856E.setChecked(this.f58865X != 0);
        ViewCompat.eTf(this.f58856E, null);
        Xw(this.f58856E);
        this.f58856E.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.Wre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CN3.ViF(this.f58934n, view);
            }
        });
    }

    private int X(Context context) {
        int i2 = this.f58871r;
        if (i2 != 0) {
            return i2;
        }
        te();
        throw null;
    }

    private void Xw(CheckableImageButton checkableImageButton) {
        this.f58856E.setContentDescription(this.f58865X == 1 ? checkableImageButton.getContext().getString(Rxk.aC.WPU) : checkableImageButton.getContext().getString(Rxk.aC.ViF));
    }

    private void bzg() {
        this.p5.setText((this.f58865X == 1 && nHg()) ? this.f58855D : this.f58858J);
    }

    private void g(Window window) {
        if (this.f58854B) {
            return;
        }
        View viewFindViewById = requireView().findViewById(Rxk.Wre.Uo);
        com.google.android.material.internal.Ml.n(window, true, l3D.nr(viewFindViewById), null);
        ViewCompat.Org(viewFindViewById, new j(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f58854B = true;
    }

    private static CharSequence iF(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private static Drawable nY(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AppCompatResources.rl(context, Rxk.I28.f8734t));
        stateListDrawable.addState(new int[0], AppCompatResources.rl(context, Rxk.I28.nr));
        return stateListDrawable;
    }

    static boolean s7N(Context context) {
        return wTp(context, Rxk.n.rV9);
    }

    static boolean wTp(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X4.n.nr(context, Rxk.n.ViF, I28.class.getCanonicalName()), new int[]{i2});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f58861O.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), X(requireContext()));
        Context context = dialog.getContext();
        this.f58867e = N(context);
        int i2 = Rxk.n.ViF;
        int i3 = Rxk.C.ViF;
        this.f58859M = new mfo.CN3(context, null, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, Rxk.o.Yq, i2, i3);
        int color = typedArrayObtainStyledAttributes.getColor(Rxk.o.f8820G, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f58859M.nHg(context);
        this.f58859M.p5(ColorStateList.valueOf(color));
        this.f58859M.M7(ViewCompat.XQ(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f58867e ? Rxk.fuX.iF : Rxk.fuX.te, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f58867e) {
            viewInflate.findViewById(Rxk.Wre.ViF).setLayoutParams(new LinearLayout.LayoutParams(e(context), -2));
        } else {
            viewInflate.findViewById(Rxk.Wre.nY).setLayoutParams(new LinearLayout.LayoutParams(e(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(Rxk.Wre.iF);
        this.eF = textView;
        ViewCompat.pJg(textView, 1);
        this.f58856E = (CheckableImageButton) viewInflate.findViewById(Rxk.Wre.fD);
        this.p5 = (TextView) viewInflate.findViewById(Rxk.Wre.E2);
        T(context);
        this.f58857FX = (Button) viewInflate.findViewById(Rxk.Wre.nr);
        te();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.J2.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f58870o.aYN();
        super.onStop();
    }

    void rV9(String str) {
        this.eF.setContentDescription(fD());
        this.eF.setText(str);
    }

    static boolean N(Context context) {
        return wTp(context, R.attr.windowFullscreen);
    }

    public static /* synthetic */ void ViF(CN3 cn3, View view) {
        cn3.te();
        throw null;
    }

    private static int e(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(Rxk.Ml.p5);
        int i2 = Month.nr().J2;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(Rxk.Ml.f8737E) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(Rxk.Ml.f8735B));
    }

    private String fD() {
        te();
        requireContext();
        throw null;
    }

    private boolean nHg() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private DateSelector te() {
        android.support.v4.media.j.n(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private void v() {
        int iX = X(requireContext());
        te();
        I28 i28V = I28.v(null, iX, this.f58866Z, null);
        this.f58862S = i28V;
        o oVarViF = i28V;
        if (this.f58865X == 1) {
            te();
            oVarViF = fuX.ViF(null, iX, this.f58866Z);
        }
        this.f58870o = oVarViF;
        bzg();
        rV9(E2());
        FragmentTransaction fragmentTransactionO = getChildFragmentManager().o();
        fragmentTransactionO.o(Rxk.Wre.ViF, this.f58870o);
        fragmentTransactionO.qie();
        this.f58870o.WPU(new n());
    }

    public String E2() {
        te();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f58871r = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.j.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f58866Z = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.j.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f58868g = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E2 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f58865X = bundle.getInt("INPUT_MODE_KEY");
        this.f58863T = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f58860N = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f58873v = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.Xw = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.jB = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f58864U = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.P5 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.M7 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.E2;
        if (text == null) {
            text = requireContext().getResources().getText(this.f58868g);
        }
        this.f58858J = text;
        this.f58855D = iF(text);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month monthT;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f58871r);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints.n nVar = new CalendarConstraints.n(this.f58866Z);
        I28 i28 = this.f58862S;
        if (i28 == null) {
            monthT = null;
        } else {
            monthT = i28.T();
        }
        if (monthT != null) {
            nVar.rl(monthT.f58929o);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", nVar.n());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f58868g);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E2);
        bundle.putInt("INPUT_MODE_KEY", this.f58865X);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f58863T);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f58860N);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f58873v);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.Xw);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.jB);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f58864U);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.P5);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.M7);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f58867e) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f58859M);
            g(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(Rxk.Ml.f8738FX);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f58859M, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new nv.j(requireDialog(), rect));
        }
        v();
    }
}
