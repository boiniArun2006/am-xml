package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final n thread;
    private boolean threadReleased;

    private static class n extends HandlerThread implements Handler.Callback {
        private RuntimeException J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Error f58501O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private EGLSurfaceTexture f58502n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private PlaceholderSurface f58503r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Handler f58504t;

        public n() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void nr() {
            Assertions.checkNotNull(this.f58502n);
            this.f58502n.release();
        }

        private void rl(int i2) {
            Assertions.checkNotNull(this.f58502n);
            this.f58502n.init(i2);
            this.f58503r = new PlaceholderSurface(this, this.f58502n.getSurfaceTexture(), i2 != 0);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        nr();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    rl(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                    this.f58501O = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                    this.J2 = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public void t() {
            Assertions.checkNotNull(this.f58504t);
            this.f58504t.sendEmptyMessage(2);
        }

        public PlaceholderSurface n(int i2) {
            boolean z2;
            start();
            this.f58504t = new Handler(getLooper(), this);
            this.f58502n = new EGLSurfaceTexture(this.f58504t);
            synchronized (this) {
                z2 = false;
                this.f58504t.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f58503r == null && this.J2 == null && this.f58501O == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.J2;
            if (runtimeException == null) {
                Error error = this.f58501O;
                if (error == null) {
                    return (PlaceholderSurface) Assertions.checkNotNull(this.f58503r);
                }
                throw error;
            }
            throw runtimeException;
        }
    }

    public static PlaceholderSurface newInstanceV17(Context context, boolean z2) {
        Assertions.checkState(!z2 || isSecureSupported(context));
        return new n().n(z2 ? secureMode : 0);
    }

    private PlaceholderSurface(n nVar, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.thread = nVar;
        this.secure = z2;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = getSecureMode(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return secureMode != 0;
    }

    private static int getSecureMode(Context context) {
        if (GlUtil.isProtectedContentExtensionSupported(context)) {
            if (GlUtil.isSurfacelessContextExtensionSupported()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.t();
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
