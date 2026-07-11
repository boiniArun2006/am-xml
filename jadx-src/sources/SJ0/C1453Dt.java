package SJ0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1453Dt implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9121n;
    public final AppCompatTextView nr;
    public final AppCompatImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageButton f9122t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9121n;
    }

    private C1453Dt(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, AppCompatTextView appCompatTextView) {
        this.f9121n = constraintLayout;
        this.rl = appCompatImageButton;
        this.f9122t = appCompatImageButton2;
        this.nr = appCompatTextView;
    }

    public static C1453Dt n(View view) {
        int i2 = 2131362229;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362229);
        if (appCompatImageButton != null) {
            i2 = 2131362231;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.n(view, 2131362231);
            if (appCompatImageButton2 != null) {
                i2 = 2131362326;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362326);
                if (appCompatTextView != null) {
                    return new C1453Dt((ConstraintLayout) view, appCompatImageButton, appCompatImageButton2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
