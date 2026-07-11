package iV5;

import android.view.View;
import android.view.ViewGroup;
import iV5.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Ml implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f68122n = new int[2];

    private void rl(ViewGroup viewGroup, JSONObject jSONObject, j.InterfaceC0968j interfaceC0968j, boolean z2) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            interfaceC0968j.n(viewGroup.getChildAt(i2), this, jSONObject, z2);
        }
    }

    @Override // iV5.j
    public JSONObject a(View view) {
        if (view == null) {
            return upM.w6.rl(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f68122n);
        int[] iArr = this.f68122n;
        return upM.w6.rl(iArr[0], iArr[1], width, height);
    }

    private void t(ViewGroup viewGroup, JSONObject jSONObject, j.InterfaceC0968j interfaceC0968j, boolean z2) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0968j.n((View) it2.next(), this, jSONObject, z2);
            }
        }
    }

    @Override // iV5.j
    public void n(View view, JSONObject jSONObject, j.InterfaceC0968j interfaceC0968j, boolean z2, boolean z3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z2) {
                t(viewGroup, jSONObject, interfaceC0968j, z3);
            } else {
                rl(viewGroup, jSONObject, interfaceC0968j, z3);
            }
        }
    }
}
