package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class TintContextWrapper extends ContextWrapper {
    private static ArrayList nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f14381t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Resources f14382n;
    private final Resources.Theme rl;

    private static boolean n(Context context) {
        return ((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources) || !VectorEnabledTintResources.t()) ? false : true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f14382n.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f14382n;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.rl;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.rl;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }

    private TintContextWrapper(Context context) {
        super(context);
        if (VectorEnabledTintResources.t()) {
            VectorEnabledTintResources vectorEnabledTintResources = new VectorEnabledTintResources(this, context.getResources());
            this.f14382n = vectorEnabledTintResources;
            Resources.Theme themeNewTheme = vectorEnabledTintResources.newTheme();
            this.rl = themeNewTheme;
            themeNewTheme.setTo(context.getTheme());
            return;
        }
        this.f14382n = new TintResources(this, context.getResources());
        this.rl = null;
    }

    public static Context rl(Context context) {
        TintContextWrapper tintContextWrapper;
        if (n(context)) {
            synchronized (f14381t) {
                try {
                    ArrayList arrayList = nr;
                    if (arrayList == null) {
                        nr = new ArrayList();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference weakReference = (WeakReference) nr.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                nr.remove(size);
                            }
                        }
                        for (int size2 = nr.size() - 1; size2 >= 0; size2--) {
                            WeakReference weakReference2 = (WeakReference) nr.get(size2);
                            if (weakReference2 != null) {
                                tintContextWrapper = (TintContextWrapper) weakReference2.get();
                            } else {
                                tintContextWrapper = null;
                            }
                            if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                                return tintContextWrapper;
                            }
                        }
                    }
                    TintContextWrapper tintContextWrapper2 = new TintContextWrapper(context);
                    nr.add(new WeakReference(tintContextWrapper2));
                    return tintContextWrapper2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return context;
    }
}
