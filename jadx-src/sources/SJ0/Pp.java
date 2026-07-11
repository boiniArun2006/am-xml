package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pp implements ViewBinding {
    public final View J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9270O;
    public final ImageButton Uo;
    public final ImageView gh;
    public final ImageButton mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9271n;
    public final SeekBar nr;
    public final ColorPickerWidget rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Guideline f9272t;
    public final ImageButton xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9271n;
    }

    private Pp(ConstraintLayout constraintLayout, ColorPickerWidget colorPickerWidget, Guideline guideline, SeekBar seekBar, TextView textView, View view, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageView imageView) {
        this.f9271n = constraintLayout;
        this.rl = colorPickerWidget;
        this.f9272t = guideline;
        this.nr = seekBar;
        this.f9270O = textView;
        this.J2 = view;
        this.Uo = imageButton;
        this.KN = imageButton2;
        this.xMQ = imageButton3;
        this.mUb = imageButton4;
        this.gh = imageView;
    }

    public static Pp n(View view) {
        int i2 = 2131362398;
        ColorPickerWidget colorPickerWidget = (ColorPickerWidget) ViewBindings.n(view, 2131362398);
        if (colorPickerWidget != null) {
            i2 = 2131362903;
            Guideline guideline = (Guideline) ViewBindings.n(view, 2131362903);
            if (guideline != null) {
                i2 = 2131363776;
                SeekBar seekBar = (SeekBar) ViewBindings.n(view, 2131363776);
                if (seekBar != null) {
                    i2 = 2131363778;
                    TextView textView = (TextView) ViewBindings.n(view, 2131363778);
                    if (textView != null) {
                        i2 = 2131363901;
                        View viewN = ViewBindings.n(view, 2131363901);
                        if (viewN != null) {
                            i2 = 2131363919;
                            ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363919);
                            if (imageButton != null) {
                                i2 = 2131363920;
                                ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363920);
                                if (imageButton2 != null) {
                                    i2 = 2131363921;
                                    ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363921);
                                    if (imageButton3 != null) {
                                        i2 = 2131363922;
                                        ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131363922);
                                        if (imageButton4 != null) {
                                            i2 = 2131364072;
                                            ImageView imageView = (ImageView) ViewBindings.n(view, 2131364072);
                                            if (imageView != null) {
                                                return new Pp((ConstraintLayout) view, colorPickerWidget, guideline, seekBar, textView, viewN, imageButton, imageButton2, imageButton3, imageButton4, imageView);
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

    public static Pp t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558593, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
