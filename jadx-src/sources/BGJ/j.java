package BGJ;

import android.app.Activity;
import android.app.Application;
import androidx.view.ComponentActivity;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j implements j9J.n {
    private final j9J.n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final Activity f422O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f423n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f424t = new Object();

    /* JADX INFO: renamed from: BGJ.j$j, reason: collision with other inner class name */
    public interface InterfaceC0012j {
        Xsz.j n();
    }

    @Override // j9J.n
    public Object Z() {
        if (this.f423n == null) {
            synchronized (this.f424t) {
                try {
                    if (this.f423n == null) {
                        this.f423n = n();
                    }
                } finally {
                }
            }
        }
        return this.f423n;
    }

    protected Object n() {
        String str;
        if (this.f422O.getApplication() instanceof j9J.n) {
            return ((InterfaceC0012j) p7j.j.n(this.J2, InterfaceC0012j.class)).n().n(this.f422O).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f422O.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f422O.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final CN3 rl() {
        return ((n) this.J2).t();
    }

    public j(Activity activity) {
        this.f422O = activity;
        this.J2 = new n((ComponentActivity) activity);
    }
}
