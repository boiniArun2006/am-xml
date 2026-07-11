package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1461n implements ViewBinding {
    public final View J2;
    public final FrameLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ConstraintLayout f9548O;
    public final DrawerLayout Uo;
    public final Guideline gh;
    public final TextView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DrawerLayout f9549n;
    public final RecyclerView nr;
    public final Button rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9550t;
    public final TextView xMQ;

    public static C1461n t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public DrawerLayout getRoot() {
        return this.f9549n;
    }

    private C1461n(DrawerLayout drawerLayout, Button button, ImageButton imageButton, RecyclerView recyclerView, ConstraintLayout constraintLayout, View view, DrawerLayout drawerLayout2, FrameLayout frameLayout, TextView textView, TextView textView2, Guideline guideline) {
        this.f9549n = drawerLayout;
        this.rl = button;
        this.f9550t = imageButton;
        this.nr = recyclerView;
        this.f9548O = constraintLayout;
        this.J2 = view;
        this.Uo = drawerLayout2;
        this.KN = frameLayout;
        this.xMQ = textView;
        this.mUb = textView2;
        this.gh = guideline;
    }

    public static C1461n n(View view) {
        int i2 = 2131362217;
        Button button = (Button) ViewBindings.n(view, 2131362217);
        if (button != null) {
            i2 = 2131362232;
            ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362232);
            if (imageButton != null) {
                i2 = 2131362338;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362338);
                if (recyclerView != null) {
                    i2 = 2131362444;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362444);
                    if (constraintLayout != null) {
                        i2 = 2131362560;
                        View viewN = ViewBindings.n(view, 2131362560);
                        if (viewN != null) {
                            DrawerLayout drawerLayout = (DrawerLayout) view;
                            i2 = 2131362838;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131362838);
                            if (frameLayout != null) {
                                i2 = 2131363771;
                                TextView textView = (TextView) ViewBindings.n(view, 2131363771);
                                if (textView != null) {
                                    i2 = 2131363910;
                                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363910);
                                    if (textView2 != null) {
                                        i2 = 2131363926;
                                        Guideline guideline = (Guideline) ViewBindings.n(view, 2131363926);
                                        if (guideline != null) {
                                            return new C1461n(drawerLayout, button, imageButton, recyclerView, constraintLayout, viewN, drawerLayout, frameLayout, textView, textView2, guideline);
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

    public static C1461n nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558429, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
