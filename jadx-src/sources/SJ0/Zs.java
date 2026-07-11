package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Zs implements ViewBinding {
    public final RecyclerView J2;
    public final Guideline KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final DrawerLayout f9403O;
    public final TextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DrawerLayout f9404n;
    public final View nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f9405t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public DrawerLayout getRoot() {
        return this.f9404n;
    }

    private Zs(DrawerLayout drawerLayout, ImageButton imageButton, ConstraintLayout constraintLayout, View view, DrawerLayout drawerLayout2, RecyclerView recyclerView, TextView textView, Guideline guideline) {
        this.f9404n = drawerLayout;
        this.rl = imageButton;
        this.f9405t = constraintLayout;
        this.nr = view;
        this.f9403O = drawerLayout2;
        this.J2 = recyclerView;
        this.Uo = textView;
        this.KN = guideline;
    }

    public static Zs n(View view) {
        int i2 = 2131362222;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362222);
        if (imageButton != null) {
            i2 = 2131362444;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362444);
            if (constraintLayout != null) {
                i2 = 2131362560;
                View viewN = ViewBindings.n(view, 2131362560);
                if (viewN != null) {
                    DrawerLayout drawerLayout = (DrawerLayout) view;
                    i2 = 2131363182;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363182);
                    if (recyclerView != null) {
                        i2 = 2131363602;
                        TextView textView = (TextView) ViewBindings.n(view, 2131363602);
                        if (textView != null) {
                            i2 = 2131363926;
                            Guideline guideline = (Guideline) ViewBindings.n(view, 2131363926);
                            if (guideline != null) {
                                return new Zs(drawerLayout, imageButton, constraintLayout, viewN, drawerLayout, recyclerView, textView, guideline);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Zs t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558490, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
