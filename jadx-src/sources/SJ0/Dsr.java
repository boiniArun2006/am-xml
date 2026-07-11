package SJ0;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.SettingEditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr implements ViewBinding {
    public final ImageButton J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9118O;
    public final SettingEditText Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9119n;
    public final ImageButton nr;
    public final RecyclerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9120t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9119n;
    }

    private Dsr(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, SettingEditText settingEditText, ImageButton imageButton4) {
        this.f9119n = linearLayout;
        this.rl = recyclerView;
        this.f9120t = textView;
        this.nr = imageButton;
        this.f9118O = imageButton2;
        this.J2 = imageButton3;
        this.Uo = settingEditText;
        this.KN = imageButton4;
    }

    public static Dsr n(View view) {
        int i2 = 2131362605;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362605);
        if (recyclerView != null) {
            i2 = 2131362610;
            TextView textView = (TextView) ViewBindings.n(view, 2131362610);
            if (textView != null) {
                i2 = 2131362705;
                ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362705);
                if (imageButton != null) {
                    i2 = 2131362889;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362889);
                    if (imageButton2 != null) {
                        i2 = 2131363465;
                        ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363465);
                        if (imageButton3 != null) {
                            i2 = 2131363472;
                            SettingEditText settingEditText = (SettingEditText) ViewBindings.n(view, 2131363472);
                            if (settingEditText != null) {
                                i2 = 2131363672;
                                ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131363672);
                                if (imageButton4 != null) {
                                    return new Dsr((LinearLayout) view, recyclerView, textView, imageButton, imageButton2, imageButton3, settingEditText, imageButton4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
