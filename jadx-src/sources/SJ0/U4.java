package SJ0;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class U4 implements ViewBinding {
    public final TextView HI;
    public final CheckBox J2;
    public final CheckBox KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final CheckBox f9358O;
    public final CheckBox Uo;
    public final TextView az;
    public final Barrier gh;
    public final View mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9359n;
    public final CheckBox nr;
    public final TextView qie;
    public final CheckBox rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CheckBox f9360t;
    public final TextView ty;
    public final View xMQ;

    public static U4 n(View view) {
        int i2 = 2131362353;
        CheckBox checkBox = (CheckBox) ViewBindings.n(view, 2131362353);
        if (checkBox != null) {
            i2 = 2131362354;
            CheckBox checkBox2 = (CheckBox) ViewBindings.n(view, 2131362354);
            if (checkBox2 != null) {
                i2 = 2131362355;
                CheckBox checkBox3 = (CheckBox) ViewBindings.n(view, 2131362355);
                if (checkBox3 != null) {
                    i2 = 2131362356;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.n(view, 2131362356);
                    if (checkBox4 != null) {
                        i2 = 2131362357;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.n(view, 2131362357);
                        if (checkBox5 != null) {
                            i2 = 2131362358;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.n(view, 2131362358);
                            if (checkBox6 != null) {
                                i2 = 2131362359;
                                CheckBox checkBox7 = (CheckBox) ViewBindings.n(view, 2131362359);
                                if (checkBox7 != null) {
                                    i2 = 2131362561;
                                    View viewN = ViewBindings.n(view, 2131362561);
                                    if (viewN != null) {
                                        i2 = 2131362562;
                                        View viewN2 = ViewBindings.n(view, 2131362562);
                                        if (viewN2 != null) {
                                            i2 = 2131362797;
                                            Barrier barrier = (Barrier) ViewBindings.n(view, 2131362797);
                                            if (barrier != null) {
                                                i2 = 2131363072;
                                                TextView textView = (TextView) ViewBindings.n(view, 2131363072);
                                                if (textView != null) {
                                                    i2 = 2131363073;
                                                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363073);
                                                    if (textView2 != null) {
                                                        i2 = 2131363733;
                                                        TextView textView3 = (TextView) ViewBindings.n(view, 2131363733);
                                                        if (textView3 != null) {
                                                            i2 = 2131363734;
                                                            TextView textView4 = (TextView) ViewBindings.n(view, 2131363734);
                                                            if (textView4 != null) {
                                                                return new U4((ConstraintLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, viewN, viewN2, barrier, textView, textView2, textView3, textView4);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9359n;
    }

    private U4(ConstraintLayout constraintLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, View view, View view2, Barrier barrier, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f9359n = constraintLayout;
        this.rl = checkBox;
        this.f9360t = checkBox2;
        this.nr = checkBox3;
        this.f9358O = checkBox4;
        this.J2 = checkBox5;
        this.Uo = checkBox6;
        this.KN = checkBox7;
        this.xMQ = view;
        this.mUb = view2;
        this.gh = barrier;
        this.qie = textView;
        this.az = textView2;
        this.ty = textView3;
        this.HI = textView4;
    }
}
