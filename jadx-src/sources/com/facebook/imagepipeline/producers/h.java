package com.facebook.imagepipeline.producers;

import aB.C1502Wre;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import bA.InterfaceC1658Wre;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class h implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52563n;
    private final ContentResolver rl;

    class j extends Mf {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.j f52564S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ mz f52565Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f52566g;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC1866p f52567o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Pl pl, InterfaceC1866p interfaceC1866p, mz mzVar, String str, InterfaceC1866p interfaceC1866p2, mz mzVar2, com.facebook.imagepipeline.request.j jVar, CancellationSignal cancellationSignal) {
            super(pl, interfaceC1866p, mzVar, str);
            this.f52567o = interfaceC1866p2;
            this.f52565Z = mzVar2;
            this.f52564S = jVar;
            this.f52566g = cancellationSignal;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.Mf
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Map xMQ(Pj0.j jVar) {
            return Hh.CN3.of("createdThumbnail", String.valueOf(jVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public Pj0.j t() throws IOException {
            String strO;
            Size size = new Size(this.f52564S.HI(), this.f52564S.ty());
            try {
                strO = h.this.O(this.f52564S);
            } catch (IllegalArgumentException unused) {
                strO = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strO != null ? eVO.j.t(eVO.j.rl(strO)) ? ThumbnailUtils.createVideoThumbnail(new File(strO), size, this.f52566g) : ThumbnailUtils.createImageThumbnail(new File(strO), size, this.f52566g) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = h.this.rl.loadThumbnail(this.f52564S.WPU(), size, this.f52566g);
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            InterfaceC1658Wre interfaceC1658WreB = InterfaceC1658Wre.B(bitmapCreateVideoThumbnail, C1502Wre.rl(), bA.Xo.nr, 0);
            this.f52565Z.jB("image_format", "thumbnail");
            interfaceC1658WreB.FX(this.f52565Z.getExtras());
            return Pj0.j.a(interfaceC1658WreB);
        }

        @Override // com.facebook.imagepipeline.producers.Mf, Gs.fuX
        protected void O(Exception exc) {
            super.O(exc);
            this.f52567o.rl(this.f52565Z, "LocalThumbnailBitmapSdk29Producer", false);
            this.f52565Z.Z(ImagesContract.LOCAL, "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.Mf, Gs.fuX
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void J2(Pj0.j jVar) {
            boolean z2;
            super.J2(jVar);
            InterfaceC1866p interfaceC1866p = this.f52567o;
            mz mzVar = this.f52565Z;
            if (jVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC1866p.rl(mzVar, "LocalThumbnailBitmapSdk29Producer", z2);
            this.f52565Z.Z(ImagesContract.LOCAL, "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public void rl(Pj0.j jVar) {
            Pj0.j.M7(jVar);
        }

        @Override // com.facebook.imagepipeline.producers.Mf, Gs.fuX
        protected void nr() {
            super.nr();
            this.f52566g.cancel();
        }
    }

    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Mf f52568n;

        n(Mf mf) {
            this.f52568n = mf;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52568n.n();
        }
    }

    public h(Executor executor, ContentResolver contentResolver) {
        this.f52563n = executor;
        this.rl = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String O(com.facebook.imagepipeline.request.j jVar) {
        return vn.I28.O(this.rl, jVar.WPU());
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        mzVar.Z(ImagesContract.LOCAL, "thumbnail_bitmap");
        j jVar = new j(pl, interfaceC1866pM7, mzVar, "LocalThumbnailBitmapSdk29Producer", interfaceC1866pM7, mzVar, jVarM, new CancellationSignal());
        mzVar.rl(new n(jVar));
        this.f52563n.execute(jVar);
    }
}
