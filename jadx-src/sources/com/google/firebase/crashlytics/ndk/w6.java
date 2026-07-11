package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class w6 implements h1M.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static w6 f60296O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.crashlytics.ndk.j f60297n;
    private j nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f60298t;

    /* JADX INFO: Access modifiers changed from: private */
    interface j {
        void n();
    }

    @Override // h1M.j
    public synchronized void nr(final String str, final String str2, final long j2, final u uVar) throws Throwable {
        try {
            try {
                this.f60298t = str;
                j jVar = new j() { // from class: com.google.firebase.crashlytics.ndk.n
                    @Override // com.google.firebase.crashlytics.ndk.w6.j
                    public final void n() {
                        w6.O(this.f60294n, str, str2, j2, uVar);
                    }
                };
                this.nr = jVar;
                if (this.rl) {
                    jVar.n();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    static w6 J2(Context context, boolean z2) {
        w6 w6Var = new w6(new com.google.firebase.crashlytics.ndk.j(context, new JniNativeApi(context), new E8K.CN3(context)), z2);
        f60296O = w6Var;
        return w6Var;
    }

    @Override // h1M.j
    public h1M.fuX n(String str) {
        return new CN3(this.f60297n.nr(str));
    }

    @Override // h1M.j
    public boolean rl() {
        String str = this.f60298t;
        return str != null && t(str);
    }

    @Override // h1M.j
    public boolean t(String str) {
        return this.f60297n.mUb(str);
    }

    w6(com.google.firebase.crashlytics.ndk.j jVar, boolean z2) {
        this.f60297n = jVar;
        this.rl = z2;
    }

    public static /* synthetic */ void O(w6 w6Var, String str, String str2, long j2, u uVar) {
        w6Var.getClass();
        h1M.CN3.J2().rl("Initializing native session: " + str);
        if (!w6Var.f60297n.gh(str, str2, j2, uVar)) {
            h1M.CN3.J2().gh("Failed to initialize Crashlytics NDK for session " + str);
        }
    }
}
