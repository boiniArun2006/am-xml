package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class ActionBarPolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f13758n;

    public boolean KN() {
        return true;
    }

    public static ActionBarPolicy rl(Context context) {
        return new ActionBarPolicy(context);
    }

    public int J2() {
        TypedArray typedArrayObtainStyledAttributes = this.f13758n.obtainStyledAttributes(null, R.styleable.f13531n, R.attr.f13442t, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.mUb, 0);
        Resources resources = this.f13758n.getResources();
        if (!Uo()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.f13450n));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public int O() {
        return this.f13758n.getResources().getDimensionPixelSize(R.dimen.rl);
    }

    public boolean Uo() {
        return this.f13758n.getResources().getBoolean(R.bool.f13445n);
    }

    public boolean n() {
        return this.f13758n.getApplicationInfo().targetSdkVersion < 14;
    }

    public int nr() {
        Configuration configuration = this.f13758n.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int t() {
        return this.f13758n.getResources().getDisplayMetrics().widthPixels / 2;
    }

    private ActionBarPolicy(Context context) {
        this.f13758n = context;
    }
}
