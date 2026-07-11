package com.facebook.imagepipeline.producers;

import aB.C1502Wre;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import bA.InterfaceC1658Wre;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class K implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52485n;
    private final ContentResolver rl;

    class j extends Mf {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.j f52486S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ mz f52487Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC1866p f52489o;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public Pj0.j t() throws Throwable {
            String strXMQ;
            try {
                strXMQ = K.this.xMQ(this.f52486S);
            } catch (IllegalArgumentException unused) {
                strXMQ = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strXMQ != null ? ThumbnailUtils.createVideoThumbnail(strXMQ, K.Uo(this.f52486S)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = K.KN(K.this.rl, this.f52486S.WPU());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            InterfaceC1658Wre interfaceC1658WreB = InterfaceC1658Wre.B(bitmapCreateVideoThumbnail, C1502Wre.rl(), bA.Xo.nr, 0);
            this.f52487Z.jB("image_format", "thumbnail");
            interfaceC1658WreB.FX(this.f52487Z.getExtras());
            return Pj0.j.a(interfaceC1658WreB);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Pl pl, InterfaceC1866p interfaceC1866p, mz mzVar, String str, InterfaceC1866p interfaceC1866p2, mz mzVar2, com.facebook.imagepipeline.request.j jVar) {
            super(pl, interfaceC1866p, mzVar, str);
            this.f52489o = interfaceC1866p2;
            this.f52487Z = mzVar2;
            this.f52486S = jVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.Mf
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Map xMQ(Pj0.j jVar) {
            return Hh.CN3.of("createdThumbnail", String.valueOf(jVar != null));
        }

        @Override // com.facebook.imagepipeline.producers.Mf, Gs.fuX
        protected void O(Exception exc) {
            super.O(exc);
            this.f52489o.rl(this.f52487Z, "VideoThumbnailProducer", false);
            this.f52487Z.Z(ImagesContract.LOCAL, "video");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.Mf, Gs.fuX
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void J2(Pj0.j jVar) {
            boolean z2;
            super.J2(jVar);
            InterfaceC1866p interfaceC1866p = this.f52489o;
            mz mzVar = this.f52487Z;
            if (jVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC1866p.rl(mzVar, "VideoThumbnailProducer", z2);
            this.f52487Z.Z(ImagesContract.LOCAL, "video");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public void rl(Pj0.j jVar) {
            Pj0.j.M7(jVar);
        }
    }

    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Mf f52490n;

        n(Mf mf) {
            this.f52490n = mf;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52490n.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap KN(ContentResolver contentResolver, Uri uri) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            Hh.C.Uo(parcelFileDescriptorOpenFileDescriptor);
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
                return frameAtTime;
            } catch (FileNotFoundException unused2) {
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            mediaMetadataRetriever = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public K(Executor executor, ContentResolver contentResolver) {
        this.f52485n = executor;
        this.rl = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Uo(com.facebook.imagepipeline.request.j jVar) {
        if (jVar.HI() <= 96 && jVar.ty() <= 96) {
            return 3;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String xMQ(com.facebook.imagepipeline.request.j jVar) {
        return vn.I28.O(this.rl, jVar.WPU());
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        mzVar.Z(ImagesContract.LOCAL, "video");
        j jVar = new j(pl, interfaceC1866pM7, mzVar, "VideoThumbnailProducer", interfaceC1866pM7, mzVar, jVarM);
        mzVar.rl(new n(jVar));
        this.f52485n.execute(jVar);
    }
}
