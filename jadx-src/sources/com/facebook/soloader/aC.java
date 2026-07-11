package com.facebook.soloader;

import android.content.Context;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.facebook.soloader.afx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class aC extends afx {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private final class j extends afx.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final n[] f53025n;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r12 + "]");
         */
        /* JADX WARN: Removed duplicated region for block: B:6:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        j(afx afxVar) throws IOException {
            BufferedReader bufferedReader;
            File file;
            File file2;
            File file3 = new File("/data/local/tmp/exopackage/" + aC.this.nr.getPackageName() + PtsLKY.Fml);
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] strArrMUb = SysUtil.mUb();
            int length = strArrMUb.length;
            int i2 = 0;
            int i3 = 0;
            loop0: while (i3 < length) {
                String str = strArrMUb[i3];
                File file4 = new File(file3, str);
                if (file4.isDirectory()) {
                    linkedHashSet.add(str);
                    File file5 = new File(file4, "metadata.txt");
                    if (file5.isFile()) {
                        FileReader fileReader = new FileReader(file5);
                        try {
                            bufferedReader = new BufferedReader(fileReader);
                        } finally {
                        }
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    file = file3;
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf == -1) {
                                        break loop0;
                                    }
                                    String str2 = line.substring(i2, iIndexOf) + ".so";
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i2 >= size) {
                                            file2 = file3;
                                            String strSubstring = line.substring(iIndexOf + 1);
                                            arrayList.add(new n(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so")), new File(file4, strSubstring)));
                                            break;
                                        } else {
                                            file2 = file3;
                                            if (((n) arrayList.get(i2)).f53035n.equals(str2)) {
                                                break;
                                            }
                                            i2++;
                                            file3 = file2;
                                        }
                                    }
                                    file3 = file2;
                                    i2 = 0;
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                } else {
                    file = file3;
                }
                i3++;
                file3 = file;
                i2 = 0;
            }
            afxVar.o((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.f53025n = (n[]) arrayList.toArray(new n[arrayList.size()]);
        }

        @Override // com.facebook.soloader.afx.I28
        public afx.w6[] rl() {
            return this.f53025n;
        }

        @Override // com.facebook.soloader.afx.I28
        public void Uo(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (n nVar : this.f53025n) {
                FileInputStream fileInputStream = new FileInputStream(nVar.f53027O);
                try {
                    afx.Ml ml = new afx.Ml(nVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        n(ml, bArr, file);
                        ml.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    private static final class n extends afx.w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final File f53027O;

        n(String str, String str2, File file) {
            super(str, str2);
            this.f53027O = file;
        }
    }

    @Override // com.facebook.soloader.afx
    protected afx.I28 HI(boolean z2) {
        return new j(this);
    }

    @Override // com.facebook.soloader.I28, com.facebook.soloader.ci
    public String t() {
        return "ExoSoSource";
    }

    public aC(Context context, String str) {
        super(context, str);
    }
}
