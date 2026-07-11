package com.facebook.imagepipeline.memory;

import Hh.C;
import Pj0.fuX;
import fJf.DAz;
import fJf.ci;
import fJf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f52433n;
    final n rl;

    class j implements fuX {
        j() {
        }

        @Override // Pj0.fuX
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(byte[] bArr) {
            w6.this.rl(bArr);
        }
    }

    static class n extends Ml {
        @Override // com.facebook.imagepipeline.memory.BasePool
        com.facebook.imagepipeline.memory.j WPU(int i2) {
            return new Wre(HI(i2), this.f52422t.Uo, 0);
        }

        public n(A72.Ml ml, nKK nkk, DAz dAz) {
            super(ml, nkk, dAz);
        }
    }

    public Pj0.j n(int i2) {
        return Pj0.j.Mx((byte[]) this.rl.get(i2), this.f52433n);
    }

    public void rl(byte[] bArr) {
        this.rl.n(bArr);
    }

    public w6(A72.Ml ml, nKK nkk) {
        boolean z2;
        if (nkk.Uo > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        this.rl = new n(ml, nkk, ci.KN());
        this.f52433n = new j();
    }
}
