package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.spherical.OrientationListener;
import com.google.android.exoplayer2.video.spherical.TouchTracker;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final Handler mainHandler;
    private final OrientationListener orientationListener;

    @Nullable
    private final Sensor orientationSensor;
    private final I28 scene;
    private final SensorManager sensorManager;

    @Nullable
    private Surface surface;

    @Nullable
    private SurfaceTexture surfaceTexture;
    private final TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final CopyOnWriteArrayList<VideoSurfaceListener> videoSurfaceListeners;

    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    final class j implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        private final float[] J2;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private float f58568S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private float f58569Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28 f58572n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final float[] f58573o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final float[] f58574r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float[] f58575t = new float[16];

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final float[] f58567O = new float[16];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float[] f58571g = new float[16];
        private final float[] E2 = new float[16];

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.E2, 0, this.J2, 0, this.f58573o, 0);
                Matrix.multiplyMM(this.f58571g, 0, this.f58574r, 0, this.E2, 0);
            }
            Matrix.multiplyMM(this.f58567O, 0, this.f58575t, 0, this.f58571g, 0);
            this.f58572n.rl(this.f58567O, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
        public synchronized void onOrientationChange(float[] fArr, float f3) {
            float[] fArr2 = this.J2;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f58568S = -f3;
            rl();
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        public synchronized void onScrollChange(PointF pointF) {
            this.f58569Z = pointF.y;
            rl();
            Matrix.setRotateM(this.f58573o, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f3 = i2 / i3;
            Matrix.perspectiveM(this.f58575t, 0, n(f3), f3, 0.1f, SphericalGLSurfaceView.Z_FAR);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.onSurfaceTextureAvailable(this.f58572n.t());
        }

        public j(I28 i28) {
            float[] fArr = new float[16];
            this.J2 = fArr;
            float[] fArr2 = new float[16];
            this.f58574r = fArr2;
            float[] fArr3 = new float[16];
            this.f58573o = fArr3;
            this.f58572n = i28;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f58568S = SphericalGLSurfaceView.UPRIGHT_ROLL;
        }

        private float n(float f3) {
            if (f3 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f3))) * 2.0d);
            }
            return 90.0f;
        }

        private void rl() {
            Matrix.setRotateM(this.f58574r, 0, -this.f58569Z, (float) Math.cos(this.f58568S), (float) Math.sin(this.f58568S), 0.0f);
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.isStarted = false;
        updateOrientationListenerRegistration();
        super.onPause();
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoSurfaceListeners = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) Assertions.checkNotNull(context.getSystemService("sensor"));
        this.sensorManager = sensorManager;
        Sensor defaultSensor = Util.SDK_INT >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.orientationSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        I28 i28 = new I28();
        this.scene = i28;
        j jVar = new j(i28);
        TouchTracker touchTracker = new TouchTracker(context, jVar, PX_PER_DEGREES);
        this.touchTracker = touchTracker;
        this.orientationListener = new OrientationListener(((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), touchTracker, jVar);
        this.useSensorRotation = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(touchTracker);
    }

    public static /* synthetic */ void n(SphericalGLSurfaceView sphericalGLSurfaceView) {
        Surface surface = sphericalGLSurfaceView.surface;
        if (surface != null) {
            Iterator<VideoSurfaceListener> it = sphericalGLSurfaceView.videoSurfaceListeners.iterator();
            while (it.hasNext()) {
                it.next().onVideoSurfaceDestroyed(surface);
            }
        }
        releaseSurface(sphericalGLSurfaceView.surfaceTexture, surface);
        sphericalGLSurfaceView.surfaceTexture = null;
        sphericalGLSurfaceView.surface = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture) {
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.Wre
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.rl(this.f58581n, surfaceTexture);
            }
        });
    }

    private static void releaseSurface(@Nullable SurfaceTexture surfaceTexture, @Nullable Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public static /* synthetic */ void rl(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.surfaceTexture;
        Surface surface = sphericalGLSurfaceView.surface;
        Surface surface2 = new Surface(surfaceTexture);
        sphericalGLSurfaceView.surfaceTexture = surfaceTexture;
        sphericalGLSurfaceView.surface = surface2;
        Iterator<VideoSurfaceListener> it = sphericalGLSurfaceView.videoSurfaceListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSurfaceCreated(surface2);
        }
        releaseSurface(surfaceTexture2, surface);
    }

    private void updateOrientationListenerRegistration() {
        boolean z2 = this.useSensorRotation && this.isStarted;
        Sensor sensor = this.orientationSensor;
        if (sensor == null || z2 == this.isOrientationListenerRegistered) {
            return;
        }
        if (z2) {
            this.sensorManager.registerListener(this.orientationListener, sensor, 0);
        } else {
            this.sensorManager.unregisterListener(this.orientationListener);
        }
        this.isOrientationListenerRegistered = z2;
    }

    public void addVideoSurfaceListener(VideoSurfaceListener videoSurfaceListener) {
        this.videoSurfaceListeners.add(videoSurfaceListener);
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.scene;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.scene;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.surface;
    }

    public void removeVideoSurfaceListener(VideoSurfaceListener videoSurfaceListener) {
        this.videoSurfaceListeners.remove(videoSurfaceListener);
    }

    public void setDefaultStereoMode(int i2) {
        this.scene.nr(i2);
    }

    public void setUseSensorRotation(boolean z2) {
        this.useSensorRotation = z2;
        updateOrientationListenerRegistration();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.CN3
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.n(this.f58546n);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.isStarted = true;
        updateOrientationListenerRegistration();
    }
}
