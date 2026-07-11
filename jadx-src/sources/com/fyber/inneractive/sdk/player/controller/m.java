package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f54468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f54469b;

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        try {
            try {
                Iterator it = this.f54469b.f54472b.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(this.f54468a);
                }
                bVar = this.f54468a;
            } catch (Exception e2) {
                if (IAlog.f56974a <= 3) {
                    q qVar2 = this.f54469b;
                    qVar2.getClass();
                    IAlog.a("%sonPlayerStateChanged callback threw an exception!", e2, IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f54468a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.f54469b.f54480j);
                qVar = this.f54469b;
                qVar.f54480j = null;
            }
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f54469b.f54480j);
                qVar = this.f54469b;
                qVar.f54480j = null;
                qVar.f54481k = null;
            }
        } catch (Throwable th) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f54468a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f54469b.f54480j);
                q qVar3 = this.f54469b;
                qVar3.f54480j = null;
                qVar3.f54481k = null;
            }
            throw th;
        }
    }

    public m(q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f54469b = qVar;
        this.f54468a = bVar;
    }
}
