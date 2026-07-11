package com.facebook.imageformat;

import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {
    public static final w6 HI;
    public static final w6 J2;
    public static final w6 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final w6 f52414O;
    public static final w6 Uo;
    public static final w6 az;
    public static final List ck;
    public static final w6 gh;
    public static final w6 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f52415n = new n();
    public static final w6 nr;
    public static final w6 qie;
    public static final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w6 f52416t;
    public static final w6 ty;
    public static final w6 xMQ;

    static {
        w6 w6Var = new w6("JPEG", "jpeg");
        rl = w6Var;
        w6 w6Var2 = new w6("PNG", "png");
        f52416t = w6Var2;
        w6 w6Var3 = new w6("GIF", "gif");
        nr = w6Var3;
        w6 w6Var4 = new w6("BMP", "bmp");
        f52414O = w6Var4;
        w6 w6Var5 = new w6("ICO", "ico");
        J2 = w6Var5;
        w6 w6Var6 = new w6("WEBP_SIMPLE", "webp");
        Uo = w6Var6;
        w6 w6Var7 = new w6("WEBP_LOSSLESS", "webp");
        KN = w6Var7;
        w6 w6Var8 = new w6("WEBP_EXTENDED", "webp");
        xMQ = w6Var8;
        w6 w6Var9 = new w6(aNrWBQYwFf.iVxIDdnNPXDqJq, "webp");
        mUb = w6Var9;
        w6 w6Var10 = new w6("WEBP_ANIMATED", "webp");
        gh = w6Var10;
        w6 w6Var11 = new w6("HEIF", "heif");
        qie = w6Var11;
        az = new w6("DNG", "dng");
        w6 w6Var12 = new w6("BINARY_XML", "xml");
        ty = w6Var12;
        w6 w6Var13 = new w6("AVIF", LHbnkhI.NaLcjHYqfZGYnE);
        HI = w6Var13;
        ck = CollectionsKt.listOf((Object[]) new w6[]{w6Var, w6Var2, w6Var3, w6Var4, w6Var5, w6Var6, w6Var7, w6Var8, w6Var9, w6Var10, w6Var11, w6Var12, w6Var13});
    }

    public static final boolean n(w6 imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == Uo || imageFormat == KN || imageFormat == xMQ || imageFormat == mUb;
    }

    public static final boolean rl(w6 imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return n(imageFormat) || imageFormat == gh;
    }

    private n() {
    }
}
