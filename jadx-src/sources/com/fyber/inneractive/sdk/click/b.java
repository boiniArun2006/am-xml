package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f53213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f53214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f53217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f53218f = new ArrayList();

    public final String toString() {
        q qVar = this.f53213a;
        if (qVar == q.FAILED) {
            Throwable th = this.f53214b;
            return "Open result: Failed! error: " + (th != null ? th.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.f53215c;
    }

    public b(String str, q qVar, String str2, Exception exc) {
        this.f53216d = str;
        this.f53213a = qVar;
        this.f53215c = str2;
        this.f53214b = exc;
    }
}
