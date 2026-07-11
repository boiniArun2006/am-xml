package SJ0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class KH implements ViewBinding {
    public final TextView HI;
    public final ColorView Ik;
    public final TextView J2;
    public final TextView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final RecyclerView f9173O;
    public final TextView Uo;
    public final SeekBar az;
    public final FrameLayout ck;
    public final View gh;
    public final View mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9174n;
    public final View nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConstraintLayout f9175o;
    public final View qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ColorPickerWidget f9176r;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9177t;
    public final TextView ty;
    public final Guideline xMQ;

    public static KH n(View view) {
        int i2 = 2131362271;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362271);
        if (imageButton != null) {
            i2 = 2131362296;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362296);
            if (imageButton2 != null) {
                i2 = 2131362821;
                View viewN = ViewBindings.n(view, 2131362821);
                if (viewN != null) {
                    i2 = 2131362822;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362822);
                    if (recyclerView != null) {
                        i2 = 2131362823;
                        TextView textView = (TextView) ViewBindings.n(view, 2131362823);
                        if (textView != null) {
                            i2 = 2131362824;
                            TextView textView2 = (TextView) ViewBindings.n(view, 2131362824);
                            if (textView2 != null) {
                                i2 = 2131362825;
                                TextView textView3 = (TextView) ViewBindings.n(view, 2131362825);
                                if (textView3 != null) {
                                    i2 = 2131363268;
                                    Guideline guideline = (Guideline) ViewBindings.n(view, 2131363268);
                                    if (guideline != null) {
                                        i2 = 2131363700;
                                        View viewN2 = ViewBindings.n(view, 2131363700);
                                        if (viewN2 != null) {
                                            i2 = 2131363701;
                                            View viewN3 = ViewBindings.n(view, 2131363701);
                                            if (viewN3 != null) {
                                                i2 = 2131363702;
                                                View viewN4 = ViewBindings.n(view, 2131363702);
                                                if (viewN4 != null) {
                                                    i2 = 2131363703;
                                                    SeekBar seekBar = (SeekBar) ViewBindings.n(view, 2131363703);
                                                    if (seekBar != null) {
                                                        i2 = 2131363704;
                                                        TextView textView4 = (TextView) ViewBindings.n(view, 2131363704);
                                                        if (textView4 != null) {
                                                            i2 = 2131363705;
                                                            TextView textView5 = (TextView) ViewBindings.n(view, 2131363705);
                                                            if (textView5 != null) {
                                                                i2 = 2131363858;
                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131363858);
                                                                if (frameLayout != null) {
                                                                    i2 = 2131363859;
                                                                    ColorView colorView = (ColorView) ViewBindings.n(view, 2131363859);
                                                                    if (colorView != null) {
                                                                        i2 = 2131363863;
                                                                        ColorPickerWidget colorPickerWidget = (ColorPickerWidget) ViewBindings.n(view, 2131363863);
                                                                        if (colorPickerWidget != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                            return new KH(constraintLayout, imageButton, imageButton2, viewN, recyclerView, textView, textView2, textView3, guideline, viewN2, viewN3, viewN4, seekBar, textView4, textView5, frameLayout, colorView, colorPickerWidget, constraintLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9174n;
    }

    private KH(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, View view, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, Guideline guideline, View view2, View view3, View view4, SeekBar seekBar, TextView textView4, TextView textView5, FrameLayout frameLayout, ColorView colorView, ColorPickerWidget colorPickerWidget, ConstraintLayout constraintLayout2) {
        this.f9174n = constraintLayout;
        this.rl = imageButton;
        this.f9177t = imageButton2;
        this.nr = view;
        this.f9173O = recyclerView;
        this.J2 = textView;
        this.Uo = textView2;
        this.KN = textView3;
        this.xMQ = guideline;
        this.mUb = view2;
        this.gh = view3;
        this.qie = view4;
        this.az = seekBar;
        this.ty = textView4;
        this.HI = textView5;
        this.ck = frameLayout;
        this.Ik = colorView;
        this.f9176r = colorPickerWidget;
        this.f9175o = constraintLayout2;
    }
}
