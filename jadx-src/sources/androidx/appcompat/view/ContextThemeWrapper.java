package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.appcompat.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ContextThemeWrapper extends ContextWrapper {
    private static Configuration J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Resources f13761O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13762n;
    private Configuration nr;
    private Resources.Theme rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LayoutInflater f13763t;

    public ContextThemeWrapper(Context context, int i2) {
        super(context);
        this.f13762n = i2;
    }

    protected void J2(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    private static boolean O(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (J2 == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            J2 = configuration2;
        }
        return configuration.equals(J2);
    }

    private void nr() {
        boolean z2 = this.rl == null;
        if (z2) {
            this.rl = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.rl.setTo(theme);
            }
        }
        J2(this.rl, this.f13762n, z2);
    }

    private Resources rl() {
        if (this.f13761O == null) {
            Configuration configuration = this.nr;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && O(configuration))) {
                this.f13761O = super.getResources();
            } else {
                this.f13761O = createConfigurationContext(this.nr).getResources();
            }
        }
        return this.f13761O;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13763t == null) {
            this.f13763t = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13763t;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.rl;
        if (theme != null) {
            return theme;
        }
        if (this.f13762n == 0) {
            this.f13762n = R.style.nr;
        }
        nr();
        return this.rl;
    }

    public void n(Configuration configuration) {
        if (this.f13761O != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.nr != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.nr = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f13762n != i2) {
            this.f13762n = i2;
            nr();
        }
    }

    public int t() {
        return this.f13762n;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.rl = theme;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return rl();
    }
}
