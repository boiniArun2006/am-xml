package com.facebook.imagepipeline.producers;

import bA.C1653C;
import com.facebook.imagepipeline.producers.DAz;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fg implements l4Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final UM7.Ml f52552O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52553n;
    private final boolean nr;
    private final A72.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l4Z f52554t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private class j extends AbstractC1863c {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final mz f52555O;
        private final DAz Uo;
        private final UM7.Ml nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f52556t;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.fg$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        class C0750j implements DAz.Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ fg f52557n;

            C0750j(fg fgVar) {
                this.f52557n = fgVar;
            }

            @Override // com.facebook.imagepipeline.producers.DAz.Ml
            public void n(C1653C c1653c, int i2) throws Throwable {
                if (c1653c == null) {
                    j.this.HI().rl(null, i2);
                } else {
                    j jVar = j.this;
                    jVar.S(c1653c, i2, (UM7.w6) Hh.C.Uo(jVar.nr.createImageTranscoder(c1653c.p5(), j.this.f52556t)));
                }
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        class n extends Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ fg f52558n;
            final /* synthetic */ Pl rl;

            n(fg fgVar, Pl pl) {
                this.f52558n = fgVar;
                this.rl = pl;
            }

            @Override // com.facebook.imagepipeline.producers.Wre, com.facebook.imagepipeline.producers.OU
            public void n() {
                if (j.this.f52555O.p5()) {
                    j.this.Uo.KN();
                }
            }

            @Override // com.facebook.imagepipeline.producers.OU
            public void rl() {
                j.this.Uo.t();
                j.this.J2 = true;
                this.rl.n();
            }
        }

        j(Pl pl, mz mzVar, boolean z2, UM7.Ml ml) {
            super(pl);
            this.J2 = false;
            this.f52555O = mzVar;
            Boolean boolZ = mzVar.M().Z();
            this.f52556t = boolZ != null ? boolZ.booleanValue() : z2;
            this.nr = ml;
            this.Uo = new DAz(fg.this.f52553n, new C0750j(fg.this), 100);
            mzVar.rl(new n(fg.this, pl));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S(C1653C c1653c, int i2, UM7.w6 w6Var) throws Throwable {
            this.f52555O.M7().nr(this.f52555O, "ResizeAndRotateProducer");
            com.facebook.imagepipeline.request.j jVarM = this.f52555O.M();
            A72.aC aCVarT = fg.this.rl.t();
            try {
                try {
                    UM7.n nVarRl = w6Var.rl(c1653c, aCVarT, jVarM.XQ(), jVarM.o(), null, 85, c1653c.U());
                    if (nVarRl.n() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map mapViF = ViF(c1653c, jVarM.o(), nVarRl, w6Var.n());
                    Pj0.j jVarA = Pj0.j.a(aCVarT.n());
                    try {
                        C1653C c1653c2 = new C1653C(jVarA);
                        c1653c2.Uf(com.facebook.imageformat.n.rl);
                        try {
                            c1653c2.Org();
                            this.f52555O.M7().mUb(this.f52555O, "ResizeAndRotateProducer", mapViF);
                            if (nVarRl.n() != 1) {
                                i2 |= 16;
                            }
                            HI().rl(c1653c2, i2);
                            C1653C.Uo(c1653c2);
                            Pj0.j.M7(jVarA);
                            aCVarT.close();
                        } catch (Throwable th) {
                            C1653C.Uo(c1653c2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Pj0.j.M7(jVarA);
                        throw th2;
                    }
                } catch (Exception e2) {
                    this.f52555O.M7().gh(this.f52555O, "ResizeAndRotateProducer", e2, null);
                    if (w6.nr(i2)) {
                        HI().onFailure(e2);
                    }
                    aCVarT.close();
                }
            } catch (Throwable th3) {
                aCVarT.close();
                throw th3;
            }
        }

        private Map ViF(C1653C c1653c, dX.CN3 cn3, UM7.n nVar, String str) {
            String str2;
            if (!this.f52555O.M7().J2(this.f52555O, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = c1653c.getWidth() + "x" + c1653c.getHeight();
            if (cn3 != null) {
                str2 = cn3.f63505n + "x" + cn3.rl;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(c1653c.p5()));
            map.put("Original size", str3);
            map.put(wDgKoYAES.owyJXGVLj, str2);
            map.put("queueTime", String.valueOf(this.Uo.J2()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(nVar));
            return Hh.CN3.t(map);
        }

        private void WPU(C1653C c1653c, int i2, com.facebook.imageformat.w6 w6Var) {
            HI().rl((w6Var == com.facebook.imageformat.n.rl || w6Var == com.facebook.imageformat.n.qie) ? g(c1653c) : nY(c1653c), i2);
        }

        private C1653C g(C1653C c1653c) {
            return (this.f52555O.M().XQ().O() || c1653c.m() == 0 || c1653c.m() == -1) ? c1653c : aYN(c1653c, 0);
        }

        private C1653C nY(C1653C c1653c) {
            dX.fuX fuxXQ = this.f52555O.M().XQ();
            return (fuxXQ.KN() || !fuxXQ.Uo()) ? c1653c : aYN(c1653c, fuxXQ.J2());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            if (this.J2) {
                return;
            }
            boolean zNr = w6.nr(i2);
            if (c1653c == null) {
                if (zNr) {
                    HI().rl(null, 1);
                    return;
                }
                return;
            }
            com.facebook.imageformat.w6 w6VarP5 = c1653c.p5();
            vn.Ml mlKN = fg.KN(this.f52555O.M(), c1653c, (UM7.w6) Hh.C.Uo(this.nr.createImageTranscoder(w6VarP5, this.f52556t)));
            if (zNr || mlKN != vn.Ml.UNSET) {
                if (mlKN != vn.Ml.YES) {
                    WPU(c1653c, i2, w6VarP5);
                } else if (this.Uo.gh(c1653c, i2)) {
                    if (zNr || this.f52555O.p5()) {
                        this.Uo.KN();
                    }
                }
            }
        }

        private C1653C aYN(C1653C c1653c, int i2) {
            C1653C c1653cRl = C1653C.rl(c1653c);
            if (c1653cRl != null) {
                c1653cRl.f(i2);
            }
            return c1653cRl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vn.Ml KN(com.facebook.imagepipeline.request.j jVar, C1653C c1653c, UM7.w6 w6Var) {
        if (c1653c == null || c1653c.p5() == com.facebook.imageformat.w6.nr) {
            return vn.Ml.UNSET;
        }
        if (w6Var.nr(c1653c.p5())) {
            return vn.Ml.t(J2(jVar.XQ(), c1653c) || w6Var.t(c1653c, jVar.XQ(), jVar.o()));
        }
        return vn.Ml.NO;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        this.f52554t.n(new j(pl, mzVar, this.nr, this.f52552O), mzVar);
    }

    public fg(Executor executor, A72.fuX fux, l4Z l4z, boolean z2, UM7.Ml ml) {
        this.f52553n = (Executor) Hh.C.Uo(executor);
        this.rl = (A72.fuX) Hh.C.Uo(fux);
        this.f52554t = (l4Z) Hh.C.Uo(l4z);
        this.f52552O = (UM7.Ml) Hh.C.Uo(ml);
        this.nr = z2;
    }

    private static boolean J2(dX.fuX fux, C1653C c1653c) {
        if (!fux.O()) {
            if (UM7.I28.O(fux, c1653c) != 0 || Uo(fux, c1653c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean Uo(dX.fuX fux, C1653C c1653c) {
        if (fux.Uo() && !fux.O()) {
            return UM7.I28.rl.contains(Integer.valueOf(c1653c.Nxk()));
        }
        c1653c.Bu(0);
        return false;
    }
}
