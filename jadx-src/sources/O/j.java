package O;

import ES.Dsr;
import ES.w6;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import x0.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j {
    private final AssetManager nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f7231n = new Dsr();
    private final Map rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f7232t = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f7230O = ".ttf";

    public void nr(FQq.n nVar) {
    }

    private Typeface O(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i2 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    public Typeface rl(w6 w6Var) {
        this.f7231n.rl(w6Var.n(), w6Var.t());
        Typeface typeface = (Typeface) this.rl.get(this.f7231n);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceO = O(n(w6Var), w6Var.t());
        this.rl.put(this.f7231n, typefaceO);
        return typefaceO;
    }

    public void t(String str) {
        this.f7230O = str;
    }

    public j(Drawable.Callback callback, FQq.n nVar) {
        if (!(callback instanceof View)) {
            CN3.t("LottieDrawable must be inside of a view for images to work.");
            this.nr = null;
        } else {
            this.nr = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface n(w6 w6Var) {
        String strN = w6Var.n();
        Typeface typeface = (Typeface) this.f7232t.get(strN);
        if (typeface != null) {
            return typeface;
        }
        w6Var.t();
        w6Var.rl();
        if (w6Var.nr() != null) {
            return w6Var.nr();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.nr, "fonts/" + strN + this.f7230O);
        this.f7232t.put(strN, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }
}
