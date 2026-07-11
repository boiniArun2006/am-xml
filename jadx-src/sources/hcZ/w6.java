package hcZ;

import K7m.I28;
import K7m.fuX;
import a88.Pl;
import android.view.View;
import hcZ.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f67979n;

    @Override // hcZ.j
    public JSONObject a(View view) {
        JSONObject jSONObjectT = K7m.w6.t(0, 0, 0, 0);
        K7m.w6.O(jSONObjectT, I28.n());
        return jSONObjectT;
    }

    ArrayList rl() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        g4f.w6 w6VarO = g4f.w6.O();
        if (w6VarO != null) {
            Collection collectionN = w6VarO.n();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionN.size() * 2) + 3);
            Iterator it = collectionN.iterator();
            while (it.hasNext()) {
                View viewHI = ((Pl) it.next()).HI();
                if (viewHI != null && fuX.Uo(viewHI) && (rootView = viewHI.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
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
        this.f67979n = jVar;
    }

    @Override // hcZ.j
    public void n(View view, JSONObject jSONObject, j.InterfaceC0957j interfaceC0957j, boolean z2, boolean z3) {
        Iterator it = rl().iterator();
        while (it.hasNext()) {
            interfaceC0957j.n((View) it.next(), this.f67979n, jSONObject, z3);
        }
    }
}
