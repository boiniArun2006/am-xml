package SJ0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9406n;
    public final ListView rl;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9406n;
    }

    private a(LinearLayout linearLayout, ListView listView) {
        this.f9406n = linearLayout;
        this.rl = listView;
    }

    public static a n(View view) {
        ListView listView = (ListView) ViewBindings.n(view, 2131362060);
        if (listView != null) {
            return new a((LinearLayout) view, listView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131362060)));
    }
}
