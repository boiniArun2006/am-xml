package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import bA.C1653C;
import com.facebook.common.memory.PooledByteBuffer;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class LocalExifThumbnailProducer implements R6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52494n;
    private final A72.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ContentResolver f52495t;

    @com.facebook.soloader.Wre
    private class Api24Utils {
        private Api24Utils() {
        }

        ExifInterface n(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }
    }

    class j extends Mf {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.j f52498o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Pl pl, InterfaceC1866p interfaceC1866p, mz mzVar, String str, com.facebook.imagepipeline.request.j jVar) {
            super(pl, interfaceC1866p, mzVar, str);
            this.f52498o = jVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.Mf
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Map xMQ(C1653C c1653c) {
            return Hh.CN3.of("createdThumbnail", Boolean.toString(c1653c != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Gs.fuX
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public C1653C t() {
            ExifInterface exifInterfaceUo = LocalExifThumbnailProducer.this.Uo(this.f52498o.WPU());
            if (exifInterfaceUo == null || !exifInterfaceUo.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.O(LocalExifThumbnailProducer.this.rl.nr((byte[]) Hh.C.Uo(exifInterfaceUo.getThumbnail())), exifInterfaceUo);
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
        final /* synthetic */ Mf f52499n;

        n(Mf mf) {
            this.f52499n = mf;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52499n.n();
        }
    }

    boolean J2(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    private int KN(ExifInterface exifInterface) {
        return com.facebook.imageutils.CN3.n(Integer.parseInt((String) Hh.C.Uo(exifInterface.getAttribute("Orientation"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1653C O(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair pairNr = com.facebook.imageutils.Ml.nr(new A72.Dsr(pooledByteBuffer));
        int iKN = KN(exifInterface);
        int iIntValue = pairNr != null ? ((Integer) pairNr.first).intValue() : -1;
        int iIntValue2 = pairNr != null ? ((Integer) pairNr.second).intValue() : -1;
        Pj0.j jVarA = Pj0.j.a(pooledByteBuffer);
        try {
            C1653C c1653c = new C1653C(jVarA);
            Pj0.j.M7(jVarA);
            c1653c.Uf(com.facebook.imageformat.n.rl);
            c1653c.f(iKN);
            c1653c.HBN(iIntValue);
            c1653c.p0N(iIntValue2);
            return c1653c;
        } catch (Throwable th) {
            Pj0.j.M7(jVarA);
            throw th;
        }
    }

    ExifInterface Uo(Uri uri) {
        String strO = vn.I28.O(this.f52495t, uri);
        if (strO == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            Dzy.j.nr(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (J2(strO)) {
            return new ExifInterface(strO);
        }
        AssetFileDescriptor assetFileDescriptorN = vn.I28.n(this.f52495t, uri);
        if (assetFileDescriptorN != null) {
            ExifInterface exifInterfaceN = new Api24Utils().n(assetFileDescriptorN.getFileDescriptor());
            assetFileDescriptorN.close();
            return exifInterfaceN;
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.R6
    public boolean rl(dX.CN3 cn3) {
        return RzR.rl(512, 512, cn3);
    }

    public LocalExifThumbnailProducer(Executor executor, A72.fuX fux, ContentResolver contentResolver) {
        this.f52494n = executor;
        this.rl = fux;
        this.f52495t = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        InterfaceC1866p interfaceC1866pM7 = mzVar.M7();
        com.facebook.imagepipeline.request.j jVarM = mzVar.M();
        mzVar.Z(ImagesContract.LOCAL, "exif");
        j jVar = new j(pl, interfaceC1866pM7, mzVar, "LocalExifThumbnailProducer", jVarM);
        mzVar.rl(new n(jVar));
        this.f52494n.execute(jVar);
    }
}
