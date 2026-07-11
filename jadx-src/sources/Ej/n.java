package Ej;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n extends AsyncTask {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f2361n;
    protected final InterfaceC0084n rl;

    public interface j {
        void n(n nVar);
    }

    /* JADX INFO: renamed from: Ej.n$n, reason: collision with other inner class name */
    public interface InterfaceC0084n {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public void t(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void n(j jVar) {
        this.f2361n = jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        j jVar = this.f2361n;
        if (jVar != null) {
            jVar.n(this);
        }
    }

    public n(InterfaceC0084n interfaceC0084n) {
        this.rl = interfaceC0084n;
    }
}
