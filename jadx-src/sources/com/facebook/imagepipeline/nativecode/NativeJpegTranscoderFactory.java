package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Hh.Ml
public class NativeJpegTranscoderFactory implements UM7.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f52441n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f52442t;

    @Override // UM7.Ml
    @Hh.Ml
    public UM7.w6 createImageTranscoder(com.facebook.imageformat.w6 w6Var, boolean z2) {
        if (w6Var != com.facebook.imageformat.n.rl) {
            return null;
        }
        return new NativeJpegTranscoder(z2, this.f52441n, this.rl, this.f52442t);
    }

    @Hh.Ml
    public NativeJpegTranscoderFactory(int i2, boolean z2, boolean z3) {
        this.f52441n = i2;
        this.rl = z2;
        this.f52442t = z3;
    }
}
