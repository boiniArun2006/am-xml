package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f56715b = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f56716a;

    public x1() {
        b2 b2Var;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            b2Var = f56715b;
        }
        w1 w1Var = new w1(r0.f56647a, b2Var);
        Charset charset = l1.f56612a;
        this.f56716a = w1Var;
    }
}
