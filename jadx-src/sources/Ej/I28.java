package Ej;

import Ej.n;
import a88.Pl;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class I28 extends j {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.nr.toString();
    }

    public I28(n.InterfaceC0084n interfaceC0084n, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0084n, hashSet, jSONObject, j2);
    }

    private void O(String str) {
        g4f.w6 w6VarO = g4f.w6.O();
        if (w6VarO != null) {
            for (Pl pl : w6VarO.t()) {
                if (this.f2360t.contains(pl.az())) {
                    pl.ty().mUb(str, this.f2359O);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ej.n, android.os.AsyncTask
    /* JADX INFO: renamed from: rl */
    public void onPostExecute(String str) {
        O(str);
        super.onPostExecute(str);
    }
}
