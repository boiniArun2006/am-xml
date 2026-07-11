package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f53604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f53605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f53607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f53608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53609f;

    public k(Context context, t0 t0Var) {
        x0 x0Var = new x0(context, t0Var);
        m mVar = new m();
        this.f53605b = mVar;
        this.f53604a = x0Var;
        this.f53606c = !TextUtils.equals(x0Var.f53986d.f56840B, "1");
        h hVar = new h();
        this.f53608e = hVar;
        this.f53609f = hVar.f53601b;
        this.f53607d = new com.fyber.inneractive.sdk.flow.endcard.loaders.b(x0Var, mVar);
    }

    public final b a() {
        b bVar;
        m mVar = this.f53605b;
        int size = mVar.f53640a.size();
        int i2 = mVar.f53642c;
        do {
            i2++;
            if (i2 >= size) {
                return null;
            }
            bVar = (b) mVar.f53640a.get(i2);
        } while (!bVar.l());
        if (bVar.i() == com.fyber.inneractive.sdk.model.vast.i.Default_End_Card) {
            for (int size2 = mVar.f53641b.size() - 1; size2 >= 0; size2--) {
                if (((b) mVar.f53641b.get(size2)) instanceof o) {
                    return null;
                }
            }
            if (mVar.f53642c >= 0) {
                return null;
            }
        } else if (bVar instanceof c) {
            int i3 = i2 + 1;
            for (int size3 = mVar.f53640a.size() - 1; size3 >= i3; size3--) {
                b bVar2 = (b) mVar.f53640a.get(size3);
                if (bVar2 instanceof c) {
                    bVar2.destroy();
                    mVar.f53640a.remove(size3);
                }
            }
        }
        mVar.f53642c = i2;
        mVar.f53641b.add(bVar);
        bVar.f53590e = mVar.f53641b.size();
        return bVar;
    }
}
