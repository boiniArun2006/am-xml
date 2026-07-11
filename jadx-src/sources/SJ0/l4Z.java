package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class l4Z implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RelativeLayout f9516n;
    public final ColorPickerWidget rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RelativeLayout f9517t;

    public static l4Z t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f9516n;
    }

    private l4Z(RelativeLayout relativeLayout, ColorPickerWidget colorPickerWidget, RelativeLayout relativeLayout2) {
        this.f9516n = relativeLayout;
        this.rl = colorPickerWidget;
        this.f9517t = relativeLayout2;
    }

    public static l4Z n(View view) {
        ColorPickerWidget colorPickerWidget = (ColorPickerWidget) ViewBindings.n(view, 2131362398);
        if (colorPickerWidget != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new l4Z(relativeLayout, colorPickerWidget, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131362398)));
    }

    public static l4Z nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558501, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
