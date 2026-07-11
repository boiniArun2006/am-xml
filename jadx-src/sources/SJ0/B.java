package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class B implements ViewBinding {
    public final Button J2;
    public final Button KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Button f9084O;
    public final Button Uo;
    public final CardView gh;
    public final Button mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9085n;
    public final Button nr;
    public final AppCompatTextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9086t;
    public final Button xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9085n;
    }

    private B(LinearLayout linearLayout, AppCompatTextView appCompatTextView, TextView textView, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, CardView cardView) {
        this.f9085n = linearLayout;
        this.rl = appCompatTextView;
        this.f9086t = textView;
        this.nr = button;
        this.f9084O = button2;
        this.J2 = button3;
        this.Uo = button4;
        this.KN = button5;
        this.xMQ = button6;
        this.mUb = button7;
        this.gh = cardView;
    }

    public static B n(View view) {
        int i2 = 2131363477;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363477);
        if (appCompatTextView != null) {
            i2 = 2131363490;
            TextView textView = (TextView) ViewBindings.n(view, 2131363490);
            if (textView != null) {
                i2 = 2131363645;
                Button button = (Button) ViewBindings.n(view, 2131363645);
                if (button != null) {
                    i2 = 2131363646;
                    Button button2 = (Button) ViewBindings.n(view, 2131363646);
                    if (button2 != null) {
                        i2 = 2131363647;
                        Button button3 = (Button) ViewBindings.n(view, 2131363647);
                        if (button3 != null) {
                            i2 = 2131363648;
                            Button button4 = (Button) ViewBindings.n(view, 2131363648);
                            if (button4 != null) {
                                i2 = 2131363649;
                                Button button5 = (Button) ViewBindings.n(view, 2131363649);
                                if (button5 != null) {
                                    i2 = 2131363650;
                                    Button button6 = (Button) ViewBindings.n(view, 2131363650);
                                    if (button6 != null) {
                                        i2 = 2131363651;
                                        Button button7 = (Button) ViewBindings.n(view, 2131363651);
                                        if (button7 != null) {
                                            i2 = 2131363652;
                                            CardView cardView = (CardView) ViewBindings.n(view, 2131363652);
                                            if (cardView != null) {
                                                return new B((LinearLayout) view, appCompatTextView, textView, button, button2, button3, button4, button5, button6, button7, cardView);
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

    public static B t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558557, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
