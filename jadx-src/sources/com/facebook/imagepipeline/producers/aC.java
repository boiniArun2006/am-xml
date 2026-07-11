package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import bA.InterfaceC1656I28;
import bA.InterfaceC1658Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class aC implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52535n;
    private final boolean nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f52536t;

    private static class j extends AbstractC1863c {
        private final int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f52537t;

        private void ck(Pj0.j jVar) {
            InterfaceC1656I28 interfaceC1656I28;
            Bitmap bitmapHRu;
            int rowBytes;
            if (jVar == null || !jVar.isValid() || (interfaceC1656I28 = (InterfaceC1656I28) jVar.eF()) == null || interfaceC1656I28.isClosed() || !(interfaceC1656I28 instanceof InterfaceC1658Wre) || (bitmapHRu = ((InterfaceC1658Wre) interfaceC1656I28).hRu()) == null || (rowBytes = bitmapHRu.getRowBytes() * bitmapHRu.getHeight()) < this.f52537t || rowBytes > this.nr) {
                return;
            }
            bitmapHRu.prepareToDraw();
        }

        j(Pl pl, int i2, int i3) {
            super(pl);
            this.f52537t = i2;
            this.nr = i3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Pj0.j jVar, int i2) {
            ck(jVar);
            HI().rl(jVar, i2);
        }
    }

    public aC(l4Z l4z, int i2, int i3, boolean z2) {
        boolean z3;
        if (i2 <= i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        Hh.C.rl(Boolean.valueOf(z3));
        this.f52535n = (l4Z) Hh.C.Uo(l4z);
        this.rl = i2;
        this.f52536t = i3;
        this.nr = z2;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        if (mzVar.a() && !this.nr) {
            this.f52535n.n(pl, mzVar);
        } else {
            this.f52535n.n(new j(pl, this.rl, this.f52536t), mzVar);
        }
    }
}
