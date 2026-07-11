package SJ0;

import android.view.View;
import android.widget.ImageButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.LevelMeterView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class aC implements ViewBinding {
    public final ImageButton J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ConstraintLayout f9407O;
    public final ImageButton Uo;
    public final ImageButton gh;
    public final ImageButton mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9408n;
    public final ImageButton nr;
    public final LevelMeterView qie;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardView f9409t;
    public final ImageButton xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9408n;
    }

    private aC(ConstraintLayout constraintLayout, ImageButton imageButton, CardView cardView, ImageButton imageButton2, ConstraintLayout constraintLayout2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, ImageButton imageButton7, ImageButton imageButton8, LevelMeterView levelMeterView) {
        this.f9408n = constraintLayout;
        this.rl = imageButton;
        this.f9409t = cardView;
        this.nr = imageButton2;
        this.f9407O = constraintLayout2;
        this.J2 = imageButton3;
        this.Uo = imageButton4;
        this.KN = imageButton5;
        this.xMQ = imageButton6;
        this.mUb = imageButton7;
        this.gh = imageButton8;
        this.qie = levelMeterView;
    }

    public static aC n(View view) {
        int i2 = 2131362224;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362224);
        if (imageButton != null) {
            CardView cardView = (CardView) ViewBindings.n(view, 2131362235);
            i2 = 2131362236;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362236);
            if (imageButton2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362237);
                i2 = 2131362274;
                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131362274);
                if (imageButton3 != null) {
                    i2 = 2131362279;
                    ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131362279);
                    if (imageButton4 != null) {
                        i2 = 2131362280;
                        ImageButton imageButton5 = (ImageButton) ViewBindings.n(view, 2131362280);
                        if (imageButton5 != null) {
                            i2 = 2131362287;
                            ImageButton imageButton6 = (ImageButton) ViewBindings.n(view, 2131362287);
                            if (imageButton6 != null) {
                                i2 = 2131362288;
                                ImageButton imageButton7 = (ImageButton) ViewBindings.n(view, 2131362288);
                                if (imageButton7 != null) {
                                    i2 = 2131362300;
                                    ImageButton imageButton8 = (ImageButton) ViewBindings.n(view, 2131362300);
                                    if (imageButton8 != null) {
                                        i2 = 2131363095;
                                        LevelMeterView levelMeterView = (LevelMeterView) ViewBindings.n(view, 2131363095);
                                        if (levelMeterView != null) {
                                            return new aC((ConstraintLayout) view, imageButton, cardView, imageButton2, constraintLayout, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, imageButton8, levelMeterView);
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
