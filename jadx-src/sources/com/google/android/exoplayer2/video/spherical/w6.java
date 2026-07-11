package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import com.google.android.exoplayer2.util.GlProgram;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class w6 {
    private int J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f58585O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f58586n;
    private GlProgram nr;
    private j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j f58587t;
    private int xMQ;
    private static final float[] mUb = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] gh = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] qie = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] az = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] ty = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    private static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f58588n;
        private final int nr;
        private final FloatBuffer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final FloatBuffer f58589t;

        public j(Projection.SubMesh subMesh) {
            this.f58588n = subMesh.getVertexCount();
            this.rl = GlUtil.createBuffer(subMesh.vertices);
            this.f58589t = GlUtil.createBuffer(subMesh.textureCoords);
            int i2 = subMesh.mode;
            if (i2 != 1) {
                if (i2 != 2) {
                    this.nr = 4;
                    return;
                } else {
                    this.nr = 6;
                    return;
                }
            }
            this.nr = 5;
        }
    }

    public static boolean t(Projection projection) {
        Projection.Mesh mesh = projection.f58565n;
        Projection.Mesh mesh2 = projection.rl;
        return mesh.getSubMeshCount() == 1 && mesh.getSubMesh(0).textureId == 0 && mesh2.getSubMeshCount() == 1 && mesh2.getSubMesh(0).textureId == 0;
    }

    public void n(int i2, float[] fArr, boolean z2) {
        j jVar = z2 ? this.f58587t : this.rl;
        if (jVar == null) {
            return;
        }
        int i3 = this.f58586n;
        GLES20.glUniformMatrix3fv(this.J2, 1, false, i3 == 1 ? z2 ? qie : gh : i3 == 2 ? z2 ? ty : az : mUb, 0);
        GLES20.glUniformMatrix4fv(this.f58585O, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(this.xMQ, 0);
        GlUtil.checkGlError();
        GLES20.glVertexAttribPointer(this.Uo, 3, 5126, false, 12, (Buffer) jVar.rl);
        GlUtil.checkGlError();
        GLES20.glVertexAttribPointer(this.KN, 2, 5126, false, 8, (Buffer) jVar.f58589t);
        GlUtil.checkGlError();
        GLES20.glDrawArrays(jVar.nr, 0, jVar.f58588n);
        GlUtil.checkGlError();
    }

    public void rl() {
        GlProgram glProgram = new GlProgram("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        this.nr = glProgram;
        this.f58585O = glProgram.getUniformLocation("uMvpMatrix");
        this.J2 = this.nr.getUniformLocation("uTexMatrix");
        this.Uo = this.nr.getAttributeArrayLocationAndEnable("aPosition");
        this.KN = this.nr.getAttributeArrayLocationAndEnable("aTexCoords");
        this.xMQ = this.nr.getUniformLocation("uTexture");
    }

    w6() {
    }

    public void nr(Projection projection) {
        if (!t(projection)) {
            return;
        }
        this.f58586n = projection.f58566t;
        j jVar = new j(projection.f58565n.getSubMesh(0));
        this.rl = jVar;
        if (!projection.nr) {
            jVar = new j(projection.rl.getSubMesh(0));
        }
        this.f58587t = jVar;
    }
}
