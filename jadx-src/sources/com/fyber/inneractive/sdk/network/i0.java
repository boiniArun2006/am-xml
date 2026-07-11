package com.fyber.inneractive.sdk.network;

import android.os.Process;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f54264a;

    public i0(l0 l0Var) {
        this.f54264a = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t0 t0Var;
        boolean z2;
        boolean z3;
        a aVarI;
        o0 o0VarA;
        p0 p0Var;
        p0 p0Var2;
        i1 i1Var;
        p0 p0Var3;
        l0 l0Var = this.f54264a;
        l0Var.getClass();
        Process.setThreadPriority(10);
        while (l0Var.f54278b) {
            o0 o0Var = null;
            try {
                t0Var = (t0) l0Var.f54277a.take();
            } catch (InterruptedException unused) {
                if (!l0Var.f54278b) {
                    Thread.currentThread().interrupt();
                }
                t0Var = null;
            }
            if (t0Var != null && !t0Var.f54315a) {
                i1 i1Var2 = i1.RUNNING;
                t0Var.f54320f = i1Var2;
                if (i1Var2 == i1.QUEUED_FOR_RETRY && (p0Var3 = t0Var.f54318d) != null) {
                    p0Var3.a("sdkRequestEndedButWillBeRetried");
                }
                if (t0Var.f54329o) {
                    Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.f53260M.f53273K.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_manage_request_watchdog");
                    if (boolC != null ? boolC.booleanValue() : true) {
                        z2 = true;
                    }
                    if (z2) {
                        IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z3));
                        if (z3) {
                        }
                        if (t0Var.f54315a) {
                            if (aVarI != null) {
                                t0Var.a(aVarI.f54224b, (Exception) null, true);
                            }
                            l lVarA = l0Var.a(t0Var, aVarI);
                            o0VarA = l0Var.a(t0Var, lVarA);
                            l0.a(t0Var, lVarA, o0VarA);
                            l0.a(t0Var, o0VarA);
                            t0Var.e();
                            i1Var = i1.DONE;
                            t0Var.f54320f = i1Var;
                            if (i1Var == i1.QUEUED_FOR_RETRY) {
                                p0Var2.a("sdkRequestEndedButWillBeRetried");
                            }
                            l0Var.b(t0Var);
                        }
                    }
                } else {
                    z2 = false;
                    z3 = !z2 || t0Var.v();
                    IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z3));
                    if (z3) {
                        j1 j1Var = l0Var.f54282f;
                        Thread threadCurrentThread = Thread.currentThread();
                        j1Var.getClass();
                        IAlog.a("%s : NetworkRequestWatchdog : register request: %s", IAlog.a(j1Var), t0Var.f54321g);
                        int iS = t0Var.s();
                        l1 l1VarP = t0Var.p();
                        n1 n1Var = new n1(t0Var, threadCurrentThread, l1VarP.f54283a + l1VarP.f54284b + iS);
                        j1Var.f54268a.putIfAbsent(t0Var.f54321g, n1Var);
                        com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(n1Var.f54293d, n1Var.f54292c);
                    }
                    try {
                    } catch (Exception e2) {
                        IAlog.a("failed fetching cache data for url: %s msg: %s", t0Var.r(), e2.getMessage());
                        if (!t0Var.f54315a) {
                            t0Var.a((Object) null, e2, true);
                        }
                    }
                    aVarI = (!t0Var.f54315a || t0Var.h() == null) ? null : t0Var.i();
                    if (aVarI != null && aVarI.f54224b != null && !t0Var.f54315a) {
                        t0Var.a(aVarI.f54224b, (Exception) null, true);
                    }
                    try {
                        l lVarA2 = l0Var.a(t0Var, aVarI);
                        o0VarA = l0Var.a(t0Var, lVarA2);
                        try {
                            l0.a(t0Var, lVarA2, o0VarA);
                            l0.a(t0Var, o0VarA);
                            try {
                                t0Var.e();
                            } catch (Exception unused2) {
                            }
                            i1Var = i1.DONE;
                            t0Var.f54320f = i1Var;
                        } catch (t1 unused3) {
                            o0Var = o0VarA;
                            l0.a(t0Var, o0Var);
                            try {
                                t0Var.e();
                            } catch (Exception unused4) {
                            }
                            i1 i1Var3 = i1.DONE;
                            t0Var.f54320f = i1Var3;
                            if (i1Var3 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f54318d) != null) {
                            }
                            l0Var.b(t0Var);
                        } catch (Exception e3) {
                            e = e3;
                            if (!t0Var.f54315a) {
                                t0Var.a((Object) null, e, false);
                            }
                            l0.a(t0Var, o0VarA);
                            try {
                                t0Var.e();
                            } catch (Exception unused5) {
                            }
                            i1 i1Var4 = i1.DONE;
                            t0Var.f54320f = i1Var4;
                            if (i1Var4 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f54318d) != null) {
                            }
                            l0Var.b(t0Var);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                if (!t0Var.f54315a) {
                                    t0Var.a((Object) null, new Exception(th), false);
                                }
                                l0.a(t0Var, o0VarA);
                                try {
                                    t0Var.e();
                                } catch (Exception unused6) {
                                }
                                i1 i1Var5 = i1.DONE;
                                t0Var.f54320f = i1Var5;
                                if (i1Var5 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f54318d) != null) {
                                }
                                l0Var.b(t0Var);
                            } catch (Throwable th2) {
                                l0.a(t0Var, o0VarA);
                                try {
                                    t0Var.e();
                                } catch (Exception unused7) {
                                }
                                i1 i1Var6 = i1.DONE;
                                t0Var.f54320f = i1Var6;
                                if (i1Var6 == i1.QUEUED_FOR_RETRY && (p0Var = t0Var.f54318d) != null) {
                                    p0Var.a("sdkRequestEndedButWillBeRetried");
                                }
                                l0Var.b(t0Var);
                                throw th2;
                            }
                        }
                    } catch (t1 unused8) {
                    } catch (Exception e4) {
                        e = e4;
                        o0VarA = null;
                    } catch (Throwable th3) {
                        th = th3;
                        o0VarA = null;
                    }
                    if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f54318d) != null) {
                        p0Var2.a("sdkRequestEndedButWillBeRetried");
                    }
                    l0Var.b(t0Var);
                }
            }
        }
    }
}
