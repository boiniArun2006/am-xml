package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Xo {
    private static int J2(CN3 cn3, ByteBuffer byteBuffer, long j2) {
        xMQ(cn3, byteBuffer, 2, j2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    private static short KN(CN3 cn3, ByteBuffer byteBuffer, long j2) {
        xMQ(cn3, byteBuffer, 1, j2);
        return (short) (byteBuffer.get() & UByte.MAX_VALUE);
    }

    private static long Uo(CN3 cn3, ByteBuffer byteBuffer, long j2) {
        xMQ(cn3, byteBuffer, 4, j2);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static String[] t(fuX fux) throws ClosedByInterruptException {
        int i2 = 0;
        while (true) {
            try {
                return rl(fux);
            } catch (ClosedByInterruptException e2) {
                i2++;
                if (i2 > 4) {
                    throw e2;
                }
                Thread.interrupted();
                qz.t("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e2);
                fux.n();
            }
        }
    }

    private static void xMQ(CN3 cn3, ByteBuffer byteBuffer, int i2, long j2) {
        int iFD;
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        while (byteBuffer.remaining() > 0 && (iFD = cn3.fD(byteBuffer, j2)) != -1) {
            j2 += (long) iFD;
        }
        if (byteBuffer.remaining() > 0) {
            throw new j("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    protected static class j extends UnsatisfiedLinkError {
        j(String str) {
            super(str);
        }
    }

    private static String O(CN3 cn3, ByteBuffer byteBuffer, long j2) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short sKN = KN(cn3, byteBuffer, j2);
            if (sKN == 0) {
                return sb.toString();
            }
            sb.append((char) sKN);
            j2 = j3;
        }
    }

    public static String[] n(CN3 cn3) {
        return cn3 instanceof fuX ? t((fuX) cn3) : rl(cn3);
    }

    private static long nr(CN3 cn3, ByteBuffer byteBuffer, long j2) {
        xMQ(cn3, byteBuffer, 8, j2);
        return byteBuffer.getLong();
    }

    private static String[] rl(CN3 cn3) {
        long j2;
        long jJ2;
        long jUo;
        long jUo2;
        long jUo3;
        long j3;
        long jUo4;
        long j4;
        long jNr;
        long j5;
        long jNr2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jUo5 = Uo(cn3, byteBufferAllocate, 0L);
        if (jUo5 != 1179403647) {
            throw new j("file is not ELF: magic is 0x" + Long.toHexString(jUo5) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z2 = KN(cn3, byteBufferAllocate, 4L) == 1;
        long j6 = 5;
        if (KN(cn3, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jUo6 = z2 ? Uo(cn3, byteBufferAllocate, 28L) : nr(cn3, byteBufferAllocate, 32L);
        if (z2) {
            j2 = 44;
            jJ2 = J2(cn3, byteBufferAllocate, 44L);
        } else {
            j2 = 44;
            jJ2 = J2(cn3, byteBufferAllocate, 56L);
        }
        int iJ2 = J2(cn3, byteBufferAllocate, z2 ? 42L : 54L);
        boolean z3 = z2;
        long j7 = 40;
        if (jJ2 == 65535) {
            long jUo7 = z3 ? Uo(cn3, byteBufferAllocate, 32L) : nr(cn3, byteBufferAllocate, 40L);
            jJ2 = z3 ? Uo(cn3, byteBufferAllocate, jUo7 + 28) : Uo(cn3, byteBufferAllocate, jUo7 + j2);
        }
        long j9 = jUo6;
        long j10 = 0;
        while (true) {
            if (j10 >= jJ2) {
                jUo = 0;
                break;
            }
            if ((z3 ? Uo(cn3, byteBufferAllocate, j9) : Uo(cn3, byteBufferAllocate, j9)) == 2) {
                jUo = z3 ? Uo(cn3, byteBufferAllocate, j9 + 4) : nr(cn3, byteBufferAllocate, j9 + 8);
            } else {
                j9 += (long) iJ2;
                j10++;
                j7 = j7;
            }
        }
        long j11 = j7;
        if (jUo == 0) {
            throw new j("ELF file does not contain dynamic linking information");
        }
        long j12 = jUo;
        long jUo8 = 0;
        int i2 = 0;
        while (true) {
            long jUo9 = z3 ? Uo(cn3, byteBufferAllocate, j12) : nr(cn3, byteBufferAllocate, j12);
            long j13 = j6;
            if (jUo9 == 1) {
                if (i2 == Integer.MAX_VALUE) {
                    throw new j("malformed DT_NEEDED section");
                }
                i2++;
            } else if (jUo9 == j13) {
                jUo8 = z3 ? Uo(cn3, byteBufferAllocate, j12 + 4) : nr(cn3, byteBufferAllocate, j12 + 8);
            }
            j12 += z3 ? 8L : 16L;
            if (jUo9 == 0) {
                if (jUo8 == 0) {
                    throw new j("Dynamic section string-table not found");
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= jJ2) {
                        jUo2 = 0;
                        break;
                    }
                    if (z3) {
                        j3 = jUo6;
                        jUo4 = Uo(cn3, byteBufferAllocate, j3);
                    } else {
                        j3 = jUo6;
                        jUo4 = Uo(cn3, byteBufferAllocate, j3);
                    }
                    if (jUo4 == 1) {
                        if (z3) {
                            j4 = jJ2;
                            jNr = Uo(cn3, byteBufferAllocate, j3 + 8);
                        } else {
                            j4 = jJ2;
                            jNr = nr(cn3, byteBufferAllocate, j3 + 16);
                        }
                        if (z3) {
                            j5 = jNr;
                            jNr2 = Uo(cn3, byteBufferAllocate, j3 + 20);
                        } else {
                            j5 = jNr;
                            jNr2 = nr(cn3, byteBufferAllocate, j3 + j11);
                        }
                        if (j5 <= jUo8 && jUo8 < j5 + jNr2) {
                            jUo2 = (z3 ? Uo(cn3, byteBufferAllocate, j3 + 4) : nr(cn3, byteBufferAllocate, j3 + 8)) + (jUo8 - j5);
                        }
                    } else {
                        j4 = jJ2;
                    }
                    jUo6 = j3 + ((long) iJ2);
                    i3++;
                    jJ2 = j4;
                }
                if (jUo2 == 0) {
                    throw new j("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i2];
                int i5 = 0;
                do {
                    jUo3 = z3 ? Uo(cn3, byteBufferAllocate, jUo) : nr(cn3, byteBufferAllocate, jUo);
                    if (jUo3 == 1) {
                        strArr[i5] = O(cn3, byteBufferAllocate, (z3 ? Uo(cn3, byteBufferAllocate, jUo + 4) : nr(cn3, byteBufferAllocate, jUo + 8)) + jUo2);
                        if (i5 == Integer.MAX_VALUE) {
                            throw new j("malformed DT_NEEDED section");
                        }
                        i5++;
                    }
                    jUo += z3 ? 8L : 16L;
                } while (jUo3 != 0);
                if (i5 == i2) {
                    return strArr;
                }
                throw new j("malformed DT_NEEDED section");
            }
            j6 = j13;
        }
    }
}
