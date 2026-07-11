package com.facebook.fresco.animation.factory;

import FSZ.qz;
import Gs.CN3;
import Gs.Dsr;
import Hh.Ml;
import Hh.Pl;
import X1.I28;
import aB.AbstractC1501Ml;
import android.content.Context;
import android.graphics.Rect;
import bA.C1653C;
import bA.InterfaceC1656I28;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import ln.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Ml
public class AnimatedFactoryV2Impl implements YqR.j {
    private Szt.n J2;
    private ypp.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private YqR.Ml f52394O;
    private i4.j Uo;
    private final boolean gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1501Ml f52395n;
    private final boolean nr;
    private int qie;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz f52396t;
    private CN3 xMQ;

    class j implements bAP.n {
        j() {
        }

        @Override // bAP.n
        public InterfaceC1656I28 n(C1653C c1653c, int i2, bA.eO eOVar, dX.Ml ml) {
            return AnimatedFactoryV2Impl.this.ty().n(c1653c, ml, ml.xMQ);
        }
    }

    class n implements Szt.n {
        n() {
        }

        @Override // Szt.n
        public X1.j n(I28 i28, Rect rect) {
            return new Szt.j(AnimatedFactoryV2Impl.this.az(), i28, rect, AnimatedFactoryV2Impl.this.nr);
        }
    }

    class w6 implements Szt.n {
        w6() {
        }

        @Override // Szt.n
        public X1.j n(I28 i28, Rect rect) {
            return new Szt.j(AnimatedFactoryV2Impl.this.az(), i28, rect, AnimatedFactoryV2Impl.this.nr);
        }
    }

    public static /* synthetic */ Integer J2() {
        return 3;
    }

    public static /* synthetic */ Integer O() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i4.j az() {
        if (this.Uo == null) {
            this.Uo = new i4.j();
        }
        return this.Uo;
    }

    private kIp.Ml gh() {
        Hh.qz qzVar = new Hh.qz() { // from class: kIp.n
            @Override // Hh.qz
            public final Object get() {
                return AnimatedFactoryV2Impl.O();
            }
        };
        ExecutorService ml = this.xMQ;
        if (ml == null) {
            ml = new Gs.Ml(this.rl.nr());
        }
        Hh.qz qzVar2 = new Hh.qz() { // from class: kIp.w6
            @Override // Hh.qz
            public final Object get() {
                return AnimatedFactoryV2Impl.J2();
            }
        };
        Hh.qz qzVar3 = Pl.rl;
        return new kIp.Ml(qie(), Dsr.p5(), ml, RealtimeSinceBootClock.get(), this.f52395n, this.f52396t, qzVar, qzVar2, qzVar3, Pl.n(Boolean.valueOf(this.gh)), Pl.n(Boolean.valueOf(this.nr)), Pl.n(Integer.valueOf(this.mUb)), Pl.n(Integer.valueOf(this.qie)));
    }

    private YqR.Ml mUb() {
        return new YqR.I28(new w6(), this.f52395n, this.gh);
    }

    private Szt.n qie() {
        if (this.J2 == null) {
            this.J2 = new n();
        }
        return this.J2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public YqR.Ml ty() {
        if (this.f52394O == null) {
            this.f52394O = mUb();
        }
        return this.f52394O;
    }

    @Override // YqR.j
    public ypp.j n(Context context) {
        if (this.KN == null) {
            this.KN = gh();
        }
        return this.KN;
    }

    @Override // YqR.j
    public bAP.n rl() {
        return new bAP.n() { // from class: kIp.j
            @Override // bAP.n
            public final InterfaceC1656I28 n(C1653C c1653c, int i2, bA.eO eOVar, dX.Ml ml) {
                return this.f69843n.ty().rl(c1653c, ml, ml.xMQ);
            }
        };
    }

    @Override // YqR.j
    public bAP.n t() {
        return new j();
    }

    @Ml
    public AnimatedFactoryV2Impl(AbstractC1501Ml abstractC1501Ml, eO eOVar, qz qzVar, boolean z2, boolean z3, int i2, int i3, CN3 cn3) {
        this.f52395n = abstractC1501Ml;
        this.rl = eOVar;
        this.f52396t = qzVar;
        this.mUb = i2;
        this.gh = z3;
        this.nr = z2;
        this.xMQ = cn3;
        this.qie = i3;
    }
}
