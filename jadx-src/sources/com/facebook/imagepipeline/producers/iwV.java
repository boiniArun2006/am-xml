package com.facebook.imagepipeline.producers;

import bA.C1653C;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class iwV implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52569n;
    private final A72.fuX rl;

    class j extends Mf {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ mz f52570S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ InterfaceC1866p f52571Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.j f52573o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Pl pl, InterfaceC1866p interfaceC1866p, mz mzVar, String str, com.facebook.imagepipeline.request.j jVar, InterfaceC1866p interfaceC1866p2, mz mzVar2) {
            super(pl, interfaceC1866p, mzVar, str);
            this.f52573o = jVar;
            this.f52571Z = interfaceC1866p2;
            this.f52570S = mzVar2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public C1653C t() {
            C1653C c1653cNr = iwV.this.nr(this.f52573o);
            if (c1653cNr == null) {
                this.f52571Z.rl(this.f52570S, iwV.this.J2(), false);
                this.f52570S.Z(ImagesContract.LOCAL, "fetch");
                return null;
            }
            c1653cNr.Org();
            this.f52571Z.rl(this.f52570S, iwV.this.J2(), true);
            this.f52570S.Z(ImagesContract.LOCAL, "fetch");
            this.f52570S.jB("image_color_space", c1653cNr.U());
            return c1653cNr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public void rl(C1653C c1653c) {
            C1653C.Uo(c1653c);
        }
    }

    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Mf f52574n;

        n(Mf mf) {
            this.f52574n = mf;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52574n.n();
        }
    }

    protected abstract String J2();

    protected abstract C1653C nr(com.facebook.imagepipeline.request.j jVar);

    protected C1653C t(InputStream inputStream, int i2) {
        Pj0.j jVarA = null;
        try {
            jVarA = i2 <= 0 ? Pj0.j.a(this.rl.n(inputStream)) : Pj0.j.a(this.rl.rl(inputStream, i2));
            C1653C c1653c = new C1653C(jVarA);
            Hh.n.rl(inputStream);
            Pj0.j.M7(jVarA);
            return c1653c;
        } catch (Throwable th) {
            Hh.n.rl(inputStream);
            Pj0.j.M7(jVarA);
            throw th;
        }
    }

    protected iwV(Executor executor, A72.fuX fux) {
        this.f52569n = executor;
        this.rl = fux;
    }

    protected C1653C O(InputStream inputStream, int i2) {
        return t(inputStream, i2);
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        mzVar.Z(ImagesContract.LOCAL, "fetch");
        j jVar = new j(pl, interfaceC1866pM7, mzVar, J2(), jVarM, interfaceC1866pM7, mzVar);
        mzVar.rl(new n(jVar));
        this.f52569n.execute(jVar);
    }
}
