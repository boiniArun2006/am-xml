package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Utf8 {
    private static int incompleteStateFor(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        if (r7[r6] > (-65)) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i5) {
        byte b2;
        int i7;
        int i8;
        if (i2 != 0) {
            if (i3 >= i5) {
                return i2;
            }
            byte b4 = (byte) i2;
            if (b4 < -32) {
                if (b4 >= -62) {
                    i8 = i3 + 1;
                }
                return -1;
            }
            if (b4 < -16) {
                byte b5 = (byte) (~(i2 >> 8));
                if (b5 == 0) {
                    int i9 = i3 + 1;
                    byte b6 = bArr[i3];
                    if (i9 >= i5) {
                        return incompleteStateFor(b4, b6);
                    }
                    i3 = i9;
                    b5 = b6;
                }
                if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                    i8 = i3 + 1;
                }
                return -1;
            }
            byte b7 = (byte) (~(i2 >> 8));
            if (b7 == 0) {
                i7 = i3 + 1;
                b7 = bArr[i3];
                if (i7 >= i5) {
                    return incompleteStateFor(b4, b7);
                }
                b2 = 0;
            } else {
                b2 = (byte) (i2 >> 16);
                i7 = i3;
            }
            if (b2 == 0) {
                int i10 = i7 + 1;
                byte b8 = bArr[i7];
                if (i10 >= i5) {
                    return incompleteStateFor(b4, b7, b8);
                }
                b2 = b8;
                i7 = i10;
            }
            if (b7 <= -65 && (((b4 << 28) + (b7 + 112)) >> 30) == 0 && b2 <= -65) {
                i3 = i7 + 1;
            }
            return -1;
            i3 = i8;
        }
        return partialIsValidUtf8(bArr, i3, i5);
    }

    private static int incompleteStateFor(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i2, int i3) {
        return partialIsValidUtf8(bArr, i2, i3) == 0;
    }

    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i5 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i5 >= i3 - 2) {
                        return incompleteStateFor(bArr, i5, i3);
                    }
                    int i7 = i2 + 2;
                    byte b4 = bArr[i5];
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i8 = i2 + 3;
                        if (bArr[i7] <= -65) {
                            i2 += 4;
                            if (bArr[i8] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i5 >= i3 - 1) {
                    return incompleteStateFor(bArr, i5, i3);
                }
                int i9 = i2 + 2;
                byte b5 = bArr[i5];
                if (b5 <= -65 && ((b2 != -32 || b5 >= -96) && (b2 != -19 || b5 < -96))) {
                    i2 += 3;
                    if (bArr[i9] > -65) {
                    }
                }
                return -1;
            }
            i2 = i5;
        }
        return 0;
    }

    private static int incompleteStateFor(int i2, int i3, int i5) {
        if (i2 > -12 || i3 > -65 || i5 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i5 << 16);
    }

    private static int incompleteStateFor(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i5 = i3 - i2;
        if (i5 == 0) {
            return incompleteStateFor(b2);
        }
        if (i5 == 1) {
            return incompleteStateFor(b2, bArr[i2]);
        }
        if (i5 == 2) {
            return incompleteStateFor(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static int partialIsValidUtf8(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i2, i3);
    }
}
