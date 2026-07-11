package Vwv;

import Vwv.n;
import Vy.Pl;
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

    public I28(n.InterfaceC0407n interfaceC0407n, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0407n, hashSet, jSONObject, j2);
    }

    private void O(String str) {
        J2B.w6 w6VarO = J2B.w6.O();
        if (w6VarO != null) {
            for (Pl pl : w6VarO.t()) {
                if (this.f11366t.contains(pl.gh())) {
                    pl.qie().xMQ(str, this.f11365O);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vwv.n, android.os.AsyncTask
    /* JADX INFO: renamed from: rl */
    public void onPostExecute(String str) {
        O(str);
        super.onPostExecute(str);
    }
}
