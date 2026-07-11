package com.safedk.android.utils;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63135a = "GzipUtil";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:47:0x00b3, B:51:0x00bb, B:53:0x00c0, B:55:0x00c5), top: B:63:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:47:0x00b3, B:51:0x00bb, B:53:0x00c0, B:55:0x00c5), top: B:63:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[Catch: IOException -> 0x00b7, TRY_LEAVE, TryCatch #1 {IOException -> 0x00b7, blocks: (B:47:0x00b3, B:51:0x00bb, B:53:0x00c0, B:55:0x00c5), top: B:63:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        ?? r8;
        StringBuilder sb;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        Logger.d(f63135a, "unzip started, input size is ", Integer.valueOf(bArr.length));
        if (!b(bArr)) {
            Logger.d(f63135a, "unzip started, input is not compressed");
            return new String(bArr);
        }
        String string = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e2) {
                e = e2;
                gZIPInputStream = null;
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = null;
                inputStreamReader = null;
            }
            try {
                inputStreamReader = new InputStreamReader(gZIPInputStream, C.UTF8_NAME);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (IOException e3) {
                    e = e3;
                    bufferedReader = 0;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = 0;
                }
                try {
                    sb = new StringBuilder();
                } catch (IOException e4) {
                    e = e4;
                    Logger.d(f63135a, "Exception in unzip: ", e.getMessage());
                    r8 = bufferedReader;
                } catch (Throwable th3) {
                    th = th3;
                    Logger.d(f63135a, "Exception in unzip: ", th.getMessage());
                    r8 = bufferedReader;
                }
            } catch (IOException e5) {
                e = e5;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                Logger.d(f63135a, "Exception in unzip: ", e.getMessage());
                r8 = bufferedReader;
                if (r8 != 0) {
                }
                if (inputStreamReader != null) {
                }
                if (gZIPInputStream != null) {
                }
                if (byteArrayInputStream != null) {
                }
                return string;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                Logger.d(f63135a, "Exception in unzip: ", th.getMessage());
                r8 = bufferedReader;
                if (r8 != 0) {
                }
                if (inputStreamReader != null) {
                }
                if (gZIPInputStream != null) {
                }
                if (byteArrayInputStream != null) {
                }
                return string;
            }
        } catch (IOException e6) {
            e = e6;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            if (r8 != 0) {
                try {
                    r8.close();
                } catch (IOException e7) {
                    Logger.d(f63135a, "Exception in unzip finally block: ", e7.getMessage());
                }
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (gZIPInputStream != null) {
                gZIPInputStream.close();
            }
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            return string;
        }
        Logger.d(f63135a, "unzip started, output size is ", Integer.valueOf(sb.length()));
        string = sb.toString();
        r8 = bufferedReader;
        if (r8 != 0) {
        }
        if (inputStreamReader != null) {
        }
        if (gZIPInputStream != null) {
        }
        if (byteArrayInputStream != null) {
        }
        return string;
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int[] iArrC = c(bArr2);
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr2[i2] != bArr[i3]) {
                i2 = iArrC[i2 - 1];
            }
            if (bArr2[i2] == bArr[i3]) {
                i2++;
            }
            if (i2 == bArr2.length) {
                return (i3 - bArr2.length) + 1;
            }
        }
        return -1;
    }

    private static int[] c(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i2 = 0;
        for (int i3 = 1; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr[i2] != bArr[i3]) {
                i2 = iArr[i2 - 1];
            }
            if (bArr[i2] == bArr[i3]) {
                i2++;
            }
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static boolean b(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }

    public static String a(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrDecode));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, bArrDecode.length * 2));
                try {
                    try {
                        bArr = new byte[8192];
                    } catch (IOException e2) {
                        e = e2;
                        Logger.d(f63135a, "First attempt failed, trying double decode: ", e.getMessage());
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        byte[] bArrDecode2 = Base64.decode(new String(bArrDecode, Charset.forName(C.UTF8_NAME)), 0);
                        try {
                            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrDecode2));
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, bArrDecode2.length * 2));
                                try {
                                    byte[] bArr2 = new byte[8192];
                                    while (true) {
                                        int i2 = gZIPInputStream.read(bArr2);
                                        if (i2 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                    String str2 = new String(byteArrayOutputStream.toByteArray(), Charset.forName(C.UTF8_NAME));
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e5) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e6) {
                                    }
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e7) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e8) {
                                    }
                                    return str2;
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPInputStream2 = gZIPInputStream;
                                    if (gZIPInputStream2 != null) {
                                        try {
                                            try {
                                                gZIPInputStream2.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (IOException e9) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e10) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
        }
        while (true) {
            int i3 = gZIPInputStream.read(bArr);
            if (i3 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
            th = th5;
            gZIPInputStream2 = gZIPInputStream;
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (IOException e13) {
                }
            }
            if (byteArrayOutputStream == null) {
                throw th;
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e14) {
                throw th;
            }
        }
        String str3 = new String(byteArrayOutputStream.toByteArray(), Charset.forName(C.UTF8_NAME));
        try {
            gZIPInputStream.close();
        } catch (IOException e15) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e16) {
        }
        return str3;
    }
}
