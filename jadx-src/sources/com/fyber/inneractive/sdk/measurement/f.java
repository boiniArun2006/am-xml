package com.fyber.inneractive.sdk.measurement;

import a88.j;
import a88.n;
import a88.qz;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f54046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f54047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VI.n f54048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54049d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54050e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f54051f;

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th.getMessage();
        t0 t0Var = this.f54051f;
        z.a(simpleName, str, t0Var != null ? t0Var.f53977a : null, t0Var != null ? t0Var.f53978b : null);
    }

    public final ArrayList a(List list) {
        qz qzVarRl;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            qz qzVar = null;
            try {
                if (hVar.f54054a != null) {
                    if (!TextUtils.isEmpty(hVar.f54058e) && !TextUtils.isEmpty(hVar.f54057d)) {
                        qzVarRl = qz.n(hVar.f54058e, hVar.f54054a, hVar.f54057d);
                    } else {
                        qzVarRl = qz.rl(hVar.f54054a);
                    }
                    qzVar = qzVarRl;
                }
            } catch (Throwable th) {
                a(th);
            }
            if (qzVar != null) {
                arrayList.add(qzVar);
            }
        }
        return arrayList;
    }
}
