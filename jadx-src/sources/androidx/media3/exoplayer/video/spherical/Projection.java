package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public SubMesh getSubMesh(int i2) {
            return this.subMeshes[i2];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public int getVertexCount() {
            return this.vertices.length / 3;
        }

        public SubMesh(int i2, float[] fArr, float[] fArr2, int i3) {
            boolean z2;
            this.textureId = i2;
            if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkArgument(z2);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i3;
        }
    }

    public Projection(Mesh mesh, int i2) {
        this(mesh, mesh, i2);
    }

    public static Projection createEquirectangular(int i2) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i2) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i2;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f3, int i2, int i3, float f4, float f5, int i5) {
        int i7 = i2;
        Assertions.checkArgument(f3 > 0.0f);
        Assertions.checkArgument(i7 >= 1);
        Assertions.checkArgument(i3 >= 1);
        Assertions.checkArgument(f4 > 0.0f && f4 <= 180.0f);
        Assertions.checkArgument(f5 > 0.0f && f5 <= 360.0f);
        float radians = (float) Math.toRadians(f4);
        float radians2 = (float) Math.toRadians(f5);
        float f6 = radians / i7;
        float f7 = radians2 / i3;
        int i8 = i3 + 1;
        int i9 = ((i8 * 2) + 2) * i7;
        float[] fArr = new float[i9 * 3];
        float[] fArr2 = new float[i9 * 2];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i7) {
            float f8 = radians / 2.0f;
            float f9 = (i10 * f6) - f8;
            int i13 = i10 + 1;
            float f10 = (i13 * f6) - f8;
            int i14 = 0;
            while (i14 < i8) {
                float f11 = radians;
                float f12 = radians2;
                int i15 = 2;
                int i16 = 0;
                while (i16 < i15) {
                    float f13 = i16 == 0 ? f9 : f10;
                    float f14 = f6;
                    float f15 = i14 * f7;
                    float f16 = f7;
                    float f17 = f9;
                    double d2 = f3;
                    double d4 = (f15 + 3.1415927f) - (f12 / 2.0f);
                    double dSin = Math.sin(d4) * d2;
                    double d5 = f13;
                    fArr[i11] = -((float) (dSin * Math.cos(d5)));
                    fArr[i11 + 1] = (float) (d2 * Math.sin(d5));
                    int i17 = i11 + 3;
                    fArr[i11 + 2] = (float) (Math.cos(d4) * d2 * Math.cos(d5));
                    fArr2[i12] = f15 / f12;
                    int i18 = i12 + 2;
                    fArr2[i12 + 1] = ((i10 + i16) * f14) / f11;
                    if ((i14 == 0 && i16 == 0) || (i14 == i3 && i16 == 1)) {
                        System.arraycopy(fArr, i11, fArr, i17, 3);
                        i11 += 6;
                        i15 = 2;
                        System.arraycopy(fArr2, i12, fArr2, i18, 2);
                        i12 += 4;
                    } else {
                        i15 = 2;
                        i11 = i17;
                        i12 = i18;
                    }
                    i16++;
                    f6 = f14;
                    f7 = f16;
                    f9 = f17;
                }
                i14++;
                radians2 = f12;
                radians = f11;
            }
            i7 = i2;
            i10 = i13;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i5);
    }
}
