package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.ValueSpinner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qfL implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9603n;
    public final ValueSpinner rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9604t;

    public static qfL t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9603n;
    }

    private qfL(ConstraintLayout constraintLayout, ValueSpinner valueSpinner, AppCompatTextView appCompatTextView) {
        this.f9603n = constraintLayout;
        this.rl = valueSpinner;
        this.f9604t = appCompatTextView;
    }

    public static qfL n(View view) {
        int i2 = 2131363743;
        ValueSpinner valueSpinner = (ValueSpinner) ViewBindings.n(view, 2131363743);
        if (valueSpinner != null) {
            i2 = 2131363744;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363744);
            if (appCompatTextView != null) {
                return new qfL((ConstraintLayout) view, valueSpinner, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static qfL nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558839, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
