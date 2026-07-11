package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class C {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ C[] f60908O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f60909n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f60910t;

    enum j extends C {
        j(String str, int i2) {
            super(str, i2, null);
        }
    }

    private C(String str, int i2) {
    }

    static {
        j jVar = new j("DEFAULT", 0);
        f60909n = jVar;
        C c2 = new C("STRING", 1) { // from class: com.google.gson.C.n
            {
                j jVar2 = null;
            }
        };
        f60910t = c2;
        f60908O = new C[]{jVar, c2};
    }

    /* synthetic */ C(String str, int i2, j jVar) {
        this(str, i2);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f60908O.clone();
    }
}
