package SJ0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.ValueSpinner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Lu implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9200n;
    public final AppCompatTextView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ValueSpinner f9201t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9200n;
    }

    private Lu(ConstraintLayout constraintLayout, View view, ValueSpinner valueSpinner, AppCompatTextView appCompatTextView) {
        this.f9200n = constraintLayout;
        this.rl = view;
        this.f9201t = valueSpinner;
        this.nr = appCompatTextView;
    }

    public static Lu n(View view) {
        int i2 = 2131362560;
        View viewN = ViewBindings.n(view, 2131362560);
        if (viewN != null) {
            i2 = 2131363406;
            ValueSpinner valueSpinner = (ValueSpinner) ViewBindings.n(view, 2131363406);
            if (valueSpinner != null) {
                i2 = 2131363744;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363744);
                if (appCompatTextView != null) {
                    return new Lu((ConstraintLayout) view, viewN, valueSpinner, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
