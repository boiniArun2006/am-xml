package Zo2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import rH.QJ;
import rH.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements ViewBinding {
    public final VectorTextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final FrameLayout f12599O;
    public final FrameLayout Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f12600n;
    public final RadiusLayout nr;
    public final FrameLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f12601t;

    public static j n(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i2 = QJ.f72956n;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i2);
        if (appCompatImageView != null) {
            i2 = QJ.rl;
            RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(i2);
            if (radiusLayout != null) {
                i2 = QJ.f72957t;
                FrameLayout frameLayout2 = (FrameLayout) view.findViewById(i2);
                if (frameLayout2 != null) {
                    i2 = QJ.nr;
                    VectorTextView vectorTextView = (VectorTextView) view.findViewById(i2);
                    if (vectorTextView != null) {
                        i2 = QJ.f72955O;
                        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(i2);
                        if (frameLayout3 != null) {
                            return new j((FrameLayout) view, frameLayout, appCompatImageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static j t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(l3D.f72984n, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f12600n;
    }

    private j(FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatImageView appCompatImageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.f12600n = frameLayout;
        this.rl = frameLayout2;
        this.f12601t = appCompatImageView;
        this.nr = radiusLayout;
        this.f12599O = frameLayout3;
        this.J2 = vectorTextView;
        this.Uo = frameLayout4;
    }
}
