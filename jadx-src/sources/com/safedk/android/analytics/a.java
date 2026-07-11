package com.safedk.android.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61351a = "ANRDetector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f61352b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f61353c = new HashSet(Arrays.asList("com.android.internal.os.RuntimeInit$UncaughtHandler.uncaughtException", "com.android.internal.os.RuntimeInit$KillApplicationHandler.uncaughtException"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f61354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f61355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f61357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.safedk.android.analytics.reporters.a f61358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f61359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f61360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f61361k;

    public a(Context context) {
        this(context, 5000, false);
    }

    public a(Context context, boolean z2) {
        this(context, 5000, z2);
    }

    public a(Context context, int i2, boolean z2) {
        this.f61354d = 0;
        this.f61361k = new Runnable() { // from class: com.safedk.android.analytics.a.1
            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f61354d = (aVar.f61354d + 1) % Integer.MAX_VALUE;
            }
        };
        this.f61355e = context;
        this.f61356f = i2;
        this.f61360j = z2;
        this.f61357g = new Handler(Looper.getMainLooper());
        this.f61358h = new com.safedk.android.analytics.reporters.a(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
    }

    private StackTraceElement[] a() {
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    private static String a(StackTraceElement[] stackTraceElementArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                messageDigest.update(stackTraceElement.toString().getBytes());
            }
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            return null;
        }
    }
}
