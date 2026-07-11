package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f56527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f56528b;

    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f56527a = z1Var;
        f56528b = new z1();
    }
}
