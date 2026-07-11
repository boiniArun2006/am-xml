package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class oJ implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RelativeLayout f9580n;
    public final AppCompatTextView rl;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f9580n;
    }

    private oJ(RelativeLayout relativeLayout, AppCompatTextView appCompatTextView) {
        this.f9580n = relativeLayout;
        this.rl = appCompatTextView;
    }

    public static oJ n(View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363144);
        if (appCompatTextView != null) {
            return new oJ((RelativeLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363144)));
    }

    public static oJ t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558721, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
