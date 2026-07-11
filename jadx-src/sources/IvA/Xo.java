package IvA;

import android.app.Application;
import com.alightcreative.app.motion.AlightMotionApplication;
import com.pairip.StartupLauncher;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Xo extends Application implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4315n = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final BGJ.Ml f4316t = new BGJ.Ml(new j());

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class j implements BGJ.I28 {
        j() {
        }

        @Override // BGJ.I28
        public Object get() {
            return qz.n().n(new sMY.j(Xo.this)).rl();
        }
    }

    static {
        StartupLauncher.launch();
    }

    public final BGJ.Ml n() {
        return this.f4316t;
    }

    protected void rl() {
        if (this.f4315n) {
            return;
        }
        this.f4315n = true;
        ((w6) Z()).rl((AlightMotionApplication) j9J.I28.n(this));
    }

    @Override // j9J.n
    public final Object Z() {
        return n().Z();
    }

    @Override // android.app.Application
    public void onCreate() {
        rl();
        super.onCreate();
    }
}
