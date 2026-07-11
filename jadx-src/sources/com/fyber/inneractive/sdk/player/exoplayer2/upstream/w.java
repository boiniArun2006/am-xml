package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f56161a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f56162b;

    public final synchronized Map a() {
        try {
            if (this.f56162b == null) {
                this.f56162b = Collections.unmodifiableMap(new HashMap(this.f56161a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f56162b;
    }
}
