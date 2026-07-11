package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private static int decodeZigZag(int i2) {
        return (-(i2 & 1)) ^ (i2 >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i2 == 1886547818;
    }

    @Nullable
    public static Projection decode(byte[] bArr, int i2) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i2);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int i2;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i2 = parsableByteArray.readInt() + position) > position && i2 <= iLimit) {
            int i3 = parsableByteArray.readInt();
            if (i3 == TYPE_YTMP || i3 == TYPE_MSHP) {
                parsableByteArray.setLimit(i2);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return null;
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i2 = parsableByteArray.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return arrayList;
    }

    private ProjectionDecoder() {
    }

    @Nullable
    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i2 > 10000) {
            return null;
        }
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = parsableByteArray.readFloat();
        }
        int i5 = parsableByteArray.readInt();
        if (i5 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d2 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i2) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i7 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i5 * 5];
        int[] iArr = new int[5];
        int i8 = 0;
        int i9 = 0;
        while (i8 < i5) {
            Projection.Mesh mesh2 = mesh;
            int i10 = 0;
            while (i10 < 5) {
                int iDecodeZigZag = iArr[i10] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag < i2 && iDecodeZigZag >= 0) {
                    fArr2[i9] = fArr[iDecodeZigZag];
                    iArr[i10] = iDecodeZigZag;
                    i10++;
                    i9++;
                } else {
                    return mesh2;
                }
            }
            i8++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i11 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i12 = 0;
        while (i12 < bits) {
            int bits2 = parsableBitArray.readBits(i7);
            int bits3 = parsableBitArray.readBits(i7);
            int bits4 = parsableBitArray.readBits(i11);
            if (bits4 > MAX_TRIANGLE_INDICES) {
                return mesh3;
            }
            int i13 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i5) * d2) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i14 = 0;
            int i15 = 0;
            while (i14 < bits4) {
                int iDecodeZigZag2 = i15 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 >= 0 && iDecodeZigZag2 < i5) {
                    int i16 = i14 * 3;
                    int i17 = iDecodeZigZag2 * 5;
                    fArr3[i16] = fArr2[i17];
                    fArr3[i16 + 1] = fArr2[i17 + 1];
                    fArr3[i16 + 2] = fArr2[i17 + 2];
                    int i18 = i14 * 2;
                    fArr4[i18] = fArr2[i17 + 3];
                    fArr4[i18 + 1] = fArr2[i17 + 4];
                    i14++;
                    i15 = iDecodeZigZag2;
                } else {
                    return mesh3;
                }
            }
            subMeshArr[i12] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i12++;
            bits = i13;
            i11 = 32;
            d2 = 2.0d;
            i7 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i2 = parsableByteArray.readInt();
        if (i2 == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (i2 != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }
}
