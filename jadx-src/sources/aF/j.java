package aF;

import Rxk.C;
import Rxk.n;
import Rxk.o;
import X4.w6;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.internal.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j extends AppCompatRadioButton {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int f12796S = C.f8723S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[][] f12797g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f12798o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f12799r;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.bzg);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f12796S;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayXMQ = eO.xMQ(context2, attributeSet, o.q8, i2, i3, new int[0]);
        int i5 = o.cJ;
        if (typedArrayXMQ.hasValue(i5)) {
            CompoundButtonCompat.nr(this, w6.n(context2, typedArrayXMQ, i5));
        }
        this.f12798o = typedArrayXMQ.getBoolean(o.zv, false);
        typedArrayXMQ.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12799r == null) {
            int iNr = W3.j.nr(this, n.KN);
            int iNr2 = W3.j.nr(this, n.gh);
            int iNr3 = W3.j.nr(this, n.ty);
            int[][] iArr = f12797g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = W3.j.mUb(iNr3, iNr, 1.0f);
            iArr2[1] = W3.j.mUb(iNr3, iNr2, 0.54f);
            iArr2[2] = W3.j.mUb(iNr3, iNr2, 0.38f);
            iArr2[3] = W3.j.mUb(iNr3, iNr2, 0.38f);
            this.f12799r = new ColorStateList(iArr, iArr2);
        }
        return this.f12799r;
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f12798o = z2;
        if (z2) {
            CompoundButtonCompat.nr(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.nr(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12798o && CompoundButtonCompat.rl(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
