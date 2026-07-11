package SJ0;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class FPL implements ViewBinding {
    public final ConstraintLayout J2;
    public final TextView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayout f9131O;
    public final RecyclerView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9132n;
    public final RecyclerView nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9133t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9132n;
    }

    private FPL(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, RecyclerView recyclerView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView2, TextView textView) {
        this.f9132n = constraintLayout;
        this.rl = imageButton;
        this.f9133t = imageButton2;
        this.nr = recyclerView;
        this.f9131O = linearLayout;
        this.J2 = constraintLayout2;
        this.Uo = recyclerView2;
        this.KN = textView;
    }

    public static FPL n(View view) {
        int i2 = 2131362240;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362240);
        if (imageButton != null) {
            i2 = 2131362253;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362253);
            if (imageButton2 != null) {
                i2 = 2131362640;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362640);
                if (recyclerView != null) {
                    i2 = 2131362644;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362644);
                    if (linearLayout != null) {
                        i2 = 2131362645;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362645);
                        if (constraintLayout != null) {
                            i2 = 2131362646;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.n(view, 2131362646);
                            if (recyclerView2 != null) {
                                i2 = 2131363658;
                                TextView textView = (TextView) ViewBindings.n(view, 2131363658);
                                if (textView != null) {
                                    return new FPL((ConstraintLayout) view, imageButton, imageButton2, recyclerView, linearLayout, constraintLayout, recyclerView2, textView);
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
