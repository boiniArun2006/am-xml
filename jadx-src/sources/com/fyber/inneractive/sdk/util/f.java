package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f56996b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f56997a = new ConcurrentLinkedQueue();

    public f() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f56997a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
