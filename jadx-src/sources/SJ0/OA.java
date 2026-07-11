package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.EditTextEx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class OA implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9247n;
    public final EditTextEx rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FrameLayout f9248t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9247n;
    }

    private OA(ConstraintLayout constraintLayout, EditTextEx editTextEx, FrameLayout frameLayout) {
        this.f9247n = constraintLayout;
        this.rl = editTextEx;
        this.f9248t = frameLayout;
    }

    public static OA n(View view) {
        int i2 = 2131362608;
        EditTextEx editTextEx = (EditTextEx) ViewBindings.n(view, 2131362608);
        if (editTextEx != null) {
            i2 = 2131362609;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131362609);
            if (frameLayout != null) {
                return new OA((ConstraintLayout) view, editTextEx, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static OA t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558609, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
