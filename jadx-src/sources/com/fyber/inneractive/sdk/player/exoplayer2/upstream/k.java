package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f56108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56113f;

    public final String toString() {
        return "DataSpec[" + this.f56108a + ", " + Arrays.toString((byte[]) null) + ", " + this.f56109b + ", " + this.f56110c + ", " + this.f56111d + ", " + this.f56112e + ", " + this.f56113f + "]";
    }

    public k(Uri uri, long j2, long j3, long j4, String str, int i2) {
        if (j2 >= 0) {
            if (j3 >= 0) {
                if (j4 <= 0 && j4 != -1) {
                    throw new IllegalArgumentException();
                }
                this.f56108a = uri;
                this.f56109b = j2;
                this.f56110c = j3;
                this.f56111d = j4;
                this.f56112e = str;
                this.f56113f = i2;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
