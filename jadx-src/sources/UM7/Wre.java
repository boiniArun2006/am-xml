package UM7;

import kotlin.jvm.internal.Intrinsics;
import ln.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre implements Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f10648O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10649n;
    private final Integer nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f10650t;

    private final w6 n(com.facebook.imageformat.w6 w6Var, boolean z2) {
        Ml ml = this.f10650t;
        if (ml != null) {
            return ml.createImageTranscoder(w6Var, z2);
        }
        return null;
    }

    private final w6 nr(com.facebook.imageformat.w6 w6Var, boolean z2) {
        w6 w6VarCreateImageTranscoder = new fuX(this.f10649n).createImageTranscoder(w6Var, z2);
        Intrinsics.checkNotNullExpressionValue(w6VarCreateImageTranscoder, "createImageTranscoder(...)");
        return w6VarCreateImageTranscoder;
    }

    private final w6 rl(com.facebook.imageformat.w6 w6Var, boolean z2) {
        Integer num = this.nr;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return t(w6Var, z2);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return nr(w6Var, z2);
    }

    private final w6 t(com.facebook.imageformat.w6 w6Var, boolean z2) {
        return com.facebook.imagepipeline.nativecode.w6.n(this.f10649n, this.rl, this.f10648O).createImageTranscoder(w6Var, z2);
    }

    @Override // UM7.Ml
    public w6 createImageTranscoder(com.facebook.imageformat.w6 imageFormat, boolean z2) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        w6 w6VarN = n(imageFormat, z2);
        if (w6VarN == null) {
            w6VarN = rl(imageFormat, z2);
        }
        if (w6VarN == null && Q.n()) {
            w6VarN = t(imageFormat, z2);
        }
        return w6VarN == null ? nr(imageFormat, z2) : w6VarN;
    }

    public Wre(int i2, boolean z2, Ml ml, Integer num, boolean z3) {
        this.f10649n = i2;
        this.rl = z2;
        this.f10650t = ml;
        this.nr = num;
        this.f10648O = z3;
    }
}
