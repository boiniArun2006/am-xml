package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.google.common.util.concurrent.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class AbstractC1901c {
    static void n(Object obj, long j2) {
        LockSupport.parkNanos(obj, Math.min(j2, 2147483647999999999L));
    }
}
