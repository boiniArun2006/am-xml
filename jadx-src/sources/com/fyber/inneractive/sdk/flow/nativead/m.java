package com.fyber.inneractive.sdk.flow.nativead;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f53747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f53748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f53749d;

    public m(p pVar, i iVar, boolean z2, com.fyber.inneractive.sdk.util.g gVar) {
        this.f53749d = pVar;
        this.f53746a = iVar;
        this.f53747b = z2;
        this.f53748c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar;
        p pVar = this.f53749d;
        i iVar = this.f53746a;
        boolean z2 = this.f53747b;
        com.fyber.inneractive.sdk.util.g gVar = this.f53748c;
        pVar.getClass();
        String str = iVar.f53739a;
        String str2 = iVar.f53740b;
        if (v.a(str)) {
            oVar = new n(pVar, iVar, str2, gVar);
        } else {
            if (!v.a(str2)) {
                j jVar = (j) pVar.f53773a;
                i iVar2 = jVar.f53743a;
                if (iVar2 == null || iVar2.equals(iVar)) {
                    IAlog.a("%s : No valid link object, origin: %s", j.f53742d, gVar);
                } else {
                    p pVar2 = jVar.f53745c;
                    i iVar3 = jVar.f53743a;
                    pVar2.getClass();
                    com.fyber.inneractive.sdk.util.r.f57025a.execute(new m(pVar2, iVar3, true, gVar));
                }
                p pVar3 = this.f53749d;
                i iVar4 = this.f53746a;
                pVar3.getClass();
                for (String str3 : iVar4.f53741c) {
                    if (!TextUtils.isEmpty(str3)) {
                        z0.b(str3);
                    }
                }
            }
            oVar = new o(pVar, iVar, gVar);
            str = str2;
        }
        k kVar = ((j) pVar.f53773a).f53744b;
        if (kVar != null) {
            kVar.a(str, z2, gVar, oVar);
        }
        p pVar32 = this.f53749d;
        i iVar42 = this.f53746a;
        pVar32.getClass();
        while (r0.hasNext()) {
        }
    }
}
