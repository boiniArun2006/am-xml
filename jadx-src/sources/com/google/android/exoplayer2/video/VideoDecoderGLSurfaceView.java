package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlProgram;
import com.google.android.exoplayer2.util.GlUtil;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {
    private final j renderer;

    private static final class j implements GLSurfaceView.Renderer {
        private VideoDecoderOutputBuffer E2;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private GlProgram f58511S;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f58513g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final GLSurfaceView f58514n;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float[] f58508e = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private static final float[] f58507X = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private static final float[] f58506T = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private static final String[] f58505N = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final FloatBuffer f58509v = GlUtil.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int[] f58517t = new int[3];

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int[] f58510O = new int[3];
        private final int[] J2 = new int[3];

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int[] f58516r = new int[3];

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final AtomicReference f58515o = new AtomicReference();

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final FloatBuffer[] f58512Z = new FloatBuffer[3];

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        private void rl() {
            GLES20.glGenTextures(3, this.f58517t, 0);
            for (int i2 = 0; i2 < 3; i2++) {
                GLES20.glUniform1i(this.f58511S.getUniformLocation(f58505N[i2]), i2);
                GLES20.glActiveTexture(33984 + i2);
                GlUtil.bindTexture(3553, this.f58517t[i2]);
            }
            GlUtil.checkGlError();
        }

        public void n(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) this.f58515o.getAndSet(videoDecoderOutputBuffer);
            if (videoDecoderOutputBuffer2 != null) {
                videoDecoderOutputBuffer2.release();
            }
            this.f58514n.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.f58515o.getAndSet(null);
            if (videoDecoderOutputBuffer == null && this.E2 == null) {
                return;
            }
            if (videoDecoderOutputBuffer != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.E2;
                if (videoDecoderOutputBuffer2 != null) {
                    videoDecoderOutputBuffer2.release();
                }
                this.E2 = videoDecoderOutputBuffer;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer3 = (VideoDecoderOutputBuffer) Assertions.checkNotNull(this.E2);
            float[] fArr = f58507X;
            int i2 = videoDecoderOutputBuffer3.colorspace;
            if (i2 == 1) {
                fArr = f58508e;
            } else if (i2 == 3) {
                fArr = f58506T;
            }
            GLES20.glUniformMatrix3fv(this.f58513g, 1, false, fArr, 0);
            int[] iArr = (int[]) Assertions.checkNotNull(videoDecoderOutputBuffer3.yuvStrides);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) Assertions.checkNotNull(videoDecoderOutputBuffer3.yuvPlanes);
            for (int i3 = 0; i3 < 3; i3++) {
                int i5 = videoDecoderOutputBuffer3.height;
                if (i3 != 0) {
                    i5 = (i5 + 1) / 2;
                }
                int i7 = i5;
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.f58517t[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i7, 0, 6409, 5121, byteBufferArr[i3]);
            }
            int i8 = videoDecoderOutputBuffer3.width;
            int i9 = (i8 + 1) / 2;
            int[] iArr2 = {i8, i9, i9};
            for (int i10 = 0; i10 < 3; i10++) {
                if (this.J2[i10] != iArr2[i10] || this.f58516r[i10] != iArr[i10]) {
                    Assertions.checkState(iArr[i10] != 0);
                    float f3 = iArr2[i10] / iArr[i10];
                    this.f58512Z[i10] = GlUtil.createBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f3, 0.0f, f3, 1.0f});
                    GLES20.glVertexAttribPointer(this.f58510O[i10], 2, 5126, false, 0, (Buffer) this.f58512Z[i10]);
                    this.J2[i10] = iArr2[i10];
                    this.f58516r[i10] = iArr[i10];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.checkGlError();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            GlProgram glProgram = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f58511S = glProgram;
            GLES20.glVertexAttribPointer(glProgram.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (Buffer) f58509v);
            this.f58510O[0] = this.f58511S.getAttributeArrayLocationAndEnable("in_tc_y");
            this.f58510O[1] = this.f58511S.getAttributeArrayLocationAndEnable("in_tc_u");
            this.f58510O[2] = this.f58511S.getAttributeArrayLocationAndEnable("in_tc_v");
            this.f58513g = this.f58511S.getUniformLocation("mColorConversion");
            GlUtil.checkGlError();
            rl();
            GlUtil.checkGlError();
        }

        public j(GLSurfaceView gLSurfaceView) {
            this.f58514n = gLSurfaceView;
            for (int i2 = 0; i2 < 3; i2++) {
                int[] iArr = this.J2;
                this.f58516r[i2] = -1;
                iArr[i2] = -1;
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        j jVar = new j(this);
        this.renderer = jVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setRenderMode(0);
    }

    @Override // com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.renderer.n(videoDecoderOutputBuffer);
    }
}
