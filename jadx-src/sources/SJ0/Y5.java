package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.TryIcon;
import com.alightcreative.widget.SettingEditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Y5 implements ViewBinding {
    public final AppCompatImageView J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageView f9393O;
    public final ImageButton Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9394n;
    public final ConstraintLayout nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SettingEditText f9395t;
    public final TryIcon xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9394n;
    }

    private Y5(LinearLayout linearLayout, ImageButton imageButton, SettingEditText settingEditText, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageButton imageButton2, ImageButton imageButton3, TryIcon tryIcon) {
        this.f9394n = linearLayout;
        this.rl = imageButton;
        this.f9395t = settingEditText;
        this.nr = constraintLayout;
        this.f9393O = appCompatImageView;
        this.J2 = appCompatImageView2;
        this.Uo = imageButton2;
        this.KN = imageButton3;
        this.xMQ = tryIcon;
    }

    public static Y5 n(View view) {
        int i2 = 2131362514;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362514);
        if (imageButton != null) {
            i2 = 2131362654;
            SettingEditText settingEditText = (SettingEditText) ViewBindings.n(view, 2131362654);
            if (settingEditText != null) {
                i2 = 2131363083;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131363083);
                if (constraintLayout != null) {
                    i2 = 2131363084;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363084);
                    if (appCompatImageView != null) {
                        i2 = 2131363194;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363194);
                        if (appCompatImageView2 != null) {
                            i2 = 2131363266;
                            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363266);
                            if (imageButton2 != null) {
                                i2 = 2131363362;
                                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363362);
                                if (imageButton3 != null) {
                                    i2 = 2131363960;
                                    TryIcon tryIcon = (TryIcon) ViewBindings.n(view, 2131363960);
                                    if (tryIcon != null) {
                                        return new Y5((LinearLayout) view, imageButton, settingEditText, constraintLayout, appCompatImageView, appCompatImageView2, imageButton2, imageButton3, tryIcon);
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

    public static Y5 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558599, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
