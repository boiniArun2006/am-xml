package eK;

import android.text.TextUtils;
import com.facebook.s4;
import com.google.android.exoplayer2.C;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final aC f63599n = new aC();

    public static final File n() {
        if (VmF.j.nr(aC.class)) {
            return null;
        }
        try {
            File file = new File(s4.qie().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            VmF.j.rl(th, aC.class);
            return null;
        }
    }

    public static final Map t(File file) {
        Map map;
        Map map2 = null;
        if (VmF.j.nr(aC.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = byteBufferWrap.getInt();
                int i3 = i2 + 4;
                if (iAvailable < i3) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, Charsets.UTF_8));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = jSONArrayNames.getString(i5);
                }
                ArraysKt.sort((Object[]) strArr);
                HashMap map3 = new HashMap();
                int i7 = 0;
                while (i7 < length) {
                    String str = strArr[i7];
                    if (str == null) {
                        map = map2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i8 = 1;
                        map = map2;
                        for (int i9 = 0; i9 < length2; i9++) {
                            try {
                                int i10 = jSONArray.getInt(i9);
                                iArr[i9] = i10;
                                i8 *= i10;
                            } catch (Exception unused) {
                                return map;
                            } catch (Throwable th) {
                                th = th;
                                VmF.j.rl(th, aC.class);
                                return map;
                            }
                        }
                        int i11 = i8 * 4;
                        int i12 = i3 + i11;
                        if (i12 > iAvailable) {
                            return map;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i3, i11);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        j jVar = new j(iArr);
                        byteBufferWrap2.asFloatBuffer().get(jVar.n(), 0, i8);
                        map3.put(str, jVar);
                        i3 = i12;
                    }
                    i7++;
                    map2 = map;
                }
                return map3;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = map2;
        }
    }

    private aC() {
    }

    public final int[] nr(String texts, int i2) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[i2];
            String strRl = rl(texts);
            Charset charsetForName = Charset.forName(C.UTF8_NAME);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strRl.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 < bytes.length) {
                    iArr[i3] = bytes[i3] & UByte.MAX_VALUE;
                } else {
                    iArr[i3] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final String rl(String str) {
        int i2;
        boolean z2;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (Intrinsics.compare((int) str.charAt(i2), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i3++;
                    }
                } else {
                    if (!z2) {
                        break;
                    }
                    length--;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new Regex("\\s+").split(str.subSequence(i3, length + 1).toString(), 0).toArray(new String[0]));
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
