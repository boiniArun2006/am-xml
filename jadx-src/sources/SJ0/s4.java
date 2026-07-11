package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class s4 implements ViewBinding {
    public final DrawerLayout J2;
    public final LinearLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ConstraintLayout f9631O;
    public final RecyclerView Uo;
    public final Guideline az;
    public final TextView gh;
    public final LinearLayout mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DrawerLayout f9632n;
    public final ImageButton nr;
    public final EditText qie;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9633t;
    public final NavigationView xMQ;

    public static s4 t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static s4 n(View view) {
        int i2 = 2131362228;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362228);
        if (imageButton != null) {
            i2 = 2131362283;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362283);
            if (imageButton2 != null) {
                i2 = 2131362285;
                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131362285);
                if (imageButton3 != null) {
                    i2 = 2131362444;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362444);
                    if (constraintLayout != null) {
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        i2 = 2131362819;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362819);
                        if (recyclerView != null) {
                            i2 = 2131362820;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362820);
                            if (linearLayout != null) {
                                i2 = 2131363273;
                                NavigationView navigationView = (NavigationView) ViewBindings.n(view, 2131363273);
                                if (navigationView != null) {
                                    i2 = 2131363311;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131363311);
                                    if (linearLayout2 != null) {
                                        i2 = 2131363602;
                                        TextView textView = (TextView) ViewBindings.n(view, 2131363602);
                                        if (textView != null) {
                                            i2 = 2131363613;
                                            EditText editText = (EditText) ViewBindings.n(view, 2131363613);
                                            if (editText != null) {
                                                i2 = 2131363926;
                                                Guideline guideline = (Guideline) ViewBindings.n(view, 2131363926);
                                                if (guideline != null) {
                                                    return new s4(drawerLayout, imageButton, imageButton2, imageButton3, constraintLayout, drawerLayout, recyclerView, linearLayout, navigationView, linearLayout2, textView, editText, guideline);
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
    public DrawerLayout getRoot() {
        return this.f9632n;
    }

    private s4(DrawerLayout drawerLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ConstraintLayout constraintLayout, DrawerLayout drawerLayout2, RecyclerView recyclerView, LinearLayout linearLayout, NavigationView navigationView, LinearLayout linearLayout2, TextView textView, EditText editText, Guideline guideline) {
        this.f9632n = drawerLayout;
        this.rl = imageButton;
        this.f9633t = imageButton2;
        this.nr = imageButton3;
        this.f9631O = constraintLayout;
        this.J2 = drawerLayout2;
        this.Uo = recyclerView;
        this.KN = linearLayout;
        this.xMQ = navigationView;
        this.mUb = linearLayout2;
        this.gh = textView;
        this.qie = editText;
        this.az = guideline;
    }

    public static s4 nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558450, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
