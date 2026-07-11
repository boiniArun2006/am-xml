package iV5;

import Vy.Pl;
import android.view.View;
import iV5.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import upM.I28;
import upM.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f68124n;

    @Override // iV5.j
    public JSONObject a(View view) {
        JSONObject jSONObjectRl = upM.w6.rl(0, 0, 0, 0);
        upM.w6.O(jSONObjectRl, I28.n());
        return jSONObjectRl;
    }

    ArrayList rl() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        J2B.w6 w6VarO = J2B.w6.O();
        if (w6VarO != null) {
            Collection collectionN = w6VarO.n();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionN.size() * 2) + 3);
            Iterator it = collectionN.iterator();
            while (it.hasNext()) {
                View viewAz = ((Pl) it.next()).az();
                if (viewAz != null && fuX.Uo(viewAz) && (rootView = viewAz.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fNr = fuX.nr(rootView);
                    int size = arrayList.size();
                    while (size > 0 && fuX.nr((View) arrayList.get(size - 1)) > fNr) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public w6(j jVar) {
        this.f68124n = jVar;
    }

    @Override // iV5.j
    public void n(View view, JSONObject jSONObject, j.InterfaceC0968j interfaceC0968j, boolean z2, boolean z3) {
        Iterator it = rl().iterator();
        while (it.hasNext()) {
            interfaceC0968j.n((View) it.next(), this.f68124n, jSONObject, z3);
        }
    }
}
