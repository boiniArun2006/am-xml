package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1454b implements ViewBinding {
    public final View J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageButton f9413O;
    public final AppCompatImageView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f9414n;
    public final AppCompatImageView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9415t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f9414n;
    }

    private C1454b(FrameLayout frameLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageButton appCompatImageButton, View view, AppCompatImageView appCompatImageView4) {
        this.f9414n = frameLayout;
        this.rl = appCompatImageView;
        this.f9415t = appCompatImageView2;
        this.nr = appCompatImageView3;
        this.f9413O = appCompatImageButton;
        this.J2 = view;
        this.Uo = appCompatImageView4;
    }

    public static C1454b n(View view) {
        int i2 = 2131362372;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362372);
        if (appCompatImageView != null) {
            i2 = 2131362908;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131362908);
            if (appCompatImageView2 != null) {
                i2 = 2131363085;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.n(view, 2131363085);
                if (appCompatImageView3 != null) {
                    i2 = 2131363086;
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131363086);
                    if (appCompatImageButton != null) {
                        i2 = 2131363934;
                        View viewN = ViewBindings.n(view, 2131363934);
                        if (viewN != null) {
                            i2 = 2131363935;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.n(view, 2131363935);
                            if (appCompatImageView4 != null) {
                                return new C1454b((FrameLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageButton, viewN, appCompatImageView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static C1454b t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558831, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
