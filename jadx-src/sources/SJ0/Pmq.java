package SJ0;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.CameraViewPerspective;
import com.alightcreative.widget.ValueSpinner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Pmq implements ViewBinding {
    public final TextView HI;
    public final SwitchCompat Ik;
    public final ConstraintLayout J2;
    public final ConstraintLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ConstraintLayout f9264O;
    public final CameraViewPerspective Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final View f9265Z;
    public final RecyclerView az;
    public final RecyclerView ck;
    public final AppCompatTextView gh;
    public final ValueSpinner mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9266n;
    public final TextView nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageButton f9267o;
    public final View qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f9268r;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ValueSpinner f9269t;
    public final SwitchCompat ty;
    public final TextView xMQ;

    public static Pmq n(View view) {
        int i2 = 2131362094;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362094);
        if (imageView != null) {
            i2 = 2131362311;
            ValueSpinner valueSpinner = (ValueSpinner) ViewBindings.n(view, 2131362311);
            if (valueSpinner != null) {
                i2 = 2131362312;
                TextView textView = (TextView) ViewBindings.n(view, 2131362312);
                if (textView != null) {
                    i2 = 2131362313;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362313);
                    if (constraintLayout != null) {
                        i2 = 2131362314;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.n(view, 2131362314);
                        if (constraintLayout2 != null) {
                            i2 = 2131362316;
                            CameraViewPerspective cameraViewPerspective = (CameraViewPerspective) ViewBindings.n(view, 2131362316);
                            if (cameraViewPerspective != null) {
                                i2 = 2131362317;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.n(view, 2131362317);
                                if (constraintLayout3 != null) {
                                    i2 = 2131362318;
                                    TextView textView2 = (TextView) ViewBindings.n(view, 2131362318);
                                    if (textView2 != null) {
                                        i2 = 2131362319;
                                        ValueSpinner valueSpinner2 = (ValueSpinner) ViewBindings.n(view, 2131362319);
                                        if (valueSpinner2 != null) {
                                            i2 = 2131362320;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362320);
                                            if (appCompatTextView != null) {
                                                i2 = 2131362697;
                                                View viewN = ViewBindings.n(view, 2131362697);
                                                if (viewN != null) {
                                                    i2 = 2131362811;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362811);
                                                    if (recyclerView != null) {
                                                        i2 = 2131362812;
                                                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.n(view, 2131362812);
                                                        if (switchCompat != null) {
                                                            i2 = 2131362813;
                                                            TextView textView3 = (TextView) ViewBindings.n(view, 2131362813);
                                                            if (textView3 != null) {
                                                                i2 = 2131362815;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.n(view, 2131362815);
                                                                if (recyclerView2 != null) {
                                                                    i2 = 2131362816;
                                                                    SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.n(view, 2131362816);
                                                                    if (switchCompat2 != null) {
                                                                        i2 = 2131362817;
                                                                        TextView textView4 = (TextView) ViewBindings.n(view, 2131362817);
                                                                        if (textView4 != null) {
                                                                            i2 = 2131363389;
                                                                            ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363389);
                                                                            if (imageButton != null) {
                                                                                i2 = 2131363759;
                                                                                View viewN2 = ViewBindings.n(view, 2131363759);
                                                                                if (viewN2 != null) {
                                                                                    return new Pmq((ConstraintLayout) view, imageView, valueSpinner, textView, constraintLayout, constraintLayout2, cameraViewPerspective, constraintLayout3, textView2, valueSpinner2, appCompatTextView, viewN, recyclerView, switchCompat, textView3, recyclerView2, switchCompat2, textView4, imageButton, viewN2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9266n;
    }

    private Pmq(ConstraintLayout constraintLayout, ImageView imageView, ValueSpinner valueSpinner, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CameraViewPerspective cameraViewPerspective, ConstraintLayout constraintLayout4, TextView textView2, ValueSpinner valueSpinner2, AppCompatTextView appCompatTextView, View view, RecyclerView recyclerView, SwitchCompat switchCompat, TextView textView3, RecyclerView recyclerView2, SwitchCompat switchCompat2, TextView textView4, ImageButton imageButton, View view2) {
        this.f9266n = constraintLayout;
        this.rl = imageView;
        this.f9269t = valueSpinner;
        this.nr = textView;
        this.f9264O = constraintLayout2;
        this.J2 = constraintLayout3;
        this.Uo = cameraViewPerspective;
        this.KN = constraintLayout4;
        this.xMQ = textView2;
        this.mUb = valueSpinner2;
        this.gh = appCompatTextView;
        this.qie = view;
        this.az = recyclerView;
        this.ty = switchCompat;
        this.HI = textView3;
        this.ck = recyclerView2;
        this.Ik = switchCompat2;
        this.f9268r = textView4;
        this.f9267o = imageButton;
        this.f9265Z = view2;
    }
}
