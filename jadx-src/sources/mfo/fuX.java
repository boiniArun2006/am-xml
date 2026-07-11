package mfo;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {
    static Ml n(int i2) {
        return i2 != 0 ? i2 != 1 ? rl() : new I28() : new aC();
    }

    static Ml rl() {
        return new aC();
    }

    static Wre t() {
        return new Wre();
    }

    public static void J2(View view, CN3 cn3) {
        if (cn3.wTp()) {
            cn3.M(l3D.J2(view));
        }
    }

    public static void O(View view) {
        Drawable background = view.getBackground();
        if (background instanceof CN3) {
            J2(view, (CN3) background);
        }
    }

    public static void nr(View view, float f3) {
        Drawable background = view.getBackground();
        if (background instanceof CN3) {
            ((CN3) background).M7(f3);
        }
    }
}
