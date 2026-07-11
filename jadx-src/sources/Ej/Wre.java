package Ej;

import Ej.n;
import a88.Pl;
import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Wre extends j {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (K7m.w6.S(this.nr, this.rl.a())) {
            return null;
        }
        this.rl.a(this.nr);
        return this.nr.toString();
    }

    public Wre(n.InterfaceC0084n interfaceC0084n, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0084n, hashSet, jSONObject, j2);
    }

    private void O(String str) {
        g4f.w6 w6VarO = g4f.w6.O();
        if (w6VarO != null) {
            for (Pl pl : w6VarO.t()) {
                if (this.f2360t.contains(pl.az())) {
                    pl.ty().ck(str, this.f2359O);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ej.n, android.os.AsyncTask
    /* JADX INFO: renamed from: rl */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            O(str);
        }
        super.onPostExecute(str);
    }
}
