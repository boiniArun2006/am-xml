package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class n {
    private static int rl(int i2) {
        return (-(i2 & 1)) ^ (i2 >> 1);
    }

    private static boolean t(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i2 == 1886547818;
    }

    private static ArrayList J2(ParsableByteArray parsableByteArray) {
        int i2;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i2 = parsableByteArray.readInt() + position) > position && i2 <= iLimit) {
            int i3 = parsableByteArray.readInt();
            if (i3 == 2037673328 || i3 == 1836279920) {
                parsableByteArray.setLimit(i2);
                return O(parsableByteArray);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return null;
    }

    private static ArrayList Uo(ParsableByteArray parsableByteArray) {
        ArrayList arrayList = new ArrayList();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i2 = parsableByteArray.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == 1835365224) {
                Projection.Mesh meshNr = nr(parsableByteArray);
                if (meshNr == null) {
                    return null;
                }
                arrayList.add(meshNr);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return arrayList;
    }

    public static Projection n(byte[] bArr, int i2) {
        ArrayList arrayListJ2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            arrayListJ2 = t(parsableByteArray) ? J2(parsableByteArray) : O(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListJ2 = null;
        }
        if (arrayListJ2 == null) {
            return null;
        }
        int size = arrayListJ2.size();
        if (size == 1) {
            return new Projection((Projection.Mesh) arrayListJ2.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new Projection((Projection.Mesh) arrayListJ2.get(0), (Projection.Mesh) arrayListJ2.get(1), i2);
    }

    private static ArrayList O(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i2 = parsableByteArray.readInt();
        if (i2 == 1684433976) {
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
        } else if (i2 != 1918990112) {
            return null;
        }
        return Uo(parsableByteArray);
    }

    private static Projection.Mesh nr(ParsableByteArray parsableByteArray) {
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
        if (i5 > 32000) {
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
                int iRl = iArr[i10] + rl(parsableBitArray.readBits(iCeil));
                if (iRl < i2 && iRl >= 0) {
                    fArr2[i9] = fArr[iRl];
                    iArr[i10] = iRl;
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
            if (bits4 > 128000) {
                return mesh3;
            }
            int i13 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i5) * d2) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i14 = 0;
            int i15 = 0;
            while (i14 < bits4) {
                int iRl2 = i15 + rl(parsableBitArray.readBits(iCeil2));
                if (iRl2 >= 0 && iRl2 < i5) {
                    int i16 = i14 * 3;
                    int i17 = iRl2 * 5;
                    fArr3[i16] = fArr2[i17];
                    fArr3[i16 + 1] = fArr2[i17 + 1];
                    fArr3[i16 + 2] = fArr2[i17 + 2];
                    int i18 = i14 * 2;
                    fArr4[i18] = fArr2[i17 + 3];
                    fArr4[i18 + 1] = fArr2[i17 + 4];
                    i14++;
                    i15 = iRl2;
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
}
