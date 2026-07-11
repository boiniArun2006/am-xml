package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import bA.C1653C;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Ln extends iwV implements R6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ContentResolver f52493t;
    private static final Class nr = Ln.class;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String[] f52492O = {"_id", "_data"};
    private static final String[] J2 = {"_data"};
    private static final Rect Uo = new Rect(0, 0, 512, RendererCapabilities.DECODER_SUPPORT_MASK);
    private static final Rect KN = new Rect(0, 0, 96, 96);

    private C1653C Uo(Uri uri, dX.CN3 cn3) {
        Cursor cursorQuery;
        C1653C c1653cMUb;
        if (cn3 == null || (cursorQuery = this.f52493t.query(uri, f52492O, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (c1653cMUb = mUb(cn3, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                c1653cMUb.f(xMQ(cursorQuery.getString(columnIndex)));
            }
            cursorQuery.close();
            return c1653cMUb;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    private static int KN(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int gh(dX.CN3 cn3) {
        Rect rect = KN;
        if (RzR.rl(rect.width(), rect.height(), cn3)) {
            return 3;
        }
        Rect rect2 = Uo;
        return RzR.rl(rect2.width(), rect2.height(), cn3) ? 1 : 0;
    }

    private static int xMQ(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return com.facebook.imageutils.CN3.n(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e2) {
            Dzy.j.Uo(nr, e2, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return FijIa.GjrZqLSgubswEx;
    }

    @Override // com.facebook.imagepipeline.producers.R6
    public boolean rl(dX.CN3 cn3) {
        Rect rect = Uo;
        return RzR.rl(rect.width(), rect.height(), cn3);
    }

    public Ln(Executor executor, A72.fuX fux, ContentResolver contentResolver) {
        super(executor, fux);
        this.f52493t = contentResolver;
    }

    private C1653C mUb(dX.CN3 cn3, long j2) {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iGh = gh(cn3);
        if (iGh == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f52493t, j2, iGh, J2)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) Hh.C.Uo(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return O(new FileInputStream(str), KN(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j jVar) {
        Uri uriWPU = jVar.WPU();
        if (vn.I28.mUb(uriWPU)) {
            return Uo(uriWPU, jVar.o());
        }
        return null;
    }
}
