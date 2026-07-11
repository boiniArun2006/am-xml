package mc;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j extends ServiceConnection, Nge.n {
    void a(String str);

    boolean a();

    void b();

    void b(String str);

    void c(String str);

    boolean c();

    String d();

    void destroy();

    String e();

    boolean f();

    Context g();

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();

    void l();

    void n(j jVar);

    void rl(j jVar);

    void t(ComponentName componentName, IBinder iBinder);
}
