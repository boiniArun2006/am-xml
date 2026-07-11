package SJ0;

import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C implements ViewBinding {
    public final ImageButton J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9090O;
    public final ImageButton Uo;
    public final ImageButton gh;
    public final ImageButton mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9091n;
    public final ImageButton nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9092t;
    public final ImageButton xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9091n;
    }

    private C(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, ImageButton imageButton7, ImageButton imageButton8, ImageButton imageButton9, ImageButton imageButton10) {
        this.f9091n = constraintLayout;
        this.rl = imageButton;
        this.f9092t = imageButton2;
        this.nr = imageButton3;
        this.f9090O = imageButton4;
        this.J2 = imageButton5;
        this.Uo = imageButton6;
        this.KN = imageButton7;
        this.xMQ = imageButton8;
        this.mUb = imageButton9;
        this.gh = imageButton10;
    }

    public static C n(View view) {
        int i2 = 2131362040;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362040);
        if (imageButton != null) {
            i2 = 2131362043;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362043);
            if (imageButton2 != null) {
                i2 = 2131362045;
                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131362045);
                if (imageButton3 != null) {
                    i2 = 2131362205;
                    ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131362205);
                    if (imageButton4 != null) {
                        i2 = 2131362206;
                        ImageButton imageButton5 = (ImageButton) ViewBindings.n(view, 2131362206);
                        if (imageButton5 != null) {
                            i2 = 2131362207;
                            ImageButton imageButton6 = (ImageButton) ViewBindings.n(view, 2131362207);
                            if (imageButton6 != null) {
                                i2 = 2131362208;
                                ImageButton imageButton7 = (ImageButton) ViewBindings.n(view, 2131362208);
                                if (imageButton7 != null) {
                                    i2 = 2131362265;
                                    ImageButton imageButton8 = (ImageButton) ViewBindings.n(view, 2131362265);
                                    if (imageButton8 != null) {
                                        i2 = 2131362266;
                                        ImageButton imageButton9 = (ImageButton) ViewBindings.n(view, 2131362266);
                                        if (imageButton9 != null) {
                                            i2 = 2131362267;
                                            ImageButton imageButton10 = (ImageButton) ViewBindings.n(view, 2131362267);
                                            if (imageButton10 != null) {
                                                return new C((ConstraintLayout) view, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, imageButton8, imageButton9, imageButton10);
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
}
