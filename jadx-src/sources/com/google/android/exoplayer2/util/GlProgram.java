package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, j> attributeByName;
    private final j[] attributes;
    private final int programId;
    private final Map<String, n> uniformByName;
    private final n[] uniforms;

    private static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f58464O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f58465n;
        private Buffer nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f58466t;

        public static j rl(int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr, 0);
            int i5 = iArr[0];
            byte[] bArr = new byte[i5];
            GLES20.glGetActiveAttrib(i2, i3, i5, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new j(str, i3, GlProgram.getAttributeLocation(i2, str));
        }

        public void n() {
            Buffer buffer = (Buffer) Assertions.checkNotNull(this.nr, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f58466t, this.f58464O, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.rl);
            GlUtil.checkGlError();
        }

        private j(String str, int i2, int i3) {
            this.f58465n = str;
            this.rl = i2;
            this.f58466t = i3;
        }

        public void t(float[] fArr, int i2) {
            this.nr = GlUtil.createBuffer(fArr);
            this.f58464O = i2;
        }
    }

    private static final class n {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f58467O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f58468n;
        private final float[] nr = new float[16];
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f58469t;

        public static n rl(int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i5 = iArr[0];
            byte[] bArr = new byte[i5];
            GLES20.glGetActiveUniform(i2, i3, i5, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new n(str, GlProgram.getUniformLocation(i2, str), iArr2[0]);
        }

        public void O(int i2, int i3) {
            this.f58467O = i2;
            this.J2 = i3;
        }

        public void n() {
            switch (this.f58469t) {
                case 5126:
                    GLES20.glUniform1fv(this.rl, 1, this.nr, 0);
                    GlUtil.checkGlError();
                    return;
                case 35664:
                    GLES20.glUniform2fv(this.rl, 1, this.nr, 0);
                    GlUtil.checkGlError();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.rl, 1, this.nr, 0);
                    GlUtil.checkGlError();
                    return;
                case 35675:
                    GLES20.glUniformMatrix3fv(this.rl, 1, false, this.nr, 0);
                    GlUtil.checkGlError();
                    return;
                case 35676:
                    GLES20.glUniformMatrix4fv(this.rl, 1, false, this.nr, 0);
                    GlUtil.checkGlError();
                    return;
                case 35678:
                case GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT /* 35815 */:
                case 36198:
                    if (this.f58467O == 0) {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    GLES20.glActiveTexture(this.J2 + 33984);
                    GlUtil.checkGlError();
                    GlUtil.bindTexture(this.f58469t == 35678 ? 3553 : 36197, this.f58467O);
                    GLES20.glUniform1i(this.rl, this.J2);
                    GlUtil.checkGlError();
                    return;
                default:
                    throw new IllegalStateException("Unexpected uniform type: " + this.f58469t);
            }
        }

        public void nr(float[] fArr) {
            System.arraycopy(fArr, 0, this.nr, 0, fArr.length);
        }

        public void t(float f3) {
            this.nr[0] = f3;
        }

        private n(String str, int i2, int i3) {
            this.f58468n = str;
            this.rl = i2;
            this.f58469t = i3;
        }
    }

    public GlProgram(Context context, String str, String str2) throws IOException {
        this(GlUtil.loadAsset(context, str), GlUtil.loadAsset(context, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i2, String str) {
        return GLES20.glGetAttribLocation(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] == 0) {
                return i2;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i2, String str) {
        return GLES20.glGetUniformLocation(i2, str);
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.programId, str);
    }

    public void bindAttributesAndUniforms() {
        for (j jVar : this.attributes) {
            jVar.n();
        }
        for (n nVar : this.uniforms) {
            nVar.n();
        }
    }

    public void delete() {
        GLES20.glDeleteProgram(this.programId);
        GlUtil.checkGlError();
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.programId, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i2) {
        ((j) Assertions.checkNotNull(this.attributeByName.get(str))).t(fArr, i2);
    }

    public void setFloatUniform(String str, float f3) {
        ((n) Assertions.checkNotNull(this.uniformByName.get(str))).t(f3);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((n) Assertions.checkNotNull(this.uniformByName.get(str))).nr(fArr);
    }

    public void setSamplerTexIdUniform(String str, int i2, int i3) {
        ((n) Assertions.checkNotNull(this.uniformByName.get(str))).O(i2, i3);
    }

    public void use() {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError();
    }

    private static void addShader(int i2, int i3, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            GlUtil.throwGlException(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GlUtil.checkGlError();
        return attributeLocation;
    }

    public GlProgram(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        GlUtil.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GlUtil.throwGlException("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.attributeByName = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.attributes = new j[iArr2[0]];
        for (int i2 = 0; i2 < iArr2[0]; i2++) {
            j jVarRl = j.rl(this.programId, i2);
            this.attributes[i2] = jVarRl;
            this.attributeByName.put(jVarRl.f58465n, jVarRl);
        }
        this.uniformByName = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new n[iArr3[0]];
        for (int i3 = 0; i3 < iArr3[0]; i3++) {
            n nVarRl = n.rl(this.programId, i3);
            this.uniforms[i3] = nVarRl;
            this.uniformByName.put(nVarRl.f58468n, nVarRl);
        }
        GlUtil.checkGlError();
    }
}
