package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class TintResources extends ResourcesWrapper {
    private final WeakReference rl;

    public TintResources(Context context, Resources resources) {
        super(resources);
        this.rl = new WeakReference(context);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawableN = n(i2);
        Context context = (Context) this.rl.get();
        if (drawableN != null && context != null) {
            ResourceManagerInternal.Uo().WPU(context, i2, drawableN);
        }
        return drawableN;
    }
}
