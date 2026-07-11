package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ji implements ViewBinding {
    public final TextView J2;
    public final LinearLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayout f9168O;
    public final AppCompatButton Uo;
    public final RecyclerView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9169n;
    public final ImageButton nr;
    public final LinearProgressIndicator rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9170t;
    public final ConstraintLayout xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9169n;
    }

    private Ji(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, View view, ImageButton imageButton, LinearLayout linearLayout, TextView textView, AppCompatButton appCompatButton, LinearLayout linearLayout2, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.f9169n = constraintLayout;
        this.rl = linearProgressIndicator;
        this.f9170t = view;
        this.nr = imageButton;
        this.f9168O = linearLayout;
        this.J2 = textView;
        this.Uo = appCompatButton;
        this.KN = linearLayout2;
        this.xMQ = constraintLayout2;
        this.mUb = recyclerView;
    }

    public static Ji n(View view) {
        int i2 = 2131362030;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.n(view, 2131362030);
        if (linearProgressIndicator != null) {
            i2 = 2131362156;
            View viewN = ViewBindings.n(view, 2131362156);
            if (viewN != null) {
                i2 = 2131362321;
                ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362321);
                if (imageButton != null) {
                    i2 = 2131362850;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362850);
                    if (linearLayout != null) {
                        i2 = 2131362851;
                        TextView textView = (TextView) ViewBindings.n(view, 2131362851);
                        if (textView != null) {
                            i2 = 2131363195;
                            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.n(view, 2131363195);
                            if (appCompatButton != null) {
                                i2 = 2131363914;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131363914);
                                if (linearLayout2 != null) {
                                    i2 = 2131363952;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131363952);
                                    if (constraintLayout != null) {
                                        i2 = 2131363953;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363953);
                                        if (recyclerView != null) {
                                            return new Ji((ConstraintLayout) view, linearProgressIndicator, viewN, imageButton, linearLayout, textView, appCompatButton, linearLayout2, constraintLayout, recyclerView);
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

    public static Ji t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558835, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
